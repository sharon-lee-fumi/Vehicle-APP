package vehicleapp;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * The program allows the user to input information about a vehicle, either a
 * car, a truck or an airplane. Then it will print out information about the
 * vehicle.
 *
 * @author Xiaowen Li
 */
public class VehicleApp
{

    /**
     *
     * @param args inputs and outputs the information of vehicle
     *
     */
    public static void main(String[] args)
    {
        System.out.println("Which type of vehicle would you like to create?");
        Scanner kdb = new Scanner(System.in);
        System.out.println("Enter 1 to make a car");
        System.out.println("Enter 2 to make a truck");
        System.out.println("Enter 3 to make an airplane");

        Vehicle vehicle = null;

        try
        {
            switch (kdb.nextInt())
            {
                case 1:
                    System.out.println("How many wheels?");
                    int wheels = kdb.nextInt();
                    vehicle = new Car(wheels);
                    break;
                case 2:
                    System.out.println("How many wheels?");
                    wheels = kdb.nextInt();
                    System.out.println("how many kilograms of cargo is "
                            + "the truck capable of carrying?");
                    double capacity = kdb.nextDouble();
                    vehicle = new Truck(capacity, wheels);
                    break;
                case 3:
                    System.out.println("Is it a jet or propellor airplane? "
                            + "(please enter 'jet' or 'propellor')");
                    boolean type = true;
                    String airplaneType;
                    do
                    {
                        airplaneType = kdb.next();
                        switch (airplaneType)
                        {
                            case "jet":
                                break;
                            case "propellor":
                                type = false;
                                break;
                            default:
                                System.out.println("Invalid input, "
                                        + "pleasse enter 'jet' or 'propellor'");
                        }
                    } while (!(airplaneType.equals("propellor") || airplaneType.equals("jet")));
                    vehicle = new Airplane(type);
            }

            if (vehicle == null)
            {
                throw new NullPointerException("Invalid selestion, "
                        + "please run it again and select the proper vehicle type");
            }
            System.out.println("---------------------------------------");
            System.out.println(vehicle);

            if (!vehicle.canFly())
            {
                System.out.println("The vehicle cannot fly.");
            } else
            {
                System.out.println("The vehicle can fly.");
            }

        } 
        catch (InputMismatchException e)
        {
            System.out.println("Invalid input! please run it again.");
        } 
        catch (NullPointerException e)
        {
            System.out.println(e.getMessage());
        }

    }
}
