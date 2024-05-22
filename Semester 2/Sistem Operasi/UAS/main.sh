echo "Selamat Datang di File Manager KW"
echo "------------------------------"
echo "Pilih Menu File Manager KW:"
echo "1. Lihat File"
echo "2. Buat File"
echo "3. Buat Folder"
echo "4. Hapus File atau Folder"
echo "5. Copy File"
echo "6. Move File"
echo "7. Kompres"
echo "8. Ekstrak"
echo "------------------------------"
read -p "Masukkan Pilihan: " pilihan

case $pilihan in
    1)
        read -p "Masukkan direktori file: " dir
        ls $dir
        ;;
    2)
        read -p "Masukkan nama file baru: " new_file
        touch $new_file_folder
        ;;
    3)
        read -p "Masukkan nama folder baru : " new_folder
        mkdir $new_folder
        ;;
    4)
        read -p "Masukkan path file/folder yang akan dihapus: " path
        rm -r $path
        ;;
    5)
        read -p "Masukkan sumber file: " source
        read -p "Masukkan tujuan file: " destination
        cp $source $destination
        ;;
    6)
        read -p "Masukkan sumber file: " source
        read -p "Masukkan tujuan file: " destination
        mv $source $destination
        ;;
    7) 
        read -p "Masukkan nama file yang akan dikompres: " file_to_compress
        read -p "Masukkan nama file hasil kompresi: " compressed_file
        gzip $file_to_compress -c > $compressed_file.gz
        ;;
    8)  
        read -p "Masukkan nama file yang akan diekstrak: " compressed_file
        tar -zxvf $compressed_file
        ;;
    *)
        echo "Pilihan tidak valid!"
        ;;
esac