/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;
import model.GenericoEjemplo; 
import model.Alumno; 
/**
 *
 * @author ASUS
 */
public class TestGenerico {
    public static void main(String[] args) {
        GenericoEjemplo <Integer> g1 = new GenericoEjemplo <> (10);
        System.out.println("g1 + 5 es"+(g1.getDato()+5));
        
        GenericoEjemplo <Alumno> g2 = new GenericoEjemplo <> (new Alumno(777, "ana", 2025 ));
        System.out.println("El alumno es :\n"+ g2.getDato());
        
        
        
        
    }
        
}
