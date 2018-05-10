/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mvcapplication;

/**
 *
 * @author 3020
 */
public class MvcApplication {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        
                          CalculatoView theView = new CalculatoView();

	       CalculatoModel theModel = new CalculatoModel();

	        new ClaculateConroler (theView,theModel);

	        theView.setVisible(true);
    }
    
}
