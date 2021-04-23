package stack.and.queue;

import org.junit.Test;
import static org.junit.Assert.assertEquals;


public class TestAnimal {

    @Test public void test(){
        Animal newDog = new Animal();
        AnimalShelter animalShelter = new AnimalShelter();
        newDog.type = "dog";
        animalShelter.enqueue(newDog);
        animalShelter.enqueue(newDog);

        assertEquals(newDog.type,  animalShelter.dequeue("dog"));
    }

    @Test
    public void test2(){
        Animal newDog = new Animal();
        AnimalShelter animalShelter = new AnimalShelter();
        newDog.type = "cat";
        animalShelter.enqueue(newDog);
        animalShelter.enqueue(newDog);

        assertEquals(newDog.type, animalShelter.dequeue("cat"));
    }

    @Test public void test3(){
        Animal newDog = new Animal();
        AnimalShelter animalShelter = new AnimalShelter();
        newDog.type = "mouse";
        animalShelter.enqueue(newDog);
        animalShelter.enqueue(newDog);

        assertEquals(null, animalShelter.dequeue("mouse"));
    }

    @Test public void test4(){
        Animal newDog = new Animal();
        AnimalShelter animalShelter = new AnimalShelter();
        newDog.type = "cat";
        System.out.println(animalShelter.dequeue("cat"));
        assertEquals(null, animalShelter.dequeue("cat"));
    }
}
