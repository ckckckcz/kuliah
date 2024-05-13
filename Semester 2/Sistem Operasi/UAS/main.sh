
echo "Selamat Datang di VArchiver"
echo "------------------------------"
echo "Pilih Menu VArchiver:"
echo "1. Lihat File"
echo "2. Hapus File/Folder"
echo "3. Salin File"
echo "------------------------------"
read -p "Masukkan Pilihan: " pilihan

case $pilihan in
    1)
        source lihat.sh
        ;;
    2)
        source hapus.sh
        ;;
    3) 
        source salin.sh
        ;;
    *)
        echo "Pilihan tidak valid!"
        ;;
esac