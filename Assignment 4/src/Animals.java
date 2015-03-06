import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.text.JTextComponent;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTextArea;
import javax.swing.JLabel;

import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class Animals extends JFrame {

	Human man;
	Dog dog;
	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextArea textArea;
	private JTextArea textArea_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Animals frame = new Animals();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Animals() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 575, 404);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(12, 48, 207, 22);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(12, 105, 207, 22);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		final JTextArea error = new JTextArea();
		error.setBounds(42, 289, 447, 55);
		contentPane.add(error);
		
		
		JButton humanBtn = new JButton("New Human");
		humanBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String name = textField.getText();
				if(name.length()<4){
					error.setText("FEL");
					
				}else{
					man = new Human(name);
					/*textArea.setText(name);*/
				}
			}
		});
		humanBtn.setBounds(231, 47, 207, 25);
		contentPane.add(humanBtn);
		
		JButton buyDogBtn = new JButton("Buy Dog");
		buyDogBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Dog dog = null ;
				if(man != null){
					
					dog = new Dog(textField_1.getText());
					man.buyDog(dog);
					
					
				}else{
					
					error.setText("FEL");
				}
			}
		});
		buyDogBtn.setBounds(231, 104, 207, 25);
		contentPane.add(buyDogBtn);
		
		JButton printInfoBtn = new JButton("Print info");
		printInfoBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textArea.setText(man.getInfo());
			}
		});
		printInfoBtn.setBounds(160, 169, 246, 25);
		contentPane.add(printInfoBtn);
		
		textArea = new JTextArea();
		textArea.setBounds(42, 217, 447, 55);
		contentPane.add(textArea);
		

		JLabel lblInfo = new JLabel("Info");
		lblInfo.setBounds(40, 199, 56, 16);
		contentPane.add(lblInfo);
		
		JLabel lblErrorMsg = new JLabel("Error msg");
		lblErrorMsg.setBounds(42, 272, 83, 16);
		contentPane.add(lblErrorMsg);
		
		JLabel lblHumansDogs = new JLabel("Humans & Dogs");
		lblHumansDogs.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblHumansDogs.setBounds(204, 13, 234, 34);
		contentPane.add(lblHumansDogs);
	}

}
