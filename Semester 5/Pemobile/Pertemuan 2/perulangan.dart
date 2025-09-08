void perualangan(String nama, double jumlah){
  for(int i = 0; i < jumlah; i++){
    print("For ke-$i: $nama");
  } 
  print("----------");

  int j = 0;
  while (j < jumlah){
    print("While ke-$j: $jumlah");
    j++;
  }

  print("----------");
}

void main(){
  perualangan("Riovaldo Alfiyan Fahmi Rahman", 50);
}