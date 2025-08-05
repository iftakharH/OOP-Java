// Dog class demonstrating method overriding
class Dog extends Animal {
    private String breed;
    
    public Dog(String name, String breed) {
        super(name);
        this.breed = breed;
    }
    
    // Method overriding
    @Override
    public void makeSound() {
        System.out.println(name + " the " + breed + " says: Woof! Woof!");
    }
    
    // Method overloading in derived class
    public void play() {
        System.out.println(name + " is playing fetch");
    }
    
    public void play(String toy) {
        System.out.println(name + " is playing with " + toy);
    }
}