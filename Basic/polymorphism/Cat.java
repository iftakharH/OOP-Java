// Cat class demonstrating method overriding
class Cat extends Animal {
    private boolean isIndoor;
    
    public Cat(String name, boolean isIndoor) {
        super(name);
        this.isIndoor = isIndoor;
    }
    
    // Method overriding
    @Override
    public void makeSound() {
        System.out.println(name + " the cat says: Meow! Meow!");
    }
    
    @Override
    public void eat() {
        System.out.println(name + " is eating cat food delicately");
    }
    
    public void climb() {
        if (isIndoor) {
            System.out.println(name + " is climbing the furniture");
        } else {
            System.out.println(name + " is climbing trees outside");
        }
    }
}