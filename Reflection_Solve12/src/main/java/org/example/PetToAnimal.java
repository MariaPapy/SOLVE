package org.example;

import java.lang.reflect.Field;
import java.util.*;

public class PetToAnimal {
    public Animal petToAnimalDto(Pet pet){
        Class clazz = pet.getClass();
        Animal animal = new Animal();
        try {
            Field titleField = clazz.getDeclaredField("name");
            titleField.setAccessible(true);

            String title = (String) titleField.get(pet);//берем имя
            Field statusField = clazz.getDeclaredField("status");
            statusField.setAccessible(true);

            Status status = (Status) statusField.get(pet);//берем Статус из Рet
            Field photoListField = clazz.getDeclaredField("photosList");
            photoListField.setAccessible(true);

            List<Photo> photos = (List<Photo>) photoListField.get(pet); //берем Фото из Рet
            clazz = animal.getClass();
            titleField = clazz.getDeclaredField("title");
            titleField.setAccessible(true);

            titleField.set(animal, title);// делаем имя домашнего животного дикому
            statusField = clazz.getDeclaredField("isAvailable");
            Field statusField2 = clazz.getDeclaredField("isSold");
            statusField2.setAccessible(true);

            statusField.setAccessible(true);
            statusField2.set(animal, status == Status.AVAILABLE);
            statusField.set(animal, status == Status.SOLD);
            HashMap<String, String> photosMap = new HashMap<>();
            photoListField = clazz.getDeclaredField("photosMap");
            photoListField.setAccessible(true);
            for (Photo photo : photos) {
                photosMap.put(photo.getName(), photo.getURL());
            }
            photoListField.set(animal, photosMap);// установили фото пета энималу
        } catch (NoSuchFieldException | IllegalAccessException e) {
            System.out.println("Неправильно!" + e);


        }


        return animal;
    }


}
