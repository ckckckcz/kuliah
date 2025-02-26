<?php

namespace App\Http\Controllers;

use Illuminate\Http\Request;

class ProductController extends Controller
{
    public function foodBeverage()
    {
        return view('category.food');
    }

    public function beautyHealth()
    {
        return view('category.beauty');
    }

    public function homeCare()
    {
        return view('category.homecare');
    }

    public function babyKid()
    {
        return view('category.babykid');
    }
}

