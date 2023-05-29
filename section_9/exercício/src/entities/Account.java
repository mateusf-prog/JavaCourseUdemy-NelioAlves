package entities;

public class Account {
    private int number;
    private String holder;
    private double balance;

    // construtor que aceita um deposito inicial
    public Account(int number, String holder, double initDep) {
        this.number = number;
        this.holder = holder;
        deposit(initDep); // passando o deposito inicial para o saldo
    }

    // construtor que obriga aceita um deposito inicial
    public Account(int number, String holder) {
        this.number = number;
        this.holder = holder;
    }

    // mudar o nome do titular da conta
    public void setName(String holder) {
        this.holder = holder;
    }

    // retornar o nome do titular da conta
    public String getName() {
        return holder;
    }

    // retornar o numero da conta
    public int getNumber() {
        return number;
    }

    // retornar o saldo da conta
    public double getBalance() {
        return balance;
    }

    // depositar
    public void deposit(double ammount) {
        balance += ammount;
    }

    // sacar
    public void withdraw(double ammount) {
        balance -= ammount + 5;
    }

    // retorna o objeto em forma de string
    public String toString() {
        return "Account holder: " + number 
        + ", Holder: " + holder 
        + ", Balance: " + String.format("%.2f", balance);
    }    
}