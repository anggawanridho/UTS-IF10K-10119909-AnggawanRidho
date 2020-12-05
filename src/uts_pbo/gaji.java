package uts_pbo;

/**
 * @author NAMA     : Muhammad Anggawan Ridho Islami
 * KELAS    : IF 10K
 * NIM      : 10119909
 */

public class gaji {
    private String nama;
    private int lama_kerja, lembur;
    private double gaji_pokok, hitung_lembur, hitung_gaji_kotor, hitung_pajak, gaji_bersih;
    protected double tunjangannya;

    public String get_nama() {
        return nama;
    }

    public void set_nama(String nm) {
        this.nama = nm;
    }

    public int get_lama_bekerja() {
        return lama_kerja;
    }

    public void set_lama_bekerja(int lm_ker) {
        this.lama_kerja = lm_ker;
    }

    public double get_hitung_gaji_pokok() {
        if (lama_kerja == 1){
            return gaji_pokok = 1000000;
        }
        else if (lama_kerja == 2){
            return gaji_pokok = 2000000;
        }
        else {
            return gaji_pokok = 0;
        }
    }

    public void set_lembur(int lm){
        this.lembur = lm;
    }

    public int get_lama_lembur(){
        return lembur;
    }

    public double get_hitung_lembur() {
        return hitung_lembur = lembur * 15000;
    }

    public double get_hitung_gaji_kotor() {
        return hitung_gaji_kotor = gaji_pokok + tunjangannya +  hitung_lembur;
    }

    public double get_hitung_pajak() {
        return hitung_pajak = hitung_gaji_kotor * 0.1;
    }

    public double get_hitung_gaji_bersih(){
        return gaji_bersih = hitung_gaji_kotor - hitung_pajak;
    }
}
