/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mvcapplication;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author 3020
 */
public class ClaculateConroler 
{
     private CalculatoView theView;
     private CalculatoModel theModel;
     
     public ClaculateConroler (CalculatoView theView, CalculatoModel theModel)
            {

	      this.theView = theView;

	       this.theModel = theModel;

	        theView.addClaculationListner(new CalculateListener());
            }

	    class CalculateListener implements ActionListener
            {

	        public void actionPerformed(ActionEvent e) 
                {

	            int firstNumber, secondNumber = 0;

	            try{

	                firstNumber = theView.getFirstnu();

	                secondNumber = theView.getSectnu();

	                theModel.add(firstNumber, secondNumber);
                                   theView.setSolu(theModel.getResult());

	              

	            }

	 

	            catch(NumberFormatException ex)
                    {

	                 

	                System.out.println(ex);
	                 

	                theView.displayerror("You Need to Enter 2 Integers");
	                 

	            }

	             

	        }

	         

	    }

	     

	
}
