import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
        AccommodationManagement em=new AccommodationManagement();
        System.out.println("here1");
        int tmp=0;
        /*while(tmp<1){
            System.out.println("here2");
            provider a=new provider();
            System.out.println("here3");
            em.addProvider(a);
            tmp++;
        }
        em.showBuildingsPerProvider();
        HashSet<String> tt=new HashSet<> ();
        tt.add("emm");
        tt.add("trash");
        accommodation d=new accommodation("geprge",45,45,45,"louis",tt);
        accommodation e=new accommodation("maria",54,54,54,"saint",tt );
        ArrayList<accommodation> emm=new ArrayList<>();
        emm.add(d);
        emm.add(e);
        provider emmm=new provider("pap35000","sort","hotel",emm);
        em.addProvider(emmm);
        em.showBuildingsPerProvider();
        customer b=new customer(em.getProviders());
        Scanner dab=new Scanner(System.in);
        System.out.println("enter the price range");
        String tmpp=dab.nextLine();
        HashSet<String> tis=new HashSet<>();
        while(tmpp!=""){
            tis.add(tmpp);
            tmpp=dab.nextLine();
        }
        if(b.searchAccommodationByCharacteristics(tis)){
            System.out.println("you doiunfiut");
        }
        else{
            System.out.println("youtrash");
        }

        System.out.println("enter the name");
        tmpp=dab.nextLine();
        while(!b.searchAccommodationByName(tmpp)){
            System.out.println("the resort doesnt exist try gaian .");
            tmpp=dab.nextLine();
        }
        b.resevation(tmpp);
        */
        Interface run=new Interface();
        run.menu();
        customer a=new customer(run.a.getProviders());

            if(a.searchAccommodationByName("sun"))
                System.out.println("dafhasdfda");
            else
                System.out.println("fasfasdfasfsafsa");

            System.out.println("you trash ");

            provider d=new provider(    );
        run.a.setProviders(a.getDuplicate());

    }
}

