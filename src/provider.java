import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Scanner;  // Import the Scanner class
public class provider {
    private String typeOfRental;
    private String typeOfAccommodation;
    private ArrayList <> buildings;



    public provider(){
        buildings=new ArrayList<>();
        System.out.println("Please insert the type of rental (sort or long) and the type of accommodation you will provide.");

        while( readTypeOfRental()!=""  &&  readTypeOfAccomodation()!=""){

            System.out.println("Do you have mo to offer? If so,please fill the formula.");
        }



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
        System.out.println("Decide if your facilites will be rented for sort or long time(type sort or long)");
        String type=read.nextLine();
        this.typeOfRental=type;
        return type;
    }


}
