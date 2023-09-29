/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prog6112a1q2;

/**
 *
 * @author Hameed
 */

//CLASS SalesAndName IS THE CHILD CLASS
public class SalesAndName extends Sales {

    //Sales sl = new Sales();
    
    private String name;

    public SalesAndName(String name, String amount) {
        super(amount);
        this.name = name;
    }

    public String getName() {
        return name;
    }
    
    //VALIDATING INPUT FROM THE USER
    //THIS METHOD CHECKS IF THE NAME THE USER HAS ENETERED ONLY CONTAINS LETTERS
    //IF IT ONLY CONTAINS LETTER IT WILL RETURN true ELSE IT WILL RETURN false
    public static boolean containsOnlyLetters(String name){
        boolean onlyLetters = false;
        if (name.matches("[a-zA-Z]+")) {
            onlyLetters = true;
        }
        return onlyLetters;
    }
    
    //THIS METHOD CHECKS IF THE NAE THE USER HAS ENTERED HAS ANY SPECIAL CHARACTERS
    //IF IT DOES HAVE SPECIAL CHARACTERS THEN IT WILL RETURN false ELSE IT WILL RETURN TRUE
    public static boolean containsSpecialChar(String name){
        boolean specialCharCheck = false;
        if (!name.matches("[a-zA-Z]+")) {
            specialCharCheck = false;
        }
        return specialCharCheck;
    }
}
