package uts;

import java.util.Scanner;

public class Customer implements Reservasi {
    private Admin admin; // Variabel buat nyimpen referensi ke objek Admin
    
    // kontruktor untuk ngnisiasi objek Customer
    public Customer(Admin admin) {
        this.admin = admin;
    }

    @Override
    public void pesanKamar() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan Nama Pelanggan: ");
        String namaPelanggan = scanner.nextLine();

        System.out.println("Daftar Kamar yang Tersedia:");
        for (Kamar kamar : admin.getDaftarKamar()) { // Mengiterasi daftar kamar dari admin
            if (kamar.getStatus().equals("Tersedia")) { // Periksa kamar
                System.out.println("- Kamar " + kamar.getNomorKamar()); //nampilin kamar yg tersedia
            }
        }

        System.out.print("Pilih Nomor Kamar untuk Dipesan: ");
        String nomorKamar = scanner.nextLine();

        for (Kamar kamar : admin.getDaftarKamar()) {
            if (kamar.getNomorKamar().equals(nomorKamar) && kamar.getStatus().equals("Tersedia")) {
                kamar.setStatus("Tidak Tersedia");  // Ngubah status kamar jadi tidak tersedia
                Pesanan pesanan = new Pesanan(nomorKamar, namaPelanggan); // Membuat objek Pesanan
                admin.simpanPesanan(pesanan); // Menyimpan pesanan pada admin
                System.out.println("Kamar " + nomorKamar + " berhasil dipesan!");
                return;
            }
        }
         // Jika kamar tidak ditemukan atau tidak tersedia
        System.out.println("Kamar tidak tersedia atau tidak ditemukan.");
    }
    // Ngimplementasi metode untuk cek ketersediaan kamar
    @Override
    public void cekKetersediaan() {
        admin.cekKetersediaan(); // Memanggil metode cek ketersediaan di admin
    }
     // Ngimplementasi metode untuk melihat detail pesanan
    @Override
    public void lihatDetailPesanan() {
        admin.lihatDetailPesanan(); // Memanggil metode lihat detail pesanan di admin
    }
}
