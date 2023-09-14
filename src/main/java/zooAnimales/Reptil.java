package zooAnimales;
import java.util.ArrayList;

public class Reptil extends Animal {
	public static int iguanas, serpientes;
	private final static ArrayList<Reptil> reptiles =new ArrayList<>();
	private String colorEscamas;
	private int largoCola;
	
	public Reptil(String nombre, int edad, String habitat, String genero, String escamas,int cola) {
		super(nombre,edad,habitat,genero);
		this.colorEscamas=escamas;
		this.largoCola=cola;
		reptiles.add(this);
	}
	public Reptil() {
		reptiles.add(this);
	}
	public String getColorEscamas() {
		return colorEscamas;
	}
	public boolean getLargoCola() {
		return largoCola;
	}
	public static int cantidadReptiles() {
		return reptiles.size();
	}
	public String movimiento() {
		return "reptar";
	}
	public static Reptil crearIguana(String nombre,int edad,String genero) {
		iguanas++;
		Reptil iguana= new Reptil(nombre,edad,"humedal",genero,"verde",3);
		reptiles.add(iguana);
		return iguana;
	}
	public static Reptil crearSerpiente(String nombre,int edad,String genero) {
		serpientes++;
		Reptil serpiente= new Reptil(nombre,edad,"jungla",genero,"blanco",1);
		reptiles.add(serpiente);
		return serpiente;
	}
	
}