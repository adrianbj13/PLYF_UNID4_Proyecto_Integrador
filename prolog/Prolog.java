/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prolog;

import org.jpl7.Query;

/**
 *
 * @author Adrian Balam Jimenez
 */
public class Prolog {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try{
            String conexion="consult('Unidad4_LyF.pl')";
            Query con=new Query(conexion);
            System.out.println(conexion+"    "+(con.hasMoreSolutions()?"aceptado":"falso"));
        }catch(Exception e){
            
        }
    }
    
}
