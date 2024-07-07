
package uassss;

//class
public class Laundry {
//atribut dan encapsulation
    private String namaPelanggan;
    private double beratPakaian; //dalam kg
    private String layanan;
    private double totalHarga;

 //constructor
    public Laundry(String namaPelanggan, double beratPakaian, String layanan) {
        this.namaPelanggan = namaPelanggan;
        this.beratPakaian = beratPakaian;
        this.layanan = layanan;
        hitungTotalHarga();
    }

//Accessor (getter)
    // Accessor untuk namaPelanggan
    public String getNamaPelanggan() {
        return namaPelanggan;
    }
    // Accessor untuk beratPakaian
    public double getBeratPakaian() {
        return beratPakaian;
    }
     // Accessor untuk layanan
    public String getLayanan() {
        return layanan;
    }
    // Accessor untuk totalHarga
    public double getTotalHarga() {
        return totalHarga;
    }
    
//Mutator (setter)
    // Mutator untuk namaPelanggan
    public void setNamaPelanggan(String namaPelanggan) {
        this.namaPelanggan = namaPelanggan;
    }

    // Mutator untuk beratPakaian
    public void setBeratPakaian(double beratPakaian) {
        this.beratPakaian = beratPakaian;
        hitungTotalHarga();
    }
// Mutator untuk layanan
    public void setLayanan(String layanan) {
        this.layanan = layanan;
        hitungTotalHarga();
        
    } 
//perhitungan
    private void hitungTotalHarga() {
        switch (layanan.toLowerCase()) {
            case "cuci kering" -> totalHarga = 5000 * beratPakaian;
            case "cuci setrika" -> totalHarga = 9000 * beratPakaian;
            case "setrika" -> totalHarga = 4000 * beratPakaian;
            default -> {
                System.out.println("Layanan tidak tersedia");
                totalHarga = 0; // Set total harga menjadi 0 jika layanan tidak valid
            }
        }
    } 
}