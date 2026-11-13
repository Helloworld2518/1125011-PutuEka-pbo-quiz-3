package model;

public class Mahasiswa <T> {
    private String nim;
    private String nama;
    private String email;
    private int umur;

    public void setNim(String nim) {
        this.nim = nim;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setUmur(int umur) {
        this.umur = umur;
    }

    public Mahasiswa(String email, String nama, String nim, int umur) {
        this.email = email;
        this.nama = nama;
        this.nim = nim;
        this.umur = umur;
    }

    public String getNim() {
        return nim;
    }

    public String getNama() {
        return nama;
    }

    public String getEmail() {
        return email;
    }

    public int getUmur() {
        return umur;
    }
    
    @Override 
    public String toString(){
        return "NIM: " + getNim() + " Nama: " + getNama();
    }

    // protected String getPrimaryKeyValue(T data){
    //     return null;
    // }

    // @Override
    // protected  String[] getFields(){
    //     return null;
    // }

    // @Override
    // protected  T convertValuesToModel(String[] values){
    //     return null;
    // }

    // @Override
    // protected  String[] convertModelToValues(T data){
    //     return null;
    // }
}
