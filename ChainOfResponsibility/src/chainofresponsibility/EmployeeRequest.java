/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chainofresponsibility;

/**
 *
 * @author teemu
 */
public class EmployeeRequest {
    private double salary;
    private double raise;

    public EmployeeRequest(double salary, double raise) {
        this.salary = salary;
        this.raise = raise;
    }

    public double getSalary() {
        return salary;
    }

    public double getRaise() {
        return raise;
    }
    

    
    
}
