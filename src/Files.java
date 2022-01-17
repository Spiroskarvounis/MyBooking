import java.io.*;
import java.util.*;

public class Files {

    public  HashMap<String,String> LoadLogin() {
        HashMap<String,String> login_info = new HashMap<>();
        try (ObjectInputStream ois = new ObjectInputStream (new FileInputStream("login_info.dat"))){
            login_info= (HashMap<String,String>) ois.readObject();

        } catch (IOException | ClassNotFoundException e){
            e.printStackTrace();
        }

        return login_info;
    }

    public void SaveLogin(HashMap<String,String> login_info){

        try (ObjectOutputStream oos = new ObjectOutputStream (new FileOutputStream("login_info.dat"))){
            oos.writeObject(login_info);
        } catch (IOException e){
            e.printStackTrace();
        }
    }



}
/////////// vres pos na kaneis save sto telos tou programmatos