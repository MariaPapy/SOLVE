package org.example;

import java.lang.reflect.Method;

public class Main {
    public static void main(String[] args) {
        Print(new Messages());
    }

    public static void Print(Messages clazz){
        Method[] methods = clazz.getClass().getDeclaredMethods();
        for (Method method: methods){
            method.setAccessible(true);
            if (method.isAnnotationPresent(Paint.class)){
                try {
                    System.out.println(method.getAnnotation(Paint.class).color() + method.getAnnotation(Paint.class).style() +
                            method.invoke(clazz) + Color.RESET);

                }catch (Exception e){
                    System.out.println("Ошибка!" + e);
                }
            }else if(clazz.getClass().isAnnotationPresent(Paint.class)){
                try {
                    System.out.println(clazz.getClass().getAnnotation(Paint.class).color() + clazz.getClass().getAnnotation(Paint.class).style() +
                            method.invoke(clazz) + Color.RESET);
                }catch (Exception e){
                    System.out.println("Ошибка!" + e);
                }
            }
        }

    }
}