package model;


public class Deposit extends Transaction{

    //Método construtor
    public Deposit(String name, double value, Balance balance) {
        
        super(name, value, balance);
    }

    //Método herdado para modificar a balança
    @Override
    public void doTransaction() {
        double newBalance = getBalance().getValue() + getValue();
        getBalance().setValue(newBalance);
    }
}
