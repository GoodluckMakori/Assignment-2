package Practicals;

public class Person {
    // private instance variables
    private String name, address;

    // Constructor
    public Person(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public Person() {
    }

    // Getters and Setters
    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return this.address;
    }
    public void setAddress(String address) {
        this.address = address;
    }

    // Describle itself
    public String toString() {
        return "Person[name="+ this.name + ",address= " + address + "]";
    }
}