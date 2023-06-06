# T05 Buy More Pay Less -- A Modular Version (Paired)

Sejak Rabu lalu Ucok terlihat sering menggaruk-garuk kepalanya. Ia terlihat bingung. Seperti biasa, selepas makan siang di kantin, Butet mendatangi Ucok serta bertanya ada perihal apa yang membuatnya bingung. Ternyata, Ucok bingung karena code dari aplikasi Juragan Buku sangat panjang, kompleks, dan sulit ditelusuri. Bagaimana tidak, saat ini sudah lebih dari 100 baris.

Di sore hari, sambil mencorat-coret secarik kertas, Ucok terinspirasi dengan konsep modular solution. Dengan mengembangkan solusi yang modular, maka aplikasi bisa lebih terstruktur, reusable, dan tentu saja lebih mudah ditelusuri. Karena marasa kesulitan, Ucok kemudian menghubungi pair anda. Menurut Ucok, pair anda termasuk mahasiswa yang memahami konsep modular solution untuk mendapat inspirasi.

Tugas anda bersama pair adalah:
1. Menjabarkan konsep modular solution kepada Ucok;
2. Mendesain setidaknya dua unit (functions).
3. Kedua unit harus memenuhi kriteria: (a) menggunakan paling sedikit 2 parameter, (b) salah satu parameter harus berupa array, dan (c) memberikan return value;

Oleh karena anda akan melakukan perbaikan dengan mengembangkan solusi yang modular tanpa menambah atau mengurangi fitur sebelumnya, maka anda dapat menggunakan contoh dan deskripsi T04.

### Example 1

**Input**:
```bash
979-8700048361
35.98
1
978-0439708180
14.15
3
979-8700048361
35.98
-1
978-0439708180
14.15
4
---

```

**Output**:
```bash
97.07

```

### Example 2

**Input**:
```bash
978-0130895929
50.19
3
978-0593238295
22.11
2
978-0130895929
50.19
10
978-0439708180
14.15
4
978-0593238295
22.11
2
978-0593238295
22.11
3
978-0439708180
14.15
-4
---

```

**Output**:
```bash
771.52

```

HINT: untuk menulis dalam format presisi, silakan melihat fungsi ToFixed(r, i) yang dapat diakses di: http://www.flowgorithm.org/documentation/intrinsic-functions.html 

## Code Generation

Pada saat mengekspor Java code, gunakan template yang telah diberikan ```java-program-template.fpgt```.