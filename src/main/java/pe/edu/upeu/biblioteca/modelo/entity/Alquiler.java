package pe.edu.upeu.biblioteca.modelo.entity;

public class Alquiler {
	private int idalquiler;
	private int dnilector;
	private int ASIN;
	private String fechaentrada;
	private String fechasalida;
	public Alquiler() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Alquiler(int idalquiler, int dnilector, int aSIN, String fechaentrada, String fechasalida) {
		super();
		this.idalquiler = idalquiler;
		this.dnilector = dnilector;
		ASIN = aSIN;
		this.fechaentrada = fechaentrada;
		this.fechasalida = fechasalida;
	}
	public int getIdalquiler() {
		return idalquiler;
	}
	public void setIdalquiler(int idalquiler) {
		this.idalquiler = idalquiler;
	}
	public int getDnilector() {
		return dnilector;
	}
	public void setDnilector(int dnilector) {
		this.dnilector = dnilector;
	}
	public int getASIN() {
		return ASIN;
	}
	public void setASIN(int aSIN) {
		ASIN = aSIN;
	}
	public String getFechaentrada() {
		return fechaentrada;
	}
	public void setFechaentrada(String fechaentrada) {
		this.fechaentrada = fechaentrada;
	}
	public String getFechasalida() {
		return fechasalida;
	}
	public void setFechasalida(String fechasalida) {
		this.fechasalida = fechasalida;
	}

}
