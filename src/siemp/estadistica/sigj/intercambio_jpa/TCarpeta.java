package siemp.estadistica.sigj.intercambio_jpa;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the t_carpetas database table.
 * 
 */
@Entity
@Table(schema="transferencia_informacion" , name="t_carpetas", catalog = "transferencia_informacion")
@NamedQuery(name="TCarpeta.findAll", query="SELECT t FROM TCarpeta t")
public class TCarpeta implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="id_carpeta")
	private Long idCarpeta;

	@Column(name="anio_carpeta")
	private int anioCarpeta;

	@Column(name="carpeta_judicial")
	private String carpetaJudicial;

	@Column(name="estado_procesal")
	private String estadoProcesal;

	@Column(name="fecha_recepcion")
	private String fechaRecepcion;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="fecha_solicitud")
	private Date fechaSolicitud;

	@Column(name="id_tipo_audiencia")
	private int idTipoAudiencia;

	@Column(name="id_unidad_gestion")
	private String idUnidadGestion;

	@Column(name="num_carpeta")
	private int numCarpeta;

	@Column(name="num_investigacion")
	private String numInvestigacion;

	private String procedencia;

	private String remision;

	public TCarpeta() {
	}

	public Long getIdCarpeta() {
		return this.idCarpeta;
	}

	public void setIdCarpeta(Long idCarpeta) {
		this.idCarpeta = idCarpeta;
	}

	public int getAnioCarpeta() {
		return this.anioCarpeta;
	}

	public void setAnioCarpeta(int anioCarpeta) {
		this.anioCarpeta = anioCarpeta;
	}

	public String getCarpetaJudicial() {
		return this.carpetaJudicial;
	}

	public void setCarpetaJudicial(String carpetaJudicial) {
		this.carpetaJudicial = carpetaJudicial;
	}

	public String getEstadoProcesal() {
		return this.estadoProcesal;
	}

	public void setEstadoProcesal(String estadoProcesal) {
		this.estadoProcesal = estadoProcesal;
	}

	public String getFechaRecepcion() {
		return this.fechaRecepcion;
	}

	public void setFechaRecepcion(String fechaRecepcion) {
		this.fechaRecepcion = fechaRecepcion;
	}

	public Date getFechaSolicitud() {
		return this.fechaSolicitud;
	}

	public void setFechaSolicitud(Date fechaSolicitud) {
		this.fechaSolicitud = fechaSolicitud;
	}

	public int getIdTipoAudiencia() {
		return this.idTipoAudiencia;
	}

	public void setIdTipoAudiencia(int idTipoAudiencia) {
		this.idTipoAudiencia = idTipoAudiencia;
	}

	public String getIdUnidadGestion() {
		return this.idUnidadGestion;
	}

	public void setIdUnidadGestion(String idUnidadGestion) {
		this.idUnidadGestion = idUnidadGestion;
	}

	public int getNumCarpeta() {
		return this.numCarpeta;
	}

	public void setNumCarpeta(int numCarpeta) {
		this.numCarpeta = numCarpeta;
	}

	public String getNumInvestigacion() {
		return this.numInvestigacion;
	}

	public void setNumInvestigacion(String numInvestigacion) {
		this.numInvestigacion = numInvestigacion;
	}

	public String getProcedencia() {
		return this.procedencia;
	}

	public void setProcedencia(String procedencia) {
		this.procedencia = procedencia;
	}

	public String getRemision() {
		return this.remision;
	}

	public void setRemision(String remision) {
		this.remision = remision;
	}

}