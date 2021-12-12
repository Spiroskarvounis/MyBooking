import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

/**
 * Here we create an object {@link Interface} in order to run the log in menu and then we give the user the choices he is able to make depending on his/her type
 */

public class Main {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        int choice, start,finish;
        String name, charact, location;
        HashSet<String> characteristics = new HashSet();
        Interface run=new Interface();
        run.menu();

        customer cust=new customer(run.a.getProviders());

        if (run.type==1){
            provider d=new provider();
            run.a.setProviders(cust.getDuplicate());
        }
        else if (run.type==2){
            System.out.println("You can search accommodation by: name(1), price range(2), location(3). Type the number you want.");
            choice = input.nextInt();
            input.nextLine();
            if (choice==1) {
                System.out.println("Type the name you want: ");
                name = input.nextLine();
                if (cust.searchAccommodationByName(name))
                    cust.resevation(name);
            } else if(choice==2){
                System.out.println("Give the price range you want: ");
                start = input.nextInt();
                finish = input.nextInt();
                input.nextLine();
                if (cust.searchAccommodationByPriceRange(start,finish)) {
                    System.out.println("Type the name you want: ");
                    name = input.nextLine();
                    if (cust.searchAccommodationByName(name))
                        cust.resevation(name);
                }
            } else {
                System.out.println("Type the location of the accommodation: ");
                location = input.nextLine();
                if (cust.searchAccommodationLocation(location)) {
                    System.out.println("Type the name you want: ");
                    name = input.nextLine();
                    if (cust.searchAccommodationByName(name))
                        cust.resevation(name);
                }
            }
        }
        else {
            System.out.println("Do you want to see the list of users? Type 1(yes) or 0(no).");
            choice= input.nextInt();
            input.nextLine();
            if(choice==1){
                for (int i=0; i<run.users.size(); i++){
                    run.users.get(i).showUser();
                }
            }
            System.out.println("Do you want to see the list of hotels and airbnb? Type 1(yes) or 0(no).");
            choice= input.nextInt();
            input.nextLine();
            if(choice==1){
                for(int i=0; i<run.a.getProviders().size(); i++){
                    for (int j=0; j<run.a.getProviders().get(i).buildings.size(); j++){
                        System.out.println("Name: "+run.a.getProviders().get(i).buildings.get(j).getName());
                        System.out.println("Location: "+run.a.getProviders().get(i).buildings.get(j).getLocation());
                        System.out.println("Price: "+run.a.getProviders().get(i).buildings.get(j).getPrice());
                        System.out.println("Capacity: "+run.a.getProviders().get(i).buildings.get(j).getCapacity());
                        System.out.println("Square metres: "+run.a.getProviders().get(i).buildings.get(j).getSquareMetres());
                        System.out.println("\n");
                    }
                }
            }
        }

    }
}

