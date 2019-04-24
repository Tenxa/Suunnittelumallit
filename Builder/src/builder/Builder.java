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
public interface Builder <E>{
    void buildBun();
    void buildBeef();
    void buildSalad();
    void buildOnion();
    void createBRGR();
    E getBRGR();
}
