/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clinica;

import java.util.Date;

/**
 *
 * @author kevin
 */
public class Enfermero extends Persona {
    private int codigoEnfermero;
    private String areaTrabajo;
    
    //Método constructor de la clase hija Enfermero
    public Enfermero(String nombres, String apellidos, Date fechaNacimiento, char sexo, int telefono, String dui, String direccion, String ocupacion, String estadoCivil)
    {
        super(nombres, apellidos, fechaNacimiento, sexo, telefono, dui, direccion, ocupacion, estadoCivil);
        this.codigoEnfermero = codigoEnfermero;
        this.areaTrabajo = areaTrabajo;
    }

    public Enfermero() 
    {
        super();
    }

    //Método para mostrar los datos del Enfermero
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
        System.out.println("Codigo del Paciente: "+codigoEnfermero);
        System.out.println("Área de trabajo: "+areaTrabajo);
    }
    
    @Override
    public void funcion()
    {
        System.out.println("Soy un enfermero, que trabaja en esta clinica para ayudar a las personas que vienen a pasar consulta");
    }
}
 