import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Scanner;  // Import the Scanner class
import javax.swing.*;
public class provider {
    /**
     * @typeOfRental long or sort term rent
     * @typeOfAccommodation hotel,airbnb or anything else
     * @builings an array list that contains all the building of each provider
     */
    AddExtraFacility extra;
    private String typeOfAccommodation;
    private String username;
    public  ArrayList <accommodation> buildings;
    private JTextField textField1;
    private JLabel selectOption;
    private JButton addFac;
    private JButton checkFac;
    private JPanel providerPanel;
    private JComboBox comboBox1;
    private JButton logOutButton;
    JFrame frameProv;

    /**
     * default consructor
     * read the information about the facility that the provider wants to provide to our site
     *inserts everything in the array list buildings
     * the possible objects are hotel,airbnb or accommodation(hotel and airbnb inherit for accommodation
     */
    public provider(){
        addFac.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(buildings==null){
                    buildings=new ArrayList<>();
                }
                accommodation a=new accommodation();
                buildings.add(a);

            }
        });
        CreateFrame();
        checkFac.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                    checkFacilities a=new checkFacilities(buildings);

            }
        });
        logOutButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frameProv.dispose();
            }
        });
    }
    public provider(int a){

    }

    /**
     * a constructor that initializes the parameters
     */

    public provider(String username, String typeOfAccommodation,ArrayList<accommodation> accommodations) {
        this.typeOfAccommodation = typeOfAccommodation;
        this.username=username;
        buildings=accommodations;

    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public ArrayList<accommodation> getBuildings() {
        return buildings;
    }

    public void setBuildings(ArrayList<accommodation> buildings) {
        this.buildings = buildings;
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


    private void CreateFrame(){
       frameProv=new JFrame();
       frameProv.add(providerPanel);
       frameProv.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
       frameProv.setBounds(250,250,100000,1000);
//        AccommodationFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
       frameProv.pack();
       frameProv.setVisible(true);
    }

    /**
     * reading the type of rental from the user
     * @return the type of rental
     */

    /*
    public String readTypeOfRental(){
        Scanner read=new Scanner(System.in);
        //System.out.println("Decide if your facilites will be rented for sort or long time(type sort or long)");
        String type=read.nextLine();
        this.typeOfRental=type;
        return type;
    }
    */

    /**
     * prints the information of the building of each provider
     */
    public void showBuildings(){
        for(accommodation i:buildings){
            i.printInformation();
        }
    }
    public static void main(String[] args){
        Interface b=new Interface();
        provider a=new provider();
        b.a.addProvider(a);
        customer c =new customer(b.a.getProviders());
    }
}
