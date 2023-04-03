package org.example;

import java.time.LocalDate;

public class Date implements Command {

    public LocalDate data;

    public void setCoommand(){
        this.data = LocalDate.now() ;
    }

    public LocalDate getCoommand() {
        LocalDate data = LocalDate.now();
        return data;
    }
}