package lesson6;

public abstract class Animal {

    private String animal;
    private String name;
    private int run;
    private int swim;

    public Animal(String animal, String name, int run, int swim) {
        this.animal = animal;
        this.name = name;
        this.run = run;
        this.swim = swim;
    }

    @Override
    public String toString() {
        return String.format("%s %s пробежал %s метров и проплыл %s метров", animal, name, run, swim);
    }

    abstract void run(int length);

    abstract void swim(int length);
}


