import 'dart:io';
import 'downloader.dart';
import 'html_parser.dart';

class ImageGrabber {
  final String url;
  final String outputFolder;

  ImageGrabber(this.url, this.outputFolder);

  Future<void> run() async {
    print("Mengunduh halaman...");
    final htmlContent = await Downloader.fetchHtml(url);
    if (htmlContent == null) {
      print("Gagal mengunduh halaman.");
      return;
    }

    final imageUrls = HtmlParser.extractImageUrls(htmlContent, baseUrl: url);
    if (imageUrls.isEmpty) {
      print("Tidak ditemukan gambar pada halaman.");
      return;
    }

    Directory dir = Directory(outputFolder);
    if (!dir.existsSync()) {
      dir.createSync(recursive: true);
    }

    print("Menemukan ${imageUrls.length} gambar. Mengunduh...");
    for (final imgUrl in imageUrls) {
      await Downloader.downloadImage(imgUrl, dir.path);
    }

    print("Unduhan selesai, silahkan cek folder '$outputFolder'.");
  }
}
