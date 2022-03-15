package lesson6;

public class Dog extends Animal {

    public Dog(String animal, String name, int run, int swim) {
        super(animal, name, run, swim);
    }
    @Override
    void run(int length) {
        int MAX_RUN_LENGTH = 500;
        if ((length >= 0) && (length <= MAX_RUN_LENGTH)){
            System.out.println("run: true");
        }else{
            System.out.println("run: false");
        }
    }

    @Override
    void swim(int length) {
        int MAX_SWIM_LENGTH = 10;
        if ((length >= 0) && (length <= MAX_SWIM_LENGTH)){
            System.out.println("swim: true");
        } else{
            System.out.println("swim: false");
        }
    }
}



