    /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clinica;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Gustavo Cuéllar
 */

     
     //Parte De Gustavo Ernesto Cuellar Delgado.

public class clinica {
    
    private double precioMedicamentos, serviciosMedicos, hospitalizacion, pagarAgua, pagarLuz, cobrarComida, _precioMedicamentos; 
    private final double precioComida=1.25; 
    private double agua = 20.15; 
    private double luz = 50.00; 
    private double internet = 30.99;
    
    public void abstraccionPagoComida ()
    {   
        Scanner entrada = new Scanner (System.in);
        double cantidadcomida, resultado;  
        System.out.println ("¿Cuántos platos de comida ha consumido");
        cantidadcomida = entrada.nextDouble();
        resultado= cantidadcomida*precioComida; System.out.println("El total a pagar eso: "+ resultado);    
    }
    
    public void abstraccionpagoAgua()
    {
        Scanner entrada = new Scanner (System.in);
        double mesAgua, resultado; 
        System.out.println("¿Cuantos meses de servicio de agua pagará?");
        mesAgua = entrada.nextDouble();
        resultado = mesAgua*agua; System.out.println("El total a cancelar es: "+ resultado);
    }
    
    public void abstraccionPagoLuz () 
    {
        Scanner entrada = new Scanner (System.in);
        double mesLuz, resultado; 
        System.out.println("¿Cuántos meses de servicio de luz quiere cancelar");
        mesLuz = entrada.nextDouble();
        resultado = mesLuz*luz; System.out.println("El total a pagar es: "+ resultado); 
    }
    
    public void abstraccionPagoInternet ()
    {
        Scanner entrada = new Scanner (System.in);
        double mesInternet, resultado;
        System.out.println("¿Cuantos meses de servicio de internet quiere cancelar?");
        mesInternet = entrada.nextDouble();
        resultado = mesInternet*internet; System.out.println("El total a cancelar es: "+ resultado);
    }
    //Metodo para hacer el cobro de medicamento.
    public void setcobrarMedicamento () 
    {
        this.precioMedicamentos=_precioMedicamentos; 
    }
    public double getprecioMedicamentos ()
    {
        return this.precioMedicamentos; 
    }
    //Metodo para hacer el cobro de comida.
    public void setcobrarComida (double _cobrarComida)
    {
        this.cobrarComida= _cobrarComida;
    }
    
    public double getcobrarComida()
    {
        return this.cobrarComida; 
    }
    //Metodo para hacer el cobro de los servicios Medicos. 
    public void setcobrarServiciosMedicos (double _serviciosMedicos)
    {
        this.serviciosMedicos=_serviciosMedicos;
    }
    
    public double getcobrarServiciosMedicos()
    {
        return this.serviciosMedicos;
    }
    //Metodo para hacer el pago del agua
    public void setpagarAgua (double _pagarAgua)
    {
        this.agua=_pagarAgua;
    }
    
    public double getcobrarAgua ()
    {
        return this.pagarAgua;
    }
    //Metodo para hacer el pago de luz. 
    public void setpagarLuz (double pagarLuz)
    {
        this.luz=pagarLuz;
    }
    
    public double getcobrarLuz()
    {
        return this.pagarLuz;       
    }
    //Metodo para hacer el cobro de hospitalizacion/
    public void sethospitalizacion (double _cobrarHospitalizacion)
    {
        this.hospitalizacion=_cobrarHospitalizacion;
    }
    
    public double gethospitalizacion ()
    {
        return this.hospitalizacion;
    }
    //Metodo para hacer el pago de internet. 
    public void setinternet (double _cobrarInternet)
    {
        this.internet=_cobrarInternet;
    }
    
    public double getinternet ()
    {
        return this.internet; 
    }  

    //arreglos
    
    public class arreglosMedicamentos
    {
        public static void main(String[] args)
        {
            Scanner entrada = new Scanner (System.in);
            int nMedicamentos;
            nMedicamentos = Integer.parseInt(JOptionPane.showInputDialog("Digite los espacios de medicamentos que desea crear"));
            char [] medicamentos = new char[nMedicamentos]; System.out.println("Digite los medicamentos: ");
            for (int i = 0;i<nMedicamentos;i++)
            {
                System.out.println((i+1)+". Ingrese el medicamento"); medicamentos [i] = entrada.next().charAt(0);   
            }
            System.out.println("\nLos medicamentos son: ");
            for(int i=0;i<nMedicamentos;i++) System.out.print(medicamentos[i]+".");
        }
        public static int medicamentosExistentes(int[]arreglo, int busqueda)
        {
            for (int x=0;x<arreglo.length;x++) if (arreglo[x]== busqueda)   
                {
                    return x;
                }
            return -1;
        }
    }
    //Arreglos de comida
    public class arreglosComida 
    {
        public static void main(String[] args)
        {
            Scanner entrada = new Scanner (System.in);
            int nComida; nComida = Integer.parseInt(JOptionPane.showInputDialog("Digite los espacios para los platos de comida"));
            char [] comida = new char [nComida]; System.out.println("Digite el numero de platos de comida");
            for (int i =0;i<nComida;i++)
            {
                System.out.println((i+1)+"Ingrese el plato de comida"); comida [i]=entrada.next().charAt(0); 
            }
            System.out.println("\nLos platos de comida son: "); for (int i=0;i<nComida;i++)System.out.print(comida[i]+".");

        }
        public static int platosEnExistencia(int[] arreglo, int busqueda)
        {
            for (int x= 0;x< arreglo.length;x++) if (arreglo [x]==busqueda)   
                {
                    return x;
                }
            return -1;
        }
    }
    
    //Arreglos de Utensilios Medicos
    public class arreglosUtenziliosMedicos
    {
        public static void main(String[] args)
        {
            Scanner entrada = new Scanner (System.in);
            int nUtensilios; nUtensilios = Integer.parseInt(JOptionPane.showInputDialog("Digite los espacios para los utensilios medicos"));
            char [] utensilios = new char[nUtensilios]; System.out.println("Digite el numero de utensilios medicos");
            for (int i=0;i<nUtensilios;i++)
            {
                System.out.println((i+1)+"Ingrese los utensilios Medicos"); utensilios [i]=entrada.next(). charAt(0);  
            }
            System.out.println("\nLos utensilios son: ");
            for (int i = 0;i<nUtensilios;i++) System.out.print(utensilios[i]+".");
            
        }
    }    
    //clases abstractas  
    public abstract class comidasjsjs
    {
        private String ingredientes, menus;
        private double precio; 
    
        public void setprecio(double pre)
        {
            precio=pre;
        }
       
     public abstract void comidas();   
     
    }
    public abstract class costoMedicamentos
    {
       private String categoriaMedicamentos; 
       private double costoMedicamento; 
       
       public void setprecioMedicamento1(double medicamentosprecio)
       {
           costoMedicamento=medicamentosprecio; 
       }
    }
    //Variables polimorficas
    
    menusComida objtotalcomida=new menusComida();
    menusComida objPreciosTotales[]=new menusComida[2];
    //objPreciosTotales[0]=objtotalcomida;
    
    farmaciaClinica objTotalPreciomedicina=new farmaciaClinica();
    farmaciaClinica obtTotalPrecioMedicina[]=new farmaciaClinica[2];
    //objTotalPrecioMedicina[]=new objTotalPreciomedicina;
}