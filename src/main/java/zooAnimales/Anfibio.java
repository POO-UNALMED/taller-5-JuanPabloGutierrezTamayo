package zooAnimales;
import gestion.*;
import java.util.*;
public class Anfibio extends Animal {
	private List<Anfibio> listado=new ArrayList<>();
	public static int ranas;
	public static int salamandras;
	private String colorPiel;
	private boolean venenoso;
	public Anfibio(String nombre, int edad, String habitat, String genero, Zona zona,
			 String colorPiel, boolean venenoso) {
		super(nombre, edad, habitat, genero, zona);
		this.colorPiel = colorPiel;
		this.venenoso = venenoso;
		listado.add(this);
		
	}
	public Anfibio(String nombre, int edad, String habitat, String genero,
			 String colorPiel, boolean venenoso) {
		super(nombre, edad, habitat, genero);
		this.colorPiel = colorPiel;
		this.venenoso = venenoso;
		listado.add(this);
		
	}
	public Anfibio() {
		listado.add(this);
		
	}
	public String movimiento() {
		return "saltar";
	}
	public static Anfibio crearRana(String nombre, int edad, String genero, Zona zona) {
		Anfibio rana=new Anfibio(nombre,edad,"selva",genero,zona,"rojo",true);
		ranas++;
		return rana;
	}
	public static Anfibio crearRana(String nombre, int edad, String genero) {
		Anfibio rana=new Anfibio(nombre,edad,"selva",genero,"rojo",true);
		ranas++;
		return rana;
	}
	public static Anfibio crearSalamandra(String nombre, int edad, String genero, Zona zona) {
		Anfibio salamandra=new Anfibio(nombre,edad,"selva",genero,zona,"negro y amarillo",false);
		salamandras++;
		return salamandra;
	}
	public static Anfibio crearSalamandra(String nombre, int edad, String genero) {
		Anfibio salamandra=new Anfibio(nombre,edad,"selva",genero,"negro y amarillo",false);
		salamandras++;
		return salamandra;
	}
	public static int cantaidadAnfibios() {
		return ranas+salamandras;
	}
	public List<Anfibio> getListado() {
		return listado;
	}
	public void setListado(List<Anfibio> listado) {
		this.listado = listado;
	}
	public String getColorPiel() {
		return colorPiel;
	}
	public void setColorPiel(String colorPiel) {
		this.colorPiel = colorPiel;
	}
	public boolean isVenenoso() {
		return venenoso;
	}
	public void setVenenoso(boolean venenoso) {
		this.venenoso = venenoso;
	}
	
	

}
