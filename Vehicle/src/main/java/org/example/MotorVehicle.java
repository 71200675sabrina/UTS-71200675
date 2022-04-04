package org.example;

public class MotorVehicle {
    private String vehicleName;
    private Engine engine;
    private  Tire tire;
    private Wheel wheel;
    private Transmision transmition;

    public Engine getEngine() {
        return this.engine;
    }

    public Tire getTire(){
        return  this.tire;
    }

    public Transmision getTransmition(){
        return this.transmition;
    }

    public String getVehicleName(){
        return this.vehicleName;
    }

    public Wheel getWheel(){
        return this.wheel;
    }

    public void setEngine(Engine){

    }

    public void setTire(Tire){}

    public void setTransmition(Transmision){}

    public void setVehicleName(String){

    }

    public void setWheel(Wheel){}

}
