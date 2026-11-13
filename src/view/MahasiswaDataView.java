package view;

import model.DataView;
import model.Mahasiswa;

public class MahasiswaDataView <T extends DataView> {
    private T value;

    @Override 
    public void printAll(){
        for (T rc: records){
            System.out.println(rc.toString());
        }
    }
}
