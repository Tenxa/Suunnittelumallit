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
public abstract class RaiseHandler {
    private RaiseHandler successor;

    public void setSuccessor(RaiseHandler successor) {
        this.successor = successor;
    }
    
    
    public void handle(EmployeeRequest r){
        if (successor != null){
            successor.handle(r);
        }
    }
    
    public boolean allowRaise(EmployeeRequest r, double percent){
        double salary = r.getSalary();
        double raise = r.getRaise();
        
        return salary + (salary * percent) > raise + salary;
    }
    
    public void print(String title, EmployeeRequest r ){
        System.out.println(title + " will accept the salary raise of: " +r.getRaise());
        System.out.println("The new salary will be " + (r.getSalary()+r.getRaise()));
    }
    
}
