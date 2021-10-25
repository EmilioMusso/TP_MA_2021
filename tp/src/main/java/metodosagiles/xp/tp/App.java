package metodosagiles.xp.tp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

import javax.swing.JFrame;
import javax.swing.UIManager;
import javax.swing.UIManager.LookAndFeelInfo;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.WindowConstants;

import org.hibernate.engine.jdbc.connections.spi.DataSourceBasedMultiTenantConnectionProviderImpl;
import org.hibernate.loader.entity.plan.DynamicBatchingEntityLoader;

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
	
//		DBConnect();
//		DBLoad();
		
		
	}
	
	
private static void DBLoad() {
		// TODO Auto-generated method stub
		
	}


private static void DBConnect() {
		final String url = "jdbc:postgresql://localhost:5432/";
		Properties props = new Properties();
		final String dbName = "Test01";		
		Properties props1 = new Properties();
		props1.setProperty("user","root");
		
		try {
			Connection conn = DriverManager.getConnection(url, props1);
			
			if(!conn.isClosed())
				System.out.println("Database connection working...");
		} catch (Exception e){
			System.err.println("Exception "+e.getMessage());
		} 
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
