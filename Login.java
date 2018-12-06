package funcs;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JPanel;
import javax.swing.ImageIcon;

public class Login extends JFrame implements ActionListener{

	private JTextField textField;
	private JTextField textField_1;
	private JButton btnLogin;
	JLabel lblId;
	JLabel label;
	private JLabel label_1;
	private JPanel panel;
	private JLabel lblNewLabel;
	private final JLabel label_2 = new JLabel("");
	
	Login() {
		
		setBounds(100, 100, 450, 300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(162, 101, 144, 20);
		getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(162, 132, 144, 20);
		getContentPane().add(textField_1);
		
		lblId = new JLabel("ID");
		lblId.setBounds(90, 104, 46, 14);
		getContentPane().add(lblId);
		
		label = new JLabel("Password");
		label.setBounds(90, 135, 62, 14);
		getContentPane().add(label);
		
		btnLogin = new JButton("Login");
		btnLogin.addActionListener(this);
		btnLogin.setBounds(188, 174, 89, 23);
		getContentPane().add(btnLogin);
		
		label_1 = new JLabel("");
		label_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		label_1.setForeground(new Color(255, 0, 0));
		label_1.setBounds(162, 81, 144, 14);
		getContentPane().add(label_1);
		label_2.setBounds(188, 0, 89, 95);
		getContentPane().add(label_2);
		label_2.setIcon(new ImageIcon("C:\\Users\\m7mda\\eclipse-workspace\\funcs\\kfupm_logo.png"));
		label_2.setForeground(Color.RED);
		label_2.setFont(new Font("Tahoma", Font.BOLD, 11));
		
		lblNewLabel = new JLabel("");
		lblNewLabel.setBounds(0, 0, 437, 274);
		getContentPane().add(lblNewLabel);
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\m7mda\\eclipse-workspace\\funcs\\kfupm tower 3(day).jpg"));
		
		panel = new JPanel();
		panel.setBounds(0, 0, 434, 261);
		getContentPane().add(panel);
		
	}


	
	public void actionPerformed(ActionEvent e) {
		String id = textField.getText();
		String Password = textField_1.getText();
		boolean login = Student.t.login(id, Password);
		if(!login) label_1.setText("Incorrect ID or Password");
		else {
			dasd d= new dasd();
			d.setVisible(true);
				
			}
		
	}
}
