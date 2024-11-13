package trabajo;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
	
	ArrayList<Vendedores> vendedores = new ArrayList<>();
	ArrayList<Soporte> soportes = new ArrayList<>();
	
	Vendedores v1 = new Vendedores("Jose", 500000, 1, 5);
	Vendedores v2 = new Vendedores("Jose", 350000, 2, 10);
	Vendedores v3 = new Vendedores("Jose", 400000, 3, 2);
	vendedores.add(v1);
	vendedores.add(v2);
	vendedores.add(v3);
	
	Soporte s1 = new Soporte("Maria", 730000, 1, 3);
	Soporte s2 = new Soporte("Maria", 630000, 2, 5);
	Soporte s3 = new Soporte("Maria", 525000, 3, 0);
	soportes.add(s1);
	soportes.add(s2);
	soportes.add(s3);
	
	for (Vendedores vendedor : vendedores) {
		System.out.println("Vendedor v" + vendedor.getID() + " " + vendedor.calcularPrecioComision());
	}
	
	for (Soporte soporte : soportes) {
		System.out.println("Soporte s" + soporte.getID() + " " + soporte.calcularHorasExtra());
	}
	
//	for (int i = 0; i < soportes.size(); i++) {
//		System.out.println("Soporte s" + soporte.getID() + " " + soporte.calcularHorasExtra());
//	}
	
	}
	
	
}
