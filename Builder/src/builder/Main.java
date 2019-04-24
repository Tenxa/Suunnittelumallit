/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package builder;

import builder.Ingredients.Ingredients_IF;
import java.util.ArrayList;

/**
 *
 * @author teemu
 */
public class Main {

    public static void main(String[] args) {
        Chef ramsay = new Chef(new Hesburger());
        ramsay.CreateBurger();
        System.out.println("Hesburger: ");
        System.out.println(ramsay.getBurger());
        
        ramsay.setBurgerBuilder(new McDonalds());
        System.out.println("McDonalds: ");
        ramsay.CreateBurger();
        
        ((ArrayList<Ingredients_IF>) ramsay.getBurger()).forEach(System.out::println);
    }
    
}
