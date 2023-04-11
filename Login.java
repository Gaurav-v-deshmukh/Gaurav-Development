package bankmanagement;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Login extends JFrame implements ActionListener
{
    JButton login,SignUp,Clear;
    JTextField LoginTextField;
    JPasswordField PasswordTextField; 
    Login()
    {
        setLayout(null);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("Icons/Untitled.png"));
        Image i2 = i1.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
       ImageIcon i3 = new ImageIcon(i2);
        JLabel label = new JLabel(i3);
        label.setBounds(70,10,100,100);
        add(label); 
        
        JLabel text = new JLabel("Welcome to Deshmukh Bank");
        text.setFont(new Font("ALGERIAN",Font.BOLD,30));
        text.setBounds(200,40,800,40);
        add(text);
        
        JLabel LoginId = new JLabel("Login ID:");
        LoginId.setFont(new Font("Raleway",Font.BOLD,25));
        LoginId.setBounds(150,180,200,30);
        add(LoginId);
        
         LoginTextField = new JTextField();
        LoginTextField.setBounds(340,180,250,30);
        add(LoginTextField);
        
        JLabel Password = new JLabel("Password:");
        Password.setFont(new Font("Raleway",Font.BOLD,25));
        Password.setBounds(150,250,800,30);
        add(Password);
        
         PasswordTextField = new JPasswordField();
        PasswordTextField.setBounds(340,250,250,30);
        add(PasswordTextField);
        
         login = new JButton("SIGN IN");
        login.setBounds(340,300,100,30);
        login.addActionListener(this);
        add(login);
        
         SignUp  = new JButton("SIGN UP");
        SignUp.setBounds(340,340,250,30);
        SignUp.addActionListener(this);
        add(SignUp);
         
         Clear  = new JButton("Clear");
        Clear.setBounds(490,300,100,30);
        Clear.addActionListener(this);
        add(Clear);
        
        getContentPane().setBackground(Color.orange);
                
        
        setTitle("Deshmukh Bank");
      setSize(800,480);
      setVisible(true);
      setLocation(350,200);
    }
    public void actionPerformed(ActionEvent ae)
    {
        if(ae.getSource() == Clear)
        {
            LoginTextField.setText("");
            PasswordTextField.setText("");
        }
        else if(ae.getSource() == login)
        {
        
        }
        else if(ae.getSource() == SignUp)
        {
            SignupOne Sign = new SignupOne();
        }
    }
     public static void main(String args[])
     {
         new Login();
     }
}
