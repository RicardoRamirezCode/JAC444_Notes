// Fig. 12.2: Addition.java
// Addition program that uses JOptionPane for input and output.
import javax.swing.JOptionPane; 		

public class Addition 
{
   public static void main(String[] args)
   {
      // obtain user input from JOptionPane input dialogs
      String firstNumber = 
         JOptionPane.showInputDialog("Enter first integer");
      String secondNumber =
          JOptionPane.showInputDialog("Enter second integer");

      // convert String inputs to int values for use in a calculation
      int number1 = Integer.parseInt(firstNumber); 
      int number2 = Integer.parseInt(secondNumber);

      int sum = number1 + number2; // add numbers

      // display result in a JOptionPane message dialog
      JOptionPane.showMessageDialog(null, "The sum is " + sum, 
         "Sum of Two Integers", JOptionPane.PLAIN_MESSAGE);
      
      // first argument is null, it refers to parent of the dialog box; will centered on screen
      // second argument will be concat of what will be printed in dialog box
      // third argument is title of dialog box
      // fourth argument to show plain message (with no icon)
      
      // changing fourth argument to JOptionPane.ERROR_MESSAGE would result in an "X" image before text
   } 
} // end class Addition


/**************************************************************************
 * (C) Copyright 1992-2014 by Deitel & Associates, Inc. and               *
 * Pearson Education, Inc. All Rights Reserved.                           *
 *                                                                        *
 * DISCLAIMER: The authors and publisher of this book have used their     *
 * best efforts in preparing the book. These efforts include the          *
 * development, research, and testing of the theories and programs        *
 * to determine their effectiveness. The authors and publisher make       *
 * no warranty of any kind, expressed or implied, with regard to these    *
 * programs or to the documentation contained in these books. The authors *
 * and publisher shall not be liable in any event for incidental or       *
 * consequential damages in connection with, or arising out of, the       *
 * furnishing, performance, or use of these programs.                     *
 *************************************************************************/
