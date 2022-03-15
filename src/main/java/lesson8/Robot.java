package lesson8;

public class Robot implements Actions{
    private String name;
    private int runDistance;
    private int jumpHeight;


    public Robot(String name, int runDistance, int jumpHeight) {
        this.name = name;
        this.runDistance = runDistance;
        this.jumpHeight = jumpHeight;
    }

    @Override
    public void run() {
        System.out.println("Robot " + this.name + " Пробежал " + this.getRunDistance());

    }

    @Override
    public void jump() {
        System.out.println("Robot " + this.name + " Прыгнул " + this.getJumpHeight());

    }

    public int getRunDistance() {
        return runDistance;
    }

    public int getJumpHeight() {
        return jumpHeight;
    }
}


