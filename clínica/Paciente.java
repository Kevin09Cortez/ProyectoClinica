/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clínica;

import java.util.Date;

/**
 *
 * @author kevin
 */
public class Paciente extends Persona {

    private int codigoPaciente;
    private String enfermedad;

    //Método constructor de la clase hija Paciente
    public Paciente(String nombres, String apellidos, Date fechaNacimiento, char sexo, int telefono, String dui, String direccion, String ocupacion, String estadoCivil, int codigoPaciente)
    {
        super(nombres, apellidos, fechaNacimiento, sexo, telefono, dui, direccion, ocupacion, estadoCivil);
        this.codigoPaciente = codigoPaciente;
        this.enfermedad = enfermedad;
    }
        
    

    //Método para mostrar los datos del Paciente
    public void mostrarDatos() 
    {
        System.out.println("Nombres: " + getNombres());
        System.out.println("Apellidos: " + getApellidos());
        System.out.println("Edad: " + getEdad());
        System.out.println("Sexo: " + getSexo());
        System.out.println("Teléfono: " + getTelefono());
        System.out.println("DUI: " + getDui());
        System.out.println("Dirección: " + getDireccion());
        System.out.println("Ocupación: " + getOcupacion());
        System.out.println("Estado Civil: " + getEstadoCivil());
        System.out.println("Codigo del Paciente: " + codigoPaciente);
        System.out.println("Enfermedad detectada: "+enfermedad);
    }
    
    @Override
    public void funcion()
    {
        System.out.println("Soy un paciente, que ha venido a pasar consulta");
    }
}
