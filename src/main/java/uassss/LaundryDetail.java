
package uassss;

public class LaundryDetail extends Laundry {
//inhertance
    public LaundryDetail(String namaPelanggan, double beratPakaian, String layanan) {
        super(namaPelanggan, beratPakaian, layanan);
    }
//polymorphinm 
    @Override
    public String toString() {
        return "LaundryDetail{" +
                "namaPelanggan='" + getNamaPelanggan() + '\'' +
                ", beratPakaian=" + getBeratPakaian() +
                ", layanan='" + getLayanan() + '\'' +
                ", totalHarga=" + getTotalHarga() +
                '}';
    }
}