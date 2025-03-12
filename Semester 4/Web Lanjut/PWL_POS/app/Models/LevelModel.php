<?php

namespace App\Models;

use Illuminate\Database\Eloquent\Model;
use Illuminate\Database\Eloquent\Relations\HasOne;

class LevelModel extends Model
{
    protected $table = 'm_level'; // Nama tabel di database
    protected $primaryKey = 'level_id'; // Primary key tabel

    protected $fillable = ['level_id', 'level_code', 'level_nama'];

    public function user(): HasOne
    {
        return $this->hasOne(UserModel::class, 'level_id', 'level_id');
    }
}