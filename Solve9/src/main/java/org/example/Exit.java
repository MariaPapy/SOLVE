package org.example;

public class Exit implements Command{
    public void setCoommand(){
    }
    public Integer getCoommand(){
        System.exit(0);
        return 1;
    }
}