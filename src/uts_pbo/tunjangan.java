package uts_pbo;

/**
 * @author NAMA     : Muhammad Anggawan Ridho Islami
 * KELAS    : IF 10K
 * NIM      : 10119909
 */

public class tunjangan extends gaji {
    public double get_hitung_tunjangan(int lama_kerja){
        if (lama_kerja == 1){
            return tunjangannya = 500000;
        }
        else if (lama_kerja == 2){
            return tunjangannya = 700000;
        }
        else {
            return tunjangannya = 0;
        }
    }
}
