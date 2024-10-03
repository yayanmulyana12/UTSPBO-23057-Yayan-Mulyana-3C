package uts;

public class Kamar {
    private String nomorKamar;
    private String status; // Variabel buat nyimpan status kamar (Tersedia atau Tidak Tersedia)

    // kontruktor buat ngonosoasi objek Kamar
    public Kamar(String nomorKamar) {
        this.nomorKamar = nomorKamar; // Mengatur nomor kamar
        this.status = "Tersedia"; // Mengatur status kamar jadi "Tersedia" ketika dibuat
    }
    // Metode buat mendapatkan nomor kamar
    public String getNomorKamar() {
        return nomorKamar;
    }
    // Metode buat mendapatkan status kamar
    public String getStatus() {
        return status;
    }
    // Metode buat mengatur status kamar
    public void setStatus(String status) {
        this.status = status; // Mengatur status kamar sesuai dengan input
    }
}
