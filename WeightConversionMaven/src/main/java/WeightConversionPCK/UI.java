package WeightConversionPCK;
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Toolkit;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JLabel;
import java.awt.Color;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class UI extends JFrame {

	private JPanel contentPane;
	private JTextField tfInput;
	private JTextField tfOutput;
	private JComboBox<String> cbLeft;
	private JComboBox<String> cbRight;
	private String input, left, right;
	private double factor;

	public UI() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\FAbdu\\Downloads\\scale.png"));
		setTitle("Weight Converter");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 358, 245);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		tfInput = new JTextField();
		tfInput.setFont(new Font("Tahoma", Font.BOLD, 15));
		tfInput.setBounds(21, 60, 128, 44);
		contentPane.add(tfInput);
		tfInput.setColumns(10);
		
		tfOutput = new JTextField();
		tfOutput.setFont(new Font("Tahoma", Font.BOLD, 15));
		tfOutput.setColumns(10);
		tfOutput.setBounds(190, 60, 128, 44);
		contentPane.add(tfOutput);
		
		JLabel lblNewLabel = new JLabel("Weight Converter");
		lblNewLabel.setForeground(Color.RED);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel.setBounds(109, 6, 135, 44);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("=");
		lblNewLabel_1.setForeground(Color.BLACK);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblNewLabel_1.setBounds(159, 55, 44, 44);
		contentPane.add(lblNewLabel_1);
		
		cbLeft = new JComboBox();
		cbLeft.setBounds(21, 114, 128, 21);
		contentPane.add(cbLeft);
		
		cbLeft.addItem("kilogram");
		cbLeft.addItem("pound");
		cbLeft.addItem("ounce");
		cbLeft.addItem("gram");
//		cbLeft.addItem("milligram");
//		cbLeft.addItem("ton");
		
		cbRight = new JComboBox();
		cbRight.setBounds(190, 114, 128, 21);
		contentPane.add(cbRight);
		
		cbRight.addItem("kilogram");
		cbRight.addItem("pound");
		cbRight.addItem("ounce");
		cbRight.addItem("gram");
//		cbRight.addItem("milligram");
//		cbRight.addItem("ton");
		
		JButton btnNewButton = new JButton("Convert");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				input = tfInput.getText();
				Double inputParsed = Double.valueOf(input);
				left = (String)cbLeft.getSelectedItem();
				right = (String)cbRight.getSelectedItem();
				//kilogram to lb, oz, gr
				if(left.equals("kilogram") && right.equals("pound")) {
					double result = inputParsed * 2.2;
					String resultString = Double.toString(result);
					tfOutput.setText(resultString + " lb");
				}else if(left.equals("kilogram") && right.equals("ounce")) {
					float result = (float)(inputParsed * 32.27);
					String resultString = Float.toString(result);
					tfOutput.setText(resultString + " oz");
				}else if(left.equals("kilogram") && right.equals("gram")) {
					double result = inputParsed * 1000;
					String resultString = Double.toString(result);
					tfOutput.setText(resultString + " gr");
				//pound to kg, oz, gr
				}else if(left.equals("pound") && right.equals("kilogram")) {
					float result = (float)(inputParsed * 0.4535);
					String resultString = Float.toString(result);
					tfOutput.setText(resultString + " kg");
				}else if(left.equals("pound") && right.equals("ounce")) {
					double result = inputParsed * 16;
					String resultString = Double.toString(result);
					tfOutput.setText(resultString + " oz");
				}else if(left.equals("pound") && right.equals("gram")) {
					float result = (float)(inputParsed * 453.5);
					String resultString = Float.toString(result);
					tfOutput.setText(resultString + " gr");
				//ounce to kg, lb, gr
				}else if(left.equals("ounce") && right.equals("kilogram")) {
					float result = (float)(inputParsed * 0.02834);
					String resultString = Float.toString(result);
					tfOutput.setText(resultString + " kg");
				}else if(left.equals("ounce") && right.equals("pound")) {
					float result = (float)(inputParsed * 0.0625);
					String resultString = Float.toString(result);
					tfOutput.setText(resultString + " lb");
				}else if(left.equals("ounce") && right.equals("gram")) {
					float result = (float)(inputParsed * 28.34952);
					String resultString = Float.toString(result);
					tfOutput.setText(resultString + " gr");
				//gram to kg, lb, oz
				}else if(left.equals("gram") && right.equals("kilogram")) {
					float result = (float)(inputParsed * 0.001);
					String resultString = Float.toString(result);
					tfOutput.setText(resultString + " kg");
				}else if(left.equals("gram") && right.equals("pound")) {
					float result = (float)(inputParsed * 0.00220462);
					String resultString = Float.toString(result);
					tfOutput.setText(resultString + " lb");
				}else if(left.equals("gram") && right.equals("ounce")) {
					float result = (float)(inputParsed * 0.035274);
					String resultString = Float.toString(result);
					tfOutput.setText(resultString + " oz");
				}
				
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNewButton.setForeground(Color.BLACK);
		btnNewButton.setBounds(109, 158, 117, 27);
		contentPane.add(btnNewButton);
		
		JMenu mnNewMenu = new JMenu("New menu");
		mnNewMenu.setBounds(21, 111, 111, 24);
		contentPane.add(mnNewMenu);
		
		JMenuItem mntmNewMenuItem_1 = new JMenuItem("New menu item");
		mnNewMenu.add(mntmNewMenuItem_1);
	}
}
