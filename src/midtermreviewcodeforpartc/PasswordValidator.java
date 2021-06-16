package midtermreviewcodeforpartc;
/**
 * PasswordValidator class will check if a password is valid, otherwise display
 * an error
 *
 * @author William Ibarra June 16, 2021
 */
public class PasswordValidator {
    private String userName;
    private String password;
    private boolean validPassword;


    public void verifyPassword (String userName, String password) {
        this.userName = userName;
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

    public void printErrorPasswordValidation () {
        if (this.validPassword == false) {
            System.out.println("Error creating account. Passwords must have at least 8 characters.");
            System.out.println("Passwords must have at least one special character");
        }
    }

    public String getUserName () {
        return userName;
    }

    public void setUserName (String userName) {
        this.userName = userName;
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
