package siemp.estadistica.sigj.intercambio_jpa;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigInteger;


/**
 * The persistent class for the t_victima database table.
 * 
 */
@Entity
@Table(name="t_tvictima",  catalog = "transferencia_informacion", schema="transferencia_informacion")
@NamedQuery(name="TTVictima.findAll", query="SELECT t FROM TTVictima t")
public class TTVictima implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="id_persona")
	private Long idPersona;

	@Column(name="a_materno")
	private String aMaterno;

	@Column(name="a_paterno")
	private String aPaterno;

	private String alfabetismo;

	@Column(name="condicion_migratoria")
	private String condicionMigratoria;

	private String curp;

	private String discapacidad;

	private String edad;

	private String embarazo;

	@Column(name="entidad_nacimiento")
	private String entidadNacimiento;

	@Column(name="entidad_residencia")
	private String entidadResidencia;

	private String escolaridad;

	@Column(name="estado_civil")
	private String estadoCivil;

	@Column(name="fecha_nacimiento")
	private String fechaNacimiento;

	@Column(name="habla_espaniol")
	private String hablaEspaniol;

	@Column(name="habla_lengua_indigena")
	private String hablaLenguaIndigena;

	@Column(name="id_carpeta")
	private Long idCarpeta;

	private String interprete;

	@Column(name="lengua_extranjera")
	private String lenguaExtranjera;

	private String lgbttti;

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

	@Column(name="relacion_imputado")
	private String relacionImputado;

	private String rfc;

	private String sexo;

	@Column(name="situacion_calle")
	private String situacionCalle;

	@Column(name="tipo_discapacidad")
	private String tipoDiscapacidad;

	@Column(name="tipo_lengua_extranjera")
	private String tipoLenguaExtranjera;

	@Column(name="tipo_lengua_indigena")
	private String tipoLenguaIndigena;

	@Column(name="tipo_persona")
	private String tipoPersona;

	@Column(name="tipo_victima")
	private String tipoVictima;

	public TTVictima() {
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

	public String getAlfabetismo() {
		return this.alfabetismo;
	}

	public void setAlfabetismo(String alfabetismo) {
		this.alfabetismo = alfabetismo;
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

	public String getEmbarazo() {
		return this.embarazo;
	}

	public void setEmbarazo(String embarazo) {
		this.embarazo = embarazo;
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

	public String getEstadoCivil() {
		return this.estadoCivil;
	}

	public void setEstadoCivil(String estadoCivil) {
		this.estadoCivil = estadoCivil;
	}

	public String getFechaNacimiento() {
		return this.fechaNacimiento;
	}

	public void setFechaNacimiento(String fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public String getHablaEspaniol() {
		return this.hablaEspaniol;
	}

	public void setHablaEspaniol(String hablaEspaniol) {
		this.hablaEspaniol = hablaEspaniol;
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

	public String getLgbttti() {
		return this.lgbttti;
	}

	public void setLgbttti(String lgbttti) {
		this.lgbttti = lgbttti;
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

	public String getRelacionImputado() {
		return this.relacionImputado;
	}

	public void setRelacionImputado(String relacionImputado) {
		this.relacionImputado = relacionImputado;
	}

	public String getRfc() {
		return this.rfc;
	}

	public void setRfc(String rfc) {
		this.rfc = rfc;
	}

	public String getSexo() {
		return this.sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
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

	public String getTipoLenguaExtranjera() {
		return this.tipoLenguaExtranjera;
	}

	public void setTipoLenguaExtranjera(String tipoLenguaExtranjera) {
		this.tipoLenguaExtranjera = tipoLenguaExtranjera;
	}

	public String getTipoLenguaIndigena() {
		return this.tipoLenguaIndigena;
	}

	public void setTipoLenguaIndigena(String tipoLenguaIndigena) {
		this.tipoLenguaIndigena = tipoLenguaIndigena;
	}

	public String getTipoPersona() {
		return this.tipoPersona;
	}

	public void setTipoPersona(String tipoPersona) {
		this.tipoPersona = tipoPersona;
	}

	public String getTipoVictima() {
		return this.tipoVictima;
	}

	public void setTipoVictima(String tipoVictima) {
		this.tipoVictima = tipoVictima;
	}

}