package mx.edu.utng.anime.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Anime {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column
	private String Nombre;
	
	@Column
	private String Genero;
	
	@Column
	private String Capitulos;
	
	@Column
	private String Ovas;
	
	@Column
	private Long precio;
	
	@Column
	private Long Duracion;

	public Anime() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Anime(Long id, String nombre, String genero, String capitulos, String ovas, Long precio, Long duracion) {
		super();
		this.id = id;
		Nombre = nombre;
		Genero = genero;
		Capitulos = capitulos;
		Ovas = ovas;
		this.precio = precio;
		Duracion = duracion;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNombre() {
		return Nombre;
	}

	public void setNombre(String nombre) {
		Nombre = nombre;
	}

	public String getGenero() {
		return Genero;
	}

	public void setGenero(String genero) {
		Genero = genero;
	}

	public String getCapitulos() {
		return Capitulos;
	}

	public void setCapitulos(String capitulos) {
		Capitulos = capitulos;
	}

	public String getOvas() {
		return Ovas;
	}

	public void setOvas(String ovas) {
		Ovas = ovas;
	}

	public Long getPrecio() {
		return precio;
	}

	public void setPrecio(Long precio) {
		this.precio = precio;
	}

	public Long getDuracion() {
		return Duracion;
	}

	public void setDuracion(Long duracion) {
		Duracion = duracion;
	}

	@Override
	public String toString() {
		return "Anime [id=" + id + ", Nombre=" + Nombre + ", Genero=" + Genero + ", Capitulos=" + Capitulos + ", Ovas="
				+ Ovas + ", precio=" + precio + ", Duracion=" + Duracion + "]";
	}


	
}
