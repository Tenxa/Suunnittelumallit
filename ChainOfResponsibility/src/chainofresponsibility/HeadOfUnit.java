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
public class HeadOfUnit extends RaiseHandler{
    private final String TITLE = "Head of Unit";
    private final double RAISE_PCT = 0.05;

    public HeadOfUnit() {
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
        super.setSuccessor(successor); //To change body of generated methods, choose Tools | Templates.
    }
    
}
