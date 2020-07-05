package za.mycput;

/* test drive
*  test one
* */

public class Dog {
    private String name;
    private Person owner;

    public Dog(String name, Person owner)
    {
        this.name = name;
        this.owner = owner;
    }

    @Override
    public String toString()
    {
        return String.format("My name is : %s, and I belong to %s", name, owner);
    }
}
