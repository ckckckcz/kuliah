void map(){
  Map<String, String> biodata =
  {
    "Nama"    : "Riovaldo Alfiyan Fahmi Rahman",
    "Jurusan" : "Teknologi Informasi"
  };

  biodata["asal"] = "Malang";

  print("Biodata  : $biodata");
  print("Nama     : ${biodata['nama']}");

  print("----------");
}