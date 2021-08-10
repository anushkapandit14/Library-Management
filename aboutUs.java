package library.management.system;

import java.awt.*;
import javax.swing.*;
import javax.swing.border.*;

public class aboutUs extends JFrame{

	private JPanel contentPane;

        public static void main(String[] args) {
            new aboutUs().setVisible(true);			
	}
    
        public aboutUs() {
            
            super("About Us - Internship Project");
            setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\ram\\Desktop\\rohit.jpg"));
            setBackground(new Color(173, 216, 230));
            setBounds(500, 250, 700, 500);
		
            contentPane = new JPanel();
            setContentPane(contentPane);
            contentPane.setLayout(null);

            


            JLabel l3 = new JLabel("Good Books Library");
            l3.setForeground(new Color(0, 250, 154));
            l3.setFont(new Font("Trebuchet MS", Font.BOLD | Font.ITALIC, 34));
            l3.setBounds(160, 40, 150, 55);
            contentPane.add(l3);
            
            JLabel l4 = new JLabel("Books Library");
            l4.setForeground(new Color(0, 250, 154));
            l4.setFont(new Font("Trebuchet MS", Font.BOLD | Font.ITALIC, 34));
            l4.setBounds(160, 40, 150, 55);
            contentPane.add(l4);

            


            JLabel l6 = new JLabel("Developed By :Anushka Pandit ");
            l6.setFont(new Font("Trebuchet MS", Font.BOLD, 30));
            l6.setBounds(70, 198, 600, 35);
            contentPane.add(l6);
            
            JLabel l7 = new JLabel(" Sanika Indulkar");
            l7.setFont(new Font("Trebuchet MS", Font.BOLD, 30));
            l7.setBounds(70, 198, 600, 35);
            contentPane.add(l7);

           


            JLabel l10 = new JLabel("**Successfully completed the project**");
            l10.setForeground(new Color(47, 79, 79));
            l10.setFont(new Font("Trebuchet MS", Font.BOLD | Font.ITALIC, 18));
            l10.setBounds(70, 400, 600, 34);
            contentPane.add(l10);
                
                
            contentPane.setBackground(Color.WHITE);
	}
        

}

