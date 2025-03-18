<?php

namespace Database\Seeders;

use Illuminate\Database\Console\Seeds\WithoutModelEvents;
use Illuminate\Database\Seeder;
use Illuminate\Support\Facades\DB;

class PenjualanDetailSeeder extends Seeder
{
    /**
     * Run the database seeds.
     */
    public function run(): void
    {
        $data = [
            // Transaction 1 details
            [
                'detail_id' => 1,
                'penjualan_id' => 1,
                'barang_id' => 1,
                'harga' => 2500000,
                'jumlah' => 2,
            ],
            [
                'detail_id' => 2,
                'penjualan_id' => 1,
                'barang_id' => 7,
                'harga' => 5000,
                'jumlah' => 10,
            ],
            [
                'detail_id' => 3,
                'penjualan_id' => 1,
                'barang_id' => 5,
                'harga' => 20000,
                'jumlah' => 5,
            ],

            // Transaction 2 details
            [
                'detail_id' => 4,
                'penjualan_id' => 2,
                'barang_id' => 2,
                'harga' => 8750000,
                'jumlah' => 1,
            ],
            [
                'detail_id' => 5,
                'penjualan_id' => 2,
                'barang_id' => 8,
                'harga' => 10000,
                'jumlah' => 5,
            ],
            [
                'detail_id' => 6,
                'penjualan_id' => 2,
                'barang_id' => 6,
                'harga' => 35000,
                'jumlah' => 3,
            ],

            // Transaction 3 details
            [
                'detail_id' => 7,
                'penjualan_id' => 3,
                'barang_id' => 3,
                'harga' => 200000,
                'jumlah' => 3,
            ],
            [
                'detail_id' => 8,
                'penjualan_id' => 3,
                'barang_id' => 4,
                'harga' => 275000,
                'jumlah' => 2,
            ],
            [
                'detail_id' => 9,
                'penjualan_id' => 3,
                'barang_id' => 7,
                'harga' => 5000,
                'jumlah' => 6,
            ],

            // Transaction 4 details
            [
                'detail_id' => 10,
                'penjualan_id' => 4,
                'barang_id' => 9,
                'harga' => 130000,
                'jumlah' => 2,
            ],
            [
                'detail_id' => 11,
                'penjualan_id' => 4,
                'barang_id' => 10,
                'harga' => 95000,
                'jumlah' => 4,
            ],
            [
                'detail_id' => 12,
                'penjualan_id' => 4,
                'barang_id' => 8,
                'harga' => 10000,
                'jumlah' => 8,
            ],

            // Transaction 5 details
            [
                'detail_id' => 13,
                'penjualan_id' => 5,
                'barang_id' => 1,
                'harga' => 2500000,
                'jumlah' => 1,
            ],
            [
                'detail_id' => 14,
                'penjualan_id' => 5,
                'barang_id' => 3,
                'harga' => 200000,
                'jumlah' => 2,
            ],
            [
                'detail_id' => 15,
                'penjualan_id' => 5,
                'barang_id' => 5,
                'harga' => 20000,
                'jumlah' => 10,
            ],

            // Transaction 6 details
            [
                'detail_id' => 16,
                'penjualan_id' => 6,
                'barang_id' => 2,
                'harga' => 8750000,
                'jumlah' => 1,
            ],
            [
                'detail_id' => 17,
                'penjualan_id' => 6,
                'barang_id' => 6,
                'harga' => 35000,
                'jumlah' => 5,
            ],
            [
                'detail_id' => 18,
                'penjualan_id' => 6,
                'barang_id' => 8,
                'harga' => 10000,
                'jumlah' => 12,
            ],

            // Transaction 7 details
            [
                'detail_id' => 19,
                'penjualan_id' => 7,
                'barang_id' => 4,
                'harga' => 275000,
                'jumlah' => 3,
            ],
            [
                'detail_id' => 20,
                'penjualan_id' => 7,
                'barang_id' => 7,
                'harga' => 5000,
                'jumlah' => 24,
            ],
            [
                'detail_id' => 21,
                'penjualan_id' => 7,
                'barang_id' => 10,
                'harga' => 95000,
                'jumlah' => 2,
            ],

            // Transaction 8 details
            [
                'detail_id' => 22,
                'penjualan_id' => 8,
                'barang_id' => 3,
                'harga' => 200000,
                'jumlah' => 4,
            ],
            [
                'detail_id' => 23,
                'penjualan_id' => 8,
                'barang_id' => 5,
                'harga' => 20000,
                'jumlah' => 15,
            ],
            [
                'detail_id' => 24,
                'penjualan_id' => 8,
                'barang_id' => 9,
                'harga' => 130000,
                'jumlah' => 1,
            ],

            // Transaction 9 details
            [
                'detail_id' => 25,
                'penjualan_id' => 9,
                'barang_id' => 1,
                'harga' => 2500000,
                'jumlah' => 1,
            ],
            [
                'detail_id' => 26,
                'penjualan_id' => 9,
                'barang_id' => 2,
                'harga' => 8750000,
                'jumlah' => 1,
            ],
            [
                'detail_id' => 27,
                'penjualan_id' => 9,
                'barang_id' => 7,
                'harga' => 5000,
                'jumlah' => 12,
            ],

            // Transaction 10 details
            [
                'detail_id' => 28,
                'penjualan_id' => 10,
                'barang_id' => 6,
                'harga' => 35000,
                'jumlah' => 8,
            ],
            [
                'detail_id' => 29,
                'penjualan_id' => 10,
                'barang_id' => 9,
                'harga' => 130000,
                'jumlah' => 2,
            ],
            [
                'detail_id' => 30,
                'penjualan_id' => 10,
                'barang_id' => 10,
                'harga' => 95000,
                'jumlah' => 3,
            ],
        ];

        DB::table('t_penjualan_detail')->insert($data);
    }
}
