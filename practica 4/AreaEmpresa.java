package tp04.ejercicio5;

public class AreaEmpresa {
	private String area;
	private int tiempo;
	
	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	public int getTiempo() {
		return tiempo;
	}

	public void setTiempo(int tiempo) {
		this.tiempo = tiempo;
	}
	
	public AreaEmpresa() {
		
	}

	public AreaEmpresa(String area, int tiempo) {
		this.area = area;
		this.tiempo = tiempo;
	}
}
