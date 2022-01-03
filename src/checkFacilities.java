import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class checkFacilities extends  provider{
    JFrame checkFrame;
    private JPanel checkPanel;
    private JButton nextButton;
    private JButton closeButton;
    private JLabel printInf;

    public checkFacilities(accommodation acc) {
        super(1);
        nextButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                printInf.setText("The name of the facility is "+acc.getName()+"!\n"+"The location is "+acc.getLocation()+"!\n"+"The price of the night  is "+acc.getPrice()+"!\n"+"The square metres are "+acc.getSquareMetres()+"!\n"+"The capacity is "+acc.getCapacity()+"!\n");
            }
        });
        CreateFrame();
        closeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                checkFrame.dispose();
            }
        });
    }

    private void CreateFrame(){
        checkFrame=new JFrame();
        checkFrame.add(checkPanel);
        checkFrame.setBounds(250,250,100000,1000);
//        AccommodationFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        checkFrame.pack();
        checkFrame.setVisible(true);
    }
}
