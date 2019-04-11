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
public class Arvuuttaja {
    private Random rand;
    private static Arvuuttaja INSTANCE = null;
    
    private Arvuuttaja(){
        
    }
    
    public static synchronized Arvuuttaja getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new Arvuuttaja();
        }
        return INSTANCE;
    }
    
    public boolean arvaus(int arvaus, Object obj) {
        Memento memento = (Memento) obj;
        return arvaus == memento.getLuku();
    }
    
    public Memento liityPeliin() {
        rand = new Random();
        return new Memento(rand.nextInt(10) + 1);
    }

    private class Memento {
        private int luku;

        private Memento(int luku) {
            this.luku = luku;
        }

        private int getLuku() {
            return this.luku;
        }
    }
}
