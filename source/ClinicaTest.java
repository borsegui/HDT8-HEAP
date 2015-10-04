/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author pablo arriola
 */
public class ClinicaTest {
    
    public ClinicaTest() {
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
     * Test of AgregarPaciente method, of class Clinica.
     */
    @Test
    public void testAgregarPaciente() {
        System.out.println("AgregarPaciente");
        String paciente = "";
        Clinica instance = new Clinica();
        instance.AgregarPaciente(paciente);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of MostrarLista method, of class Clinica.
     */
    @Test
    public void testMostrarLista() {
        System.out.println("MostrarLista");
        Clinica instance = new Clinica();
        instance.MostrarLista();
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
