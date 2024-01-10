package com.your_keys.entity;

import java.io.Serializable;
import java.util.List;
import java.util.Date;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="alquiler")
public class Alquiler implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id_alquiler;
	private Long id_cliente;
	private Long id_auto;
	private Long id_empleado;
	private Date fecha_ini;
	private Date fecha_fin;
	private double precio_auto;
	private double precio_protección;
	private double total;
	private String tipo_pago;
	private boolean pagado;
	private boolean reservado;
	private Date fecha_reg;
	
	@OneToOne(mappedBy = "alquiler")
	private Devolucion devo;
	
	public Long getId_alquiler() {
		return id_alquiler;
	}

	public void setId_alquiler(Long id_alquiler) {
		this.id_alquiler = id_alquiler;
	}

	public Long getId_cliente() {
		return id_cliente;
	}

	public void setId_cliente(Long id_cliente) {
		this.id_cliente = id_cliente;
	}

	public Long getId_auto() {
		return id_auto;
	}

	public void setId_auto(Long id_auto) {
		this.id_auto = id_auto;
	}


	public Long getId_empleado() {
		return id_empleado;
	}

	public void setId_empleado(Long id_empleado) {
		this.id_empleado = id_empleado;
	}

	public Date getFecha_ini() {
		return fecha_ini;
	}

	public void setFecha_ini(Date fecha_ini) {
		this.fecha_ini = fecha_ini;
	}

	public Date getFecha_fin() {
		return fecha_fin;
	}

	public void setFecha_fin(Date fecha_fin) {
		this.fecha_fin = fecha_fin;
	}

	public double getPrecio_auto() {
		return precio_auto;
	}

	public void setPrecio_auto(double precio_auto) {
		this.precio_auto = precio_auto;
	}

	public double getPrecio_protección() {
		return precio_protección;
	}

	public void setPrecio_protección(double precio_protección) {
		this.precio_protección = precio_protección;
	}

	public double getTotal() {
		return total;
	}

	public void setTotal(double total) {
		this.total = total;
	}

	public String getTipo_pago() {
		return tipo_pago;
	}

	public void setTipo_pago(String tipo_pago) {
		this.tipo_pago = tipo_pago;
	}

	public boolean isPagado() {
		return pagado;
	}

	public void setPagado(boolean pagado) {
		this.pagado = pagado;
	}

	public boolean isReservado() {
		return reservado;
	}

	public void setReservado(boolean reservado) {
		this.reservado = reservado;
	}

	public Date getFecha_reg() {
		return fecha_reg;
	}

	public void setFecha_reg(Date fecha_reg) {
		this.fecha_reg = fecha_reg;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public Devolucion getDevo() {
		return devo;
	}

	public void setDevo(Devolucion devo) {
		this.devo = devo;
	}

	
}
