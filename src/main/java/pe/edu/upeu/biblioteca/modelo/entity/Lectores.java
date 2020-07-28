package pe.edu.upeu.biblioteca.modelo.entity;

public class Lectores {
	private int dnilector;
	private String nombre;
	private String telefono;
	private String direccion;
	private String codigopostal;
	public Lectores() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Lectores(int dnilector, String nombre, String telefono, String direccion, String codigopostal) {
		super();
		this.dnilector = dnilector;
		this.nombre = nombre;
		this.telefono = telefono;
		this.direccion = direccion;
		this.codigopostal = codigopostal;
	}
	public int getDnilector() {
		return dnilector;
	}
	public void setDnilector(int dnilector) {
		this.dnilector = dnilector;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public String getCodigopostal() {
		return codigopostal;
	}
	public void setCodigopostal(String codigopostal) {
		this.codigopostal = codigopostal;
	}
	

}
