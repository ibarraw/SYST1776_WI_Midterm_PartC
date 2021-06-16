/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package midtermreviewcodeforpartc;

import java.util.Scanner;

/**
 * The signIn page for UnoOnline.
 * Takes in a user name and password and then
 * validates the password before creating a new user in the list
 * of possible users. To be used as the beginning code for MidtermReview C.
 *
 * @author dancye, 2019
 * @author William Ibarra modified June 16, 2021
 */
public class UnoOnline {

    private User[] users = new User[100];//the users of the game
    int numUsers = 0;
    /**
     * Main method with call to private run method, to encapsulate our
     * main functionality.
     *
     * @param args - not used
     */
    public static void main (String[] args) {
        UnoOnline unoGame = new UnoOnline();
        unoGame.run();
    }
    
    private void run()
    {
        PasswordValidator validate = new PasswordValidator();
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your desired user name: ");
        String username = input.nextLine();
        System.out.println("Please enter your desired password");
        String password = input.nextLine();

        validate.verifyPassword(username, password);

        while (!(validate.isValidPassword())) { //while isValidPassword() is false
            validate.printErrorPasswordValidation();
            System.out.println("Please enter your desired user name: ");
            String username2 = input.nextLine();
            System.out.println("Please enter your desired password");
            String password2 = input.nextLine();
            validate.verifyPassword(username2, password2);
            if (validate.isValidPassword()) { //I don't think this is needed
                break;
            }
        }//loop only ends when password is valid so now we create the User
        User newUser = new User(validate.getUserName(), validate.getPassword());
        System.out.println("New User Added");
        System.out.println("UserName: " + validate.getUserName());
        System.out.println("Password: just kidding can't show password");
        users[numUsers] = newUser;
        numUsers++;
    }//end run method
}//end class
