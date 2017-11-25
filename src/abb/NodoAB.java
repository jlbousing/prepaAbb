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
public class NodoAB {
    
    private int data;
    private NodoAB hi;
    private NodoAB hd;

    public NodoAB(int data) {
        this.data = data;
        this.hd = null;
        this.hi = null;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public NodoAB getHi() {
        return hi;
    }

    public void setHi(NodoAB hi) {
        this.hi = hi;
    }

    public NodoAB getHd() {
        return hd;
    }

    public void setHd(NodoAB hd) {
        this.hd = hd;
    }
    
    
    
    
}
