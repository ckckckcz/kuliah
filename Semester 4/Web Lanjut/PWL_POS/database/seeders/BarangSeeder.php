<?php

namespace Database\Seeders;

use Illuminate\Database\Seeder;
use Illuminate\Support\Facades\DB;

class BarangSeeder extends Seeder
{
    public function run()
    {
        $data = [
            [
                'barang_id' => 1,
                'barang_nama' => 'Laptop',
                'kategori_id' => 1,
                'barang_kode' => 'LPTP',
                'harga_beli' => 10000000,
                'harga_jual' => 12000000,
            ],
            [
                'barang_id' => 2,
                'barang_nama' => 'Smartphone',
                'kategori_id' => 1,
                'barang_kode' => 'SMHP',
                'harga_beli' => 5000000,
                'harga_jual' => 6000000,
            ],
            [
                'barang_id' => 3,
                'barang_nama' => 'Kaos',
                'kategori_id' => 2,
                'barang_kode' => 'KOS',
                'harga_beli' => 500000,
                'harga_jual' => 600000,
            ],
            [
                'barang_id' => 4,
                'barang_nama' => 'Celana',
                'kategori_id' => 2,
                'barang_kode' => 'CLN',
                'harga_beli' => 1000000,
                'harga_jual' => 1200000,
            ],
            [
                'barang_id' => 5,
                'barang_nama' => 'Nasi Goreng',
                'kategori_id' => 3,
                'barang_kode' => 'NASGOR',
                'harga_beli' => 10000,
                'harga_jual' => 12000,
            ],
            [
                'barang_id' => 6,
                'barang_nama' => 'Burger',
                'kategori_id' => 3,
                'barang_kode' => 'BRGR',
                'harga_beli' => 15000,
                'harga_jual' => 18000,
            ],
            [
                'barang_id' => 7,
                'barang_nama' => 'Teh Botol',
                'kategori_id' => 4,
                'barang_kode' => 'TEHBOT',
                'harga_beli' => 5000,
                'harga_jual' => 6000,
            ],
            [
                'barang_id' => 8,
                'barang_nama' => 'Kopi',
                'kategori_id' => 4,
                'barang_kode' => 'KOP',
                'harga_beli' => 4000,
                'harga_jual' => 5000,
            ],
            [
                'barang_id' => 9,
                'barang_nama' => 'Pensil',
                'kategori_id' => 5,
                'barang_kode' => 'PNSL',
                'harga_beli' => 2000,
                'harga_jual' => 3000,
            ],
            [
                'barang_id' => 10,
                'barang_nama' => 'Pulpen',
                'kategori_id' => 5,
                'barang_kode' => 'PLPN',
                'harga_beli' => 3000,
                'harga_jual' => 4000,
            ],
        ];


        DB::table('m_barang')->insert($data);
    }
}
