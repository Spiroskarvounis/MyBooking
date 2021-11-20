import java.util.HashSet;
public class accommodation {
    private int price;
    HashSet <String> characteristics;
    private float SquareMetres;
    private int capacity;
    private String location;
    Calendar cal ;
    //HashSet <Image> img;
    /*
    JFrame frame = new JFrame();
  ImageIcon icon = new ImageIcon("androidBook.jpg");
  JLabel label = new JLabel(icon);
  frame.add(label);
  frame.setDefaultCloseOperation                                HOW TO SHOW AN IMAGE IN JAVA
         (JFrame.EXIT_ON_CLOSE);
  frame.pack();
  frame.setVisible(true);

     */

    public accommodation(){
        characteristics=new HashSet<String>();
        cal=new Calendar();
        //img=new HashSet<Image>();
    }



    public accommodation(int price, float squareMetres, int capacity, String location) {
        this.price = price;
        characteristics =new HashSet<String>();
        SquareMetres = squareMetres;
        this.capacity = capacity;
        this.location = location;
        cal=new Calendar();
        //img=new HashSet<Image>();
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
    public HashSet<String> getCharacteristics() {
        return characteristics;
    }

    public void setCharacteristics(HashSet<String> characteristics) {
        this.characteristics = characteristics;

    }
    public float getSquareMetres() {
        return SquareMetres;
    }

    public void setSquareMetres(float squareMetres) {
        SquareMetres = squareMetres;
    }


    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
    public void addCharacteristics(String s){
        characteristics.add(s);
    }
}
