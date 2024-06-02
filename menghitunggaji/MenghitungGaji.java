/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package menghitunggaji;
import java.util.Scanner;
/**
 *
 * @author Kadek Dwi Novita Muliawati (2201010379)
 */
public class MenghitungGaji {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int pilihan;

        do {
            System.out.println("Aplikasi Menghitung Gaji Pegawai Tetap & Kontrak");
            System.out.println("Menu Aplikasi:");
            System.out.println("1. Tambah Pegawai");
            System.out.println("2. Tampilkan Pegawai");
            System.out.println("3. Ubah Data Pegawai");
            System.out.println("4. Hapus Data Pegawai");
            System.out.println("5. Keluar");
            System.out.print("Pilih opsi: ");
            pilihan = scanner.nextInt();
            scanner.nextLine();  

            switch (pilihan) {
                case 1:
                    Pegawai.tambahPegawai(scanner);
                    break;
                case 2:
                    Pegawai.tampilkanPegawai();
                    break;
                case 3:
                    Pegawai.ubahPegawai(scanner);
                    break;
                case 4:
                    Pegawai.hapusPegawai(scanner);
                    break;
                case 5:
                    System.out.println("Keluar dari aplikasi...");
                    break;
                default:
                    System.out.println("Pilihan tidak valid!");
            }
        } while (pilihan != 5);

        scanner.close();
    }
    
}
