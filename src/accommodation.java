import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class accommodation {
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

    public accommodation(){
        characteristics=new HashSet<String>();
        cal=new Calendar();
        //img=new HashSet<Image>();
    }



    public accommodation(int price, double squareMetres, int capacity, String location) {
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
        this.location = location;
    }
    public void addCharacteristics(String s){
        characteristics.add(s);
    }

    public accommodation fillTheInformation(){

        accommodation a=new hotel();
        Scanner read=new Scanner(System.in);
        int tmp1;
        float tmp2;
        System.out.println("Enter capacity");
        tmp1=read.nextInt();
        a.setCapacity(tmp1);
        System.out.println("enter the price of each night");
        tmp1=read.nextInt();
        a.setPrice(tmp1);
        //System.out.println(a.getPrice());
        System.out.println("enter the square metres");
        tmp2= read.nextFloat();;
        a.setSquareMetres(tmp2);
        //System.out.println(a.getSquareMetres());
        System.out.println("enter the location");
        String tmp3;
        read.nextLine();
        tmp3=read.nextLine();
        a.setLocation(tmp3);
        //System.out.println(a.getLocation());
        System.out.println("enter the characteristics");
        tmp3=read.nextLine();
        while(!(tmp3.equals(""))){
            a.addCharacteristics(tmp3);
            //System.out.println(tmp3);
            tmp3=read.nextLine();
        }

        return a;
    }

    public void printInformation(){
        System.out.println("The location is "+getLocation());
        System.out.println("The price of the night  is "+getPrice());
        System.out.println("The square metres are "+getSquareMetres());
        System.out.println("The capacity is "+getCapacity());
        System.out.println("The resort offers:");
        for(String i:characteristics){
            System.out.println(i +"!");
        }




    }

    public static void main(String[] args) {

        hotel a=new hotel();
        a.cal.preferableDaysOfStay();
        a.cal.preferableDaysOfStay();




    }







}
