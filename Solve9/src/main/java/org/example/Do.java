package org.example;

public class Do {
    public void Do(String a){
        String str2 = "TIME";
        String str3 = "DATA";
        String str4 = "EXIT";

        if (a.equals(str2)) {
            Time t = new Time();
            System.out.println(t.getCoommand());
        }else if (a.equals(str3)) {
            Date d = new Date();
            System.out.println(d.getCoommand());
        }else if(a.equals(str4)){
            Exit ex = new Exit();
            ex.getCoommand();
        }else{
            System.out.println(a + " Unknown commands");
        }
    }
}
