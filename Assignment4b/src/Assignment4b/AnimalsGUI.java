package Assignment4b;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;


public class AnimalsGUI extends JFrame {

	private JPanel contentPane;
	private ArrayList<Animal> BossesDjurpark;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AnimalsGUI frame = new AnimalsGUI();
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
	public AnimalsGUI() {
		
		BossesDjurpark = new ArrayList<Animal>();
	
		
		
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(12, 13, 408, 227);
		contentPane.add(scrollPane);
		
		JTextArea textArea = new JTextArea();
		scrollPane.setViewportView(textArea);
		
		BossesDjurpark.add(new Snake("SlingrarN", "storus maskis", true));
		BossesDjurpark.add(new Snake("Göte", "storus maskis", false));
		Cat stoijan = new Cat("Kattus rövhålis", 4, 6);
		stoijan.setfriendlyName("Stoijan");
		BossesDjurpark.add(stoijan);
		BossesDjurpark.add(new Cat("Örjan", "kattus rövhålis", 4));
		Dog atlas = new Dog("hundus mortalis", 2, true);
		BossesDjurpark.add(atlas);
		BossesDjurpark.add(new Dog("Atlas", "hundus mortalis", 5, true));
		BossesDjurpark.add(new Dog("Zac", "hundus mortalis", 3, false));
		
		for(Animal i: BossesDjurpark){
			textArea.append(i.getinfo() + "\n");
		}
		
		
	}
	
}
