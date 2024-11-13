package trabajo;

public class ZapateriaNegocio {
	
	protected String nombre;
	protected double sueldoBase;
	protected int ID;
	
	public ZapateriaNegocio(String nombre, double sueldoBase, int iD) {
		this.nombre = nombre;
		this.sueldoBase = sueldoBase;
		ID = iD;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public double getSueldoBase() {
		return sueldoBase;
	}
	
	public void setSueldoBase(double sueldoBase) {
		this.sueldoBase = sueldoBase;
	}
	
	public int getID() {
		return ID;
	}
	
	public void setID(int iD) {
		ID = iD;
	}
	
	public double calcularPrecio() {
		return sueldoBase;
	}
	
}