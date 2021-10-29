package XP.UI;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;

import XP.AppSistema;

public class MenuBarra extends JMenuBar {
	
	private JPanel menuPrincipal;
	private JMenu menuArchivo;
	private JMenuItem menuItemSalir;
	private JMenu menuVendedor;
	private JMenuItem menuItemAltaVendedor;
	private PanelAltaVendedor panelAltaVendedor;
	private JMenu menuInmueble;
	private JMenuItem menuItemAñadirInmueble;
	private JMenuItem menuItemAltaInmueble;

	
	MenuBarra(AppSistema appE, JFrame frame) {
		super();
		armarPanel(appE, frame);
	}

	public void armarPanel(AppSistema appE, JFrame frame) {

		menuArchivo = new JMenu("File");
		
		menuItemSalir = new JMenuItem("Salir");
		menuItemSalir.addActionListener( e -> System.exit(0));
		menuArchivo.add(menuItemSalir);
				
		menuVendedor = new JMenu("Vendedor");
//		---------------------------------------------------------------- Vendedor
		menuItemAltaVendedor = new JMenuItem("Añadir Vendedor");
		menuItemAltaVendedor.addActionListener( a -> {
			frame.setContentPane(panelAltaVendedor= new PanelAltaVendedor(frame));
			frame.revalidate();
			frame.repaint();
		});
		
		
		menuVendedor.add(menuItemAltaVendedor);
		
		menuInmueble= new JMenu("Inmueble");
//		---------------------------------------------------------------- Inmueble
		menuItemAltaInmueble= new JMenuItem("Añadir Inmueble");
		menuItemAltaInmueble.addActionListener( a -> {
			//frame.setContentPane(panelInsumo = new PanelAltaInmueble(appE, frame, 0.0));
			frame.revalidate();
			frame.repaint();
		});
		menuInmueble.add(menuItemAltaInmueble);
		
		
		this.add(menuArchivo);
		this.add(menuVendedor);
		this.add(menuInmueble);
		frame.setJMenuBar(this);
	}

}
