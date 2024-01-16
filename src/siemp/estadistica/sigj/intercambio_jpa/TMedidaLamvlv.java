package siemp.estadistica.sigj.intercambio_jpa;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the t_medida_lamvlv database table.
 * 
 */
@Entity
@Table(name="t_medida_lamvlv", schema="transferencia_informacion", catalog = "transferencia_informacion")
@NamedQuery(name="TMedidaLamvlv.findAll", query="SELECT t FROM TMedidaLamvlv t")
public class TMedidaLamvlv implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="id_medida")
	private Long idMedida;

	@Column(name="fecha_fin")
	private String fechaFin;

	@Column(name="fecha_inicio")
	private String fechaInicio;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="fecha_resolucion")
	private Date fechaResolucion;

	@Column(name="id_carpeta")
	private Long idCarpeta;

	@Column(name="id_persona")
	private Long idPersona;

	@Column(name="resolucion_medida")
	private String resolucionMedida;

	@Column(name="tipo_medida")
	private String tipoMedida;

	public TMedidaLamvlv() {
	}

	public Long getIdMedida() {
		return this.idMedida;
	}

	public void setIdMedida(Long idMedida) {
		this.idMedida = idMedida;
	}

	public String getFechaFin() {
		return this.fechaFin;
	}

	public void setFechaFin(String fechaFin) {
		this.fechaFin = fechaFin;
	}

	public String getFechaInicio() {
		return this.fechaInicio;
	}

	public void setFechaInicio(String fechaInicio) {
		this.fechaInicio = fechaInicio;
	}

	public Date getFechaResolucion() {
		return this.fechaResolucion;
	}

	public void setFechaResolucion(Date fechaResolucion) {
		this.fechaResolucion = fechaResolucion;
	}

	public Long getIdCarpeta() {
		return this.idCarpeta;
	}

	public void setIdCarpeta(Long idCarpeta) {
		this.idCarpeta = idCarpeta;
	}

	public Long getIdPersona() {
		return this.idPersona;
	}

	public void setIdPersona(Long idPersona) {
		this.idPersona = idPersona;
	}

	public String getResolucionMedida() {
		return this.resolucionMedida;
	}

	public void setResolucionMedida(String resolucionMedida) {
		this.resolucionMedida = resolucionMedida;
	}

	public String getTipoMedida() {
		return this.tipoMedida;
	}

	public void setTipoMedida(String tipoMedida) {
		this.tipoMedida = tipoMedida;
	}

}