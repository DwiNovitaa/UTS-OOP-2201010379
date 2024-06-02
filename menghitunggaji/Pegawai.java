/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package menghitunggaji;
import java.util.Scanner;

/**
 *
 * @author Kadek Dwi Novita Muliawati (2201010379)
 */
public class Pegawai {
    private static Pegawai[] pegawaiArray = new Pegawai[100];
    private static int count = 0;

    protected String nama;
    protected String jenis;

    public Pegawai(String nama, String jenis) {
        this.nama = nama;
        this.jenis = jenis;
    }

    public void hitungGaji() {
        // bagian ini saya kosongkan karena ketika dirun method hitunggaji akan di-override oleh class turunan sesuai dengan jenis pegawai
    }

    public void tampilkanData() {
        // ini juga dikosongkan karena ketika dirun method ini juga akan di-override oleh class turunan sesuai dengan jenis pegawai
    }

    public String getNama() {
        return nama;
    }

    public String getJenis() {
        return jenis;
    }

    public static void tambahPegawai(Scanner scanner) {
        System.out.println("Masukkan jenis pegawai (1 untuk Pegawai Tetap, 2 untuk Pegawai Kontrak): ");
        int jenisPegawai = scanner.nextInt();
        scanner.nextLine();  

        System.out.println("Masukkan nama pegawai: ");
        String nama = scanner.nextLine();

        if (jenisPegawai == 1) {
            System.out.println("Masukkan gaji pokok: ");
            double gajiPokok = scanner.nextDouble();

            System.out.println("Masukkan tunjangan: ");
            double tunjangan = scanner.nextDouble();

            pegawaiArray[count] = new PegawaiTetap(nama, gajiPokok, tunjangan);

        } else if (jenisPegawai == 2) {
            System.out.println("Masukkan tarif per jam: ");
            double tarifPerJam = scanner.nextDouble();

            System.out.println("Masukkan jumlah jam kerja: ");
            int jamKerja = scanner.nextInt();

            pegawaiArray[count] = new PegawaiKontrak(nama, tarifPerJam, jamKerja);

        } else {
            System.out.println("Jenis pegawai tidak valid.");
            return;
        }

        count++;
        System.out.println("Pegawai berhasil ditambahkan!");
    }

    public static void tampilkanPegawai() {
        if (count == 0) {
            System.out.println("Tidak ada pegawai yang tercatat.");
            return;
        }

        for (int i = 0; i < count; i++) {
            System.out.println("Pegawai ke-" + (i + 1) + ":");
            pegawaiArray[i].tampilkanData();
            pegawaiArray[i].hitungGaji();
            System.out.println("-----------------------------");
        }
    }

    public static void ubahPegawai(Scanner scanner) {
        System.out.println("Masukkan nomor pegawai yang ingin diubah: ");
        int index = scanner.nextInt() - 1;

        if (index < 0 || index >= count) {
            System.out.println("Nomor pegawai tidak valid.");
            return;
        }

        scanner.nextLine();  
        Pegawai pegawai = pegawaiArray[index];

        System.out.println("Mengubah data untuk pegawai: " + pegawai.getNama());
        if (pegawai.getJenis().equals("tetap")) {
            System.out.println("Masukkan gaji pokok baru: ");
            double gajiPokok = scanner.nextDouble();

            System.out.println("Masukkan tunjangan baru: ");
            double tunjangan = scanner.nextDouble();

            ((PegawaiTetap) pegawai).ubahPegawaiTetap(gajiPokok, tunjangan);

        } else if (pegawai.getJenis().equals("kontrak")) {
            System.out.println("Masukkan tarif per jam baru: ");
            double tarifPerJam = scanner.nextDouble();

            System.out.println("Masukkan jumlah jam kerja baru: ");
            int jamKerja = scanner.nextInt();

            ((PegawaiKontrak) pegawai).ubahPegawaiKontrak(tarifPerJam, jamKerja);
        }

        System.out.println("Data pegawai berhasil diubah!");
    }

    public static void hapusPegawai(Scanner scanner) {
        System.out.println("Masukkan nomor pegawai yang ingin dihapus: ");
        int index = scanner.nextInt() - 1;

        if (index < 0 || index >= count) {
            System.out.println("Nomor pegawai tidak valid.");
            return;
        }

        for (int i = index; i < count - 1; i++) {
            pegawaiArray[i] = pegawaiArray[i + 1];
        }

        pegawaiArray[count - 1] = null;
        count--;
        System.out.println("Data pegawai berhasil dihapus!");
    }
}

