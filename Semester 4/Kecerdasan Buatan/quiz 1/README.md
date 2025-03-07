# Dokumentasi Sistem Fuzzy untuk Subsidi Pertanian

## Pendahuluan
Notebook ini berisi implementasi sistem fuzzy menggunakan **Scikit-Fuzzy** untuk menentukan subsidi pertanian berdasarkan luas lahan dan produksi padi. Metode fuzzy yang digunakan adalah **Tsukamoto**, yang menggunakan inferensi berbasis aturan dengan fungsi keanggotaan monoton.

## Instalasi
Pastikan Anda memiliki pustaka berikut sebelum menjalankan kode:

```bash
pip install numpy scikit-fuzzy matplotlib networkx
```

## Penjelasan Kode

### 1. Import Pustaka
```python
import skfuzzy as fuzz
import skfuzzy.control as ctrl
import numpy as np
import matplotlib.pyplot as plt
```
Kode ini mengimpor pustaka yang diperlukan untuk implementasi sistem fuzzy, seperti **Scikit-Fuzzy** untuk perhitungan logika fuzzy, **NumPy** untuk manipulasi data numerik, dan **Matplotlib** untuk visualisasi.

### 2. Fuzzifikasi (Menentukan Variabel Input dan Output)
```python
luas_lahan = ctrl.Antecedent(np.arange(0, 6.1, 0.1), 'luas_lahan')
produksi_padi = ctrl.Antecedent(np.arange(2, 8.1, 0.1), 'produksi_padi')
subsidi = ctrl.Consequent(np.arange(1, 7.1, 0.1), 'subsidi')
```
Fuzzifikasi adalah proses mengubah nilai input menjadi derajat keanggotaan pada himpunan fuzzy.
- **`luas_lahan`**: Input berupa luas lahan pertanian dalam hektar.
- **`produksi_padi`**: Input berupa produksi padi dalam ton/hektar.
- **`subsidi`**: Output berupa subsidi dalam juta rupiah per hektar.

### 3. Derajat Keanggotaan (Membership Functions)
Fungsi keanggotaan menentukan seberapa besar suatu nilai masuk dalam kategori tertentu.

#### Fungsi Keanggotaan untuk Luas Lahan
```python
luas_lahan['kecil'] = fuzz.trimf(luas_lahan.universe, [0, 1, 2])
luas_lahan['sedang'] = fuzz.trimf(luas_lahan.universe, [1.5, 2.75, 4])
luas_lahan['besar'] = fuzz.trimf(luas_lahan.universe, [3, 4.5, 6])
```
- **Kecil**: 0 - 2 hektar
- **Sedang**: 1.5 - 4 hektar
- **Besar**: 3 - 6 hektar

#### Fungsi Keanggotaan untuk Produksi Padi
```python
produksi_padi['rendah'] = fuzz.trimf(produksi_padi.universe, [2, 3, 4])
produksi_padi['sedang'] = fuzz.trimf(produksi_padi.universe, [3, 4.5, 6])
produksi_padi['tinggi'] = fuzz.trimf(produksi_padi.universe, [5, 6.5, 8])
```
- **Rendah**: 2 - 4 ton/hektar
- **Sedang**: 3 - 6 ton/hektar
- **Tinggi**: 5 - 8 ton/hektar

### 4. Inferensi (Menentukan Aturan Fuzzy)
Inferensi dilakukan dengan menerapkan aturan berbasis **logika IF-THEN** untuk menentukan keluaran fuzzy.
```python
rule1 = ctrl.Rule(luas_lahan['kecil'] & produksi_padi['rendah'], subsidi['rendah'])
rule2 = ctrl.Rule(luas_lahan['kecil'] & produksi_padi['sedang'], subsidi['sedang'])
rule3 = ctrl.Rule(luas_lahan['besar'] & produksi_padi['tinggi'], subsidi['tinggi'])
```
Aturan fuzzy di atas merepresentasikan bagaimana nilai input dikombinasikan untuk menghasilkan nilai keluaran.
- Jika luas lahan kecil dan produksi padi rendah, maka subsidi rendah.
- Jika luas lahan kecil dan produksi padi sedang, maka subsidi sedang.
- Jika luas lahan besar dan produksi padi tinggi, maka subsidi tinggi.

### 5. Defuzzifikasi (Mengubah Hasil Fuzzy Menjadi Nilai Nyata)
Proses defuzzifikasi dilakukan untuk mendapatkan nilai crisp sebagai hasil akhir.
```python
subsidi_ctrl = ctrl.ControlSystem([rule1, rule2, rule3])
subsidi_sim = ctrl.ControlSystemSimulation(subsidi_ctrl)
subsidi_sim.input['luas_lahan'] = 3.2
subsidi_sim.input['produksi_padi'] = 5
subsidi_sim.compute()
print(subsidi_sim.output['subsidi'])
```
- Sistem menerima input nilai **luas lahan = 3.2 hektar** dan **produksi padi = 5 ton/hektar**.
- Berdasarkan aturan fuzzy yang telah dibuat, sistem menghitung nilai keanggotaan dan mengombinasikan aturan.
- Hasil akhirnya adalah subsidi dalam bentuk angka konkret yang siap digunakan sebagai rekomendasi keputusan.

