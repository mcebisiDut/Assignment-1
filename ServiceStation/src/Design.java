import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Design {

	private JFrame frame;
	private JTextField txtArrivalTime;
	private JTextField txtProbabilityOne;
	private JTextField txtProbabilityTwo;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Design window = new Design();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Design() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblArrivalTime = new JLabel("Arrival Time");
		lblArrivalTime.setBounds(10, 11, 73, 24);
		frame.getContentPane().add(lblArrivalTime);
		
		txtArrivalTime = new JTextField();
		txtArrivalTime.setBounds(187, 13, 123, 20);
		frame.getContentPane().add(txtArrivalTime);
		txtArrivalTime.setColumns(10);
		
		JLabel lblServiceProbabilityOne = new JLabel("Service Probability One");
		lblServiceProbabilityOne.setBounds(10, 70, 135, 24);
		frame.getContentPane().add(lblServiceProbabilityOne);
		
		txtProbabilityOne = new JTextField();
		txtProbabilityOne.setColumns(10);
		txtProbabilityOne.setBounds(187, 72, 123, 20);
		frame.getContentPane().add(txtProbabilityOne);
		
		txtProbabilityTwo = new JTextField();
		txtProbabilityTwo.setColumns(10);
		txtProbabilityTwo.setBounds(187, 132, 123, 20);
		frame.getContentPane().add(txtProbabilityTwo);
		
		JLabel lblServiceProbabilityTwo = new JLabel("Service Probability Two");
		lblServiceProbabilityTwo.setBounds(10, 130, 135, 24);
		frame.getContentPane().add(lblServiceProbabilityTwo);
		
		JButton btnRun = new JButton("Run");
		btnRun.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Service service = new Service();
				Integer arrivalTime = Integer.parseInt(txtArrivalTime.getText());
				Integer probabilityOne = Integer.parseInt(txtProbabilityOne.getText());
				Integer probabilityTwo = Integer.parseInt(txtProbabilityTwo.getText());
				service.carService(arrivalTime, probabilityOne, probabilityTwo);
			}
		});
		btnRun.setBounds(122, 214, 73, 23);
		frame.getContentPane().add(btnRun);
		
		JButton btnDefaults = new JButton("Defaults");
		btnDefaults.setBounds(281, 214, 89, 23);
		frame.getContentPane().add(btnDefaults);
	}
}
