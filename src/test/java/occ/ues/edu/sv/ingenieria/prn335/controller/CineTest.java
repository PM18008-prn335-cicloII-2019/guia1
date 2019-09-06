/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package occ.ues.edu.sv.ingenieria.prn335.controller;

import java.time.LocalDate;
import occ.ues.edu.sv.ingenieria.prn335.entity.Pelicula;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author melvin
 */
public class CineTest {
    
    public CineTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of getListaPeliculas method, of class Cine.
     */


    /**
     * Test of agregarPelicula method, of class Cine.
     */
    @Test
    public void testAgregarPelicula() {
        System.out.println("agregarPelicula");
        Cine cineTest=new Cine();
        Pelicula expResult = null;
        Pelicula result = cineTest.agregarPelicula(6, "Eternals", "90min", "Marvel", "Accion", LocalDate.of(2020, 6, 1), 'E', "Ironman 26");
        assertEquals(expResult, result);
        
    }

 


    
}
