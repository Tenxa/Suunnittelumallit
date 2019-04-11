/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package memento;

/**
 *
 * @author teemu
 */
public class Main {


    public static void main(String[] args) {

        Thread thread1 = new Thread(new Asiakas("1"));
        Thread thread2 = new Thread(new Asiakas("2"));
        
        thread1.start();
        thread2.start();
        
    }
    
}
