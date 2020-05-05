package edu.unicundi.proyectocompjsf.beans;

import edu.unicundi.proyectocompjsf.logica.Modelo;
import java.io.IOException;
import java.io.Serializable;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;

/**
 *
 * @author Ander
 */
@ManagedBean(name = "empleado", eager = false)
@SessionScoped

public class Empleado implements Serializable {

    @ManagedProperty(value = "#{formulario}")
    private Formulario formulario;

    private String cedula;
    private String nombre;
    private String apellido;
    private String fechaNacimiento;
    private String[] estudio;
    private String[] idioma;
    private int diasTrabajados;
    private int sueldoBase;
    private int sueldoTotal;

    private Modelo calculador;

    public Empleado() {
        calculador = new Modelo();

    }

    public Formulario getFormulario() {
        return formulario;
    }

    public void setFormulario(Formulario formulario) {
        this.formulario = formulario;
    }

    public String getCedula() {
        return cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public String[] getEstudio() {
        return estudio;
    }

    public String[] getIdioma() {
        return idioma;
    }

    public int getDiasTrabajados() {
        return diasTrabajados;
    }

    public int getSueldoBase() {
        return sueldoBase;
    }

    public int getSueldoTotal() {
        return sueldoTotal;
    }

    public Modelo getCalculador() {
        return calculador;
    }


    public void ejecutar() {
        try {
            cedula = formulario.getCedula();
            nombre = formulario.getNombre();
            apellido = formulario.getApellido();
            fechaNacimiento = formulario.getFechaNacimiento();
            //calcularSueldo();
            estudio = formulario.getEstudio();

            idioma = formulario.getIdioma();
            diasTrabajados = formulario.getDiasTrabajados();
            sueldoBase = formulario.getSueldoBase();

            sueldoTotal = formulario.getDiasTrabajados();
            FacesContext.getCurrentInstance().getExternalContext().redirect("empleado.xhtml");
        } catch (IOException ex) {
            Logger.getLogger(Empleado.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
