import java.util.ArrayList;
import java.util.HashMap;

public class AccommodationManagement {
    // an array list that contains all the providers and each provider has it own accommodation
    static ArrayList<provider> providers;

    /**
     * default constructor
     */
    public AccommodationManagement(){
        providers=new ArrayList<>();
    }

    public  ArrayList<provider> getProviders() {
        return providers;
    }

    public  void setProviders(ArrayList<provider> providers) {
        AccommodationManagement.providers = providers;
    }

    public void addProvider(provider tmp){
        providers.add(tmp);
    }

    /**
     * shows the information of each building of each provider
     */
    public void showBuildingsPerProvider(){
        for(provider i:providers){
            System.out.println("This providers offers:");
            i.showBuildings();
        }
     }



}
