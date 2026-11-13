package model;

import java.util.*;

abstract public class DataView<T> {
    public List<T> records = new ArrayList<>();

    public List<T> getRecords() {
        return records;
    }

    public void printAll(){
        for (T rc: records){
            System.out.println(rc.toString());
        }
    }

    public void printByPk(String primaryKey){
        
    }

    public void showInsertForm(){

    }

    public void showUpdateForm(){

    }

    public void promptDelete(){
        
    }

    // protected abstract String getPrimaryKeyValue(T data);

    // protected abstract String[] getFields();

    // protected abstract T convertValuesToModel(String[] values);

    // protected abstract String[] convertModelToValues(T data);

}
