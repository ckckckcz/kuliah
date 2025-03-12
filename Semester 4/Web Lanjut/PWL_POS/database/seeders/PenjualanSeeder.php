<?php

namespace Database\Seeders;

use Illuminate\Database\Seeder;
use Illuminate\Support\Facades\DB;
use Illuminate\Support\Str;

class PenjualanSeeder extends Seeder
{
    public function run()
    {
        for ($i = 1; $i <= 10; $i++) {
            DB::table('t_penjualan')->insert([
                'penjualan_id' => $i,
                'user_id' => rand(1, 3), 
                'pembeli' => 'Pembeli ' . $i,
                'penjualan_kode' => 'TRX' . Str::upper(Str::random(6)), // Kode unik transaksi
                'penjualan_tanggal' => now(),
                'created_at' => now(),
                'updated_at' => now(),
            ]);
        }
    }
}
