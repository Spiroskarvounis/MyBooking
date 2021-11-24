import java.util.Scanner;

public class hotel extends accommodation  {
    private int availableRooms;
    public hotel(){
        super();
    }

    public  hotel(String name,int price, float squareMetres, int capacity, String location,int availableRooms){
        super(name,price,squareMetres,capacity,location);
        this.availableRooms=availableRooms;

    }
    public int getAvailableRooms() {
        return availableRooms;
    }

    public void setAvailableRooms(int availableRooms) {
        this.availableRooms = availableRooms;
    }
    public void hotelInformation(){
        Scanner read=new Scanner(System.in);
        availableRooms=read.nextInt();
    }
}
