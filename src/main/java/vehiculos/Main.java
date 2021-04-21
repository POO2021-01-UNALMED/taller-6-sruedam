package vehiculos;

public class Main {

	public static void main(String[] args) {
		Pais colombia = new Pais("Colombia");
		Fabricante nissan = new Fabricante("Nissan", colombia);
		Fabricante foton = new Fabricante("Foton", colombia);
		Automovil auto1 = new Automovil("AHG-313", "Aveo GT" , 1200,
				5131, nissan, 5);
		Automovil auto2 = new Automovil("AHG-312", "Aveo GT" , 1200,
				5131, nissan, 5);
		Camion auto3 = new Camion("AHG-562", "Foton" , 1200,
				5131, foton, 5);
		
		System.out.println(Vehiculo.getCantidadVehiculos());
		System.out.println(Automovil.getCantidadAutomoviles());
		System.out.println(Camion.getCantidadCamiones());
		System.out.println(Vehiculo.vehiculosPorTipo());
		System.out.println(Fabricante.fabricaMayorVentas());
		System.out.println(nissan.getVehiculosFabricados());
		System.out.println(colombia.getVehiculosFabricados());
		System.out.println(Pais.paisMasVendedor());
	}
}