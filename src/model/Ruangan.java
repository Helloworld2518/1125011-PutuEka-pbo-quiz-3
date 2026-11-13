package model;

public class Ruangan {
    private String id;
    private String nama;
    private String lokasiLantai;
    private int kapasitas;

    public Ruangan(String id, int kapasitas, String lokasiLantai, String nama) {
        this.id = id;
        this.kapasitas = kapasitas;
        this.lokasiLantai = lokasiLantai;
        this.nama = nama;
    }

    public String getId() {
        return id;
    }

    public String getNama() {
        return nama;
    }

    public String getLokasiLantai() {
        return lokasiLantai;
    }

    public int getKapasitas() {
        return kapasitas;
    }

    @Override 
    public String toString(){
        return "Nama Ruangan: " + getNama() + " Lokasi Lantai: " + getLokasiLantai() + " kapasitas: " + getKapasitas();
    }
}
