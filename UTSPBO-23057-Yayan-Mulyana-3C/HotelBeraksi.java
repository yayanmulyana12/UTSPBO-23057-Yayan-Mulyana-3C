package uts;

import java.util.Scanner;

public class HotelBeraksi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Ngebuat objek Scanner buat membaca input dari pengguna
        Admin admin = new Admin(); // Ngebuat objek Admin
        Customer customer = new Customer(admin); 
        // Menu utama 
        System.out.println("=== Selamat Datang di Sistem Hotel ===");
        System.out.println("Apakah Anda ingin masuk sebagai Admin atau Customer?");
        System.out.println("1. Admin");
        System.out.println("2. Pengunjung");
        System.out.print("Pilih user: ");
        int peran = scanner.nextInt(); // Ngebaca input peran yang dipilih sama user
        scanner.nextLine(); // Membersihkan newline 
        // Meriksa apakah pengguna memilih sebagai Admin
        if (peran == 1) {
            while (true) {
                //Menu buat admin
                System.out.println("\n=== Menu Admin ===");
                System.out.println("1. Cek Ketersediaan Kamar");
                System.out.println("2. Lihat Detail Semua Pesanan");
                System.out.println("3. Tambah Kamar");
                System.out.println("4. Update Status Kamar");
                System.out.println("5. Keluar");
                System.out.print("Pilih menu: ");
                int pilihan = scanner.nextInt(); // Membaca pilihan dari admin
                scanner.nextLine(); // Membersihkan newline

                switch (pilihan) {
                    case 1:
                        admin.cekKetersediaan(); // Manggil metode untuk cek ketersediaan kamar
                        break;
                    case 2:
                        admin.lihatDetailPesanan(); // Manggil metode untuk cek detail pesanan
                        break;
                    case 3:
                        admin.tambahKamar(); // Manggil metode untuk tambah kamar
                        break;
                    case 4:
                        admin.updateStatusKamar(); // Manggil metode untuk ganti status kamar
                        break;
                    case 5:
                        System.out.println("Terima kasih, Admin!");
                        return;
                    default:
                        System.out.println("Pilihan tidak valid.");
                }
            }
            // Meriksa apakah pengguna memilih sebagai Pengunjung
        } else if (peran == 2) {
            while (true) {
                System.out.println("\n=== Menu Pembeli ===");
                System.out.println("1. Cek Ketersediaan Kamar");
                System.out.println("2. Pesan Kamar");
                System.out.println("3. Lihat Detail Pesanan");
                System.out.println("4. Keluar");
                System.out.print("Pilih menu: ");
                int pilihan = scanner.nextInt(); // Membaca pilihan dari Pengunjung
                scanner.nextLine();  // Membersihkan newline

                switch (pilihan) {
                    case 1:
                        customer.cekKetersediaan(); // Manggil metode untuk cek ketersediaan kamar
                        break;
                    case 2:
                        customer.pesanKamar(); // Manggil metode untuk pesan kamar
                        break;
                    case 3:
                        customer.lihatDetailPesanan(); // Manggil metode untuk cek detail pesanan
                        break;
                    case 4:
                        System.out.println("Terima kasih, Customer!");
                        return;
                    default:
                        System.out.println("Pilihan tidak valid.");
                }
            }
             // Jika pilihan pengunjung tidak valid
        } else {
            System.out.println("Pilihan peran tidak valid.");
        }
    }
}
