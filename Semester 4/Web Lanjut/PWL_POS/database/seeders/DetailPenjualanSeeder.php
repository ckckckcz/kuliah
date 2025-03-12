<?php

namespace Database\Seeders;

use Illuminate\Database\Seeder;
use Illuminate\Support\Facades\DB;

class DetailPenjualanSeeder extends Seeder
{
    public function run()
    {
        $detail_id = 1;

        // Get existing penjualan_id from t_penjualan
        $penjualan_ids = DB::table('t_penjualan')->pluck('penjualan_id')->toArray();

        // Get existing barang_id from m_barang
        $barang_ids = DB::table('m_barang')->pluck('barang_id')->toArray();

        if (empty($penjualan_ids) || empty($barang_ids)) {
            return; // Avoid inserting if dependencies are missing
        }

        foreach ($penjualan_ids as $penjualan_id) {
            for ($i = 0; $i < 3; $i++) { // 3 barang per transaksi
                DB::table('t_detail_penjualan')->insert([
                    'detail_id' => $detail_id++, // Corrected primary key name
                    'penjualan_id' => $penjualan_id,
                    'barang_id' => $barang_ids[array_rand($barang_ids)], // Select a valid barang_id
                    'jumlah' => rand(1, 5),
                    'harga' => rand(5000, 20000),
                    'created_at' => now(),
                    'updated_at' => now(),
                ]);
            }
        }
    }
}
