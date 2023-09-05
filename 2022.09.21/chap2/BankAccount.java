
/**
 * Write a description of class BankAccount here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class BankAccount {
    // data field or instance variables
    private String name;
    private int psw;
    private double balance;

    //constructor:(1)same name with the class
    //            (2)initialize instance variables
    public BankAccount() {
        name = "";
        psw = 0;
        balance = 0.0;
    }


    public BankAccount(String n, int p) {
        name = n;
        psw = p;
        balance = 0.0;
    }

    public BankAccount(String n, int p, double c) {
        name = n;
        psw = p;
        balance = c;
    }

    public String getName() {
        return name;
    }

    public int getPsw() {
        return psw;
    }

    public double getBalance() {
        return balance;
    }

    public void setName(String n) {
        name = n;
    }

    public void setPsw(int p) {
        psw = p;
    }

    public void setBalance(double b) {
        balance = b;
    }

}
