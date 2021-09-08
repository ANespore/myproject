package controller;

import entitiy.User;

public class Bank {
    private User user;
    public String setAciveUser(User user) {

     this.user = user;
     return "user updated successfully";
    }

    public double getUserBalance(){
        return user.getBalance();
    }


    //adds amount to the current users balance
    public String creditUser (double amount) {
        double newBalance = user.getBalance() + amount ;
        this.user.setBalance(newBalance);
        return amount +  "  euro added to your balance";

    }

    //adds amount to the current users balance
    public String debitUser (double amount) {
        if (user.getBalance() >= amount) {
            double newBalance = user.getBalance() - amount;
            this.user.setBalance(newBalance);
            return amount + "  euro withdrawn from your balance";
        } else {
            return "Insufficient funds " + user.getBalance();
        }
    }


}
