package zooAnimales;
import gestion.Zona;
public class Animal {
	private static int totalAnimales;
	private String nombre, habitat, genero;
	private int edad;
	private Zona zona;
	public Animal(String nombre, int edad, String habitat,String genero) {
		this.nombre=nombre;
		this.edad=edad;
		this.habitat=habitat;
		this.genero=genero;
		totalAnimales++;
	}
	public Animal() {
		totalAnimales++;
	}
	public String getNombre() {
		return nombre;
	}
	public int getEdad() {
		return edad;
	}
	public String getHabitat() {
		return habitat;
	}
	public String getGenero() {
		return genero;
	}
	public String movimiento() {
		return "desplazarse";
	}
	public static String totalPorTipo() {
		return "Mamiferos: " + Mamifero.cantidadMamiferos() + "\n" + "Aves: " +  Ave.cantidadAves() + "\n" + "Reptiles: " + Reptil.cantidadReptiles() + "\n" + "Peces: " + Pez.cantidadPeces() + "\n" + "Anfibios: " + Anfibio.cantidadAnfibios();
	}
	public String toString() {
		if (zona==null) {
			return "Mi nombre es "+nombre+", tengo una edad de "+edad+", habito en "+habitat+" y mi genero es "+genero;
		}
		else {
			return "Mi nombre es "+nombre+", tengo una edad de "+edad+", habito en "+habitat+" y mi genero es "+genero+", la zona en la que me ubico es "+zona+", en el "+zona.getZoo().getNombre();
		}
	}
	
}