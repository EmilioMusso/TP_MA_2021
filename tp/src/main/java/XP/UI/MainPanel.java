package XP.UI;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.UIManager;
import javax.swing.UIManager.LookAndFeelInfo;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter.DEFAULT;

import javax.swing.UnsupportedLookAndFeelException;

import XP.AppSistema;
import XP.UTIL.strings;

import javax.swing.JTabbedPane;
import javax.swing.JPanel;
import javax.swing.JTextPane;
import javax.swing.JButton;
import javax.swing.JDesktopPane;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;
import javax.swing.JToolBar;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JMenu;

public class MainPanel extends JPanel{

	//Declaraciones de elementos de la pantalla
	//
	private JPanel PanelAltaVendedor;
	private JPanel PanelBajaVendedor;
	private JPanel PanelModificarVendedor;
	private XP.UI.MenuBarra menuBar;
	/**
	 * Create the application.
	 */
	public MainPanel(AppSistema appS, JFrame frame) {
		super();
		this.initialize(appS, frame);
	}


	/**
	 * Initialize the contents of the frame.
	 */
	
	private void initialize(AppSistema appS, JFrame frame) {
		
		menuBar = new MenuBarra(appS, frame);
	}
	 
//	private void initialize(/*AppSistema appS,*/ JFrame frame) {
//	
//		

//		
//		JDesktopPane desktopPane = new JDesktopPane();
//		desktopPane.setBounds(10, 41, 764, 509);
//		panel.add(desktopPane);
//		
//		JMenuBar menuBar = new JMenuBar();
//		menuBar.setBounds(10, 8, 101, 22);
//		panel.add(menuBar);
//		
//		JMenu itemFile = new JMenu(strings.FILE_LABEL);
//		menuBar.add(itemFile);
//		JMenu itemEdit = new JMenu(strings.EDIT_LABEL);
//		menuBar.add(itemEdit);
//		
//		JMenuItem itemSalir = new JMenuItem(strings.EXIT_LABEL);
//		itemFile.add(itemSalir);
//		
//		itemSalir.addActionListener(a -> {
//			System.exit(0);
//		});
//		
//	
//	}
}
