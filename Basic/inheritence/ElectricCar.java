class ElectricCar extends Car{
    int battery, chargeTime;
    
    public ElectricCar(int accelerator, int brake, int engine, int transmission, int battery, int chargeTime){
        super (accelerator, brake, engine, transmission);
        this.battery=battery;
        this. chargeTime=chargeTime;
    }
}