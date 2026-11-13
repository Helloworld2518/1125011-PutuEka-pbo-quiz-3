package view;

import java.util.*;
import model.DataView;
import model.Mahasiswa;

public class MahasiswaDataView <T extends DataView> {
    private DataView<Mahasiswa> mahasiswa = new ArrayList<>();

    public void printAll(){
        for (T rc: mahasiswa){
            System.out.println(rc.toString());
        }
    }
    


}
