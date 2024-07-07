# Proyek Akhir Pemrograman Berbasis Objek 1

Proyek ini adalah contoh sederhana aplikasi pengolahan data mahasiswa menggunakan Java sebagai tugas akhir dari mata kuliah pemrograman berbasis objek 1.

## Deskripsi

Aplikasi ini menerima input berupa nama dan NPM mahasiswa, dan memberikan output berupa informasi detail dari NPM tersebut seperti tahun masuk, fakultas, program studi, dan nomor registrasi.

Aplikasi ini mengimplementasikan beberapa konsep penting dalam pemrograman berorientasi objek (OOP) seperti Class, Object, Atribut, Method Constructor, Method Mutator, Method Accessor, Encapsulation, Inheritance, Overloading, Overriding, Seleksi, Perulangan, IO Sederhana, Array, dan Error Handling.

## Penjelasan Kode

Berikut adalah bagian kode yang relevan dengan konsep OOP yang dijelaskan:

1. **Class** adalah template atau blueprint dari object. Pada kode ini, `Laundry`, `LaundryDetail`, dan `LaundryBeraksi` adalah contoh dari class.

```bash
public class Laundry {
    ...
}

public class LaundryDetail extends Laundry {
    ...
}

public class LaundryBeraksi {
    ...
}
```

2. **Object** adalah instance dari class. Pada kode ini, `LaundryDetail[] transaksi = new LaundryDetail(maxTransaksi);` adalah contoh pembuatan object.

```bash
Laundry[i] = new LaundryDetail(maxTransaksi);
```

3. **Atribut** adalah variabel yang ada dalam class. Pada kode ini, `namaPelanggan` dan `Layanan` dan `beratPakaian` dan `totalHarga` danadalah contoh atribut.

```bash
String namaPelanggan;
double beratPakaian;
String Layanan;
double totalHarga;
```

4. **Constructor** adalah method yang pertama kali dijalankan pada saat pembuatan object. Pada kode ini, constructor ada di dalam class `Laundry` dan `LaundryDetail`.

```bash
public Laundry(String namaPelanggan, double beratPakaian, String layanan) {
    this.namaPelanggan = namaPelanggan;
    this.beratPakaian = beratPakaian;
    this.layanan = layanan;
}

public LaundryDetail(String nama, String npm) {
    super(namaPelanggan, beratPakaian, layanan);
}
```

5. **Mutator** atau setter digunakan untuk mengubah nilai dari suatu atribut. Pada kode ini, `setNamaPelanggan` dan `setBeratPakaian` dan `setLayanan` adalah contoh method mutator.

```bash
public void setNamaPelanggan(String namaPelanggan) {
    this.namaPelanggan = namaPelanggan;
}

public void setBeratPakaian(double berataPakaian) {
    this.beratPakaian = beraatPakaian;
}

public void setLayanan(String layanan) {
    this.layanan = layanan;
```

6. **Accessor** atau getter digunakan untuk mengambil nilai dari suatu atribut. Pada kode ini, `getNamaPelanggan`, `getBeratPakaian`, `getLayanan`, dan `getTotalHarga` adalah contoh method accessor.

```bash
public String getNamaPelanggan() {
    return namaPelanggan;
}

public double getBeratPakaian() {
    return beratPakaian;
}

public String getLayanan() {
    return Layanan;
}

public double getTotalHarga(){
    return TotalHarga;
}
```

7. **Encapsulation** adalah konsep menyembunyikan data dengan membuat atribut menjadi private dan hanya bisa diakses melalui method. Pada kode ini, atribut `namaPelangan`,`beratPakaian`,`layanan`, dan `totalHarga`  dienkapsulasi dan hanya bisa diakses melalui method getter dan setter.

```bash
private String namaPelanggan;
private double beratPakaian;
private String layanan;
private double totalHarga;
```

8. **Inheritance** adalah konsep di mana sebuah class bisa mewarisi property dan method dari class lain. Pada kode ini, `LaundryDetail` mewarisi `Laundry` dengan sintaks `extends`.

```bash
public class LaundryDetail extends Laundry {
    ...
}
```

