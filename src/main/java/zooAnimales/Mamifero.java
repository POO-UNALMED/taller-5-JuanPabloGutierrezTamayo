package zooAnimales;
import java.util.*;
import gestion.*;

public class Mamifero extends Animal {
	private List<Mamifero>listado;
	static public int caballos;
	static public int leones;
	private boolean pelaje;
	private int patas;
	
	public Mamifero(String nombre, int edad, String habitat, String genero, Zona zona, boolean pelaje, int patas) {
		super(nombre,edad,habitat,genero,zona);
		this.pelaje = pelaje;
		this.patas = patas;
		listado.add(this);
		
		
	}
	public Mamifero() {
		listado.add(this);
	}
	public static Mamifero crearCaballo(String nombre,int edad,String genero,Zona zona){
		Mamifero caballo=new Mamifero(nombre,edad,"pradera",genero,zona,true,4);
		caballos++;
		return caballo;
	}
	public static Mamifero crearLeon(String nombre,int edad,String genero,Zona zona){
		Mamifero leon=new Mamifero(nombre,edad,"selva",genero,zona,true,4);
		caballos++;
		return leon;
	}
	public static int cantidadMamiferos() {
		return caballos+leones;
	}
	public List<Mamifero> getListado() {
		return listado;
	}
	public void setListado(List<Mamifero> listado) {
		this.listado = listado;
	}
	public boolean isPelaje() {
		return pelaje;
	}
	public void setPelaje(boolean pelaje) {
		this.pelaje = pelaje;
	}
	public int getPatas() {
		return patas;
	}
	public void setPatas(int patas) {
		this.patas = patas;
	}
	
}