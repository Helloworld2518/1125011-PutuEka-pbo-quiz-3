package model;

public class MataKuliah {
    private String kode;
    private String nama;
    private int jumlahSks;
    private int semester;

    public MataKuliah(int jumlahSks, String kode, String nama, int semester) {
        this.jumlahSks = jumlahSks;
        this.kode = kode;
        this.nama = nama;
        this.semester = semester;
    }

    public String getKode() {
        return kode;
    }

    public String getNama() {
        return nama;
    }

    public int getJumlahSks() {
        return jumlahSks;
    }

    public int getSemester() {
        return semester;
    }

    public String toString(){
        return "Kode: " + getKode() + " Nama: " + getNama() + " Jumlah"
    }
}
