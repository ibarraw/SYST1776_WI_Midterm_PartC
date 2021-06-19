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
    } //end main

    private void run () {
        //instantiate PasswordValidator object to set user name and password
        PasswordValidator validate = new PasswordValidator();
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your desired user name: ");
        String name = input.nextLine();
        System.out.println("Please enter your desired password");
        validate.setPassword(input.nextLine());
        validate.verifyPassword(validate.getPassword());

        //while isValidPassword() is false, print password error and ask again for the values
        while (!(validate.isValidPassword())) {
            validate.printValidationError();
            System.out.println("Please enter your desired password");
            validate.setPassword(input.nextLine());
            validate.verifyPassword(validate.getPassword());
        }

        //loop only ends when password is valid so now we create the User
        User newUser = new User(name, validate.getPassword());
        System.out.println("\nNew User Added");
        System.out.println("UserName: " + name);
        System.out.println("Password: just kidding can't show password");
        users[numUsers] = newUser;
        numUsers++;
    }//end run method
}//end class
