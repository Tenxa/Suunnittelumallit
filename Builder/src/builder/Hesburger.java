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
public class Hesburger implements Builder<StringBuilder>{
    
    private StringBuilder str;

    @Override
    public void buildBun() {
        str.append("Bun\n");
    }

    @Override
    public void buildBeef() {
        str.append("Beef\n");
    }

    @Override
    public void buildSalad() {
        str.append("Salad\n");
    }

    @Override
    public void buildOnion() {
        str.append("Onion\n");
    }

    @Override
    public void createBRGR() {
        str = new StringBuilder();
    }

    @Override
    public StringBuilder getBRGR() {
        return str;
    }

    
}
