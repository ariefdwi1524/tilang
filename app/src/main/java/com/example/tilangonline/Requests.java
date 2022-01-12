package com.example.tilangonline;

public class Requests {

    private String nama;
    private String kota;
    private String kendaraan;
    private String nomorkendaraan;
    private String tanggalsekarang;
    private String tempatkejadiaan;
    private String nohp;
    private String email;
    private String jenispelanggaran;
    private String pasal;
    private String jeniskelamin;
    private String noktp;
    private String denda;



    public Requests(String dtpelanggar, String nama, String jeniskelamin, String noktp, String kota, String kendaraan, String nomorkendaraan, String tanggalsekarang, String tempatkejadiaan, String nohp, String email, String jenispelanggaran, String pasal, String denda) {
        this.nama = nama;
        this.jeniskelamin = jeniskelamin;
        this.noktp = noktp;
        this.kota = kota;
        this.kendaraan = kendaraan;
        this.nomorkendaraan = nomorkendaraan;
        this.tanggalsekarang = tanggalsekarang;
        this.tempatkejadiaan = tempatkejadiaan;
        this.nohp = nohp;
        this.email = email;
        this.jenispelanggaran = jenispelanggaran;
        this.pasal = pasal;
        this.denda = denda;
    }




    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getJeniskelamin() {
        return jeniskelamin;
    }

    public void setJeniskelamin(String jeniskelamin) {
        this.jeniskelamin = jeniskelamin;
    }

    public String getNoktp() {
        return noktp;
    }

    public void setNoktp(String noktp) {
        this.noktp = noktp;
    }

    public String getKota() {
        return kota;
    }

    public void setKota(String kota) {
        this.kota = kota;
    }

    public String getKendaraan() {
        return kendaraan;
    }

    public void setKendaraan(String kendaraan) {
        this.kendaraan = kendaraan;
    }

    public String getNomorkendaraan() {
        return nomorkendaraan;
    }

    public void getNomorkendaraan(String nomorkendaraan) {
        this.nomorkendaraan = nomorkendaraan;
    }

    public String getTanggalsekarang() {
        return tanggalsekarang;
    }

    public void setTanggalsekarang(String tanggalsekarang) {
        this.tanggalsekarang = tanggalsekarang;
    }

    public String getTempatkejadiaan() {
        return tempatkejadiaan;
    }

    public void setTempatkejadiaan(String tempatkejadiaan) {
        this.tempatkejadiaan = tempatkejadiaan;
    }

    public String getNohp() {
        return nohp;
    }

    public void setNohp(String nohp) {
        this.nohp = nohp;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getJenispelanggaran() {
        return jenispelanggaran;
    }

    public void setJenispelanggaran(String jenispelanggaran) {
        this.jenispelanggaran = jenispelanggaran;
    }

    public String getPasal() {
        return pasal;
    }

    public void setPasal(String pasal) {
        this.pasal = pasal;
    }
    public String getDenda() {
        return denda;
    }

    public void setDenda(String denda) {
        this.denda = denda;
    }

}
