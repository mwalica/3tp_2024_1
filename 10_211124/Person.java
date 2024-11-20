package app;

public class Person {

    private String name;//getName, setName
    private int age;//getAge, setAge
    private boolean isAdult;//isAdult, setAdult

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
        this.isAdult = age > 17;
    }


    //getter
    public String getName() {
        return name.toUpperCase();
    }

    public int getAge() {
        return age;
    }

    public boolean isAdult() {
        return isAdult;
    }

    //setter


    public void setAdult(int age) {
        if (age > 0) {
            this.age = age;
            this.isAdult = age > 17;
        } else {
            System.out.println("Wiek musi być liczbą dodatnią");
        }

    }
}
