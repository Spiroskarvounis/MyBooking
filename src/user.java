public class user{


    private int type, age; /* type: 1 for providers, 2 for customers, 3 for admins*/
    private String name, surname, username, password, gender;

    /**
     *
     * a constructor that initializes the characteristics of a user
     * @param age age of the user
     * @param type type of the user (admin, provider, customer)
     * @param gender gender of the user
     * @param name name of the user
     * @param surname surname of the user
     * @param username username of the user
     * @param password password of the user
     *
     */
    public user(String name,String surname,String username,String password,String gender,int type,int age){
        this.age = age;
        this.type = type;
        this.name = name;
        this.surname = surname;
        this.gender = gender;
        this.username = username;
        this.password = password;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setType(int type) {
        this.type = type;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getAge() {
        return age;
    }

    public int getType() {
        return type;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getGender() {
        return gender;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    /**
     * a function that shows the characteristics of a specific user
     */

    public void showUser(){
        System.out.println("Name: "+name);
        System.out.println("Surname: "+surname);
        System.out.println("Username: "+username);
        System.out.println("Password: "+password);
        System.out.println("Age: "+age);
        System.out.println("Gender: "+gender);
        if (type==1)
            System.out.println("Type: Provider");
        else if(type==2)
            System.out.println("Type: Customer");
        else
            System.out.println("Type: Admin");
        System.out.println("\n");
    }
}