/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package roundingerror;
import javax.swing.*; 
import java.awt.event.*; 

/**
 *
 * @author ayyam8774
 */
public class RoundingError {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {      
        String input;
        double num;
        double RoundError;
        double error;
        
        // getting the argument number from user.
        input = JOptionPane.showInputDialog("Prease enter the number :");
        
        // convert string to double.
        num = Double.valueOf (input);
        
        // store the input num to use it after (rounding error)
        error = Double.parseDouble(input);
        
        // squareroot the argument num and ^2.
        num = Math.sqrt(num);
        
        num = Math.pow(num, 2);
        
        System.out.println("The square of the square root is : " + num);

        
        //Show rounding error ↓
        RoundError = num - error;
        
        System.out.println("The round off error is : " + RoundError);
    }
    
}
