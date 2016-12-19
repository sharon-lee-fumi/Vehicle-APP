package vehicleapp;

/**
 * An airplane is represented by whether it can fly
 * and a method which returns its information
 * 
 * @author Xiaowen Li
 */
public class Airplane implements Vehicle
{
    private boolean isJet;

    public Airplane(boolean isJet)
    {
        this.isJet = isJet;
    }

    public boolean isIsJet()
    {
        return isJet;
    }

    public void setIsJet(boolean isJet)
    {
        this.isJet = isJet;
    }

    /**
     * @return true, because car can fly
     */
    @Override
    public boolean canFly()
    {
        return true; 
    }
    
    /**
     * @return a message to indicate the output of airplane object
     */
    @Override
    public String toString()
    {
        if (this.isJet)
        {
            return "This is an airplane and it is a jet airplane."; 
        }
        else
        {
            return "This is an airplane and it is a propellor airplane.";
        }
    }  
}
