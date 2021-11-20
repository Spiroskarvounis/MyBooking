public class hotel extends accommodation  {
    private int availableRooms;
    public hotel(){
        super();
    }

    public  hotel(int price, float squareMetres, int capacity, String location,int availableRooms){
        super(price,squareMetres,capacity,location);
        this.availableRooms=availableRooms;

    }
    public int getAvailableRooms() {
        return availableRooms;
    }

    public void setAvailableRooms(int availableRooms) {
        this.availableRooms = availableRooms;
    }
}
