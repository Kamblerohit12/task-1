import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class newreser extends Frame implements ActionListener {

    newreser()
    {
       TextField tffrom = new TextField();
        TextField tfto = new TextField();
        tfto.setBackground(Color.gray);
        tffrom.setBackground(Color.gray);
        tffrom.setBounds(510,280,300,40);
        tfto.setBounds(1070,280,300,40);
        add(tfto);
        add(tffrom);
        JButton btn = new JButton("Payment");
        btn.setBounds(880,800,150,60);
        add(btn);


      setSize(1800,1100);
      setLayout(null);

       setTitle("NEW RESERVATION");

        List lst = new List();
        lst.setBounds(420,420,450,270);
        List lst1 = new List();
        lst1.setBounds(1020,420,450,270);
        lst1.add("latur");
        lst1.add("nanded");
        lst1.add("LaturRoad");
        lst1.add("kolhapur");
        lst1.add("Osmanabad");
        lst1.add("pune");
        lst1.add("mumbai");
        lst1.add("delhi");
        lst1.add("hingoli");
        lst1.add("nagpur");
        lst1.add("akola");
        lst1.add("parbhani");
        lst1.add("aurangabad");
        lst1.add("nashik");
        lst1.add("solapur");
        lst1.add("beed");
        lst1.add("satara");
        lst1.add("sangali");
        lst1.add("dhule");
        lst1.add("mukhed");
        lst1.add("ahamadpur");
        lst1.add("ausa");
        lst1.add("panvel");
        lst1.add("haidrabad");
        lst1.add("panjab");
        add(lst1);

       //List lst1 = new List();
       lst.setBounds(420,420,450,270);

      lst.add("latur");
        lst.add("nanded");
        lst.add("LaturRoad");
        lst.add("kolhapur");

        lst.add("satara");
        lst.add("sangali");
        lst.add("dhule");
        lst.add("mukhed");
        lst.add("ahamadpur");
        lst.add("ausa");
        lst.add("panvel");
        lst.add("haidrabad");
        lst.add("panjab");
        lst.add("Osmanabad");
        lst.add("pune");
        lst.add("mumbai");
        lst.add("delhi");
        lst.add("hingoli");
        lst.add("nagpur");
        lst.add("akola");
        lst.add("parbhani");
        lst.add("aurangabad");
        lst.add("nashik");
        lst.add("solapur");
        lst.add("beed");
        add(lst);


        ImageIcon img = new ImageIcon("train.png");
        JLabel lbl1=new JLabel("Latur Shivaji Terminas",img,Label.LEFT);

        lbl1.setBounds(50,40,150,50);

        ImageIcon i1= new ImageIcon("train.png");
        setIconImage(i1.getImage());
        setLayout(null);
        setVisible(true);
        add(lbl1);
        btn.addActionListener(this);
        Label label= new Label("Take cursor to see payment button");
        label.setBounds(860,750,250,60);
        add(label);

    }
public void paint(Graphics g) {
    Font f = new Font("ALGERIAN", Font.BOLD, 50);
    g.setFont(f);
    g.setColor(Color.CYAN);

    g.drawString("WelCome In Regestration", 600, 200);
    g.setColor(Color.gray);
    g.drawString("from", 600, 380);
    g.setColor(Color.gray);
    g.fillRect(1000, 400, 500, 300);
    g.drawString("to", 1200, 380);
    g.fillRect(400, 400, 500, 300);

}
    public static void main(String[] args)
    {
        new newreser();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
JOptionPane.showMessageDialog(null,"Payment Successfully! Happy journey");
resit r1= new resit();
r1.setVisible(true);
    }
}
