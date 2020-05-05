package edu.unicundi.proyectocompjsf.beans;

//Librerias 
import java.io.Serializable;
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

/**
 *
 * @author Ander
 */
//Informacion y alcance
@ManagedBean(name = "formulario", eager = false)
@SessionScoped
public class Formulario implements Serializable {

    //Variables globales
    private String cedula;
    private String nombre;
    private String apellido;
    private String fechaNacimiento;
    private String[] estudio;
    private String[] idioma;
    private int diasTrabajados;
    private int sueldoBase;
    private int sueldoTotal;

    public Formulario() {
    }

    @PostConstruct
    public void inicializar() {
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String[] getEstudio() {
        return estudio;
    }

    public void setEstudio(String[] estudio) {
        this.estudio = estudio;
    }

    public String[] getIdioma() {
        return idioma;
    }

    public void setIdioma(String[] idioma) {
        this.idioma = idioma;
    }

    public int getDiasTrabajados() {
        return diasTrabajados;
    }

    public void setDiasTrabajados(int diasTrabajados) {
        this.diasTrabajados = diasTrabajados;
    }

    public int getSueldoBase() {
        return sueldoBase;
    }

    public void setSueldoBase(int sueldoBase) {
        this.sueldoBase = sueldoBase;
    }

    public int getSueldoTotal() {
        return sueldoTotal;
    }

    public void setSueldoTotal(int sueldoTotal) {
        this.sueldoTotal = sueldoTotal;
    }

}
