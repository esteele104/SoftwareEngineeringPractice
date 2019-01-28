package edu.ithaca.dragon.bank;

public class BankAccount {

    private String email;
    private double balance;

    /**
     * @throws IllegalArgumentException if email is invalid
     */
    public BankAccount(String email, double startingBalance){
        if (isEmailValid(email)){
            this.email = email;
            this.balance = startingBalance;
        }
        else {
            throw new IllegalArgumentException("Email address: " + email + " is invalid, cannot create account");
        }
    }

    public double getBalance(){
        return balance;
    }

    public String getEmail(){
        return email;
    }

    /**
     * @post reduces the balance by amount if amount is non-negative and smaller than balance
     */
    public void withdraw (double amount)  {
        balance -= amount;

    }

    /**
     *
     * @param email
     * @return boolean true if the email is valid and false if the email is invalid
     * email is valid if it ends with .gov, .com, .org, or .edu AND contains an @ in a position other than the
     * beginning of the string
     */
    public static boolean isEmailValid(String email){
        if(!email.endsWith(".com") && !email.endsWith(".org") && !email.endsWith(".edu") && !email.endsWith(".gov")){
            return false;
        }
         if (email.indexOf('@') == -1 || email.indexOf('@') == 0){
            return false;
        }
        else {
            return true;
        }
    }
}
