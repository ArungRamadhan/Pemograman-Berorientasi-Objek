/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas;

/**
 *
 * @author HP
 */
public class ExWrapperClass {
    public static void main(String[] args) {
        Character objChar = new Character('D');
        Byte objByte = new Byte("10");
        Short objShort = new Short("50");
        Integer objInt = new Integer(800);
        Long objLong = new Long(1000);
        Boolean objBoolean = new Boolean(true);
        Float objFloat = new Float(82.89);
        Double objDouble = new Double(34.67);
        
        //Menampilkan Output dari Class Wrapper
        System.out.println("Character: "+objChar);
        System.out.println("Byte: "+objByte);
        System.out.println("Short: "+objShort);
        System.out.println("Integer: "+objInt);
        System.out.println("Long: "+objLong);
        System.out.println("Boolean: "+objBoolean);
        System.out.println("Float: "+objFloat);
        System.out.println("Double: "+objDouble);
    }
}