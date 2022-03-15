package lesson5;

public class User {
    private String surname;
    private String post;
    private String email;
    private String telephone;
    private int salary;
    protected int age;

    public User(String surname, String post, String email,String telephone, int salary, int age) {
        this.surname = surname;
        this.post = post;
        this.email = email;
        this.telephone = telephone;
        this.salary = salary;
        this.age = age;
    }

    public void printInfo(){
        System.out.println(this);

    }
    public String toString(){
        return String.format(surname, post, email, telephone, salary, age);

    }


}
