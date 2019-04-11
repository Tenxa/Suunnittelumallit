/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chainofresponsibility;

import java.util.Scanner;


/**
 *
 * @author teemu
 */
public class Main {

    
    public static void main(String[] args) {
        
        Supervisor superman = new Supervisor();
        HeadOfUnit unitman = new HeadOfUnit();
        CEO boss = new CEO();
        
        superman.setSuccessor(unitman);
        unitman.setSuccessor(boss);
        
        Scanner lukija = new Scanner(System.in);
        
        System.out.println("how much do u want to ask raise for your salary?");
        double raise = lukija.nextDouble();
        
        EmployeeRequest raiseRequest = new EmployeeRequest(3000.0, 100.0);
        
        superman.handle(raiseRequest);
    }
    
}
