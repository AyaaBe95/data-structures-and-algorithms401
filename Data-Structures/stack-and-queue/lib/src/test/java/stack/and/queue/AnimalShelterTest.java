package stack.and.queue;

import org.junit.Test;
import static org.junit.Assert.assertEquals;


public class AnimalShelterTest {

    @Test public void test(){
        Animal newAnimal = new Animal();
        AnimalShelter animalShelter = new AnimalShelter();
        newAnimal.type = "dog";
        animalShelter.enqueue(newAnimal);
        animalShelter.enqueue(newAnimal);

        assertEquals(newAnimal.type,  animalShelter.dequeue("dog"));
    }

    @Test public void test2(){
        Animal newAnimal = new Animal();
        AnimalShelter animalShelter = new AnimalShelter();
        newAnimal.type = "cat";
        animalShelter.enqueue(newAnimal);
        animalShelter.enqueue(newAnimal);

        assertEquals(newAnimal.type, animalShelter.dequeue("cat"));
    }

    @Test public void test3(){
        Animal newAnimal = new Animal();
        AnimalShelter animalShelter = new AnimalShelter();
        newAnimal.type = "mouse";
        animalShelter.enqueue(newAnimal);
        animalShelter.enqueue(newAnimal);

        assertEquals(null, animalShelter.dequeue("mouse"));
    }

    @Test
    public void test4(){
        Animal newAnimal = new Animal();
        AnimalShelter animalShelter = new AnimalShelter();
        newAnimal.type = "cat";
        System.out.println(animalShelter.dequeue("cat"));
        assertEquals(null, animalShelter.dequeue("cat"));
    }
    @Test
    public void test5(){
        Animal newAnimal = new Animal();
        AnimalShelter animalShelter = new AnimalShelter();
        newAnimal.type = "Cat";
        System.out.println(animalShelter.dequeue("Cat"));
        assertEquals(null, animalShelter.dequeue("Cat"));
    }
}
