/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package occ.ues.edu.sv.ingenieria.prn335.controller;

import java.time.LocalDate;
import java.util.ArrayList;
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
    /*@Test
    public void testGetListaPeliculas() {
        System.out.println("getListaPeliculas");
        Cine instance = new Cine();
        ArrayList<Pelicula> expResult = null;
        ArrayList<Pelicula> result = instance.getListaPeliculas();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
*/
    /**
     * Test of agregarPelicula method, of class Cine.
     */
    @Test
    public void testAgregarPelicula() {
        System.out.println("agregarPelicula");
        int idPelicula = 6;
        String titulo = "PruebaTitulo";
        String duracion = "PruebaDuracion";
        String director = "PruebaDirector";
        String genero = "PruebaGenero";
        LocalDate fechaEstreno = LocalDate.of(2018, 10, 30);;
        char clasificacion = 'E';
        String sinopsis = "PruebaSinopsis";
        Cine instance = new Cine();
        Pelicula expResult = null;
        Pelicula result = instance.agregarPelicula(idPelicula, titulo, duracion, director, genero, fechaEstreno, clasificacion, sinopsis);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        if(result !=expResult){
            fail("The test case is a prototype.");
        }else{
            
        }
        
    }
    
}
