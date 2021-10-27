package ui;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JDesktopPane;
import javax.swing.JLabel;
import javax.swing.JTextField;

import modelo.Vendedor;

import javax.swing.JPasswordField;

public class PanelModificarVendedor extends JPanel {
	private JTextField txtNombre;
	private JTextField txtApellido;
	private JTextField txtDni;
	private JPasswordField txtClaveAcceso;

	/**
	 * Create the panel.
	 */
	public PanelModificarVendedor(JFrame frame, Vendedor vendedor) { //TODO agregar appSistema
		
		
		super();
		frame.setContentPane(this);
		this.setBounds(0, 0, 784, 561);
		setLayout(null);
		
		JDesktopPane desktopPane = new JDesktopPane();
		desktopPane.setBounds(10, 11, 764, 539);
		add(desktopPane);
		
		JLabel lblNombre = new JLabel("Nombre");
		lblNombre.setBounds(10, 11, 46, 14);
		desktopPane.add(lblNombre);
		
		txtNombre = new JTextField();
		txtNombre.setBounds(10, 36, 86, 20);
		desktopPane.add(txtNombre);
		txtNombre.setColumns(10);
		txtNombre.setText(vendedor.getNombre());
		
		JLabel lblApellido = new JLabel("Apellido");
		lblApellido.setBounds(162, 11, 46, 14);
		desktopPane.add(lblApellido);
		
		txtApellido = new JTextField();
		txtApellido.setColumns(10);
		txtApellido.setBounds(162, 36, 86, 20);
		desktopPane.add(txtApellido);
		txtApellido.setText(vendedor.getApellido());
		
		txtDni = new JTextField();
		txtDni.setColumns(10);
		txtDni.setBounds(10, 112, 86, 20);
		desktopPane.add(txtDni);
		txtDni.setText(vendedor.getDni());
		
		JLabel lblDni = new JLabel("Dni");
		lblDni.setBounds(10, 87, 46, 14);
		desktopPane.add(lblDni);
		
		JLabel lblClaveAcceso = new JLabel("Clave");
		lblClaveAcceso.setBounds(10, 163, 46, 14);
		desktopPane.add(lblClaveAcceso);
		
		txtClaveAcceso = new JPasswordField();
		txtClaveAcceso.setBounds(10, 188, 86, 20);
		desktopPane.add(txtClaveAcceso);
		txtClaveAcceso.setText(vendedor.getClaveAcceso());
		
		JButton btnCrear = new JButton("Crear");
		btnCrear.setBounds(664, 500, 90, 28);
		desktopPane.add(btnCrear);
		btnCrear.addActionListener(a -> {
			crear();
		});
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.setBounds(564, 500, 90, 28);
		desktopPane.add(btnCancelar);
		btnCancelar.addActionListener(a -> {
			
		});
			
		
	}

	private void crear() {
		try {
			if (validacionesAlta()) {
				Vendedor v1 = new Vendedor(txtNombre.getText(), txtApellido.getText(), txtDni.getText(), txtClaveAcceso.getText());
			}
		} catch (CampoVacioException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	private Boolean validacionesAlta() throws CampoVacioException {
		// TODO Auto-generated method stub
		if(txtNombre.getText()==null)
			throw new CampoVacioException();
		return true;
	}
}
