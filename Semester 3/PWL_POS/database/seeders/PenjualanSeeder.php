<?php

namespace Database\Seeders;

use Illuminate\Database\Console\Seeds\WithoutModelEvents;
use Illuminate\Database\Seeder;
use Illuminate\Support\Facades\DB;

class PenjualanSeeder extends Seeder
{
    /**
     * Run the database seeds.
     */
    public function run(): void
    {
        $data = [
            [
                'penjualan_id' => 1,
                'user_id' => 3,
                'pembeli' => 'Budi Santoso',
                'penjualan_kode' => 'INV001',
                'penjualan_tanggal' => '2025-02-15 13:45:00',
            ],
            [
                'penjualan_id' => 2,
                'user_id' => 1,
                'pembeli' => 'Sinta Dewi',
                'penjualan_kode' => 'INV002',
                'penjualan_tanggal' => '2025-02-15 14:30:00',
            ],
            [
                'penjualan_id' => 3,
                'user_id' => 3,
                'pembeli' => 'Rudi Hermawan',
                'penjualan_kode' => 'INV003',
                'penjualan_tanggal' => '2025-02-16 09:20:00',
            ],
            [
                'penjualan_id' => 4,
                'user_id' => 2,
                'pembeli' => 'Maya Putri',
                'penjualan_kode' => 'INV004',
                'penjualan_tanggal' => '2025-02-16 11:40:00',
            ],
            [
                'penjualan_id' => 5,
                'user_id' => 3,
                'pembeli' => 'Andi Wijaya',
                'penjualan_kode' => 'INV005',
                'penjualan_tanggal' => '2025-02-17 15:15:00',
            ],
            [
                'penjualan_id' => 6,
                'user_id' => 1,
                'pembeli' => 'Dina Fitriani',
                'penjualan_kode' => 'INV006',
                'penjualan_tanggal' => '2025-02-18 10:30:00',
            ],
            [
                'penjualan_id' => 7,
                'user_id' => 3,
                'pembeli' => 'Joko Susilo',
                'penjualan_kode' => 'INV007',
                'penjualan_tanggal' => '2025-02-19 13:20:00',
            ],
            [
                'penjualan_id' => 8,
                'user_id' => 2,
                'pembeli' => 'Laras Ayu',
                'penjualan_kode' => 'INV008',
                'penjualan_tanggal' => '2025-02-20 09:45:00',
            ],
            [
                'penjualan_id' => 9,
                'user_id' => 3,
                'pembeli' => 'Hendra Gunawan',
                'penjualan_kode' => 'INV009',
                'penjualan_tanggal' => '2025-02-21 14:10:00',
            ],
            [
                'penjualan_id' => 10,
                'user_id' => 1,
                'pembeli' => 'Novi Indah',
                'penjualan_kode' => 'INV010',
                'penjualan_tanggal' => '2025-02-22 11:25:00',
            ],
        ];

        DB::table('t_penjualan')->insert($data);
    }
}
