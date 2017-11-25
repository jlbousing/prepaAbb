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
public class ArbolBB {
    
    private NodoAB raiz;

    public NodoAB getRaiz() {
        return raiz;
    }

    public void setRaiz(NodoAB raiz) {
        this.raiz = raiz;
    }
    
    public ArbolBB(){
        this.raiz = null;
    }
    
    public boolean esVacio(){
        if(raiz == null){
            return true;
        }else{
            return false;
        }
    }
    
    public void Insertar(NodoAB raiz, NodoAB nuevo){
        
        
        if(esVacio()){
            this.raiz = nuevo;
            System.out.println("INSERTO RAIZ");
        }
        else{
            
            if(raiz.getData() < nuevo.getData()){
                
                if(raiz.getHd() == null){
                    raiz.setHd(nuevo);
                    System.out.println("INSERTO "+nuevo.getData());
                }
                else{
                    Insertar(raiz.getHd(),nuevo); //SE RECORRE POR LA RAMA DERECHA
                }
                
            }
            else{
                
                if(raiz.getHi() == null){
                    raiz.setHi(nuevo);
                }
                else{
                    Insertar(raiz.getHi(),nuevo);
                }
            }
        }
        
    }
    
    public boolean buscar(NodoAB raiz, int dato){
        
        if(esVacio()){
            return false;
        }
        else{
            
            if(raiz.getData() == dato){
                return true;
            }
            else{
                
                if(raiz.getData() < dato){
                    buscar(raiz.getHd(),dato);
                }
                else{
                    buscar(raiz.getHi(),dato);
                }
                
            }
            
        }
        
        return false;
    }
    
    public void Mostrar(NodoAB raiz){
        
        if(raiz != null){
            
            Mostrar(raiz.getHi());
            System.out.println(raiz.getData());
            Mostrar(raiz.getHd());
            
            
        }
        
    }
  
    
}
