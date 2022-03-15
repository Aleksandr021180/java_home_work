package lesson8;

public class Cat implements Actions{

    private String name;
    private int runDistance;
    private int jumpHeight;


    public Cat(String name, int runDistance, int jumpHeight) {
        this.name = name;
        this.runDistance = runDistance;
        this.jumpHeight = jumpHeight;
    }

    @Override
    public void run() {
        System.out.println("Cat " + this.name + " Пробежал " + this.getRunDistance());

    }

    @Override
    public void jump() {
        System.out.println("Cat " + this.name + " Прыгнул " + this.getJumpHeight());

    }

    public int getRunDistance() {
        return runDistance;
    }

    public int getJumpHeight() {
        return jumpHeight;
    }
}
