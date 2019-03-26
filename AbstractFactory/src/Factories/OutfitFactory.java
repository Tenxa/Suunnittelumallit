/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Factories;

import Clothes.*;

/**
 *
 * @author teemu
 */
public interface OutfitFactory {
    
    public abstract Hat createHat();
    public abstract Jeans createJeans();
    public abstract Shoes createShoes();
    public abstract Tshirt crateTshirt();
}
