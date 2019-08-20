/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package occ.ues.edu.sv.ingenieria.prn335.controller;

import java.time.LocalDate;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import occ.ues.edu.sv.ingenieria.prn335.entity.Pelicula;

/**
 *
 * @author kevin
 */
public class Cine {

    /*Se les proporciona un arraylist de objetos Peliculas ya cargado en donde
    se deberan realizar las acciones*/
    ArrayList<Pelicula> listaPeliculas = new ArrayList<>();

   public Cine() {
        listaPeliculas.add(new Pelicula(1, "Blade Runner 2049", "163 minutos", "Dennis Villeneuve", "Ciencia Ficcion", LocalDate.of(2017, 10, 3), 'C', "Un androide tiene una crisis existencial"));
        listaPeliculas.add(new Pelicula(2, "A Quiet Place", "91 minutos", "John Krasinski", "Horror", LocalDate.of(2018, 3, 9), 'D', "Da miedo"));
        listaPeliculas.add(new Pelicula(3, "The Incredibles II", "120 minutos", "Brad Bird", "Acción", LocalDate.of(2016, 6, 15), 'A', "Un esposo celoso del exito de us esposa"));
        listaPeliculas.add(new Pelicula(4, "Avengers: Infinity War", "149 minutos", "Hermanos Russo", "Acción", LocalDate.of(2018, 4, 23), 'B', "Thanos encuentra el one pice"));
        listaPeliculas.add(new Pelicula(5, "Dunkirk", "106 minutos", "Christopher Nolan", "Guerra", LocalDate.of(2017, 7, 21), 'C', "Los ingleses se van de francia en barquitos"));
    }

  

    public ArrayList<Pelicula> getListaPeliculas() {
        return listaPeliculas;
    }

    
    public Pelicula agregarPelicula(int idPelicula, String titulo, String duracion,
    String director, String genero, LocalDate fechaEstreno, char clasificacion, String
    sinopsis​ ){
 
        
        if(LocalDate.now().isBefore(fechaEstreno) && clasificacion !='E'){
            
            listaPeliculas.add(new Pelicula(idPelicula, titulo, duracion, director, genero, fechaEstreno, clasificacion, sinopsis));
        }else{
        }
        
        
        return null;
    }

    public void modificarPelicula(int id_pelicula, String titulo, String duracion,
    String director, String genero, LocalDate fechaEstreno, char clasificacion, String
    sinopsis​ ){
        
        for(int posicion=0; posicion<listaPeliculas.size(); posicion++){
           if (LocalDate.now().isBefore(fechaEstreno)) {
            for (int i = 0; i < listaPeliculas.size(); i++) {
                if (listaPeliculas.get(i).getIdPelicula() == id_pelicula) {
                    Pelicula UpdatePeli = new Pelicula(id_pelicula, titulo, duracion, director, genero, fechaEstreno, Character.toUpperCase(clasificacion), sinopsis);
                    listaPeliculas.set(i, UpdatePeli);
                    //break para evitar que el bucle siga recorriendo el arraylist
                    break;
                }
            }
        }

    
        }
        
        
        
    }

    public void agregarPelicula(String idpelicula, String titulo, String duracion, String director, String genero, String fecha, String clasificacion, String sinopsis) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
}
