/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package visitor;

/**
 *
 * @author teemu
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        PokemonContext ct= new PokemonContext();
        PokemonVisitor visitor = new StateVisitor();
        
        ct.accept(visitor);
        ct.accept(visitor);
        ct.accept(visitor);
    }
    
}
