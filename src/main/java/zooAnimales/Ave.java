package zooAnimales;
import java.util.ArrayList;

public class Ave extends Animal {
	public static int aguilas,halcones;
	private final static ArrayList<Ave> aves =new Arraylist<>();
	private String colorPlumas;
	
	
	public Ave(String nombre, int edad, String habitat, String genero, String plumas) {
		super(nombre,edad,habitat,genero);
		this.colorPlumas=plumas;
		aves.add(this);
	}
	public Ave() {
		aves.add(this);
	}
	public String getColorPlumas() {
		return colorPlumas;
	}

	public static int cantidadAves() {
		return aves.size();
	}
	public String movimiento() {
		return "volar";
	}
	public static Ave crearAguila(String nombre,int edad,String genero) {
		aguilas++;
		Ave aguila= new Ave(nombre,edad,"montana",genero,"blanco y amarillo");
		aves.add(aguila);
		return aguila;
	}
	public static Pez crearHalcon(String nombre,int edad,String genero) {
		halcones++;
		Ave halcon= new Ave(nombre,edad,"montana",genero,"cafe glorioso");
		aves.add(halcon);
		return halcon;
	}
	
}