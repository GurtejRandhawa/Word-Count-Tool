import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class CountWords {

	private JFrame frmWordCountTool;
	private JTextField InputWordsTextField;
	private JTextField TotalWordsTextField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CountWords window = new CountWords();
					window.frmWordCountTool.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public CountWords() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmWordCountTool = new JFrame();
		frmWordCountTool.getContentPane().setBackground(Color.YELLOW);
		frmWordCountTool.setTitle("Word Count Tool");
		frmWordCountTool.setBounds(100, 100, 450, 300);
		frmWordCountTool.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmWordCountTool.getContentPane().setLayout(null);
		
		JLabel InputWordsLabel = new JLabel("Input Words:");
		InputWordsLabel.setFont(new Font("Verdana", Font.BOLD, 12));
		InputWordsLabel.setBounds(10, 19, 86, 13);
		frmWordCountTool.getContentPane().add(InputWordsLabel);
		
		InputWordsTextField = new JTextField();
		InputWordsTextField.setBounds(106, 8, 320, 37);
		frmWordCountTool.getContentPane().add(InputWordsTextField);
		InputWordsTextField.setColumns(10);
		
		JButton CountYourWordsBTN = new JButton("COUNT YOUR WORDS");
		CountYourWordsBTN.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String sentence=InputWordsTextField.getText();
				int i=0,words=1;
				for(i=0;i<sentence.length();i++)
				{
					if(sentence.charAt(i)==' ')
						words++;
				}
				TotalWordsTextField.setText(" "+words);
			}
		});
		CountYourWordsBTN.setForeground(Color.WHITE);
		CountYourWordsBTN.setBackground(Color.MAGENTA);
		CountYourWordsBTN.setFont(new Font("Verdana", Font.BOLD, 15));
		CountYourWordsBTN.setBounds(47, 65, 348, 37);
		frmWordCountTool.getContentPane().add(CountYourWordsBTN);
		
		JLabel TotalWordsLabel = new JLabel("Total Words:");
		TotalWordsLabel.setFont(new Font("Verdana", Font.BOLD, 12));
		TotalWordsLabel.setBounds(10, 148, 86, 13);
		frmWordCountTool.getContentPane().add(TotalWordsLabel);
		
		TotalWordsTextField = new JTextField();
		TotalWordsTextField.setBounds(107, 142, 96, 27);
		frmWordCountTool.getContentPane().add(TotalWordsTextField);
		TotalWordsTextField.setColumns(10);
		
		JButton ClearBTN = new JButton("CLEAR");
		ClearBTN.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				InputWordsTextField.setText("");
				TotalWordsTextField.setText("");
			}
		});
		ClearBTN.setForeground(Color.WHITE);
		ClearBTN.setBackground(Color.BLUE);
		ClearBTN.setFont(new Font("Verdana", Font.BOLD, 15));
		ClearBTN.setBounds(34, 202, 96, 37);
		frmWordCountTool.getContentPane().add(ClearBTN);
		
		JButton ExitBTN = new JButton("EXIT");
		ExitBTN.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		ExitBTN.setForeground(Color.WHITE);
		ExitBTN.setBackground(Color.RED);
		ExitBTN.setFont(new Font("Verdana", Font.BOLD, 15));
		ExitBTN.setBounds(311, 202, 96, 37);
		frmWordCountTool.getContentPane().add(ExitBTN);
	}

}
