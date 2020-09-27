package zooAnimales;
import gestion.*;
import java.util.*;

public class Reptil extends Animal {
	private List<Reptil> listado;
	public static int iguanas;
	public static int serpientes;
	private String colorEscamas;
	private int largoCola;
	
	public Reptil(String nombre, int edad, String habitat, String genero, Zona zona,
			String colorEscamas, int largoCola) {
		super(nombre, edad, habitat, genero, zona);
		this.colorEscamas = colorEscamas;
		this.largoCola = largoCola;
		listado.add(this);		
	}
	public Reptil(String nombre, int edad, String habitat, String genero,
			String colorEscamas, int largoCola) {
		super(nombre, edad, habitat, genero);
		this.colorEscamas = colorEscamas;
		this.largoCola = largoCola;
		listado.add(this);		
	}
	public Reptil() {
		listado.add(this);	
		
	}
	public String movimiento() {
		return "reptar";
	}
	public static Reptil crearIguana(String nombre,int edad,String genero,Zona zona){
		Reptil iguana=new Reptil(nombre,edad,"humedal",genero,zona,"verde",3);
		iguanas++;
		return iguana;
	}
	public static Reptil crearIguana(String nombre,int edad,String genero){
		Reptil iguana=new Reptil(nombre,edad,"humedal",genero,"verde",3);
		iguanas++;
		return iguana;
	}
	public static Reptil crearSerpiente(String nombre,int edad,String genero,Zona zona){
		Reptil serpiente=new Reptil(nombre,edad,"jungla",genero,zona,"blanco",1);
		serpientes++;
		return serpiente;
	}
	public static Reptil crearSerpiente(String nombre,int edad,String genero){
		Reptil serpiente=new Reptil(nombre,edad,"jungla",genero,"blanco",1);
		serpientes++;
		return serpiente;
	}
	public static int cantidadReptiles() {
		return iguanas+serpientes;
	}
	public List<Reptil> getListado() {
		return listado;
	}
	public void setListado(List<Reptil> listado) {
		this.listado = listado;
	}
	public String getColorEscamas() {
		return colorEscamas;
	}
	public void setColorEscamas(String colorEscamas) {
		this.colorEscamas = colorEscamas;
	}
	public int getLargoCola() {
		return largoCola;
	}
	public void setLargoCola(int largoCola) {
		this.largoCola = largoCola;
	}
	
	
	

}
