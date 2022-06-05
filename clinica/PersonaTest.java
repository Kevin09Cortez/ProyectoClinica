/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author kevin
 */
public class PersonaTest {
    
    public PersonaTest() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
    @Test
    public void testPersona()
    {
        String respuesta = "Si";
        String respuesta1 = "Ha comido";
        assertEquals(respuesta1, Persona.Alimentarse(respuesta));
    }
    
    @Test
    public void testPersona1()
    {
        String sx = "f";
        String sx1 = "femenino";
        assertEquals(sx1, Persona.Sexo(sx));
    }
    
    @Test
    public void testPersona2()
    {
        String nombre = "Alexander Arana";
        String nombreC = "Alexander Arana";
        assertEquals(nombreC, Persona.Nombre(nombre));
    }
}