9. **Polymorphism** adalah konsep di mana sebuah nama dapat digunakan untuk merujuk ke beberapa tipe atau bentuk objek berbeda. Ini memungkinkan metode-metode dengan nama yang sama untuk berperilaku berbeda tergantung pada tipe objek yang mereka manipulasi, polymorphism bisa berbentuk Overloading ataupun Overriding. Pada kode ini, method `toString()` di `Laundry` merupakan overloading method `displayInfo` dan `displayInfo` di `LaundryDetail` merupakan override dari method `displayInfo` di `Laundry`.

```bash
public String toString() {
    return () + "\nKelas: " + kelas;
}

@Override
public String toString() {
    ...
}
```

10. **Seleksi** adalah statement kontrol yang digunakan untuk membuat keputusan berdasarkan kondisi. Pada kode ini, digunakan seleksi `switch` dalam method `layanan` dan seleksi `switch` dalam method `kodeLayanan`.

```bash
String layanan = "";
     switch (kodeLayanan) {
        case 1:
            layanan = "cuci kering";
               break;
        case 2:
            layanan = "cuci setrika";
                break;
        case 3:
            layanan = "setrika";
                 break;
                    default:
     System.out.println("Kode layanan tidak valid");
        lanjutkan = false; 
                  break;
                }
```

11. **Perulangan** adalah statement kontrol yang digunakan untuk menjalankan blok kode berulang kali. Pada kode ini, digunakan loop `while` untuk meminta input dan menampilkan data.

```bash
while (lanjutkan && jumlahTransaksi < maxTransaksi);
```

12. **Input Output Sederhana** digunakan untuk menerima input dari user dan menampilkan output ke user. Pada kode ini, digunakan class `Scanner` untuk menerima input dan method `System.out.println` untuk menampilkan output.

```bash
Scanner scanner = new Scanner(System.in) ;
boolean lanjutkan = true;
int maxTransaksi = 10;
```

13. **Array** adalah struktur data yang digunakan untuk menyimpan beberapa nilai dalam satu variabel. Pada kode ini, `LaundryDetail[] transaksi = new LaundryDetail[maxTransaksi];` adalah contoh penggunaan array.

```bash
LaundryDetail[] transaksi = new LaundryDetail[maxTransaksi];
```

14. **Error Handling** digunakan untuk menangani error yang mungkin terjadi saat runtime. Pada kode ini, digunakan `do`,`try` dan `if` untuk menangani error.

```bash
do {
            try {
                System.out.print("Masukkan nama pelanggan: ");
                String namaPelanggan = scanner.nextLine();

                System.out.print("Masukkan berat pakaian (kg): ");
                double beratPakaian = scanner.nextDouble();
                scanner.nextLine(); 
                
                // Validasi input berat pakaian
                if (beratPakaian <= 0) {
                    System.out.println("Berat pakaian harus lebih dari 0 kg");
                    lanjutkan = false; 
                }

                System.out.println("Pilih layanan:");
                System.out.println("1. Cuci Kering (Rp 5000 per kg)");
                System.out.println("2. Cuci Setrika (Rp 9000 per kg)");
                System.out.println("3. Setrika (Rp 4000 per kg)");
                System.out.print("Masukkan kode layanan (1/2/3): ");
                int kodeLayanan = scanner.nextInt();
                scanner.nextLine();
```

## Usulan nilai

| No  | Materi         |  Nilai  |
| :-: | -------------- | :-----: |
|  1  | Class          |    5    |
|  2  | Object         |    5    |
|  3  | Atribut        |    5    |
|  4  | Constructor    |    5    |
|  5  | Mutator        |    5    |
|  6  | Accessor       |    5    |
|  7  | Encapsulation  |    5    |
|  8  | Inheritance    |    5    |
|  9  | Polymorphism   |   10    |
| 10  | Seleksi        |    5    |
| 11  | Perulangan     |    5    |
| 12  | IO Sederhana   |   10    |
| 13  | Array          |   15    |
| 14  | Error Handling |   15    |
|     | **TOTAL**      | **100** |

## Pembuat

Nama: Hidayat Noor Fadilah
NPM: 2210010060
