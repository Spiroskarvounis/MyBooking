import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Scanner;  // Import the Scanner class
public class provider {
    private String typeOfRental;
    private String typeOfAccommodation;
    private ArrayList <accommodation> buildings;



    public provider(){
        buildings=new ArrayList<>();
        System.out.println("Please insert the type of rental (sort or long) and the type of accommodation you will provide.");
        String type1=readTypeOfRental();
        String type2;
        while( !type1.equals("no")){
            type2=readTypeOfAccomodation();
            accommodation a;
            if(type2.equals("hotel")){
                a =new hotel();
            }
            else  if(type2.equals("airbnb")){
               a=new airbnb();
            }
            else {
                 a=new accommodation();

            }
            buildings.add(a);
            System.out.println("Do you have more to offer? If so,please fill the formula ,or type no.");
            type1=readTypeOfRental();
        }



    }

    public ArrayList<accommodation> getBuildings() {
        return buildings;
    }

    public void setBuildings(ArrayList<accommodation> buildings) {
        this.buildings = buildings;
    }

    public provider(String typeOfRental, String typeOfAccommodation) {
        this.typeOfRental = typeOfRental;
        this.typeOfAccommodation = typeOfAccommodation;
        buildings=new ArrayList<>();
    }

    public String getTypeOfRental() {
        return typeOfRental;
    }

    public void setTypeOfRental(String typeOfRental) {
        this.typeOfRental = typeOfRental;
    }

    public String getTypeOfAccommodation() {
        return typeOfAccommodation;
    }

    public void setTypeOfAccommodation(String typeOfAccommodation) {
        this.typeOfAccommodation = typeOfAccommodation;
    }
    public String readTypeOfAccomodation(){
        Scanner read=new Scanner(System.in);
        System.out.println("We provide hotel and airbnb accommodation.If you would like to add other type just type and our admin will think about it!");
        String type=read.nextLine();
        this.typeOfAccommodation=type;
        return type;

    }
    public String readTypeOfRental(){
        Scanner read=new Scanner(System.in);
        //System.out.println("Decide if your facilites will be rented for sort or long time(type sort or long)");
        String type=read.nextLine();
        this.typeOfRental=type;
        return type;
    }


}
