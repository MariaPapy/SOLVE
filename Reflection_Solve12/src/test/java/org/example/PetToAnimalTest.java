package org.example;

import org.junit.Assert;
import java.util.List;

public class PetToAnimalTest {
    @org.junit.Test
    public void testPetToAnimalSold(){
        Pet cat = new Pet("Барсик", Status.AVAILABLE, List.of(new Photo("Барсик с цветочком","https://placekitten.com/200/300"),
                new Photo("Барсик на ручках", "https://placekitten.com/500/605")));
        PetToAnimal petToAnimal = new PetToAnimal();
        Animal animal = petToAnimal.petToAnimalDto(cat);
        Assert.assertEquals("Барсик Sold {Барсик с цветочком=https://placekitten.com/200/300, Барсик на ручках=https://placekitten.com/500/605}",
                animal.toString());
    }

    @org.junit.Test
    public void testPetToAnimalAvailable(){
        Pet cat = new Pet("Барсик", Status.SOLD, List.of(new Photo("Барсик с цветочком","https://placekitten.com/200/300"),
                new Photo("Барсик на ручках", "https://placekitten.com/500/605")));
        PetToAnimal petToAnimal = new PetToAnimal();
        Animal animal = petToAnimal.petToAnimalDto(cat);
        Assert.assertEquals("Барсик Available {Барсик с цветочком=https://placekitten.com/200/300, Барсик на ручках=https://placekitten.com/500/605}",
                animal.toString());
    }


}