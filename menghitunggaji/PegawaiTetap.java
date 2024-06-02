/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package menghitunggaji;

/**
 *
 * @author Kadek Dwi Novita Muliawati (2201010379)
 */
public class PegawaiTetap extends Pegawai {
    private double gajiPokok;
    private double tunjangan;

    public PegawaiTetap(String nama, double gajiPokok, double tunjangan) {
        super(nama, "tetap");
        this.gajiPokok = gajiPokok;
        this.tunjangan = tunjangan;
    }

    @Override
    public void hitungGaji() {
        double gaji = gajiPokok + tunjangan;
        System.out.println("Gaji Pegawai Tetap: " + gaji);
    }

    @Override
    public void tampilkanData() {
        System.out.println("Nama: " + nama);
        System.out.println("Jenis: " + jenis);
        System.out.println("Gaji Pokok: " + gajiPokok);
        System.out.println("Tunjangan: " + tunjangan);
    }

    public void ubahPegawaiTetap(double gajiPokok, double tunjangan) {
        this.gajiPokok = gajiPokok;
        this.tunjangan = tunjangan;
    }
}

