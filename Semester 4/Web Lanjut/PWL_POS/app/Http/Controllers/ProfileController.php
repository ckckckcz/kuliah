<?php

namespace App\Http\Controllers;

use Illuminate\Http\Request;
use Illuminate\Support\Facades\Storage;
use Intervention\Image\Laravel\Facades\Image;

class ProfileController extends Controller
{
    public function index()
    {
        $breadcrumb = (object) [
            'title' => 'Profile',
            'list' => ['Home' => 'Profile']
        ];

        $page = (object) [
            'title' => 'User Profile',
        ];

        $activeMenu = '';

        $user = auth()->user();

        return view('profile.index', [
            'breadcrumb' => $breadcrumb,
            'page' => $page,
            'activeMenu' => $activeMenu,
            'user' => $user
        ]);
    }

    public function edit_picture()
    {
        $user = auth()->user();
        return view('profile.edit_picture', [
            'user' => $user
        ]);
    }

    public function update_picture(Request $request)
    {
        $request->validate([
            'profile_picture' => 'required|image|mimes:jpeg,png,jpg,gif|max:2048',
        ]);

        $user = auth()->user();

        // Delete old profile picture if exists
        if ($user->profile_picture && Storage::disk('public')->exists($user->profile_picture)) {
            Storage::disk('public')->delete($user->profile_picture);
        }

        // Generate a unique filename
        $fileName = "user_" . $user->user_id . "." . $request->file('profile_picture')->getClientOriginalExtension();
        $filePath = "profile_pictures/" . $fileName;

        // Process the image
        $img = Image::read($request->file('profile_picture')->path())
            ->resize(300, 300);
        // Save the processed image
        $img->save(storage_path('app/public/' . $filePath));

        // Update user picture_url
        $user->picture_url = $filePath;

        if ($user->save()) {
            return response()->json([
                'status' => true,
                'message' => 'Foto profil berhasil diperbarui!'
            ]);

        } else {
            // Rollback the file deletion if save fails
            if (Storage::disk('public')->exists($filePath)) {
                Storage::disk('public')->delete($filePath);
            }

            return response()->json([
                'status' => true,
                'message' => 'Foto profil Gagal diperbarui!'
            ]);
        }
    }
}
