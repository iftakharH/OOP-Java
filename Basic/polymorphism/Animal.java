// Base class for demonstrating polymorphism
class Animal {
    protected String name;
    
    public Animal(String name) {
        this.name = name;
    }
    
    // Method to be overridden
    public void makeSound() {
        System.out.println(name + " makes a generic animal sound");
    }
    
    public void eat() {
        System.out.println(name + " is eating");
    }
    
    // Method overloading example
    public void sleep() {
        System.out.println(name + " is sleeping");
    }
    
    public void sleep(int hours) {
        System.out.println(name + " is sleeping for " + hours + " hours");
    }
}