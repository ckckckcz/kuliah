<?php

use Illuminate\Support\Facades\Route;
use App\Http\Controllers\WelcomeController;
use App\Http\Controllers\PhotoController;

Route::get('/', function () {
    return 'Selamat Datang';
});

// Route::get('/hello', function(){
//     return 'Hello World';
// });

// Route::get('/world', function(){
//     return 'World';
// });

// Route::get('/about', function(){
//     return '2341720209 - ' . ' Riovaldo Alfiyan Fahmi Rahman';
// });

// Route::get('/user/{name}', function ($name) {
//     return 'Nama saya '.$name;
// });

// Route::get('/posts/{post}/comments/{comment}', function ($postId, $commentId) {
//     return 'Pos ke-'.$postId." Komentar ke-: ".$commentId;
// });

// Route::get('/articles/{id}', function ($id){
//     return 'Halaman Artikel dengan ID '. $id;
// });

// // Route::get('/user/{name?}', function($name='John'){
// //     return 'Nama saya '.$name;
// // });

// Route::get('/user/profile', function () {
//     return 'Ini adalah profil user';
// })->name('profile');

// Route::prefix('admin')->group(function () {
//     Route::get('/user', function () { return 'Admin - User'; });
//     Route::get('/post', function () { return 'Admin - Post'; });
//     Route::get('/event', function () { return 'Admin - Event'; });
// });

// Route::redirect('/here', '/there');

// Route::view('/welcome', 'welcome');
// Route::view('/welcome', 'welcome', ['name' => 'Riovaldo']);

// Route::get('/hello', [WelcomeController::class, 'hello']);

Route::get('/greeting', [WelcomeController::class, 'greeting']);
// Route::get('/greeting', function(){
//     return view('hello', ['name' => 'Riovaldo']);
// });

Route::resource('photos', PhotoController::class)->only([
    'index',
    'show'
]);
Route::resource('photos', PhotoController::class)->except([
    'create',
    'store',
    'update',
    'destroy'
]);

Route::prefix('category')->group(function () {
    Route::get('/food-beverage', function () {
        return view('category.food'); });
    Route::get('/beauty-health', function () {
        return view('category.beauty'); });
    Route::get('/home-care', function () {
        return view('category.homecare'); });
    Route::get('/baby-kid', function () {
        return view('category.babykid'); });
});

Route::get('/user/{id}/name/{name}', function ($id, $name) {
    return "Profil User ID: $id, Nama: $name";
});

Route::get('/sales', function () {
    return view('sales.index');
});