import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Regestration extends JFrame implements ActionListener {
    JLabel fname,lname,Username,password,retypepass,dob;
    JButton reg,cancle;
  TextField txtfname,txtlname,txtUsername,txtpassword,txtretypepass,txtdob;
    Regestration()
    {
        fname=new JLabel("Frist Name : ");
        lname= new JLabel("Last Name : ");
        Username= new JLabel("UserName :");
        password=new JLabel("password :");
        retypepass=new JLabel("Confirm Password :");
        dob= new JLabel("Date of Birth :");

        txtfname=new TextField();
        txtlname=new TextField();
        txtUsername=new TextField();
        txtpassword=new TextField();
        txtretypepass=new TextField();
        txtdob=new TextField();
         reg= new JButton("Regester");
         cancle=new JButton("Cancle");
getContentPane().setBackground(Color.GRAY);
         cancle.setBounds(200,280,100,30);
        reg.setBounds(60,280,100,30);
        fname.setBounds(60,50,100,30);
        lname.setBounds(60,80,100,30);
        Username.setBounds(60,110,100,30);
        password.setBounds(60,140,100,30);
        retypepass.setBounds(30,170,120,30);
        dob.setBounds(60,200,100,30);

        txtfname.setBounds(160,50,150,25);
        txtlname.setBounds(160,80,150,25);
        txtUsername.setBounds(160,110,150,25);
        txtpassword.setBounds(160,140,150,25);
        txtretypepass.setBounds(160,170,150,25);
        txtdob.setBounds(160,200,150,25);

add(reg);
add(cancle);

        add(fname);
        add(lname);
        add(Username);
        ;add(password);
        add(retypepass);
        add(dob);


        add(txtfname);
        add(txtlname);
        add(txtUsername);
        ;add(txtpassword);
        add(txtretypepass);
        add(txtdob);

        setSize(500,400);
   setLayout(null);
        setVisible(true);
reg.addActionListener(this);
cancle.addActionListener(this);

    }
    public static void main(String arg[])
    {
        new Regestration();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
if(e.getSource()==reg){
    swingdemo r1= new swingdemo();


}
if(e.getSource()==cancle){
    txtfname.setText("");
            txtlname.setText("");
    txtUsername.setText("");
    password.setText("");
            txtretypepass.setText("");
    txtdob.setText("");
}

    }
}
