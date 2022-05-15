/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clínica;

import java.time.LocalDate;
import java.time.Period;
import java.util.Arrays;
import java.util.Date;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Kevin Antonio Cortez Gutiérrez
 */
public class Persona {
    private String nombres, apellidos, dui, direccion, ocupacion, estadoCivil;
    private Date fechaNacimiento;
    private char sexo;
    private int telefono;
    
    //Método constructor con parametros
    public Persona(String _nombres, String _apellidos, Date _fechaNacimiento, char _sexo, int _telefono, String _dui, String _direccion, String _ocupacion, String _estadoCivil)
    {
        this.nombres = _nombres;
        this.apellidos = _apellidos;
        this.fechaNacimiento = _fechaNacimiento;
        this.sexo = _sexo;
        this.telefono = _telefono;
        this.dui = _dui;
        this.direccion = _direccion;
        this.ocupacion = _ocupacion;
        this.estadoCivil = _estadoCivil;
    }
    
    //Método que hara referencia a las variables polimorficas
    public void funcion()
    {
        
    }
    
    //Método para modificar el nombre
    public void setNombres(String _nombres)
    {
        this.nombres = _nombres;
    }
     public String getNombres()
     {
         return this.nombres;
     }
     
     //Método para modificar el apellido
     public void setApellidos(String _apellidos)
     {
         this.apellidos = _apellidos;
     }
     public String getApellidos()
     {
         return this.apellidos;
     }
     
     //Método para modificar la fecha de nacimiento
     public void setFechaNacimiento(Date _fechaNacimiento)
     {
         this.fechaNacimiento = _fechaNacimiento;
     }
     //Calculo de la edad
     public int getEdad()
     {
        LocalDate _fechaNacimiento = LocalDate.of(this.fechaNacimiento.getYear(), this.fechaNacimiento.getMonth(), this.fechaNacimiento.getDay());
        LocalDate ahora = LocalDate.now();
        Period p = Period.between(_fechaNacimiento, ahora);
        return p.getYears();
     }
     
     //Método para modificar el sexo
     public void setSexo(char _sexo)
     {
         this.sexo = _sexo;
     }
     //El siguiente método verifica si el caracter es "f" para verificar si es femenino o masculino
     public String getSexo()
     {
         char sx = "f".charAt(0);
         if (sx == this.sexo) return "femenino";
         else return "masculino";
     }
     
     //Método para modificar el número de teléfono
     public void setTelefono(int _telefono)
     {
         this.telefono = _telefono;
     }
     public int getTelefono()
     {
         return this.telefono;
     }
     
     //Método para modificar el DUI
     public void setDui(String _dui)
     {
         this.dui = _dui;
     }
     public String getDui()
     {
         return this.dui;
     }
     
     //Método para modificar la dirección
     public void setDireccion(String _direccion)
     {
         this.direccion = _direccion;
     }
     public String getDireccion()
     {
         return this.direccion;
     }
     
     //Método para modificar la ocupación
     public void setOcupacion(String _ocupacion)
     {
         this.ocupacion = _ocupacion;
     }
     public String getOcupacion()
     {
         return this.ocupacion;
     }
     
     //Método para modificar el estado civil
     public void setEstadoCivil(String _estadoCivil)
     {
         this.estadoCivil = _estadoCivil;
     }
     public String getEstadoCivil()
     {
         return this.estadoCivil;
     }
     
     //Método abstracto para mostrar toda la información
     public void mostrarDatos()
     {
         System.out.println("Se mostraran los datos de el paciente: ");
         System.out.println(this.nombres);
         System.out.println(this.apellidos);
         System.out.println(this.fechaNacimiento);
         System.out.println(this.sexo);
         System.out.println(this.telefono);
         System.out.println(this.dui);
         System.out.println(this.direccion);
         System.out.println(this.ocupacion);
         System.out.println(this.estadoCivil);
     }
     
     //Método abstracto para mostrar si la persona ha comido o no
     public String alimentarse(String respuesta)
     {
        respuesta = "si";
        if(respuesta == respuesta) return "Ha comido";
        else return "No ha comido";
     }
     
    private static boolean error;
     //Arreglo de las edades de los pacientes
     public static void main(String[] arg)
    {
        error = false;
        Scanner entrada = new Scanner(System.in);
        try
        {
            int _arregloEdades;
        
        _arregloEdades = Integer.parseInt(JOptionPane.showInputDialog("Digite la cantidad de edades que ingresara:"));
        
        int[] edades = new int[_arregloEdades];
        System.out.println("Digite las edades que conformaran el arreglo: ");
        for (int i=0; i<_arregloEdades; i++)
        {
            System.out.println((i+1)+". Digite una edad: ");
            edades[i] = entrada.nextInt();
        }
        System.out.println("\nLas edades del arreglo son: ");
        for (int i=0; i<_arregloEdades; i++) System.out.println(edades[i]+" ");
        
        //Método de ordenación de Burbuja
        for (int i=0; i< _arregloEdades-1;i++)
        {
            for ( int j = 0; j<_arregloEdades-i-1;j++)
            {
                if (edades[j] > edades[j+1])
                {
                    int temp = edades[j];
                    edades[j] = edades[j+1];
                    edades[j+1] = temp;
                }
            }
        }
        //Mostrando el arreglo ordenado de forma creciente
        System.out.println("\nArreglo ordenado de forma creciente: ");
        for (int i=0; i<_arregloEdades; i++)System.out.println(edades[i]);
        
        //Método de busqueda binaria
        System.out.println("Ingresa la edad que desea buscar: ");
        int edadBuscada = entrada.nextInt();
        
        int n = edades.length, inf = 0, centro = 0;
        int sup = n - 1;
        boolean valor = false;
        while (inf <= sup)
        {
            centro = (sup + inf)/2;
            if (edades[centro]==edadBuscada)
            {
                valor = true;
                break;
            }
            else if (edadBuscada<edades[centro]) sup = centro - 1;
            else inf = centro +1;
        }
        if (valor == true) System.out.println("La edad ha sido encontrada en la posición "+ (centro+1));
        else System.out.println("La edad no ha sido encontrada en ninguna posición dentro del arreglo.");
        
        
        //Método de busqueda secuencial
        int dato;
        boolean respuesta = false;
        
        System.out.println("Digite la edad a buscar: ");
        dato = entrada.nextInt();
        int i=0;
        while (i<_arregloEdades && respuesta == false)
        {
            if (edades[i] == dato)respuesta = true;
            i++;
        }
        if (respuesta == false)System.out.println("La edad no se encuentra dentro del arreglo.");
        else System.out.println("La edad se encuentra dentro del arreglo.");
        }
        catch (Exception e)
        {
            error = true;
            System.out.println("Ocurrio un error: "+e);
        }
        finally
        {
            if(error==true) System.out.println("Hubo una excepción al ejecutar el código.");
            else System.out.println("El código se ejecutó satisfactoriamente");
        }
        
//        //Variable polimorfica es la que contiene un objeto
//        Paciente objPaciente = new Paciente();
//        Medico objMedico = new Medico();
//        Enfermero objEnfermero = new Enfermero();
//        
//        //Creando variable polimorfica
//        Persona objPersonas[] = new Persona[3];
//        objPersonas[0] = objPaciente;
//        objPersonas[1] = objMedico;
//        objPersonas[2] = objEnfermero;
//        
//        //Poniendo a trabajar las variables polimorficas
//        objPersonas[0].funcion();
//        objPersonas[1].funcion();
//        objPersonas[2].funcion();
    }
}
    
