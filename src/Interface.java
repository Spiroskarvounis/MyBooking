import java.util.*;


public class Interface {
    AccommodationManagement a=new AccommodationManagement();
    ArrayList<user> users = new ArrayList<>();
    user newUser = new user();
    HashMap<String,String> login_info = new HashMap<>();

    Scanner input = new Scanner(System.in);
    int age, type, choice;
    String in, gender, name, surname, username, password;

    /*
        In this constructor we initialize the three different users
     */
    public provider createProvider(String name,int price,int squareMetres,int capacity,String location,HashSet characteristics,String type,String username,String typeOfRental){
        ArrayList<accommodation> resorts=new ArrayList<>();
        hotel hotel;
        airbnb airbnb;
        hotel f=new hotel();
        accommodation d=new accommodation(name,price,squareMetres,capacity,location,characteristics);
        if(type.equals("hotel")){
            hotel=new hotel (50,d);
            resorts.add(hotel);
        }
        else if(type.equals("airbnb")){
            airbnb=new airbnb(d);
            resorts.add(airbnb);
        }
        provider prov=new provider(username,typeOfRental,type,resorts);
        return prov;
    }
    public Interface(){

        addUser(29,1,"male","nikos","pappas","nikpap","pap1992");
        HashSet<String> characteristics=new HashSet<>();
        characteristics.add("pool");
        characteristics.add("parking");
        characteristics.add("wifi");
        a.addProvider(createProvider("palace",30,600,1000,"saint louis",characteristics,"hotel","pappas","sort"));
        addUser(43,1,"male","sakis","tanimanidis","trelopaoki","manasou");
        characteristics.clear();
        characteristics.add("wifi");
        characteristics.add("massage");
        characteristics.add("private chef");
        a.addProvider(createProvider("sun",70,1500,400,"bali",characteristics,"hotel","trelopaoki","sort"));
        addUser(35,1,"female","eleanna","mavrigiannaki","barbi","trash22");
        characteristics.clear();
        characteristics.add("big rooms");
        characteristics.add("central heat");
        characteristics.add("quiet");
        a.addProvider(createProvider("wooden house",20,63,2,"kamara",characteristics,"airbnb","barbi","long"));

        addUser(45,2,"male","john","karas","johnk","john123");
        addUser(37,3,"female","maria","theodorou","mtheo","123maria456");
    }

    /**
     *The function {@link Interface#addUser(int, int, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String)}
     *adds a new user at the array list of users, using the setters of the class {@link user}.
     * It also stores the new user's username and password in the hash map used for the login.
     *
     * @param age age of the user
     * @param type type of the user (admin, provider, customer)
     * @param gender gender of the user
     * @param name name of the user
     * @param surname surname of the user
     * @param username username of the user
     * @param password password of the user
     */

    public void addUser(int age, int type, String gender, String name, String surname, String username, String password){
        newUser.setAge(age);
        newUser.setGender(gender);
        newUser.setName(name);
        newUser.setSurname(surname);
        newUser.setType(type);
        newUser.setUsername(username);
        newUser.setPassword(password);
        users.add(newUser);
        login_info.put(newUser.getUsername(), newUser.getPassword());
    }

     public void menu() {

         System.out.println("Welcome! Do you want to login or sign up? Press 1 for login or 0 for sign up: ");
         choice = input.nextInt();
         while (choice != 0 && choice != 1) {
             System.out.println("Wrong choice! Press 1 for login or 0 for sign up: ");
             choice = input.nextInt();
         }
         if (choice == 0) {
             input.nextLine();
             System.out.println("Set your username: ");
             username = input.nextLine();
             System.out.println("Set your password: ");
             password = input.nextLine();
             System.out.println("Confirm your password: ");
             in = input.nextLine();
             while (!password.equals(in)) {
                 System.out.println("Wrong password! Try again: ");
                 in = input.nextLine();
             }
             System.out.println("Your name: ");
             name = input.nextLine();
             System.out.println("Your surname: ");
             surname = input.nextLine();
             System.out.println("Your gender: ");
             gender = input.nextLine();
             System.out.println("Your age: ");
             age = input.nextInt();
             System.out.println("Your type (1 for providers, 2 for customers, 3 for admins): ");
             type = input.nextInt();
             input.nextLine();

             addUser(age, type, gender, name, surname, username, password);
             System.out.println("You have registered successfully!");
         } else {

             input.nextLine();
             System.out.println("Insert your username: ");
             username = input.nextLine();

             while (!login_info.containsKey(username)) {
                 System.out.println("This username does not exist! Try again: ");
                 username = input.nextLine();
             }

             System.out.println("Insert your password: ");
             password = input.nextLine();

             while (!login_info.get(username).equals(password)) {
                 System.out.println("The password is wrong! Try again: ");
                 password = input.nextLine();
             }
             System.out.println("Successful login " + username);

         }

         for (user user : users)
             if ( username.equals(user.getUsername()))
                 type = user.getType();


         if (type==1){

         }
         else if (type==2){

         }
         else {

         }
     }
}
