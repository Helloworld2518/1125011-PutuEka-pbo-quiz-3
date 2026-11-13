package model;

import java.util.*;

abstract public class DataView<T> {
    private List<T> records = new ArrayList<>();

    public List<T> getRecords() {
        return records;
    }

    public void printAll(){
        String[] fields = this.getFields();
        for (int i = 0; i < this.records.size(); i++){
            T record = this.records.get(i);
            String[] values = this.convertModelToValues(record);
            System.out.println(i + " ");

            for (int j = 0; j < fields.length; j++){
                System.out.println(fields[i] + " = " + values[j] + " ");
            }
        }
        System.out.println();
    }

    public void printByPk(String primaryKey){
        for (T rec: records){
            if (getPrimaryKeyValue(rec).equals(primaryKey)){
                System.out.println(rec.toString());
            }
        }
    }

    public void showInsertForm(){
        String[] fields = this.getFields();

        for (int i = 0; i < fields.length; i++){
            System.out.println(fields[i] + " ");
        }
        this.convertValuesToModel(fields);
    }

    public void showUpdateForm(String pk){
        String[] fields = this.getFields();
        for (int i = 0; i < fields.length; i++){
            System.out.println(fields[i] + " ");
        }
    }

    public void promptDelete(String pk){
        
    }

    protected abstract String getPrimaryKeyValue(T data);

    protected abstract String[] getFields();

    protected abstract T convertValuesToModel(String[] values);

    protected abstract String[] convertModelToValues(T data);

}
