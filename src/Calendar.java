import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.*;

public class Calendar {
    HashMap<String,Integer> DaysPerMonth;
    HashMap<String,Integer> numberOfMonth;
    HashMap<Integer,Boolean> AvailableDays;
    HashSet <String> Months;
    JFrame calFrame;

    private JPanel calPanel;
    private JComboBox comboBox1;
    private JComboBox comboBox2;
    private JComboBox comboBox3;
    private JComboBox comboBox4;
    private JButton sumbitButton;
    private JLabel failRerervation;

    public Calendar(){
        DaysPerMonth=new HashMap<>();
        AvailableDays =new HashMap<>();
        numberOfMonth=new HashMap<>();
        Months=new HashSet<>();

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
        int count=0;
        for(String i:DaysPerMonth.keySet() ){
            for(int j=1;j<=DaysPerMonth.get(i);j++){
                tmp=numberOfMonth.get(i)*100+j;
                AvailableDays.put(tmp,Boolean.TRUE);

            }
        }


        Months.add("january");
        Months.add("february");
        Months.add("march");
        Months.add("april");
        Months.add("may");
        Months.add("june");
        Months.add("july");
        Months.add("august");
        Months.add("september");
        Months.add("october");
        Months.add("november");
        Months.add("december");
        createFr();
        failRerervation.setVisible(false);


        sumbitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String tmp=(String) comboBox1.getSelectedItem(),tmp1=(String) comboBox3.getSelectedItem();  //tmp=arrival month,tmp1=departure month
                tmp=tmp.toLowerCase();
                tmp1=tmp1.toLowerCase();
                int tmp2=Integer.parseInt((String) comboBox2.getSelectedItem()); // tmp2=arrival date
                tmp1=tmp1.toLowerCase();
                int tmp3=Integer.parseInt((String) comboBox4.getSelectedItem()); // tmp3=departure date
                int count=0;
                boolean state=rentDays(tmp,tmp2,tmp1,tmp3);
                if(state){
                    JOptionPane.showMessageDialog(null,"Successfull reservation!");
                    JOptionPane.getRootFrame().dispose();
                    calFrame.dispose();
                }
                else{
                    JOptionPane.showMessageDialog(null,"Unsuccessfull reservation.Please try again.");
                    JOptionPane.getRootFrame().dispose();
                    calFrame.dispose();
                    Calendar c=new Calendar();
                }









            }
        });
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
    public ArrayList<Integer> sortDays(){
        ArrayList<Integer> tmp = new ArrayList<>(AvailableDays.keySet());
        Collections.sort(tmp);
        return tmp;
    }

    public Boolean rentDays(String monthArrive,int arrival,String monthDeparture,int departure){
        arrival=numberOfMonth.get(monthArrive)*100+arrival;
        departure=numberOfMonth.get(monthDeparture)*100+departure;
        Boolean returnType=true;
        if(arrival>departure){
            returnType= false;
        }
        ArrayList <Integer> tmp=new ArrayList<>();
        tmp=sortDays();
        for(int i:tmp){
            if(i>=arrival && i<departure){
                if(!AvailableDays.get(i)) {
                    returnType= false;
                }
            }
        }
        if(returnType){
            for(int i:tmp){
                if(i>=arrival && i<departure){
                    AvailableDays.replace(i,false);
                }
            }
        }
        //showRentDays(monthArrive,arrival%100,monthDeparture,departure%100,returnType);
        return returnType;
    }

    public void showRentDays(String monthArrive,int arrival,String monthDeparture,int departure,boolean returnType){
        if(returnType)
            System.out.println("Your visit in our place will last from "+arrival + " of "+monthArrive+" to "+ departure +" of "+monthDeparture+"!");

    }
    public void preferableDaysOfStay(){
        String monAr,monD;
        int dateAr,dateD;
        Scanner read=new Scanner(System.in);
        System.out.println("Please enter the month  of the arrival");
        monAr=read.nextLine();
        monAr=monAr.toLowerCase();
        monAr=monAr.replaceAll(" ","");
        System.out.println("Please enter the date  of the arrival");
        dateAr=read.nextInt();
        while(dateAr>DaysPerMonth.get(monAr)){
            System.out.println("Please insert a valid date between 1 and "+ DaysPerMonth.get(monAr));
            dateAr=read.nextInt();
          }

            read.nextLine();
        System.out.println("Please enter the month of the departure");
        monD=read.nextLine();
        monD=monD.toLowerCase();
        monD=monD.replaceAll(" ","");
       // read.nextLine();
        System.out.println("Please enter the date of the departure");
        dateD=read.nextInt();
        while(dateD>DaysPerMonth.get(monD)){
            System.out.println("Please insert a valid date between 1 and "+ DaysPerMonth.get(monD));
            dateD=read.nextInt();
        }
        rentDays(monAr,dateAr,monD,dateD);
    }
    public void createFr(){

        calFrame=new JFrame();
        calFrame.add(calPanel);
        calFrame.setBounds(250,250,100000,1000);
//        AccommodationFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        calFrame.pack();
        calFrame.setVisible(true);
    }
    public static void main(String[] args){
        Calendar a= new Calendar();

    }
}
