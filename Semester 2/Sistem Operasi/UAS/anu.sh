#!/bin/bash

echo "Selamat Datang di VArchiver"
echo "------------------------------"
echo "Pilih Menu VArchiver:"
echo "1. Lihat File"
echo "2. Hapus File/Folder"
echo "3. Copy File"
echo "4. Move File"
echo "5. Kompres File"
echo "6. Ekstrak File"
echo "------------------------------"
read -p "Masukkan Pilihan: " pilihan

case $pilihan in
    1)
        read -p "Masukkan direktori file: " dir
        ls $dir
        ;;
    2)
        read -p "Masukkan path file/folder yang akan dihapus: " path
        rm -r $path
        ;;
    3)
        read -p "Masukkan sumber file: " source
        read -p "Masukkan tujuan file: " destination
        cp $source $destination
        ;;
    4)
        read -p "Masukkan sumber file: " source
        read -p "Masukkan tujuan file: " destination
        mv $source $destination
        ;;
    5)
        echo "Masukkan nama file yang ingin dikompres: "
        read file_name
        if [ ! -f "$file_name" ]; then
            echo "File '$file_name' tidak ditemukan."
            exit 1
        fi
        zip -q compressed.zip "$file_name"
        ;;
    6)
        echo "Masukkan nama file zip yang ingin diekstrak: "
        read zip_file
        if [ ! -f "$zip_file" ]; then
            echo "File '$zip_file' tidak ditemukan."
            exit 1
        fi
        unzip "$zip_file"
        ;;
    *)
        echo "Pilihan tidak valid!"
        ;;
esac