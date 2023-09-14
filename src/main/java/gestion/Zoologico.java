package gestion;
import java.util.Arraylist;
public class Zoologico {
	private String nombre,ubicacion;
	private Arraylist<Zona> zonas = new Arraylist<>();
	
	public Zoologico(String nombre, String ubicacion) {
		this.nombre=nombre;
		this.ubicacion=ubicacion;
	}
	public Zoologico() {
		this(null,null);
	}
	public void agregarZonas(Zona zona) {
		this.zonas.add(zona);
		zona.setZoo(this);
	}
	public int cantidadAnimales() {
		int cont=0;
		for (int i =0;i<zonas.size();i++) {
			cont +=this.zonas.get(i).cantidadAnimales();
		}
		return cont;
	}
	public void setNombre(String nombre) {
		this.nombre=nombre;
	}
	public String getNombre() {
		return nombre;
	}
	public void setUbicacion(String ubicacion) {
		this.ubicacion=ubicacion;
	}
	public String getUbicacion() {
		return ubicacion;
	}
	public void setZona(Arraylist<Zona> zonas) {
		this.zonas=zonas;
	}
	public Arraylist<Zona> getZona() {
		return zonas;
	}
	
}
