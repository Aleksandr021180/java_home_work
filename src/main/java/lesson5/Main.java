package lesson5;

public class Main {
    public static void main(String[]args){

        User[]persArray = new User[5];
        persArray[0] = new User("Иван Иванов", "Инженер", "79222553047@yandex.ru", "+79222553047", 100000, 22);
        persArray[1] = new User("Александр Иванов", "Инженер", "79222553048@yandex.ru", "+79222553048", 100000, 41);
        persArray[2] = new User("Сергей Иванов", "Инженер", "79222553049@yandex.ru", "+79222553049", 100000, 34);
        persArray[3] = new User("Петр Иванов", "Инженер", "79222553050@yandex.ru", "+79222553050", 100000, 43);
        persArray[4] = new User("Николай Иванов", "Инженер", "79222553051@yandex.ru", "+79222553051", 100000, 50);
        for (int i=0; i < persArray.length; i++)
            if (persArray[i].age > 40) persArray[i].printInfo();

    }
}
