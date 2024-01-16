package siemp.estadistica.sigj.intercambio_jpa;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigInteger;


/**
 * The persistent class for the t_presunto_responsable database table.
 * 
 */
@Entity
@Table(name="t_presunto_responsable", schema="transferencia_informacion",  catalog = "transferencia_informacion")
@NamedQuery(name="TPresuntoResponsable.findAll", query="SELECT t FROM TPresuntoResponsable t")
public class TPresuntoResponsable implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="id_persona")
	private Long idPersona;

	@Column(name="a_materno")
	private String aMaterno;

	@Column(name="a_paterno")
	private String aPaterno;

	@Column(name="condicion_alfabetismo")
	private String condicionAlfabetismo;

	@Column(name="condicion_migratoria")
	private String condicionMigratoria;

	private String curp;

	private String discapacidad;

	private String edad;

	@Column(name="entidad_nacimiento")
	private String entidadNacimiento;

	@Column(name="entidad_residencia")
	private String entidadResidencia;

	private String escolaridad;

	private String estado;

	@Column(name="fecha_nacimiento")
	private String fechaNacimiento;

	private String genero;

	@Column(name="habla_espaniol")
	private String hablaEspaniol;

	@Column(name="habla_lengua_extranjera")
	private String hablaLenguaExtranjera;

	@Column(name="habla_lengua_indigena")
	private String hablaLenguaIndigena;

	@Column(name="id_carpeta")
	private Long idCarpeta;

	@Column(name="id_estado_civil")
	private String idEstadoCivil;

	private String interprete;

	@Column(name="lengua_extranjera")
	private String lenguaExtranjera;

	@Column(name="municipio_nacimiento")
	private String municipioNacimiento;

	@Column(name="municipio_residencia")
	private String municipioResidencia;

	private String nacionalidad;

	private String nombre;

	private String ocupacion;

	@Column(name="pais_nacimiento")
	private String paisNacimiento;

	@Column(name="pais_residencia")
	private String paisResidencia;

	@Column(name="razon_social")
	private String razonSocial;

	private String reincidente;

	private String rfc;

	@Column(name="situacion_calle")
	private String situacionCalle;

	@Column(name="tipo_discapacidad")
	private String tipoDiscapacidad;

	@Column(name="tipo_lengua")
	private String tipoLengua;

	@Column(name="tipo_persona")
	private String tipoPersona;

	public TPresuntoResponsable() {
	}

	public Long getIdPersona() {
		return this.idPersona;
	}

	public void setIdPersona(Long idPersona) {
		this.idPersona = idPersona;
	}

	public String getAMaterno() {
		return this.aMaterno;
	}

	public void setAMaterno(String aMaterno) {
		this.aMaterno = aMaterno;
	}

	public String getAPaterno() {
		return this.aPaterno;
	}

	public void setAPaterno(String aPaterno) {
		this.aPaterno = aPaterno;
	}

	public String getCondicionAlfabetismo() {
		return this.condicionAlfabetismo;
	}

	public void setCondicionAlfabetismo(String condicionAlfabetismo) {
		this.condicionAlfabetismo = condicionAlfabetismo;
	}

	public String getCondicionMigratoria() {
		return this.condicionMigratoria;
	}

	public void setCondicionMigratoria(String condicionMigratoria) {
		this.condicionMigratoria = condicionMigratoria;
	}

	public String getCurp() {
		return this.curp;
	}

	public void setCurp(String curp) {
		this.curp = curp;
	}

	public String getDiscapacidad() {
		return this.discapacidad;
	}

	public void setDiscapacidad(String discapacidad) {
		this.discapacidad = discapacidad;
	}

	public String getEdad() {
		return this.edad;
	}

	public void setEdad(String edad) {
		this.edad = edad;
	}

	public String getEntidadNacimiento() {
		return this.entidadNacimiento;
	}

	public void setEntidadNacimiento(String entidadNacimiento) {
		this.entidadNacimiento = entidadNacimiento;
	}

	public String getEntidadResidencia() {
		return this.entidadResidencia;
	}

	public void setEntidadResidencia(String entidadResidencia) {
		this.entidadResidencia = entidadResidencia;
	}

	public String getEscolaridad() {
		return this.escolaridad;
	}

	public void setEscolaridad(String escolaridad) {
		this.escolaridad = escolaridad;
	}

	public String getEstado() {
		return this.estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public String getFechaNacimiento() {
		return this.fechaNacimiento;
	}

	public void setFechaNacimiento(String fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public String getGenero() {
		return this.genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public String getHablaEspaniol() {
		return this.hablaEspaniol;
	}

	public void setHablaEspaniol(String hablaEspaniol) {
		this.hablaEspaniol = hablaEspaniol;
	}

	public String getHablaLenguaExtranjera() {
		return this.hablaLenguaExtranjera;
	}

	public void setHablaLenguaExtranjera(String hablaLenguaExtranjera) {
		this.hablaLenguaExtranjera = hablaLenguaExtranjera;
	}

	public String getHablaLenguaIndigena() {
		return this.hablaLenguaIndigena;
	}

	public void setHablaLenguaIndigena(String hablaLenguaIndigena) {
		this.hablaLenguaIndigena = hablaLenguaIndigena;
	}

	public Long getIdCarpeta() {
		return this.idCarpeta;
	}

	public void setIdCarpeta(Long idCarpeta) {
		this.idCarpeta = idCarpeta;
	}

	public String getIdEstadoCivil() {
		return this.idEstadoCivil;
	}

	public void setIdEstadoCivil(String idEstadoCivil) {
		this.idEstadoCivil = idEstadoCivil;
	}

	public String getInterprete() {
		return this.interprete;
	}

	public void setInterprete(String interprete) {
		this.interprete = interprete;
	}

	public String getLenguaExtranjera() {
		return this.lenguaExtranjera;
	}

	public void setLenguaExtranjera(String lenguaExtranjera) {
		this.lenguaExtranjera = lenguaExtranjera;
	}

	public String getMunicipioNacimiento() {
		return this.municipioNacimiento;
	}

	public void setMunicipioNacimiento(String municipioNacimiento) {
		this.municipioNacimiento = municipioNacimiento;
	}

	public String getMunicipioResidencia() {
		return this.municipioResidencia;
	}

	public void setMunicipioResidencia(String municipioResidencia) {
		this.municipioResidencia = municipioResidencia;
	}

	public String getNacionalidad() {
		return this.nacionalidad;
	}

	public void setNacionalidad(String nacionalidad) {
		this.nacionalidad = nacionalidad;
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getOcupacion() {
		return this.ocupacion;
	}

	public void setOcupacion(String ocupacion) {
		this.ocupacion = ocupacion;
	}

	public String getPaisNacimiento() {
		return this.paisNacimiento;
	}

	public void setPaisNacimiento(String paisNacimiento) {
		this.paisNacimiento = paisNacimiento;
	}

	public String getPaisResidencia() {
		return this.paisResidencia;
	}

	public void setPaisResidencia(String paisResidencia) {
		this.paisResidencia = paisResidencia;
	}

	public String getRazonSocial() {
		return this.razonSocial;
	}

	public void setRazonSocial(String razonSocial) {
		this.razonSocial = razonSocial;
	}

	public String getReincidente() {
		return this.reincidente;
	}

	public void setReincidente(String reincidente) {
		this.reincidente = reincidente;
	}

	public String getRfc() {
		return this.rfc;
	}

	public void setRfc(String rfc) {
		this.rfc = rfc;
	}

	public String getSituacionCalle() {
		return this.situacionCalle;
	}

	public void setSituacionCalle(String situacionCalle) {
		this.situacionCalle = situacionCalle;
	}

	public String getTipoDiscapacidad() {
		return this.tipoDiscapacidad;
	}

	public void setTipoDiscapacidad(String tipoDiscapacidad) {
		this.tipoDiscapacidad = tipoDiscapacidad;
	}

	public String getTipoLengua() {
		return this.tipoLengua;
	}

	public void setTipoLengua(String tipoLengua) {
		this.tipoLengua = tipoLengua;
	}

	public String getTipoPersona() {
		return this.tipoPersona;
	}

	public void setTipoPersona(String tipoPersona) {
		this.tipoPersona = tipoPersona;
	}

}