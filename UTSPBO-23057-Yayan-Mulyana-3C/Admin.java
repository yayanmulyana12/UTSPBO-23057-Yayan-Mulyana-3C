package uts;

import java.util.Scanner;

public class Admin implements Reservasi {
    private Kamar[] daftarKamar; // menyimpan daftar kamar
    private Pesanan[] daftarPesanan; // menyimpan daftar pesanan
    private int jumlahPesanan = 0; // buat untuk pesanan yang disimpan

    public Admin() {
        daftarKamar = new Kamar[3]; // Inisiasi array kamar
        daftarPesanan = new Pesanan[10]; // Inisiasi array pesanan 

        // Tambahkan kamar
        daftarKamar[0] = new Kamar("1");
        daftarKamar[1] = new Kamar("2");
        daftarKamar[2] = new Kamar("3");
    }

    @Override
    public void pesanKamar() {
        // Admin tidak memesan kamar
    }

    @Override
    public void cekKetersediaan() {
        System.out.println("Daftar Kamar:");
        for (Kamar kamar : daftarKamar) {
            System.out.println("Kamar " + kamar.getNomorKamar() + ": " + kamar.getStatus());
        }
    }

    @Override
    public void lihatDetailPesanan() {
        if (jumlahPesanan > 0) {
            for (int i = 0; i < jumlahPesanan; i++) {
                System.out.println(daftarPesanan[i].getDetailPesanan());
            }
        } else {
            System.out.println("Belum ada pesanan.");
        }
    }

    public void tambahKamar() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan Nomor Kamar Baru: ");
        String nomorKamar = scanner.nextLine();

        Kamar[] kamarBaru = new Kamar[daftarKamar.length + 1]; // Buat array baru untuk menambah kamar
        System.arraycopy(daftarKamar, 0, kamarBaru, 0, daftarKamar.length); // Salin kamar lama ke array baru
        kamarBaru[daftarKamar.length] = new Kamar(nomorKamar); // Tambah kamar baru

        daftarKamar = kamarBaru; // Ganti array lama sama array baru
        System.out.println("Kamar " + nomorKamar + " berhasil ditambahkan!");
    }

    public void updateStatusKamar() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan Nomor Kamar untuk Diubah Status: ");
        String nomorKamar = scanner.nextLine();

        for (Kamar kamar : daftarKamar) {
            if (kamar.getNomorKamar().equals(nomorKamar)) {
                System.out.print("Masukkan Status Baru (Tersedia/Tidak Tersedia): ");
                String statusBaru = scanner.nextLine();
                kamar.setStatus(statusBaru);
                System.out.println("Status kamar " + nomorKamar + " berhasil diubah!");
                return;
            }
        }
        System.out.println("Kamar tidak ditemukan.");
    }

    public void simpanPesanan(Pesanan pesanan) {
        if (jumlahPesanan < daftarPesanan.length) {
            daftarPesanan[jumlahPesanan] = pesanan; // Simpan pesanan baru
            jumlahPesanan++;
        } else {
            System.out.println("Kapasitas pesanan penuh.");
        }
    }

    public Kamar[] getDaftarKamar() {
        return daftarKamar;
    }
}
