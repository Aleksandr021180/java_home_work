package lesson8;

public class Wall extends Obstacle {
    private int heigth;

    public Wall(String name, int heigth) {
        super(name);

        this.heigth = heigth;
    }

    public int getHeigth() {
        return heigth;
    }

    @Override
    protected boolean moving(Human human) {
        System.out.println("Стена " + super.getName() + " высота: " + this.heigth);

        human.jump();

        if (getHeigth() <= human.getJumpHeight()) {
            System.out.println("Прыгнул удачно");

            return true;
        } else {
            System.out.println("Прыгнул неудачно");

            return false;
        }
    }

    @Override
    protected boolean moving(Robot robot) {
        System.out.println("Стена " + super.getName() + " высота: " + this.heigth);

        robot.jump();

        if (getHeigth() <= robot.getJumpHeight()) {
            System.out.println("Прыгнул удачно");

            return true;
        } else {
            System.out.println("Прыгнул неудачно");

            return false;
        }
    }

    @Override
    protected boolean moving(Cat cat) {
        System.out.println("Стена " + super.getName() + " высота: " + this.heigth);

        cat.jump();

        if (getHeigth() <= cat.getJumpHeight()) {
            System.out.println("Прыгнул удачно");

            return true;
        } else {
            System.out.println("Прыгнул неудачно");

            return false;
        }
    }
}