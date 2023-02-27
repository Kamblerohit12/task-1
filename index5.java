import javax.swing.*;
import java.awt.*;

public class resit extends Frame {
    JLabel title = new JLabel("");
   // Frame f1= new Frame("Bill resit");
    Label username = new Label("Name : "+"...................... ");
    Label tickit = new Label("From :"+" ..................     "+"  to :"+"  ......................"+"") ;
    Label rupees = new Label("Amount : "+".................");
    Label msg =new Label( "Happy Journey");
    Label l1=new Label( "Paid successfully");

    resit()
    {
        title.setFont(new Font("Verdana", Font.PLAIN, 30));
        username.setFont(new Font("Verdana", Font.PLAIN, 15));
        tickit.setFont(new Font("Verdana", Font.PLAIN, 15));
        rupees.setFont(new Font("Verdana", Font.PLAIN, 15));
        msg.setFont(new Font("Verdana", Font.PLAIN, 45));
        l1.setFont(new Font("Verdana", Font.PLAIN, 15));

        l1.setBounds(200,300,200,20);
    title.setBounds(100,100,700,100);
    username.setBounds(200,200,100,20);
    tickit.setBounds(200,250,300,20);
    rupees.setBounds(200,350,100,20);
    msg.setBounds(260,420,900,100);
    add(tickit);
add(l1);
        add(tickit);
        add(title);
        add(username);
        add(rupees);
        add(msg);
        setSize(800,700);
        setLayout(null);
        setVisible(true);
    }
    public void paint(Graphics g) {
        Font f = new Font("ALGERIAN", Font.BOLD, 30);
        g.setFont(f);
        g.setColor(Color.CYAN);

        g.drawString("Chatrapati Shiwaji Terminas, Latur", 100, 100);
        g.setColor(Color.gray);
     //   g.drawString("from", 600, 380);
        g.setColor(Color.gray);
       g.fillRect(150, 120, 500, 300);
       // g.drawString("to", 1200, 380);
      //  g.fillRect(400, 400, 500, 300);

    }

    public static void main(String[] args) {
        new resit();
    }









}
