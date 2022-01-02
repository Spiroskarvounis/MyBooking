import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AddExtraFacility {
    JFrame fr;
    protected JPanel jpan;
    private JButton yes;
    private JButton no;
    private JLabel question;

    public AddExtraFacility() {
        yes.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                fr.dispose();
                accommodation a=new accommodation();
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



}
