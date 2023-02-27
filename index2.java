import javax.swing.*;
import  java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
class demo extends JFrame implements ActionListener{
    JMenu menu1,menu2,menu3,menu4,menu5,menu6;
    JMenuItem i1,i2,i3,i4,i5,i6;
    demo()
    {
        JMenuBar mb= new JMenuBar();
        menu1=new JMenu("Home");
        menu2=new JMenu("Reservation");
        menu3=new JMenu("Profile");
        menu4= new JMenu("Logout");
        menu5=new JMenu("help");
        menu6=new JMenu("contact");

        i1=new JMenuItem("view");
        i2=new JMenuItem("update");
        i3=new JMenuItem("new Reservation");
        i4=new JMenuItem("open");
        i5=new JMenuItem("upadte ");
        i6=new JMenuItem("cancle reservation");
      menu2.add(i3);
      menu2.add(i4);
      menu2.add(i5);
        menu2.add(i6);
        menu3.add(i1);
        menu3.add(i2);
        mb.add(menu1);
        mb.add(menu2);
        mb.add(menu3);
        mb.add(menu4);
        mb.add(menu5);
        mb.add(menu6);
        setJMenuBar(mb);
        setSize(400,400);
        setLayout(null);
        setVisible(true);


i3.addActionListener( this);
    }
    public void actionPerformed(ActionEvent e){
        newreser n1 = new newreser();
        setVisible(true);
    }
public  static void main(String [] arg)
    {
        new demo();

    }
}
