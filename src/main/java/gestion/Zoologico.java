package gestion;
import java.util.*;
import zooAnimales.*;
public class Zoologico {
	private String nombre;
	private String ubicacion;
	private List<Zona> zonas=new ArrayList<>();
	
	public Zoologico(String nombre, String ubicacion) {
		this.nombre = nombre;
		this.ubicacion = ubicacion;
	}
	public Zoologico() {
		
	}
	public int cantidadTotalAnimales(){
		int count=0;
		for(int i=0;i<zonas.size();i++) {
			count=zonas.get(i).cantidadAnimales()+count;
		}
		return count;
	}
	public void agregarZonas(Zona zona) {
		this.zonas.add(zona);
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
		return zonas;
	}
	public void setZona(List<Zona> zonas) {
		this.zonas = zonas;
	}
	
}
