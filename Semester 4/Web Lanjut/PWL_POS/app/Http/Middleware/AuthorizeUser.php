<?php
namespace App\Http\Middleware;

use Closure;
use Illuminate\Http\Request;
use Illuminate\Support\Facades\Auth;

class AuthorizeUser
{
    public function handle(Request $request, Closure $next, ...$levels)
    {
        if (Auth::check() && in_array(Auth::user()->level_id, $levels)) {
            return $next($request);
        }
        return redirect('login')->with('error', 'Anda tidak memiliki akses ke halaman ini.');
    }
}