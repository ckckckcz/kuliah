void pencabangan(double nilai){
  String status;
  if (nilai >= 75){
    status = "Lulus";
  } else {
    status = "Mengulang";
  }

  print("Nilai: $nilai");
  print("Status: $status");
  print("----------");
}

void main(){
  pencabangan(80);
}