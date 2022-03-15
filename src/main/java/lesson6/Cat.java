package lesson6;

public class Cat extends Animal {

    @Override
    void run(int length) {
        int MAX_RUN_LENGTH = 200;
        if ((length >= 0) && (length <= MAX_RUN_LENGTH)) {
            System.out.println("run: true");
        }else{
            System.out.println("run: false");
        }
    }

    @Override
    void swim(int length) {
        System.out.println("swim: false");
    }


    public Cat(String animal, String name, int run, int swim) {
        super(animal, name, run, swim);
    }


}


