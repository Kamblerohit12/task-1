import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;


import static java.awt.Color.BLACK;
import static java.awt.Color.BLUE;

public class swingdemo  implements ActionListener {
    JFrame f;
    JLabel lblusername, lblpassword;
    JButton btnsubmit, regester;
    JButton btnreset;
    JTextField lbl1 = new JTextField(" ");
    JLabel lbl2;


    JTextField txtusername, txtpassword;

    swingdemo() {
        lbl2 = new JLabel("ONLINE RESERVATION SYSTEM");
        Font f1 = new Font("sans serif", Font.BOLD, 20);
        lbl2.setBounds(30, 50, 350, 50);
        lbl2.setFont(f1);
        f = new JFrame();
        lblusername = new JLabel("enter username");
        lblpassword = new JLabel("enter password");
        txtusername = new JTextField();
        lblusername.setForeground(Color.white);
        lblpassword.setForeground(Color.white);
        txtpassword = new JTextField();
        regester = new JButton("Sign up");
        regester.setForeground(Color.white);
        regester.setBackground(BLUE);
        regester.setBounds(270, 330, 80, 20);
        f.add(regester);
        btnsubmit = new JButton("Submit");
        btnreset = new JButton("reset");
        lblusername.setBounds(30, 100, 150, 30);
        lblpassword.setBounds(30, 150, 150, 30);
        txtusername.setBounds(150, 100, 150, 30);
        txtpassword.setBounds(150, 150, 150, 30);
        btnsubmit.setBounds(30, 230, 100, 30);
        f.add(btnsubmit);
        btnreset.setBounds(180, 230, 100, 30);
        f.add(btnreset);
        f.add(txtusername);
        f.add(txtpassword);
        f.add(lbl2);
        JPanel p = new JPanel();
        f.add(lblusername);
        f.add(lblpassword);
        f.getContentPane().setBackground(Color.gray);
        f.add(p);
        f.setLayout(null);
        f.setSize(400, 400);
        f.show();
        btnsubmit.addActionListener(this);
        regester.addActionListener(this);
        btnreset.addActionListener(this);
    }


    @Override

    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == btnsubmit) {

            if (txtusername.getText().equals("rohit") && txtpassword.getText().equals("rohit358")) {

                demo d = new demo();
                d.setVisible(true);
            } else {
                lbl1.setBounds(30, 270, 250, 30);
              //  f.add(lbl1);
                txtusername.setText("incorrect username!");
                txtpassword.setText("incorrect password!");
                txtusername.setForeground(BLACK);
                txtpassword.setForeground(Color.black);
            }
        }
        if(e.getSource()==regester)
        {
            Regestration r1=new Regestration();
            r1.setVisible(true);
        }
        if(e.getSource()==btnreset){
          lbl1.setText("");
          txtusername.setText("");
          txtpassword.setText("");
        }
    }






    public static void main(String[] args) {
        new swingdemo();    }

}
