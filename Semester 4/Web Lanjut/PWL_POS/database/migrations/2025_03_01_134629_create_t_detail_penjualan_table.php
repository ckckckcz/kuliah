<?php

use Illuminate\Database\Migrations\Migration;
use Illuminate\Database\Schema\Blueprint;
use Illuminate\Support\Facades\Schema;

return new class extends Migration
{
    /**
     * Run the migrations.
     */
    public function up(): void
    {
        Schema::create('t_detail_penjualan', function (Blueprint $table) {
            $table->id('detail_id');
            $table->unsignedBigInteger('penjualan_id');
            $table->foreign('penjualan_id')
                ->references('penjualan_id')
                ->on('t_penjualan');
            $table->unsignedBigInteger('barang_id');
            $table->foreign('barang_id')
                ->references('barang_id')
                ->on('m_barang');
            $table->integer('harga');
            $table->integer('jumlah');
            $table->timestamps();
        });
    }

    /**
     * Reverse the migrations.
     */
    public function down(): void
    {
        Schema::dropIfExists('t_detail_penjualan');
    }
};
