import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AddExtraFacility extends provider{
    accommodation ac;
    JFrame fr;
    protected JPanel jpan;
    private JButton yes;
    private JButton no;
    private JLabel question;

    public AddExtraFacility() {
        super(1);
        yes.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                fr.dispose();
                accommodation a=new accommodation();
                buildings.add(a);
            }
        });
        createFr();
        no.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                fr.dispose();
            }
        });
    }
    private void createFr(){
        fr=new JFrame();
        fr.add(jpan);
        fr.setBounds(250,250,100000,1000);
//        AccommodationFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        fr.pack();
        fr.setVisible(true);
    }
    public JPanel getJPanel(){
        return jpan;
    }




    /*
    public provider getProv(){
        return prov;
    }
    public void setProv(provider a){
        prov=a;
    }

     */

    public accommodation getAc() {
        return ac;
    }

    public void setAc(accommodation ac) {
        this.ac = ac;
    }
}
