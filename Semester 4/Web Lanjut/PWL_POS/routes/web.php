<?php

use Illuminate\Support\Facades\Route;
use App\Http\Controllers\LevelController;
use App\Http\Controllers\KategoriController;
use App\Http\Controllers\UserController;

Route::get('/', function () {
    return view('welcome');
});


Route::get(uri: '/level', action: [LevelController::class, 'index']);
Route::get('/kategori', [KategoriController::class, 'index']);
Route::get('/user', [UserController::class, 'index']);

Route::get('/user/tambah', [UserController::class, 'tambah']);
Route::get('/user/tambah_simpan', [UserController::class, 'tambah_simpan']);

route::get('/user/ubah/{id}', [UserController::class, 'ubah']);
route::get('/user/ubah_simpan/{id}', [UserController::class, 'ubah_simpan']);

route::get('/user/hapus/{id}', [UserController::class, 'hapus']);