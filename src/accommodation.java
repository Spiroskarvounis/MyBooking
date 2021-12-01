import java.util.*;

public class accommodation {
    /**
     * @name the name of the facilie(hotel,airbnb or anything else)
     * @price the price of each night
     * @characteristics the characteristics of the resort(they are stored in a hash set</string>)
     * @SquareMetre the size of the facility
     * @capacity the number of people that can host
     * @location the location of the facility
     * @cal an object cal that show the availability of the facility
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
        fillTheInformation();
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
        System.out.println("Enter the characteristics.");
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

    public static void main(String[] args) {

        AccommodationManagement em=new AccommodationManagement();
        System.out.println("here1");
        int tmp=0;
        /*while(tmp<1){
            System.out.println("here2");
            provider a=new provider();
            System.out.println("here3");
            em.addProvider(a);
            tmp++;
        }
        em.showBuildingsPerProvider();*/
        HashSet <String> tt=new HashSet<> ();
        tt.add("emm");
        tt.add("trash");
        accommodation d=new accommodation("geprge",45,45,45,"louis",tt);
        accommodation e=new accommodation("maria",54,54,54,"saint",tt );
        ArrayList<accommodation> emm=new ArrayList<>();
        emm.add(d);
        emm.add(e);
        provider emmm=new provider("sort","hotel",emm);
        em.addProvider(emmm);
        em.showBuildingsPerProvider();
        customer b=new customer(em.getProviders());
        Scanner dab=new Scanner(System.in);
        System.out.println("enter the price range");
        String tmpp=dab.nextLine();
        HashSet<String> tis=new HashSet<>();
        while(tmpp!=""){
            tis.add(tmpp);
            tmpp=dab.nextLine();
        }
        if(b.searchAccommodationByCharacteristics(tis)){
            System.out.println("you doiunfiut");
        }
        else{
            System.out.println("youtrash");
        }

        System.out.println("enter the name");
        tmpp=dab.nextLine();
        while(!b.searchAccommodationByName(tmpp)){
            System.out.println("the resort doesnt exist try gaian .");
            tmpp=dab.nextLine();
        }
        b.resevation(tmpp);






    }







}
