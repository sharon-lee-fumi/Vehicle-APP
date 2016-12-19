package vehicleapp;

/**
 * A truck is represented by number of wheels, whether it can fly
 * and a method which returns its information
 * 
 * @author Xiaowen Li
 */
public class Truck extends Car
{
    private double carryingCapacity;

    public Truck(double carryingCapacity, int numWheels)
    {
        super(numWheels);
        this.carryingCapacity = carryingCapacity;
    }

    public double getCarryingCapacity()
    {
        return carryingCapacity;
    }

    public void setCarryingCapacity(double carryingCapacity)
    {
        this.carryingCapacity = carryingCapacity;
    }

    /**
     * @return a message to indicate the output of truck object
     */
    @Override
    public String toString()
    {
        return "This is a truck, it has " + this.getNumWheels() + 
                " wheels and its carrying capacity is " + 
                this.carryingCapacity;
    }
       
}
