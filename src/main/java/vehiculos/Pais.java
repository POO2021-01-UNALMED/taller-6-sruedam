package vehiculos;
import java.util.*;

public class Pais {
	private String nombre;
	private static ArrayList<Pais> paises = new ArrayList<Pais>();
	private int vehiculosFabricados = 0;
	
	public Pais() {
		this.nombre = "Narnia";
		paises.add(this);
	}
	
	public Pais(String nombre) {
		this.nombre = nombre;
		paises.add(this);
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public static ArrayList<Pais> getPaises() {
		return paises;
	}

	public static void setPaises(ArrayList<Pais> paises) {
		Pais.paises = paises;
	}
	
	public void fabricarVehiculo() {
		this.vehiculosFabricados++;
	}
	
	public int getVehiculosFabricados() {
		return this.vehiculosFabricados;
	}
	
	public static Pais paisMasVendedor() {
		Pais ganador = new Pais();
		for (int i = 0; i < paises.size(); i++) {
			if (paises.get(i).getVehiculosFabricados() > ganador.getVehiculosFabricados()) {
				ganador = paises.get(i);
			}
		}
		return ganador;
	}
}
