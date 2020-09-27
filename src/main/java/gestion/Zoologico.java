package gestion;
import java.util.*;
import zooAnimales.*;
public class Zoologico {
	private String nombre;
	private String ubicacion;
	private List<Zona> zona;
	
	public Zoologico(String nombre, String ubicacion) {
		this.nombre = nombre;
		this.ubicacion = ubicacion;
	}
	public Zoologico() {
		
	}
	public int cantidadTotalAnimales(){
		return Animal.totalAnimales;
	}
	public void agregarZonas(Zona zona) {
		this.zona.add(zona);
	}
	public String getNombre() {
		return this.nombre;
	}
	public void setNombre(String nombre) {
		this.nombre=nombre;
	}
	public String getUbicacion() {
		return ubicacion;
	}
	public void setUbicacion(String ubicacion) {
		this.ubicacion = ubicacion;
	}
	public List<Zona> getZona() {
		return zona;
	}
	public void setZona(List<Zona> zonas) {
		this.zona = zonas;
	}
	
}
