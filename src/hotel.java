import java.util.HashSet;
import java.util.Scanner;

/**
 * hotel class that inherits from the accommodation class
 */
public class hotel extends accommodation  {
    /**
     * @availableRooms the number of rooms that the hotel provides
     */
    private int availableRooms;

    /**
     * default constructor that call the super constructor (accommodation)
     */
    public hotel(){
        super();
        //hotelInformation();
    }
    public hotel(int availableRooms,accommodation a){
        super(a.getName(),a.getPrice(),a.getSquareMetres(),a.getCapacity(),a.getLocation(),a.getCharacteristics());
        this.availableRooms=availableRooms;
    }

    /**
     * constructor that initializes all the parameters of the hotel and with the usage of the method super initializes the parameters of the accommodation class
     */
    public  hotel(String name, int price, float squareMetres, int capacity, String location, int availableRooms, HashSet<String> characteristics){
        super(name,price,squareMetres,capacity,location,characteristics);
        this.availableRooms=availableRooms;

    }
    public int getAvailableRooms() {
        return availableRooms;
    }

    public void setAvailableRooms(int availableRooms) {
        this.availableRooms = availableRooms;
    }

    /**
     * a method that reads the number of available rooms from the user
     */
    public void hotelInformation(){
        System.out.println("Enter the number of the available rooms.");
        Scanner read=new Scanner(System.in);
        availableRooms =read.nextInt();
    }
}
