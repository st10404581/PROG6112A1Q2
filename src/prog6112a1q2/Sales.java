/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prog6112a1q2;

/**
 *
 * @author Hameed
 */

//THE CLASS Sales IS THE PARENT CLASS
public class Sales {
    
    //amount IS DECLAIRED AS PRIVATE FOR INFORMATION HIDING
    private String amount;

    public Sales(String amount) {
            this.amount = amount;
    }

    public String getAmount() {
        return amount;
    }

    //VALIDATING INPUT FROM THE USER
    //-----------------------------------------------------------------------------------------
    //THIS METHOD CHECKS IF THE AMOUNT ENTERED BY THE USER IS NOT A NEGATIVE NUMBER
    //IT WILL RETURN true IF IT IS GREATER THAN 0 AND false IF IT ISNT
    public static boolean isValidAmount(String amount) {
        try {
            int num = Integer.parseInt(amount);
            return num >= 0;
        } catch (NumberFormatException e) {
            return false;
        }
    }
    
    //THIS METHOD CHECKS IF THE AMOUNT ENTERD BY THE USER CONTAINS ANY SPECIAL CHARACTERS
    //IT WILL RETURN true IF IT DOESNT AND false IF IT DOES
    public static boolean containsSpecialChar(String amount) {
        return !amount.matches("^[a-zA-Z]*$");
    }

    //THIS METHOD CHECKS IF THE AMOUNF ENTERED BY THE USER IS ONLY NUMBERS
    //IF IT IS ONLY NUMBERS THEN IT WILL RETURN true IF IT ISNT IT WILL RETURN FALSE
    public static boolean isAllNumbers(String amount) {
        return amount.matches("^[0-9]*$");
    }
}
