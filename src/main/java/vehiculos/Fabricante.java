package vehiculos;
import java.util.*;

public class Fabricante {
	private String nombre;
	private Pais pais;
	private int vehiculosFabricados = 0;
	private static ArrayList<Fabricante> fabricantes = new ArrayList<Fabricante>();
	
	public Fabricante() {
		this.nombre = null;
		this.pais = null;
		fabricantes.add(this);
	}
	
	public Fabricante(String nombre, Pais pais) {
		this.nombre = nombre;
		this.pais = pais;
		fabricantes.add(this);
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Pais getPais() {
		return this.pais;
	}

	public void setPais(Pais pais) {
		this.pais = pais;
	}
	
	public void fabricarVehiculo() {
		this.vehiculosFabricados++;
	}
	
	public int getVehiculosFabricados() {
		return this.vehiculosFabricados;
	}

	public static ArrayList<Fabricante> getFabricantes() {
		return fabricantes;
	}

	public void setFabricantes(ArrayList<Fabricante> fabricantes) {
		Fabricante.fabricantes = fabricantes;
	}
	
	public static Fabricante fabricaMayorVentas() {
		Fabricante ganador = new Fabricante();
		for (int i = 0; i < fabricantes.size(); i++) {
			if (fabricantes.get(i).getVehiculosFabricados() > ganador.getVehiculosFabricados()) {
				ganador = fabricantes.get(i);
			}
		}
		return ganador;
	}
}
