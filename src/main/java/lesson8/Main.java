package lesson8;

import java.util.Random;

public class Main {
    public static void main(String[]args){
        Random rand = new Random();
        Actions[] actions = new Actions[3];

        int distance = rand.nextInt(10);
        int heigth = rand.nextInt(10);
        actions[0] = new Human("Aleksandr", distance, heigth);

        distance = rand.nextInt(10);
        heigth = rand.nextInt(10);
        actions[1] = new Robot("Robik", distance, heigth);

        distance = rand.nextInt(10);
        heigth = rand.nextInt(10);
        actions[2] = new Cat("Matroskin", distance, heigth);

        Obstacle[] obstacles = new Obstacle[6];

        boolean isRoad;
        for (int i = 0; i < obstacles.length; i++) {
            distance = rand.nextInt(10);
            isRoad = rand.nextBoolean();
            if (isRoad) {
                obstacles[i] = new Road("Road " + i, distance);
            } else {
                obstacles[i] = new Wall("Wall " + i, distance);
            }
        }

        for (int i = 0; i < actions.length; i++) {
            boolean result = true;
            for (int j = 0; j < obstacles.length; j++) {



                if (Human.class == actions[i].getClass()) {
                    result = obstacles[j].moving((Human) actions[i]);
                }

                if (Robot.class == actions[i].getClass()) {
                    result = obstacles[j].moving((Robot) actions[i]);
                }

                if (Cat.class == actions[i].getClass()) {
                    result = obstacles[j].moving((Cat) actions[i]);
                }

                if (!result) {
                    break;
                }
            }

            if (result) {
                System.out.println("Успех!!");
            } else {
                System.out.println("Безуспешно!!");
            }
        }
    }
}



