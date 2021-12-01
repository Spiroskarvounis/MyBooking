import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Scanner;  // Import the Scanner class
public class provider {
    /**
     * @typeOfRental long or sort term rent
     * @typeOfAccommodation hotel,airbnb or anything else
     * @builings an array list that contains all the building of each provider
     */
    private String typeOfRental;
    private String typeOfAccommodation;
    ArrayList <accommodation> buildings;

    /**
     * default consructor
     * read the information about the facility that the provider wants to provide to our site
     *inserts everything in the array list buildings
     * the possible objects are hotel,airbnb or accommodation(hotel and airbnb inherit for accommodation
     */
    public provider(){

        Scanner read=new Scanner(System.in);
        buildings=new ArrayList<>();
        String continueAdding="yes";
        String type1="yes";
        String type2;
        while( !continueAdding.equals("no")){
            System.out.println("Please insert the type of rental (sort or long) and the type of accommodation you will provide.");
            type1=readTypeOfRental();
            type2=readTypeOfAccommodation();
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
            System.out.println("Do you have more to offer? If so,type yes ,else type no.");
            continueAdding=read.nextLine();
        }



    }

    /**
     * a constructor that initializes the parameters
     */

    public provider(String typeOfRental, String typeOfAccommodation,ArrayList<accommodation> accommodations) {
        this.typeOfRental = typeOfRental;
        this.typeOfAccommodation = typeOfAccommodation;
        buildings=accommodations;

    }

    public ArrayList<accommodation> getBuildings() {
        return buildings;
    }

    public void setBuildings(ArrayList<accommodation> buildings) {
        this.buildings = buildings;
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

    /**
     * reading the type of accommodation from the user
     * @return the type of the accommodation
     */
    public String readTypeOfAccommodation(){
        Scanner read=new Scanner(System.in);
        System.out.println("We provide hotel and airbnb accommodation.If you would like to add other type just type and our admin will think about it!");
        String type=read.nextLine();
        this.typeOfAccommodation=type;
        return type;

    }

    /**
     * reading the type of rental from the user
     * @return the type of rental
     */
    public String readTypeOfRental(){
        Scanner read=new Scanner(System.in);
        //System.out.println("Decide if your facilites will be rented for sort or long time(type sort or long)");
        String type=read.nextLine();
        this.typeOfRental=type;
        return type;
    }

    /**
     * prints the information of the building of each provider
     */
    public void showBuildings(){
        for(accommodation i:buildings){
            i.printInformation();
        }
    }


}
