package peaksoft;

public class Person {
    private Animal animal;
    private String name;
    private int age;

    public Person(Animal animal, String name, int age) {
        this.animal = animal;
        this.name = name;
        this.age = age;
    }

    public Person() {
    }

    public Person(Bird bird) {
    }

    public Animal getAnimal() {
        return animal;
    }

    public void setAnimal(Animal animal) {
        this.animal = animal;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person (" +
                 "name is " + name +
                ", age is " + age + ", " +
                "favorite animal is " + animal +
                ')';
    }
}
