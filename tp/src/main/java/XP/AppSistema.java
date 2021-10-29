package XP;
import java.util.ArrayList;
import java.util.List;

import XP.MODEL.Usuario;
import XP.MODEL.Vendedor;
import net.bytebuddy.asm.Advice.This;

/**
 * Atributos y funciones del sistema completo
 *
 */
public class AppSistema {

	private List<Vendedor> vendedores = new ArrayList<Vendedor>();
	private List<Usuario> usuarios = new ArrayList<Usuario>();

	Usuario u1 = new Usuario(01, "usuario_test_01");
	Usuario u2 = new Usuario(02, "usuario_test_02");
	
	public void addVendedor(Vendedor v1) {
		this.vendedores.add(v1);
	}
	
	public void addUsuario(Usuario u1) {
		this.usuarios.add(u1);
	}
	
}
