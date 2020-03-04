package za.mycput;

public class Person {
    private String name;
    private int age;

    public Person(String name, int age)
    {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return String.format("Hi, my name is %S and I'm %d", name, age);
    }
}
