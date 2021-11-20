import java.util.*;

public class Calendar {
    HashMap<String,Integer> DaysPerMonth;
    HashMap<String,Integer> numberOfMonth;
    HashMap<Integer,Boolean> AvailableDays;
    public Calendar(){
        DaysPerMonth=new HashMap<>();
        AvailableDays =new HashMap<>();
        numberOfMonth=new HashMap<>();

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


        numberOfMonth.put("january",1);
        numberOfMonth.put("february",2);
        numberOfMonth.put("march",3);
        numberOfMonth.put("april",4);
        numberOfMonth.put("may",5);
        numberOfMonth.put("june",6);
        numberOfMonth.put("july",7);
        numberOfMonth.put("august",8);
        numberOfMonth.put("september",9);
        numberOfMonth.put("october",10);
        numberOfMonth.put("november",11);
        numberOfMonth.put("december",12);


        int tmp;
            for(String i:DaysPerMonth.keySet() ){
                tmp=numberOfMonth.get(i)*100+DaysPerMonth.get(i);
                AvailableDays.put(tmp,Boolean.TRUE);
            }

    }

    public HashMap<String, Integer> getDaysPerMonth() {
        return DaysPerMonth;
    }

    public void setDaysPerMonth(HashMap<String, Integer> daysPerMonth) {
        DaysPerMonth = daysPerMonth;
    }

    public HashMap<Integer, Boolean> getAvailableDays() {
        return AvailableDays;
    }

    public void setAvailableDays(HashMap<Integer, Boolean> availableDays) {
        AvailableDays = availableDays;
    }

    public Boolean rentDays(String monthArrive,String monthDeparture,int arrival,int departure){
        monthArrive.toLowerCase();
        monthDeparture.toLowerCase();
        arrival=numberOfMonth.get(monthArrive)*100+arrival;
        departure=numberOfMonth.get(monthDeparture)*100+arrival;
        ArrayList<Integer> tmp=new ArrayList<>();
        for(Integer i:AvailableDays.keySet()){
            tmp.add(i);
        }
        Collections.sort(tmp);
        for(int i:tmp){
            if(i>=arrival && i<departure){
                if(AvailableDays.get(i)==false) {
                    return false;
                }
            }
        }
        for(int i:tmp){
            if(i>=arrival && i<departure){
                    AvailableDays.replace(i,false);
            }
        }
        return true;


    }


}
