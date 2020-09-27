package gestion;
import java.util.*;
import zooAnimales.*;
public class Zoologico {
	private String nombre;
	private String ubicacion;
	private List<Zona> zonas;
	
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
		zonas.add(zona);
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
	public List<Zona> getZonas() {
		return zonas;
	}
	public void setZonas(List<Zona> zonas) {
		this.zonas = zonas;
	}
	
}
