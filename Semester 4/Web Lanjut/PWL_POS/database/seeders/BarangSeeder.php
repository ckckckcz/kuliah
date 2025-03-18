<?php

namespace Database\Seeders;

use Illuminate\Database\Console\Seeds\WithoutModelEvents;
use Illuminate\Database\Seeder;
use Illuminate\Support\Facades\DB;

class BarangSeeder extends Seeder
{
    /**
     * Run the database seeds.
     */
    public function run(): void
    {
        $data = [
            // Supplier 1 - Elektronik (5 products)
            [
                'barang_id' => 1,
                'kategori_id' => 1,
                'barang_kode' => 'BRG001',
                'barang_nama' => 'Smartphone XYZ',
                'harga_beli' => 2000000,
                'harga_jual' => 2500000,
            ],
            [
                'barang_id' => 2,
                'kategori_id' => 1,
                'barang_kode' => 'BRG002',
                'barang_nama' => 'Laptop ABC',
                'harga_beli' => 8000000,
                'harga_jual' => 8750000,
            ],
            [
                'barang_id' => 3,
                'kategori_id' => 1,
                'barang_kode' => 'BRG003',
                'barang_nama' => 'TV LED 43 inch',
                'harga_beli' => 3500000,
                'harga_jual' => 4200000,
            ],
            [
                'barang_id' => 4,
                'kategori_id' => 1,
                'barang_kode' => 'BRG004',
                'barang_nama' => 'Headphone Bluetooth',
                'harga_beli' => 350000,
                'harga_jual' => 450000,
            ],
            [
                'barang_id' => 5,
                'kategori_id' => 1,
                'barang_kode' => 'BRG005',
                'barang_nama' => 'Smart Watch',
                'harga_beli' => 1200000,
                'harga_jual' => 1500000,
            ],

            // Supplier 2 - Fashion (5 products)
            [
                'barang_id' => 6,
                'kategori_id' => 2,
                'barang_kode' => 'BRG006',
                'barang_nama' => 'Kemeja Pria',
                'harga_beli' => 150000,
                'harga_jual' => 200000,
            ],
            [
                'barang_id' => 7,
                'kategori_id' => 2,
                'barang_kode' => 'BRG007',
                'barang_nama' => 'Celana Jeans',
                'harga_beli' => 200000,
                'harga_jual' => 275000,
            ],
            [
                'barang_id' => 8,
                'kategori_id' => 2,
                'barang_kode' => 'BRG008',
                'barang_nama' => 'Dress Casual',
                'harga_beli' => 180000,
                'harga_jual' => 250000,
            ],
            [
                'barang_id' => 9,
                'kategori_id' => 2,
                'barang_kode' => 'BRG009',
                'barang_nama' => 'Jaket Denim',
                'harga_beli' => 280000,
                'harga_jual' => 350000,
            ],
            [
                'barang_id' => 10,
                'kategori_id' => 2,
                'barang_kode' => 'BRG010',
                'barang_nama' => 'Kaos Polos',
                'harga_beli' => 60000,
                'harga_jual' => 90000,
            ],

            // Supplier 3 - Makanan & Minuman (5 products)
            [
                'barang_id' => 11,
                'kategori_id' => 3,
                'barang_kode' => 'BRG011',
                'barang_nama' => 'Coklat Premium',
                'harga_beli' => 15000,
                'harga_jual' => 25000,
            ],
            [
                'barang_id' => 12,
                'kategori_id' => 3,
                'barang_kode' => 'BRG012',
                'barang_nama' => 'Kopi Arabica 100g',
                'harga_beli' => 35000,
                'harga_jual' => 45000,
            ],
            [
                'barang_id' => 13,
                'kategori_id' => 4,
                'barang_kode' => 'BRG013',
                'barang_nama' => 'Air Mineral 600ml',
                'harga_beli' => 3000,
                'harga_jual' => 5000,
            ],
            [
                'barang_id' => 14,
                'kategori_id' => 4,
                'barang_kode' => 'BRG014',
                'barang_nama' => 'Soda Kaleng 330ml',
                'harga_beli' => 7000,
                'harga_jual' => 10000,
            ],
            [
                'barang_id' => 15,
                'kategori_id' => 3,
                'barang_kode' => 'BRG015',
                'barang_nama' => 'Snack Kemasan',
                'harga_beli' => 8000,
                'harga_jual' => 12000,
            ],
        ];

        DB::table('m_barang')->insert($data);
    }
}
