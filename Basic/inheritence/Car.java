class Car extends Vehicle{
    int engine, transmission;
    
    public Car(int accelerator, int brake, int engine, int transmission){
        super (accelerator, brake);
        this.engine=engine;
        this. transmission=transmission;
    }
}