<?php

namespace Database\Seeders;

use Illuminate\Database\Console\Seeds\WithoutModelEvents;
use Illuminate\Database\Seeder;
use Illuminate\Support\Facades\DB;

class SupplierSeeder extends Seeder
{
    /**
     * Run the database seeds.
     */
    public function run(): void
    {
        $data = [
            [
                'supplier_id' => 1,
                'supplier_kode' => 'SUP001',
                'supplier_nama' => 'PT Elektronik Jaya',
                'supplier_alamat' => 'Jl. Tekonologi No. 123, Jakarta Selatan',
            ],
            [
                'supplier_id' => 2,
                'supplier_kode' => 'SUP002',
                'supplier_nama' => 'CV Fashion Indonesia',
                'supplier_alamat' => 'Jl. Industri Garmen Blok C5, Bandung',
            ],
            [
                'supplier_id' => 3,
                'supplier_kode' => 'SUP003',
                'supplier_nama' => 'PT Konsumsi Sehat',
                'supplier_alamat' => 'Jl. Pangan Raya No. 45, Semarang',
            ],
        ];

        DB::table('m_supplier')->insert($data);
    }
}
