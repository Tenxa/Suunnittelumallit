/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package memento;

import java.util.Random;

/**
 *
 * @author teemu
 */
public class Asiakas implements Runnable{

    private Object obj;
    private Arvuuttaja arvuuttaja;
    private int luku;
    private String pelaaja;
    private Random rand;

    public Asiakas(String pelaaja) {
        this.pelaaja = pelaaja;
    }
    
    
    
    @Override
    public void run() {
        arvuuttaja = Arvuuttaja.getInstance();
        obj = arvuuttaja.liityPeliin();
        rand = new Random();
        
        while (!arvuuttaja.arvaus(luku, obj)){
            luku = rand.nextInt(10) +1;
            System.out.println("Pelaaja " + pelaaja + ": arvaa numeron" + luku);
        }
    }
    
}
