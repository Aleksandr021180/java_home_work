package lesson6;

public class Main {
    public static void main (String[]args){

        Dog dog = new Dog("Пес", "Барбос", 200, 10);
        dog.run(500);
        dog.swim(10);
        Cat cat = new Cat("Кот", "Матроскин", 50, 0);
        cat.run(200);

        System.out.println(dog);
        System.out.println(cat);

    }
}


