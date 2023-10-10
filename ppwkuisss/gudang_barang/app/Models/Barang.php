<?php

namespace App\Models;

use Illuminate\Database\Eloquent\Factories\HasFactory;
use Illuminate\Database\Eloquent\Model;

class Barang extends Model
{
    use HasFactory;

    protected $table = 'barang'; // Nama tabel sesuai dengan yang dibuat

    protected $fillable = ['nama_barang', 'harga', 'stok', 'id_supplier'];
}
