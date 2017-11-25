/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package abb;

/**
 *
 * @author Jorge
 */
public class Abb {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArbolBB abb = new ArbolBB();
        
        
        NodoAB n1 = new NodoAB(3);
        NodoAB n2 = new NodoAB(2);
        NodoAB n3 = new NodoAB(1);
        NodoAB n4 = new NodoAB(15);
        NodoAB n5 = new NodoAB(4);
        NodoAB n6 = new NodoAB(7);
        NodoAB n7 = new NodoAB(5);
        
       abb.Insertar(abb.getRaiz(), n1);
       abb.Insertar(abb.getRaiz(), n2);
       abb.Insertar(abb.getRaiz(), n3);
       abb.Insertar(abb.getRaiz(), n4);
       abb.Insertar(abb.getRaiz(), n5);
       abb.Insertar(abb.getRaiz(), n6);
       abb.Insertar(abb.getRaiz(), n7);
       
       abb.Mostrar(abb.getRaiz());
    }
    
}
