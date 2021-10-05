package metodosagiles.xp.tp.UI;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.UIManager;
import javax.swing.UIManager.LookAndFeelInfo;
import javax.swing.UnsupportedLookAndFeelException;

import metodosagiles.xp.tp.AppSistema;

import javax.swing.JTabbedPane;
import javax.swing.JPanel;
import javax.swing.JTextPane;
import javax.swing.JButton;
import javax.swing.JDesktopPane;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JTextArea;

public class MainFrame extends JPanel {

	//Declaraciones de elementos de la pantalla
	private JFrame frame;
	private JTextField textField;
	//

	/**
	 * Create the application.
	 */
	public MainFrame(AppSistema appS, JFrame frame) {
		super();
		initialize(appS, frame);
	}


	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize(AppSistema appS, JFrame frame) {
	
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 784, 561);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(0, 0, 784, 561);
		panel.add(tabbedPane);
		
		JDesktopPane desktopPane = new JDesktopPane();
		tabbedPane.addTab("New tab", null, desktopPane, null);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setBounds(10, 11, 46, 14);
		desktopPane.add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(10, 36, 86, 20);
		desktopPane.add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton = new JButton("New button");
		btnNewButton.setBounds(106, 35, 89, 23);
		desktopPane.add(btnNewButton);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(33, 88, 269, 133);
		desktopPane.add(textArea);
		
		JTabbedPane tabbedPane_1 = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.addTab("New tab", null, tabbedPane_1, null);
		String var = textArea.getText();
		
		
		
	}
}
