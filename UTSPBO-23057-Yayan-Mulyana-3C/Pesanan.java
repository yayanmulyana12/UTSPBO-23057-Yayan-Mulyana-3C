package uts;

public class Pesanan {
    private String nomorKamar; // Variabel buat yimpan nomor kamar
    private String namaPelanggan; // Variabel buat nyimpan nama pelanggan
    
    // kontruktor buat nginisiasi objek Pesanan
    public Pesanan(String nomorKamar, String namaPelanggan) {
        this.nomorKamar = nomorKamar; // Mengatur nomor kamar
        this.namaPelanggan = namaPelanggan; // Mengatur nama pelanggan
    }
    // Metode buat mendapatkan detail pesanan 
    public String getDetailPesanan() {
         // Mengembalikan detail pesanan, nama pelanggan dan nomor kamar
        return "Nama Pelanggan: " + namaPelanggan + ", Nomor Kamar: " + nomorKamar;
    }
}
