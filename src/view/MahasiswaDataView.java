package view;

import java.util.ArrayList;
import java.util.List;
import model.DataView;
import model.Mahasiswa;

public class MahasiswaDataView <T extends DataView> {

    private List<Mahasiswa> mahasiswa = new ArrayList<>();
    

    public void printAll(){
        String[] fields = this.getFields();
        for (int i = 0; i < this.mahasiswa.size(); i++){
            Mahasiswa record = this.mahasiswa.get(i);
            String[] values = this.convertModelToValues(record);
            System.out.println(i + " ");

            for (int j = 0; j < fields.length; j++){
                System.out.println(fields[i] + " = " + values[j] + " ");
            }
        }
        System.out.println();
    }

    public void printByPk(String primaryKey){
        for (Mahasiswa rec: mahasiswa){
            if (rec.getNim().equals(primaryKey)){

            }
        }
    }

    public void showInsertForm(){
        String[] fields = this.getFields();

        for (int i = 0; i < fields.length; i++){
            System.out.println(fields[i] + " ");

        }
    }

    public void showUpdateForm(){
        
    }

    public void promptDelete(){
        
    }

    protected String getPrimaryKeyValue(T data){
       for (T m : mahasiswa) {
        return mahasiswa.toString();
    }
    return null; 
    }

    protected String[] getFields(){
        return null;
    }

    protected T convertValuesToModel(String[] values){
        return null;
    }

    protected String[] convertModelToValues(T data){
        return null;
    }
}
