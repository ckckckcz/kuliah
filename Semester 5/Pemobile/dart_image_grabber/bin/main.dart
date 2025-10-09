import 'dart:io';
import 'package:dart_image_grabber/image_grabber.dart';

void main() async {
  print("Selamat datang di Dart Image Grabber!");
  stdout.write("Inputkan halaman web: ");
  String? url = stdin.readLineSync();

  stdout.write("Masukkan folder tujuan: ");
  String? folder = stdin.readLineSync();

  if (url == null || url.isEmpty || folder == null || folder.isEmpty) {
    print("URL atau folder tidak boleh kosong.");
    return;
  }

  final grabber = ImageGrabber(url, folder);
  await grabber.run();
}
