
package uassss;

import java.util.InputMismatchException;
import java.util.Scanner;

public class LaundryBeraksi {
    public static void main(String[] args) {
//IO sederhana
        Scanner scanner = new Scanner(System.in);
        boolean lanjutkan = true;
        int maxTransaksi = 10;
//Array
        LaundryDetail[] transaksi = new LaundryDetail[maxTransaksi];
//object
        transaksi[0] = new LaundryDetail("Fadil", 3.5, "cuci kering");
        int jumlahTransaksi = 0; 
//eror handling
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
//seleksi
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

        if (lanjutkan) {
// Buat objek LaundryDetail
    LaundryDetail laundry = new LaundryDetail(namaPelanggan, beratPakaian, layanan);
                    
// Simpan transaksi ke dalam array
    transaksi[jumlahTransaksi] = laundry;
    jumlahTransaksi++;

// Tampilkan detail laundry dan total harga
    System.out.println("\nDetail Laundry:");
    System.out.println("Nama Pelanggan: " + laundry.getNamaPelanggan());
    System.out.println("Berat Pakaian: " + laundry.getBeratPakaian() + " kg");
    System.out.println("Layanan: " + laundry.getLayanan());
    System.out.println("Total Harga: Rp " + laundry.getTotalHarga());

// Tanya pengguna apakah ingin melanjutkan
    System.out.print("\nApakah Anda ingin melakukan input lagi? (ya/tidak): ");
    String jawaban = scanner.nextLine();
    if (!jawaban.equalsIgnoreCase("ya")) {
       lanjutkan = false;
                    }
                }
    } catch (InputMismatchException e) {
    System.out.println("Input yang dimasukkan tidak valid. Masukkan angka untuk berat pakaian atau kode layanan.");
    scanner.nextLine(); 
          lanjutkan = false; 
         }
    
        } 
//perulangan
        while (lanjutkan && jumlahTransaksi < maxTransaksi);

// tampilan
        System.out.println("\nDaftar Transaksi Laundry:");
        for (int i = 0; i < jumlahTransaksi; i++) {
            System.out.println("Transaksi ke-" + (i + 1));
            System.out.println("Nama Pelanggan: " + transaksi[i].getNamaPelanggan());
            System.out.println("Berat Pakaian: " + transaksi[i].getBeratPakaian() + " kg");
            System.out.println("Layanan: " + transaksi[i].getLayanan());
            System.out.println("Total Harga: Rp " + transaksi[i].getTotalHarga());
            System.out.println("--------------------");
        }

        scanner.close();
    }
}