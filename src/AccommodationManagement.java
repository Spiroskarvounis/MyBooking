import java.util.ArrayList;
import java.util.HashMap;

public class AccommodationManagement extends provider{
    static ArrayList<provider> providers;
    public AccommodationManagement(){
        providers=new ArrayList<>();
    }

    public static ArrayList<provider> getProviders() {
        return providers;
    }

    public static void setProviders(ArrayList<provider> providers) {
        AccommodationManagement.providers = providers;
    }

    public void addProvider(provider tmp){
        providers.add(tmp);
    }


}
