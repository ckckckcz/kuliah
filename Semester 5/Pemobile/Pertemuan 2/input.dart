import "dart:io";

void input(){
  stdout.write("Masukkan nama:  ");
  String? nama = stdin.readLineSync();

  print("Halo nama aku, $nama!");
  print("----------");
}