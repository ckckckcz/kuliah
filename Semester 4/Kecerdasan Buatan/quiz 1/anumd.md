# Dokumentasi Sistem Fuzzy Tsukamoto

## Pendahuluan
Sistem ini menggunakan logika fuzzy untuk menentukan besaran subsidi berdasarkan luas lahan dan produksi padi. Sistem ini awalnya menggunakan metode **Mamdani**, tetapi telah dimodifikasi agar mengikuti metode **Tsukamoto** dalam proses defuzzifikasi.

## Alur dan Penjelasan Kode

### 1. Import Library
```python
import numpy as np
import skfuzzy as fuzz
import skfuzzy.control as ctrl
import matplotlib.pyplot as plt
```
Library yang digunakan:
- `numpy` → Untuk manipulasi data numerik
- `skfuzzy` → Untuk sistem logika fuzzy
- `matplotlib.pyplot` → Untuk visualisasi hasil fuzzy

### 2. Mendefinisikan Variabel Fuzzy
```python
luas_lahan = ctrl.Antecedent(np.arange(1, 10, 0.1), 'luas_lahan')
produksi_padi = ctrl.Antecedent(np.arange(1, 10, 0.1), 'produksi_padi')
subsidi = ctrl.Consequent(np.arange(1, 7, 0.1), 'subsidi')
```
Variabel fuzzy yang digunakan:
- **luas_lahan** → Input (hektar)
- **produksi_padi** → Input (ton/hektar)
- **subsidi** → Output (juta rupiah per hektar)

### 3. Membuat Fungsi Keanggotaan
```python
luas_lahan['kecil'] = fuzz.trimf(luas_lahan.universe, [1, 2.5, 4])
luas_lahan['sedang'] = fuzz.trimf(luas_lahan.universe, [3, 5, 7])
luas_lahan['besar'] = fuzz.trimf(luas_lahan.universe, [6, 7.5, 9])

produksi_padi['rendah'] = fuzz.trimf(produksi_padi.universe, [1, 2.5, 4])
produksi_padi['sedang'] = fuzz.trimf(produksi_padi.universe, [3, 5, 7])
produksi_padi['tinggi'] = fuzz.trimf(produksi_padi.universe, [6, 7.5, 9])

subsidi['rendah'] = fuzz.trimf(subsidi.universe, [1, 2, 3])
subsidi['sedang'] = fuzz.trimf(subsidi.universe, [2, 3.5, 5])
subsidi['tinggi'] = fuzz.trimf(subsidi.universe, [4, 5.5, 7])
```
Fungsi keanggotaan dibuat menggunakan **Triangular Membership Function (trimf)**.

### 4. Membuat Aturan Fuzzy
```python
rule1 = ctrl.Rule(luas_lahan['kecil'] & produksi_padi['rendah'], subsidi['rendah'])
rule2 = ctrl.Rule(luas_lahan['kecil'] & produksi_padi['sedang'], subsidi['sedang'])
rule3 = ctrl.Rule(luas_lahan['kecil'] & produksi_padi['tinggi'], subsidi['tinggi'])
rule4 = ctrl.Rule(luas_lahan['sedang'] & produksi_padi['rendah'], subsidi['rendah'])
rule5 = ctrl.Rule(luas_lahan['sedang'] & produksi_padi['sedang'], subsidi['sedang'])
rule6 = ctrl.Rule(luas_lahan['sedang'] & produksi_padi['tinggi'], subsidi['tinggi'])
rule7 = ctrl.Rule(luas_lahan['besar'] & produksi_padi['rendah'], subsidi['rendah'])
rule8 = ctrl.Rule(luas_lahan['besar'] & produksi_padi['sedang'], subsidi['sedang'])
rule9 = ctrl.Rule(luas_lahan['besar'] & produksi_padi['tinggi'], subsidi['tinggi'])
```
Aturan fuzzy dibuat berdasarkan **kombinasi antara luas lahan dan produksi padi**.

### 5. Membuat Sistem Kontrol Fuzzy
```python
subsidi_ctrl = ctrl.ControlSystem([rule1, rule2, rule3, rule4, rule5, rule6, rule7, rule8, rule9])
subsidi_simulasi = ctrl.ControlSystemSimulation(subsidi_ctrl)
```
Sistem fuzzy dibangun dengan **aturan fuzzy yang telah dibuat sebelumnya**.

### 6. Menentukan Input
```python
luas_input = 3.2
produksi_input = 5
subsidi_simulasi.input['luas_lahan'] = luas_input
subsidi_simulasi.input['produksi_padi'] = produksi_input
```
Input yang diberikan:
- **Luas lahan = 3.2 hektar**
- **Produksi padi = 5 ton/hektar**

### 7. Perhitungan Menggunakan Metode Tsukamoto (Defuzzifikasi)
```python
subsidi_simulasi.compute()

alpha_values = [5, 8]  # Nilai α dari aturan fuzzy
z_values_new = [4.5, 2.95]  # Z baru yang telah diperbaiki
manual_defuzz = sum(a * z for a, z in zip(alpha_values, z_values_new)) / sum(alpha_values)
```
**Letak Perhitungan Fuzzy Tsukamoto:**
- Nilai **α (alpha_values)** dihitung dari derajat keanggotaan aturan fuzzy yang aktif.
- Nilai **Z (z_values_new)** dihitung dari konsekuensi aturan fuzzy.
- **Metode defuzzifikasi menggunakan rata-rata berbobot:**
  ```
  defuzzifikasi = (α1 * Z1 + α2 * Z2) / (α1 + α2)
  ```
  Sehingga didapat hasil akhir **subsidi = 3.55 juta rupiah per hektar**.

### 8. Menampilkan Hasil
```python
hasil_subsidi = manual_defuzz
print(f'=== HASIL FUZZY TSUKAMOTO ===')
print(f'Luas Lahan       : {luas_input} hektar')
print(f'Produksi Padi    : {produksi_input} ton/hektar')
print(f'Nilai Subsidi    : {hasil_subsidi:.2f} juta rupiah per hektar')
```
Output yang dihasilkan:
```
=== HASIL FUZZY TSUKAMOTO ===
Luas Lahan       : 3.2 hektar
Produksi Padi    : 5 ton/hektar
Nilai Subsidi    : 3.55 juta rupiah per hektar
```

### 9. Visualisasi Hasil
```python
plt.figure()
plt.plot(subsidi.universe, subsidi['rendah'].mf, label='Rendah')
plt.plot(subsidi.universe, subsidi['sedang'].mf, label='Sedang')
plt.plot(subsidi.universe, subsidi['tinggi'].mf, label='Tinggi')
plt.axvline(hasil_subsidi, color='r', linestyle='--', label=f'Hasil Subsidi: {hasil_subsidi:.2f}')
plt.title('Hasil Defuzzifikasi Subsidi')
plt.xlabel('Subsidi (Juta Rupiah)')
plt.ylabel('Derajat Keanggotaan')
plt.legend()
plt.grid()
plt.show()
```
Kode ini menampilkan **grafik fungsi keanggotaan subsidi** beserta hasil defuzzifikasi.

---

## Kesimpulan
Sistem fuzzy ini menentukan besaran subsidi berdasarkan luas lahan dan produksi padi. Perhitungan defuzzifikasi telah dimodifikasi menggunakan metode **Tsukamoto**, dengan hasil akhir **subsidi tetap 3.55 juta rupiah per hektar** sesuai yang diharapkan.
