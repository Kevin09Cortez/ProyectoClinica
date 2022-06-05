/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package clinica;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Gustavo Cuéllar
 */
public class clinicaTest {
    
    public clinicaTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of abstraccionPagoComida method, of class clinica.
     */
    @Test
    public void testAbstraccionPagoComida() {
        String respuesta= "si ha pagado";
        String respuesta2="no ha pagado";
        
        assertEquals(respuesta2,AbstraccionPagoComida.Pagocomida(respuesta));
    }

    /**
     * Test of abstraccionpagoAgua method, of class clinica.
     */
    @Test
    public void testAbstraccionpagoAgua() {
        System.out.println("abstraccionpagoAgua");
        clinica instance = new clinica();
        instance.abstraccionpagoAgua();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of abstraccionPagoLuz method, of class clinica.
     */
    @Test
    public void testAbstraccionPagoLuz() {
      String respuesta1="Si, se ha pagado";
      String respuesta2= "No, no se ha hecho el pago";
      assertEquals(respuesta2,AbstraccionPagoLuz.PagoLuz(respuesta1));
    }

    /**
     * Test of abstraccionPagoInternet method, of class clinica.
     */
    @Test
    public void testAbstraccionPagoInternet() {
        System.out.println("abstraccionPagoInternet");
        clinica instance = new clinica();
        instance.abstraccionPagoInternet();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setcobrarMedicamento method, of class clinica.
     */
    @Test
    public void testSetcobrarMedicamento() {
        System.out.println("setcobrarMedicamento");
        clinica instance = new clinica();
        instance.setcobrarMedicamento();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getprecioMedicamentos method, of class clinica.
     */
    @Test
    public void testGetprecioMedicamentos() {
        System.out.println("getprecioMedicamentos");
        clinica instance = new clinica();
        double expResult = 0.0;
        double result = instance.getprecioMedicamentos();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setcobrarComida method, of class clinica.
     */
    @Test
    public void testSetcobrarComida() {
        System.out.println("setcobrarComida");
        double _cobrarComida = 0.0;
        clinica instance = new clinica();
        instance.setcobrarComida(_cobrarComida);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getcobrarComida method, of class clinica.
     */
    @Test
    public void testGetcobrarComida() {
        System.out.println("getcobrarComida");
        clinica instance = new clinica();
        double expResult = 0.0;
        double result = instance.getcobrarComida();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setcobrarServiciosMedicos method, of class clinica.
     */
    @Test
    public void testSetcobrarServiciosMedicos() {
      String respuesta = "si, ha pagado los servicios";
      String respuesta2 = "No, no ha pagado los servicios";
      
      assertEquals(respuesta2, cobrarServiciosMedicos.pagoServiciosMedicos(respuesta));
    }

    /**
     * Test of getcobrarServiciosMedicos method, of class clinica.
     */
    @Test
    public void testGetcobrarServiciosMedicos() {
        System.out.println("getcobrarServiciosMedicos");
        clinica instance = new clinica();
        double expResult = 0.0;
        double result = instance.getcobrarServiciosMedicos();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setpagarAgua method, of class clinica.
     */
    @Test
    public void testSetpagarAgua() {
        System.out.println("setpagarAgua");
        double _pagarAgua = 0.0;
        clinica instance = new clinica();
        instance.setpagarAgua(_pagarAgua);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getcobrarAgua method, of class clinica.
     */
    @Test
    public void testGetcobrarAgua() {
        System.out.println("getcobrarAgua");
        clinica instance = new clinica();
        double expResult = 0.0;
        double result = instance.getcobrarAgua();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setpagarLuz method, of class clinica.
     */
    @Test
    public void testSetpagarLuz() {
        System.out.println("setpagarLuz");
        double pagarLuz = 0.0;
        clinica instance = new clinica();
        instance.setpagarLuz(pagarLuz);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getcobrarLuz method, of class clinica.
     */
    @Test
    public void testGetcobrarLuz() {
        System.out.println("getcobrarLuz");
        clinica instance = new clinica();
        double expResult = 0.0;
        double result = instance.getcobrarLuz();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of sethospitalizacion method, of class clinica.
     */
    @Test
    public void testSethospitalizacion() {
        System.out.println("sethospitalizacion");
        double _cobrarHospitalizacion = 0.0;
        clinica instance = new clinica();
        instance.sethospitalizacion(_cobrarHospitalizacion);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of gethospitalizacion method, of class clinica.
     */
    @Test
    public void testGethospitalizacion() {
        System.out.println("gethospitalizacion");
        clinica instance = new clinica();
        double expResult = 0.0;
        double result = instance.gethospitalizacion();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setinternet method, of class clinica.
     */
    @Test
    public void testSetinternet() {
        System.out.println("setinternet");
        double _cobrarInternet = 0.0;
        clinica instance = new clinica();
        instance.setinternet(_cobrarInternet);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getinternet method, of class clinica.
     */
    @Test
    public void testGetinternet() {
        System.out.println("getinternet");
        clinica instance = new clinica();
        double expResult = 0.0;
        double result = instance.getinternet();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    private static class AbstraccionPagoComida {

        private static Object Pagocomida(String respuesta) {
            throw new UnsupportedOperationException(); 
        }

        public AbstraccionPagoComida() {
        }
    }

    private static class AbstraccionPagoLuz {

        private static Object PagoLuz(String respuesta1) {
            throw new UnsupportedOperationException(); 
        }

        public AbstraccionPagoLuz() {
        }
    }

    private static class cobrarServiciosMedicos {

        private static Object pagoServiciosMedicos(String respuesta) {
            throw new UnsupportedOperationException("Not supported yet."); 
        }

        public cobrarServiciosMedicos() {
        }
    }
    
}
