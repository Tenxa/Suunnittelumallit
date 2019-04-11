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
public class CEO extends RaiseHandler{
    private final String TITLE = "CEO";

    public CEO() {
    }

    @Override
    public void handle(EmployeeRequest request) {
		super.print(TITLE, request);
	}


    @Override
    public void setSuccessor(RaiseHandler successor) {
        super.setSuccessor(successor); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
