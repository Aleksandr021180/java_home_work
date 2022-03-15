package lesson8;

public abstract class Obstacle {
    private String name;

    public Obstacle(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    protected abstract boolean moving(Human human);

    protected abstract boolean moving(Robot robot);

    protected abstract boolean moving(Cat cat);
}
