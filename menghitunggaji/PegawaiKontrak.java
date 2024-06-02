/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package menghitunggaji;

/**
 *
 * @author Kadek Dwi Novita Muliawati (2201010379)
 */
public class PegawaiKontrak extends Pegawai {
    private double tarifPerJam;
    private int jamKerja;

    public PegawaiKontrak(String nama, double tarifPerJam, int jamKerja) {
        super(nama, "kontrak");
        this.tarifPerJam = tarifPerJam;
        this.jamKerja = jamKerja;
    }

    @Override
    public void hitungGaji() {
        double gaji = tarifPerJam * jamKerja;
        System.out.println("Gaji Pegawai Kontrak: " + gaji);
    }

    @Override
    public void tampilkanData() {
        System.out.println("Nama: " + nama);
        System.out.println("Jenis: " + jenis);
        System.out.println("Tarif Per Jam: " + tarifPerJam);
        System.out.println("Jam Kerja: " + jamKerja);
    }

    public void ubahPegawaiKontrak(double tarifPerJam, int jamKerja) {
        this.tarifPerJam = tarifPerJam;
        this.jamKerja = jamKerja;
    }
}


