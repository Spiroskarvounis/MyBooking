import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class customer {
    private String monAr,monD;
    private int dateAr,dateD;
    public ArrayList<provider> duplicate;
    HashMap<String,Integer> DaysPerMonth;


    public customer(ArrayList<provider> original){
        DaysPerMonth=new HashMap<>();
        DaysPerMonth.put("january",31);
        DaysPerMonth.put("february",28);
        DaysPerMonth.put("march",31);
        DaysPerMonth.put("april",30);
        DaysPerMonth.put("may",31);
        DaysPerMonth.put("june",30);
        DaysPerMonth.put("july",31);
        DaysPerMonth.put("august",31);
        DaysPerMonth.put("september",30);
        DaysPerMonth.put("october",31);
        DaysPerMonth.put("november",30);
        DaysPerMonth.put("december",31);
        duplicate=original;
    }


    public ArrayList<provider> getDuplicate() {
        return duplicate;
    }

    public String getMonD() {
        return monD;
    }

    public void setMonD(String monD) {
        this.monD = monD;
    }

    public int getDateAr() {
        return dateAr;
    }

    public void setDateAr(int dateAr) {
        this.dateAr = dateAr;
    }

    public int getDateD() {
        return dateD;
    }

    public void setDateD(int dateD) {
        this.dateD = dateD;
    }

    public String getMonAr() {
        return monAr;
    }

    public void setMonAr(String monAr) {
        this.monAr = monAr;
    }

    public void setDuplicate(ArrayList<provider> duplicate) {
        this.duplicate = duplicate;
    }

    public String readMonAr(){
        Scanner read=new Scanner(System.in);
        System.out.println("Please enter the month  of the arrival");
        monAr=read.nextLine();
        monAr.toLowerCase();
        while(!DaysPerMonth.containsKey(monAr)){
            System.out.println("Please inserta valid month");
            monAr=read.nextLine();
            monAr.toLowerCase();
        }
        return monAr;
    }

    public String readMonDep(){
        Scanner read=new Scanner(System.in);
        System.out.println("Please enter the month  of the departure");
        monD=read.nextLine();
        monD.toLowerCase();
        while(!DaysPerMonth.containsKey(monD)){
            System.out.println("Please inserta valid month");
            monD=read.nextLine();
            monD.toLowerCase();
        }
        return monD;
    }

    public int readDAteAr(){
        Scanner read=new Scanner(System.in);
        System.out.println("Please enter the date  of the arrival");
        dateAr=read.nextInt();
        while(dateAr>DaysPerMonth.get(monAr)){
            System.out.println("Please insert a valid date between 1 and "+ DaysPerMonth.get(monAr));
            dateAr=read.nextInt();
        }
        read.nextLine();
        return dateAr;
    }

    public int readDAteD(){
        Scanner read=new Scanner(System.in);
        System.out.println("Please enter the date  of the departure");
        dateD=read.nextInt();
        while(dateD>DaysPerMonth.get(monD)){
            System.out.println("Please insert a valid date between 1 and "+ DaysPerMonth.get(monD));
            dateD=read.nextInt();
        }
        read.nextLine();
        return dateD;
    }

    /**
     * searching if the name of a specific hotel exist
     * @param name the name of the hote
     * @return true if the name exist,else returns false
     */
    public boolean searchAccommodationByName(String name){
        for(provider i:duplicate){
            for(accommodation j:i.buildings){

                if(name.equals(j.getName())){

                    return true;
                }
            }
        }
        return false;
    }

    /**
     * searching if there is a hotel between two price ranges
     * @param minimum the minimun price(could be 0)
     * @param maximum the maximum
     * @return true if the range of the price exists,else returns false
     */

    public boolean searchAccommodationByPriceRange(int minimum,int maximum){
        boolean returnType=false;
        for(provider i:duplicate){
            for(accommodation j:i.buildings){
                if(j.getPrice()>minimum && j.getPrice()<maximum){
                    System.out.println("The resort '"+ j.getName() +"' is between your price ranges.You can now search the resort to see the further information!");
                    returnType=true;
                }
            }
        }
        return returnType;
    }


    /**
     *  searching through each building of each provider to see whether the specific characteristics exist
     * @param charact a HashSet that contains all the characteristics that the user needs(could be also 1)
     * @return returns true if ALL the characteristics exist,else returns false
     */
    public boolean searchAccommodationByCharacteristics(HashSet<String> charact){
        int found;
        boolean returnType=false;
        for(provider i:duplicate){
            for(accommodation j:i.buildings){
                found=0;
                for(String k:charact){
                    //System.out.println(j.characteristics.contains(k));
                    if(j.characteristics.contains(k)){
                        found++;
                        returnType=true;
                    }
                }

                /*for(String k:j.characteristics){
                    for(String l:charact){
                        if(k.equals(l)){
                            found++;
                            break;
                        }
                    }
                }*/
                //System.out.println(found);
                if(found==charact.size()){
                    System.out.println("The resort '"+j.getName()+"' offers the characteristics you ask for.");
                    returnType=true;
                }
            }
        }
        return returnType;
    }


    /**
     * searching if in the current location there is at least one hotel
     * @param location the desirable location
     * @return returns true if there is at least on hotel exists in that location,else returns false
     */
    public boolean searchAccommodationLocation(String location){
        boolean returnType=false;
        for(provider i:duplicate){
            for(accommodation j:i.buildings){
                if(j.getLocation().equals(location)){
                    System.out.println("The '"+j.getName()+"' is at this area.You can now search the name of the resort.");
                    returnType=true;
                }
            }
        }
        return returnType;
    }

    /**
     * this method makes a reservation according to the name of the hotel
     * @param name the name of the hotel that the reservation will be done
     */
    public void resevation(String name){
        for(provider i:duplicate){
            for(accommodation j:i.buildings){
                if(name.equals(j.getName())){
                    while(!j.cal.rentDays(readMonAr(),readDAteAr(),readMonDep(),readDAteD()));
                }
            }
        }

    }




}
