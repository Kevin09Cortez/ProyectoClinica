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
public class Medico extends Persona {
    private String especialidad;
    private int codigoDoctor;
    
    //Método constructor de la clase hija Medico
    public Medico(String nombres, String apellidos, Date fechaNacimiento, char sexo, int telefono, String dui, String direccion, String ocupacion, String estadoCivil)
    {
        super(nombres, apellidos, fechaNacimiento, sexo, telefono, dui, direccion, ocupacion, estadoCivil);
        this.especialidad = especialidad;
        this.codigoDoctor = codigoDoctor;
    }
    
    //Método para mostrar los datos del Medico
    public void mostrarDatos()
    {
        System.out.println("Nombres: "+getNombres());
        System.out.println("Apellidos: "+getApellidos());
        System.out.println("Edad: "+getEdad());
        System.out.println("Sexo: "+getSexo());
        System.out.println("Teléfono: "+getTelefono());
        System.out.println("DUI: "+getDui());
        System.out.println("Dirección: "+getDireccion());
        System.out.println("Ocupación: "+getOcupacion());
        System.out.println("Estado Civil: "+getEstadoCivil());
        System.out.println("Especialidad: "+especialidad);
        System.out.println("Codigo del doctor: "+codigoDoctor);
    }
}
