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

import java.awt.event.ActionListener;
  import javax.swing.*;
public class CalculatoView  extends JFrame
 {
   private JTextField fn = new JTextField(5);
   private JLabel sign = new JLabel("+");
   private JTextField sn = new JTextField(5);
   private JButton calc = new JButton("Button Claculation");
   private JTextField sol = new JTextField(5);
public CalculatoView()
        {
        
         JPanel jp = new JPanel();
         this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         this.setSize(600,300);
         jp.add(fn);
         jp.add(sign);
         jp.add(sn);
          jp.add(calc);
          jp.add(sol);
          this.add(jp);
        }
 
   public int getFirstnu()
   {
       return Integer.parseInt(fn.getText());
   
   }
    public int getSectnu()
   {
       return Integer.parseInt(sn.getText());
   
   }
    public void setSolu(int solution)
    {
    
      sol.setText(Integer.toString(solution));
       
    }
 void addClaculationListner(ActionListener forButton)
    {
       calc.addActionListener(forButton);
    
    
    }
 void displayerror(String error)
 {
 JOptionPane.showMessageDialog(this, error);
 
 }

    
}
