<?php

namespace Database\Seeders;

use Illuminate\Database\Console\Seeds\WithoutModelEvents;
use Illuminate\Database\Seeder;
use Illuminate\Support\Facades\DB;

class StokSeeder extends Seeder
{
    /**
     * Run the database seeds.
     */
    public function run(): void
    {
        // Get existing barang_id from m_barang
        $barang_ids = DB::table('m_barang')->pluck('barang_id')->toArray();

        // Get existing user_id from m_user
        $user_ids = DB::table('m_user')->pluck('user_id')->toArray();

        if (empty($barang_ids) || empty($user_ids)) {
            return; // Stop if dependencies are missing
        }

        $stok_id = 1;
        foreach ($barang_ids as $barang_id) {
            DB::table('t_stok')->insert([
                'stok_id' => $stok_id++,
                'barang_id' => $barang_id,
                'user_id' => $user_ids[array_rand($user_ids)], // Assign a valid user_id
                'stok_tanggal' => now(),
                'stok_jumlah' => 10, // Fixed stock amount per item
                'created_at' => now(),
                'updated_at' => now(),
            ]);
        }
    }
}
