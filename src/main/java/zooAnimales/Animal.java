package zooAnimales;
import gestion.*;
import java.util.*;
public class Animal {
	public static int totalAnimales;
	private String nombre;
	private int edad;
	private String habitad;
	private String genero;
	private Zona zona;
	
	public Animal() {
		this.totalAnimales++;
		
	}
	public Animal(String nombre, int edad, String habitad, String genero, Zona zona) {
		this.nombre = nombre;
		this.edad = edad;
		this.habitad = habitad;
		this.genero = genero;
		this.zona = zona;	
		this.totalAnimales++;
	}
	public Animal(String nombre, int edad, String habitad, String genero) {
		this.nombre = nombre;
		this.edad = edad;
		this.habitad = habitad;
		this.genero = genero;	
		this.totalAnimales++;
	}
	
	public void totalPorTipo() {
		System.out.println("Mamiferos : "+ Mamifero.cantidadMamiferos());   
		System.out.println("Aves : "+ Ave.cantidadAves());
		System.out.println("Reptiles : "+ Reptil.cantidadReptiles());
		System.out.println("Peces : "+Pez.cantidadPeces());
		System.out.println("Anfibios : "+Anfibio.cantaidadAnfibios());
		
	}
	public String movimiento() {
		return "desplazarse";
	}
	public String toString() {
		if (this.zona==null) {
			return "Mi nombres es "+this.nombre+" tengo una edad de "+this.edad+", habito en "+this.habitad+
					" y mi genero es "+this.genero;
		}
		else {
			return "Mi nombres es "+this.nombre+" tengo una edad de "+this.edad+", habito en "+this.habitad+
					" y mi genero es "+this.genero+ " la zona en la que me ubico es "+ this.zona.getNombre()+
					" en el zoo "+ this.zona.nombreZoo();
		}
		
	}
	
}
