/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Komponentit;

/**
 *
 * @author teemu
 */
public class Muistipiiri extends AbstractComponent{

    public Muistipiiri(int price) {
        super(price);
    }

    @Override
    public String toString() {
        return "Muistipiiri: " +super.getPrice()+ 'e';
    }
    
}
