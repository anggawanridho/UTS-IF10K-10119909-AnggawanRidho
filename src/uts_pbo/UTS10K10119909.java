package uts_pbo;

import java.util.Scanner;

public class UTS10K10119909 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        tunjangan buruh1 = new tunjangan();
        System.out.println("========================================");
        System.out.println("Program Penggajian PT. Jaya Susah Selalu");
        System.out.println("========================================");
        System.out.print("Masukkan Nama Pegawai         : ");
        buruh1.set_nama(scanner.nextLine());
        System.out.println("Lama Bekerja");
        System.out.println("1. Kurang Dari 10 Tahun");
        System.out.println("2. Lebih Dari 10 Tahun");
        System.out.print("Masukkan Pilihan Lama Bekerja : ");
        buruh1.set_lama_bekerja(scanner.nextInt());
        System.out.print("Lembur                        : ");
        buruh1.set_lembur(scanner.nextInt());
        System.out.println("               Slip Gaji");
        System.out.println("========================================");
        System.out.println("NAMA\t\t: "+buruh1.get_nama());
        System.out.println("Gaji Pokok\t: "+ buruh1.get_hitung_gaji_pokok());
        System.out.println("Tunjangan\t: "+ buruh1.get_hitung_tunjangan(buruh1.get_lama_bekerja()));
        System.out.println("Lembur\t\t: "+ buruh1.get_hitung_lembur());
        System.out.println("Gaji Kotor\t: "+ buruh1.get_hitung_gaji_kotor());
        System.out.println("Pajak\t\t: "+ buruh1.get_hitung_pajak());
        System.out.println("Gaji Bersih\t: "+ buruh1.get_hitung_gaji_bersih());
    }
}
