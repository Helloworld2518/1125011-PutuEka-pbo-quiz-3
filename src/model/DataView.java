package model;

import java.util.*;

abstract public class DataView<T> {
    private List<T> records = new ArrayList<>();

    public void printAll() {
        for (T rc: records){
            System.out.println(rc.toString());
        }
    }

    public void printByPk(String primaryKey) {

    }

    public void showInsertForm() {
        
    }

    public void promptDelete(){

    }

    protected abstract String getPrimaryKeyValue(T data);

    protected abstract String[] getFields();

    protected abstract T convertValuesToModel(String[] values);

    protected abstract String[] convertModelToValues(T data);

}
