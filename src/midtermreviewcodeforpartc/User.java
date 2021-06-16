/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package midtermreviewcodeforpartc;

/**
 * A class that models a User for Uno Online.
 * The user has a name and a password.
 *
 * @author dancye, 2019
 * @author William Ibarra modified June 16, 2021
 */
public class User {
    
    private String name;
    private String password;
    private int userCount = 0;
    private static int nextUserID;

    /**
     * a constructor that takes in the user's name and password
     *
     * @param givenName
     * @param givenPass
     */
    public User (String givenName, String givenPass) {
        name = givenName;
        password= givenPass;
        //User addUser = new User(givenName, givenPass);
       // for (int i = 0; i < this.users.length; i++) {
         //   users[i] = addUser;
          //  this.userCount = User.nextUserID;
           // userCount++;
        //}
    }

    /** The getter for the user name
     *
     * @return the name
     */
    public String getName () {
        return name;
    }

    /**
     * The setter for the user name
     *
     * @param givenName the name to set
     */
    public void setName (String givenName) {
        name = givenName;
    }

    /**
     * The getter for the password
     *
     * @return the password
     */
    public String getPassword () {
        return password;
    }

    /**
     * A setter for the password
     *
     * @param givenPass
     */
    public void setPassword (String givenPass) {
        password = givenPass;
    }
/**
    public User[] getUsers () {
        return users;
    }

    public void setUsers (User[] users) {
        this.users = users;
    }
**/
    public int getUserCount () {
        return userCount;
    }

    public void setUserCount (int userCount) {
        this.userCount = userCount;
    }
    
   


}
