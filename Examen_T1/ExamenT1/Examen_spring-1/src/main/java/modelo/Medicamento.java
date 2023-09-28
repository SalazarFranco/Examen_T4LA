package modelo;

import java.sql.Date;

import org.springframework.format.annotation.DateTimeFormat;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "medicamento")
public class Medicamento {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idMedicamento;
	private String nombre;
	private String descripcion;
	private String categoria;	
	private int stock;
	
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date fechavencimiento;
	private String precio;
	
	public Medicamento(int idMedicamento, String nombre, String descripcion, String categoria, int stock, Date fechavencimiento, String precio) {
		super();
		this.idMedicamento = idMedicamento;
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.categoria = categoria;
		this.fechavencimiento = fechavencimiento;
		this.precio = precio;
	}

	public int getIdMedicamento() {
		return idMedicamento;
	}

	public void setIdMedicamento(int idMedicamento) {
		this.idMedicamento = idMedicamento;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}

	public Date getFechavencimiento() {
		return fechavencimiento;
	}

	public void setFechavencimiento(Date fechavencimiento) {
		this.fechavencimiento = fechavencimiento;
	}

	public String getPrecio() {
		return precio;
	}

	public void setPrecio(String precio) {
		this.precio = precio;
	}
	
	@Override
	public String toString() {
		return "Medicamento [idMedicamento=" + idMedicamento + ", nombre=" + nombre + ",descripcion=" + descripcion + ",categoria=" + categoria + ",stock=" + stock +
				", fechavencimiento=" + fechavencimiento + ", precio=" + precio + "]";
	}
}