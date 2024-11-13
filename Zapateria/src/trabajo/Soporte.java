package trabajo;

public class Soporte extends ZapateriaNegocio{
	
	private double cantidadHorasExtra;
	
	public Soporte(String nombre, double sueldoBase, int iD, double cantidadHorasExtra) {
		super(nombre, sueldoBase, iD);
		this.cantidadHorasExtra = cantidadHorasExtra;
	}
	
	public double getCantidadHorasExtra() {
		return cantidadHorasExtra;
	}
	
	public void setCantidadHorasExtra(double cantidadHorasExtra) {
		this.cantidadHorasExtra = cantidadHorasExtra;
	}
	
	public double calcularHorasExtra() {
		double horasExtra=this.cantidadHorasExtra*(this.sueldoBase*0.05);
		return horasExtra;
	}
}
