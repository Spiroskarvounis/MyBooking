import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class customer {

    ArrayList<provider> duplicate;

    public customer(ArrayList<provider> original){
        duplicate=original;
    }

    public ArrayList<provider> getDuplicate() {
        return duplicate;
    }

    public void setDuplicate(ArrayList<provider> duplicate) {
        this.duplicate = duplicate;
    }


    /**
     * searching if the name of a specific hotel exist
     * @param name the name of the hotel
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
                    System.out.println("The resort "+ j.getName() +" is between your price ranges.You can now search the resort to see the further information!");
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
                    System.out.println(j.characteristics.contains(k));
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
                System.out.println(found);
                if(found==charact.size()){
                    System.out.println("The resort "+j.getName()+" offers the characteristics you ask for.You can now search the name of the resort.");
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
                    System.out.println("The "+j.getName()+" is at this area.You can now search the name of the resort.");
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
                    j.cal.preferableDaysOfStay();
                    break;
                }
            }
        }
    }




}
