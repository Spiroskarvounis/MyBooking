import java.util.*;

public class accommodation {
    /**
     * @param name the name of the facility(hotel,airbnb or anything else)
     * @param price the price of each night
     * @param characteristics the characteristics of the resort(they are stored in a hash set</string>)
     * @param SquareMetre the size of the facility
     * @param capacity the number of people that can host
     * @param location the location of the facility
     * @param cal an object cal that show the availability of the facility
     */

    private String name;
    private int price;
    HashSet <String> characteristics;
    private double SquareMetres;
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

    /**
     * default constructor
     */
    public accommodation(){
        characteristics=new HashSet<String>();
        cal=new Calendar();
        //img=new HashSet<Image>();

    }


    /**
     * constructor that initializes the variables
     */
    public accommodation(String name,int price, double squareMetres, int capacity, String location,HashSet<String> characteristics) {

        this.name=name;
        this.price = price;
        this.characteristics=characteristics;
        SquareMetres = squareMetres;
        this.capacity = capacity;
        this.location = location;
        cal=new Calendar();
        //img=new HashSet<Image>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    public double getSquareMetres() {
        return SquareMetres;
    }

    public void setSquareMetres(double squareMetres) {
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
        location=location.toLowerCase();
        this.location = location;
    }

    /**
     * converts all the letters of the word to lowercase and then adds them to the HashSet characteristic
     * @param s the characteristic that will be added
     */
    public void addCharacteristics(String s){
        s=s.toLowerCase();
        characteristics.add(s);
    }

    /**
     * creates an accommodation object @duplicate
     * then start to read with the usage of @tmp1 ,@tmp2,@tmp3 the information about the resort and stores them with the usage of setter
     * @return
     */
    public accommodation fillTheInformation(){
        accommodation duplicate1;
        Scanner read=new Scanner(System.in);
        String tmp3;
        System.out.println("Enter the name of the facility.");
        tmp3=read.nextLine();
        setName(tmp3);
        //read.nextLine();
        int tmp1;
        float tmp2;
        System.out.println("Enter capacity of the facility.");
        tmp1=read.nextInt();
        setCapacity(tmp1);
        System.out.println("Enter the price of each night.");
        tmp1=read.nextInt();
        setPrice(tmp1);
        //System.out.println(a.getPrice());
        System.out.println("Enter the square metres.");
        tmp2= read.nextFloat();;
        setSquareMetres(tmp2);
        //System.out.println(a.getSquareMetres());
        System.out.println("Enter the location.");
        read.nextLine();
        tmp3=read.nextLine();
        setLocation(tmp3);
        //System.out.println(a.getLocation());
        System.out.println("Enter the characteristics.(double 'enter' to stop)");
        tmp3=read.nextLine();
        while(!(tmp3.equals(""))){
            addCharacteristics(tmp3);
            //System.out.println(tmp3);
            tmp3=read.nextLine();
        }
        duplicate1=new accommodation(getName(),getPrice(),getSquareMetres(),getCapacity(),getLocation(),getCharacteristics());
        return duplicate1;
    }

    /**
     * prints all the information of each facility
     */
    public void printInformation(){
        System.out.println("The name of the facility is "+getName()+"!");
        System.out.println("The location is "+getLocation()+"!");
        System.out.println("The price of the night  is "+getPrice()+"!");
        System.out.println("The square metres are "+getSquareMetres()+"!");
        System.out.println("The capacity is "+getCapacity()+"!");
        System.out.println("The special characteristics of the resort are:");
        for(String i:characteristics){
            System.out.print(i+" ");

        }
        System.out.print("!");
        System.out.println();




    }








}
