/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package builder;

/**
 *
 * @author teemu
 */
public class Chef {

    private Builder burgerBuilder;
    
    public Chef(Builder burgerBuilder) {
        this.burgerBuilder = burgerBuilder;
    }

    public Object getBurger() {
        return burgerBuilder.getBRGR();
    }

    public void setBurgerBuilder(Builder burgerBuilder) {
        this.burgerBuilder = burgerBuilder;
    }
    
    
    
    public void CreateBurger(){
        burgerBuilder.createBRGR();
        burgerBuilder.buildBeef();
        burgerBuilder.buildBun();
        burgerBuilder.buildOnion();
        burgerBuilder.buildSalad();
        
    }
    
}
