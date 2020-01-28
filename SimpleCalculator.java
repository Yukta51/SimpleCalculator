/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simplecalculator;
import javax.swing.JFrame;

/**
 *
 * @author YUKTA
 */
public class SimpleCalculator extends JFrame{
    
    public SimpleCalculator()
    {
        super("My Simple Calculator");
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        CalculatorWindow cal1=new CalculatorWindow();
        cal1.setVisible(true);
    }
    
}
