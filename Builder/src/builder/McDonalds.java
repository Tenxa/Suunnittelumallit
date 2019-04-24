/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package builder;

import builder.Ingredients.*;
import builder.Ingredients.Ingredients_IF;
import java.util.ArrayList;

/**
 *
 * @author teemu
 */
public class McDonalds implements Builder<ArrayList<Ingredients_IF>>{
    ArrayList<Ingredients_IF> burger;

    @Override
    public void buildBun() {
        burger.add(new Bun());
    }

    @Override
    public void buildBeef() {
        burger.add(new Beef());
    }

    @Override
    public void buildSalad() {
        burger.add(new Salad());
    }

    @Override
    public void buildOnion() {
        burger.add(new Onion());
    }

    @Override
    public void createBRGR() {
        burger = new ArrayList();
    }

    @Override
    public ArrayList<Ingredients_IF> getBRGR() {
        return burger;
    }


    
}
