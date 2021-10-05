package metodosagiles.xp.tp;

import javax.swing.JFrame;
import javax.swing.UIManager;
import javax.swing.UIManager.LookAndFeelInfo;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.WindowConstants;

import javafx.scene.paint.Color;
import metodosagiles.xp.tp.UI.MainFrame;

public class App {
	private JFrame frame;
	private MainFrame mainFrame;
	
	public static void main(String[] args) {
		App app = new App();
		AppSistema appS = new AppSistema();
		
		
		/**
		 * definicion de elementos para la app
		 */
		
		
		app.armarApp(appS);
		
		
	}
	
	
private void armarApp(AppSistema appS) {

		try {
//			UIManager.setLookAndFeel("com.seaglasslookandfeel.SeaGlassLookAndFeel");
		    for (LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
		        if ("Nimbus".equals(info.getName())) {
		            UIManager.setLookAndFeel(info.getClassName());
		            break;
		        }
		    }
		} catch (ClassNotFoundException | InstantiationException | IllegalAccessException
				| UnsupportedLookAndFeelException e) {
			try {
				UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
			} catch (ClassNotFoundException | InstantiationException | IllegalAccessException
					| UnsupportedLookAndFeelException e1) {
				e1.printStackTrace();
			}
		}
		
		frame = new JFrame("Empresa XXX");
		frame.setBounds(200, 0, 800, 600);
		frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		
		mainFrame= new MainFrame(appS, frame);
		
		frame.setVisible(true);	

		
	}
}
