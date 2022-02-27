/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clínica;


/**
 *
 * @author kevin
 */
public class Equivalente implements Comparador{
   private int fechaNacimiento;
   
   public Equivalente()
    {
        fechaNacimiento = 0;
    }
   
   public Equivalente(int edad)
   {
       fechaNacimiento = edad;
   }
   
   public double getInt()
    {
        return fechaNacimiento;
    }
   
   public int toInt()
   {
       return this.fechaNacimiento;
   }
   
    @Override
    public boolean igualQue(Object r) {
        Equivalente equi = (Equivalente) r;
        return this.getInt() == equi.getInt();
    }

    @Override
    public boolean menorQue(Object r) {
        Equivalente equi = (Equivalente) r;
        return this.getInt() < equi.getInt();
    }

    @Override
    public boolean menorIgual(Object r) {
        Equivalente equi = (Equivalente) r;
        return this.getInt() <= equi.getInt();
    }

    @Override
    public boolean mayorQue(Object r) {
        Equivalente equi = (Equivalente) r;
        return this.getInt() > equi.getInt();
    }

    @Override
    public boolean mayorIgual(Object r) {
        Equivalente equi = (Equivalente) r;
        return this.getInt() >= equi.getInt();
    }
    
}
