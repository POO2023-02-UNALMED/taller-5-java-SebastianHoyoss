package gestion;
import java.util.Arraylist;
import zooAnimales.Animal;
public class Zona {
	private String nombre;
	private Zoologico zoo;
	private Arraylist<Animal> animales = new Arraylist<>();
	
	public Zona(String nombre, Zoologico zoo) {
		this.nombre=nombre;
		this.zoo=zoo;
	}
	public Zona() {
		this(null,null);
	}
	
	public void agregarAnimales(Animal animal){
		animales.add(animal);
	}
	public int cantidadAnimales() {
		return animales.size();
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre=nombre;
	}
	public Zoologico getZoo() {
		return zoo;
	}
	public void setZoo() {
		this.zoo=zoo;
	}
}
