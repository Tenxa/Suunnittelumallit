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
public class Supervisor extends RaiseHandler{
    private final String TITLE = "supervisor";
    private final double RAISE_PCT = 0.02;

    public Supervisor() {
    }

    @Override
    public void handle(EmployeeRequest r) {
        if (super.allowRaise(r, RAISE_PCT)){
            super.print(TITLE, r);
        }
        else {
            super.handle(r);
        }
    }

    @Override
    public void setSuccessor(RaiseHandler successor) {
        super.setSuccessor(successor);
    }
    
    
    
    
}
