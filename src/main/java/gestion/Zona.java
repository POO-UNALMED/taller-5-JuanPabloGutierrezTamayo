package gestion;
import java.util.*;
import zooAnimales.*;
public class Zona {
	private String nombre;
	private Zoologico zoo;
	private List<Animal>animales;
	
	public Zona(String nombre, Zoologico zoo, List<Animal> animales) {
		this.nombre = nombre;
		this.zoo = zoo;
		this.animales = animales;
	}
	public Zona() {
		
	}
	public void agregarAnimales(Animal animal) {
		this.animales.add(animal);
	}
	public int cantidadAnimales() {
		return this.animales.size();
	}
	public String toString() {
		return this.nombre;
	}
	
	public String getNombre() {
		return this.nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre=nombre;
	}
	
	public Zoologico getZoo() {
		return zoo;
	}
	
	public void setZoo(Zoologico zoo) {
		this.zoo = zoo;
	}
	
	public List<Animal> getAnimales() {
		return animales;
	}
	
	public void setAnimales(List<Animal> animales) {
		this.animales = animales;
	}
	public String nombreZoo() {
		return zoo.getNombre();
	}
	
	
}
