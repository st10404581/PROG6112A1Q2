/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package prog6112a1q2;

import java.util.Scanner;

/**
 *
 * @author Hameed
 */
public class PROG6112A1Q2 {

    public static Scanner kb = new Scanner(System.in);

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        references:
        https://www.tutorialspoint.com/java/java_string_matches.htm
        https://www.geeksforgeeks.org/bubble-sort/
        https://www.geeksforgeeks.org/string-matches-method-in-java-with-examples/
        https://stackoverflow.com/questions/26722496/regex-difference-between-a-za-z-vs-a-za-z#:~:text=Matches%20a%20single%20upper%20or,and%20also%20ends%20with%20it.
         */
        displayIntroMsg();
        displayMenu();
    }

    public static void displayIntroMsg() {
        System.out.println("""
                                                Lux Shoe Polish(TM)
                                                SALES MANAGER
                           _____________________________________________________________________________________________""");
    }

    //THIS METHOD IS USED TO DISPLAY THE DIFFERENT OPTIONS THE USER CAN CHOOSE 
    //AND DEPENDING ON THE OPTION THEY CHOSE IT WILL CALL DIFFERENT METHODS AND ASK FOR INOUT
    public static void displayMenu() {
        int userChoice;
        System.out.println("""
                   Please choose from the following options
                   *NB* ONLY ENTER IN THE NUMBER THAT CORRESPONDS WITH THE OPTION YOU ARE GOING TO CHOOSE
                   1 - Enter Sales Generated
                   2 - Enter Money Generated and Employee FirstName
                   3 - Help
                   4 - Exit""");
        userChoice = kb.nextInt();

        // validChoice IS USED TO DETERMINE WHETHER THE INPUT THAT THE USER HAS 
        // ENTERED IS A CORRECT MENU OPTION, IF IT'S VALID = true IF NOT = false
        boolean validChoice = true;

        if (!(userChoice == 1 || userChoice == 2 || userChoice == 3 || userChoice == 4)) {
            validChoice = false;
        }

        // THIS WHILE LOOP IS USED TO REPEATEDLY GET INPUT FROM THE USER WHILE 
        // validChoice IS FALSE
        while (!validChoice) {
            System.out.println("""
                    Error.... Please choose from the following:
                   *NB* ONLY ENTER IN THE NUMBER THAT CORRESPONDS WITH THE OPTION YOU ARE GOING TO CHOOSE
                   1 - Enter Sales Genrated
                   2 - Enter Sales Generated and Employee FirstName
                   3 - Help
                   4 - Exit""");
            userChoice = kb.nextInt();

            // THIS IF STATEMENT IS USED TO CHANGE validChoice TO TRUE IF CORRECT 
            // INPUT IS ENTERED, EXITING THE WHILE LOOP
            if (userChoice == 1 || userChoice == 2 || userChoice == 3 || userChoice == 4) {
                validChoice = true;
            }
        }

        // THIS IF STATEMENT EXECUTES IF validChoice IS TRUE AND CONTAINS A SWITCH 
        // STATEMENT THAT RUNS THE APPROPRIATE CODE BASED ON THE USER'S INPUT
        if (validChoice) {
            //THIS SWTICH CASE DETERMINES WHAT CODE TO EXECUTE DEPENDING ON THE CHOICE THE USER MADE
            switch (userChoice) {
                //CASE 1 DECLARES AN ARRAY CALLES SalesArray, INPUT IS RECEIVED 
                //FROM THE USER AND VALIDATED IN A FOR LOOP THEN PASSED INTO THE ARRAY AND CLASS Sales
                case 1:
                    //GETTING THE ARRAY SIZE
                    System.out.println("You have chosen to only add Sales Generated\n---------------------------------------------------------------------------------------------------------------\nEnter how many items you would like to enter: ");
                    int arraySizeSales = kb.nextInt();
                    //obj array
                    Sales[] SalesArray = new Sales[arraySizeSales];
                    //GETTING INPUT FOR THE ARRAY
                    for (int i = 0; i < arraySizeSales; i++) {
                        System.out.print("Please enter the number of sales the employee has generated: ");
                        String amount = kb.next();
                        //VALIDATING THE INPUT
                        boolean validSalesInput;
                        //VALDIDATION METHODS ARE CALLED FROM THE CLASS Sales 
                        //TO CHECK THE LEGITIMACY OF THE DATA ENTERED
                        if (!Sales.containsSpecialChar(amount) || !Sales.isAllNumbers(amount) || !Sales.isValidAmount(amount)) {
                            validSalesInput = false;
                        } else {
                            validSalesInput = true;
                        }
                        while (validSalesInput == false) {
                            System.out.print("Error... Incorrect input.\nPlease enter the number of sales the employee has generated: ");
                            amount = kb.next();
                            if (Sales.containsSpecialChar(amount) && Sales.isAllNumbers(amount) && Sales.isValidAmount(amount)) {
                                validSalesInput = true;
                            }//END OF IF STATEMENT
                        }//END OF WHILE STATEMENT
                        System.out.println("---------------------------------------------------------------------------------------------------------------");
                        SalesArray[i] = new Sales(amount);
                    }//END OF FOR LOOP FOR ENTERING VALUES
                    //CALLING IN THE METHOD TO SORT THE ARRAY AND DISPLAY INFORMATION
                    SortAndDisplaySales(SalesArray);
                    break;
                //CASE 2 DECLARES AN ARRAY CALLES SalesNameArray, INPUT IS RECEIVED 
                //FROM THE USER AND VALIDATED IN A FOR LOOP THEN PASSED INTO THE ARRAY AND CLASS SalesAndName
                case 2:
                    System.out.println("You have chosen to add Sales Generated and Employee's FirstName\n---------------------------------------------------------------------------------------------------------------\nEnter how many items you would like to enter: ");
                    int arraySizeSalesName = kb.nextInt();
                    SalesAndName[] SalesNameArray = new SalesAndName[arraySizeSalesName];
                    for (int i = 0; i < arraySizeSalesName; i++) {
                        String amount = "";
                        String name = "";

                        //VALIDATING THE INPUT
                        boolean validSalesInput = false;
                        boolean validNameInput = false;

                        while (!validSalesInput) {
                            System.out.println("Please enter the number of sales the employee has generated: ");
                            amount = kb.next();
                            //VALIDATING THE AMOUNT ENTERED BY THE USER
                            if (SalesAndName.containsSpecialChar(amount) || !SalesAndName.isAllNumbers(amount) || !SalesAndName.isValidAmount(amount)) {
                                System.out.println("Error... Incorrect input.");
                            } else {
                                validSalesInput = true;
                            }
                        }

                        while (!validNameInput) {
                            System.out.println("Please enter the employee's first name ONLY: ");
                            name = kb.next();
                            //VALIDATING THE NAME THE USER HAS ENTERED
                            if (!SalesAndName.containsSpecialChar(name) && SalesAndName.containsOnlyLetters(name)) {
                                validNameInput = true;
                            } else {
                                System.out.println("Error... Incorrect input.");
                            }
                        }
                        System.out.println("---------------------------------------------------------------------------------------------------------------");
                        SalesNameArray[i] = new SalesAndName(name, amount);
                    }
                    SortAndDisplaySalesAndName(SalesNameArray);
                    break;
                //CASE 3 CALLS IN THE displayHelpInfo METHOD
                case 3:
                    System.out.println("You have chosen Help");
                    System.out.println("---------------------------------------------------------------------------------------------------------------");
                    displayHelpInfo();
                    break;
                case 4:
                    //CASE 4 TERMINATED THE PROGRAM
                    System.out.println("You have chosen to exit the Program\nTerminating program...");
                    System.exit(0);
                    break;
                default:
                    throw new AssertionError();
            }// END OF SWITCH CASE
        }// END OF IF STATEMENT

    }

    //THIS METHOD IS USED TO DISPLAY INFORMATION ABOUT THE PROGRAM
    public static void displayHelpInfo() {
        System.out.println("""
                           This is a Sales Management program for the Lux Shoe Polish(TM)
                           This program is used to temporarily store information of the amount of sales generated or the amount of sales generated and the employee who made those sales.
                           With this data the program sorts and displays the highest sale made and the lowest sale made
                           And depending on your choice it will only show the sales or the employee tied to those sales""");
        System.out.println("---------------------------------------------------------------------------------------------------------------");
        displayMenu();
    }

    //THIS METHOD IS USED TO SORT THE ARRAY THAT IS BEING PASSED INTO IT AND 
    //DISPLAY THE HIGHEST AND LOWEST AMOUNT OF SALES
    public static void SortAndDisplaySalesAndName(SalesAndName[] SalesNameArray) {
        for (int i = 0; i < SalesNameArray.length - 1; i++) {
            for (int j = 0; j < SalesNameArray.length - 1 - i; j++) {
                if (Integer.parseInt(SalesNameArray[j].getAmount()) > Integer.parseInt(SalesNameArray[j + 1].getAmount())) {
                    SalesAndName temp = SalesNameArray[j];
                    SalesNameArray[j] = SalesNameArray[j + 1];
                    SalesNameArray[j + 1] = temp;
                }
            }
        }
        System.out.println("The highest amount of sales, " + SalesNameArray[SalesNameArray.length - 1].getAmount() + ", were made by " + SalesNameArray[SalesNameArray.length - 1].getName());
        System.out.println("The lowest amount of sales, " + SalesNameArray[0].getAmount() + " were made by " + SalesNameArray[0].getName());
        System.out.println("---------------------------------------------------------------------------------------------------------------");
        displayMenu();
    }

    //THIS METHOD IS USED TO SORT THE ARRAY THAT IS BEING PASSED INTO IT AND 
    //DISPLAY THE HIGHEST AND LOWEST AMOUNT OF SALES AND TO WHICH EMPLOYEE THEY BELONG TO
    public static void SortAndDisplaySales(Sales[] SalesArray) {
        for (int i = 0; i < SalesArray.length - 1; i++) {
            for (int j = 0; j < SalesArray.length - 1 - i; j++) {
                if (Integer.parseInt(SalesArray[j].getAmount()) > Integer.parseInt(SalesArray[j + 1].getAmount())) {
                    Sales temp = SalesArray[j];
                    SalesArray[j] = SalesArray[j + 1];
                    SalesArray[j + 1] = temp;
                }
            }
        }
        System.out.println("Highest amount of sales: " + SalesArray[SalesArray.length - 1].getAmount());
        System.out.println("Lowest amount of sales: " + SalesArray[0].getAmount());
        System.out.println("---------------------------------------------------------------------------------------------------------------");
        displayMenu();
    }

}
