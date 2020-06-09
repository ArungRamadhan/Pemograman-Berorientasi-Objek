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
public class ExFinaly {
    public static void main(String[] args) {
        try{
            int a = 1/0;
            System.out.println("Sukses");
        }
        catch(Exception a){
            System.out.println(a);
        }
        finally{
            System.out.println("Next");
        }
    }
}
