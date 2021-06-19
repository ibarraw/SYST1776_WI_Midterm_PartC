package midtermreviewcodeforpartc;
/**
 * PasswordValidator class will check if a password is valid, otherwise display
 * an error
 * <p>
 * My design choices for PasswordValidator effectively increase OOP design by
 * promoting security and re-usability. Examples are as follows:
 * <p>
 * 1. The code is safely hidden from other classes and can only be accessed by
 * PasswordValidator objects.
 * 2. verifyPassword() will require minimal changes if different restrictions
 * are set
 * 3. printValidationError() can be easily changed if a new error is to be
 * printed
 * 4. isValidPassword() returns true if password is validated, else returns
 * false
 * 5. PasswordValidator is strictly for password management, therefore it is
 * loosely coupled with User or UnoOnline
 * 6.PasswordValidator has high cohesion with the other classes. It will store
 * and manage passwords for UnoOnline, while User will strictly handle user
 * creation and maintenance.
 *
 * @author William Ibarra June 16, 2021
 */
public class PasswordValidator {
    private String password;
    private boolean validPassword;

    //for the length of the password, if the password contains a special character then set instance variable validPassword to true; else set to false.
    public void verifyPassword (String password) {
        int specialCharCount = 0;
        for (int i = 0; i < password.length(); i++) {
            if (!(Character.isLetterOrDigit(password.charAt(i)))) {
                specialCharCount++;
            }
        }
        if (specialCharCount > 0 && password.length() > 7) {

            this.validPassword = true;
            this.password = password;
        }
        else {
            this.validPassword = false;
        }
    }

    //prints an error if instance variable validPassword is 
    public void printValidationError () {
        if (this.validPassword == false) {
            System.out.println("Error creating account. Passwords must have at least 8 characters.");
            System.out.println("Passwords must have at least one special character\n");
        }
    }

    public String getPassword () {
        return password;
    }

    public void setPassword (String password) {
        this.password = password;
    }

    public boolean isValidPassword () {
        return validPassword;
    }

    public void setValidPassword (boolean validPassword) {
        this.validPassword = validPassword;
    }





}
