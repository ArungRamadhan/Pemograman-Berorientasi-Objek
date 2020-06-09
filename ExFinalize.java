/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas;

import sun.org.mozilla.javascript.internal.ast.Block;

/**
 *
 * @author HP
 */
public class ExFinalize {
    public void finalize(){
        System.out.println("Objek tidak terpakai clear:");
    }
    
    public static void main(String[] args) {
        Runtime RT  = Runtime.getRuntime();
        System.out.println("Jumlah Memory Awal :"+RT.totalMemory());
        
        Block objek1 = new Block();
        Block objek2 = new Block();
        Block objek3 = objek1; //objek 3 mengembalikan nilai objek 3
        objek1 = null;
        objek2 = null;
        System.out.println("Jumlah memory sebelum di GC: "+RT.freeMemory());
        System.gc();
        System.out.println("Jumlah memory setelah di GC: "+RT.freeMemory());
        
    }
}
