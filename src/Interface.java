import java.util.ArrayList;
import java.util.HashMap;
import java.util.Objects;
import java.util.Scanner;


public class Interface {

    ArrayList<user> users = new ArrayList<>();
    user newUser = new user();
    HashMap<String,String> login_info = new HashMap<>();

    Scanner input = new Scanner(System.in);
    int age, type, choice;
    String in, gender, name, surname, username, password;

    /*
        In this constructor we initialize the three different users
     */

    public Interface(){

        addUser(29,1,"male","nikos","pappas","nikpap","pap1992");
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
