package lesson8;

public class Road extends Obstacle{
    private int length;

    public Road(String name, int length) {
        super(name);

        this.length=length;
    }
    public int getLength() {
        return length;
    }

    @Override
    protected boolean moving(Human human) {
        System.out.println("Дорожка " + super.getName() + " дистанция: " + this.length);

        human.run();

        if (getLength() <= human.getRunDistance()) {
            System.out.println("Пробежал удачно");

            return true;
        } else {
            System.out.println("Пробежал неудачно");

            return false;
        }
    }

    @Override
    protected boolean moving(Robot robot) {
        System.out.println("Дорожка " + super.getName() + " дистанция: " + this.length);

        robot.run();

        if (getLength() <= robot.getRunDistance()) {
            System.out.println("Пробежал удачно");

            return true;
        } else {
            System.out.println("Пробежал неудачно");

            return false;
        }
    }

    @Override
    protected boolean moving(Cat cat) {
        System.out.println("Дорожка " + super.getName() + " дистанция: " + this.length);

        cat.run();

        if (getLength() <= cat.getRunDistance()) {
            System.out.println("Пробежал удачно");

            return true;
        } else {
            System.out.println("Пробежал неудачно");

            return false;
        }
    }
}

