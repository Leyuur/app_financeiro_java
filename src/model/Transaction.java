package model;

public abstract class Transaction {
    
    //Declaração de atributos
    private String name;
    private double value;
    private Balance balance;
    
    //Método construtor
    public Transaction(String name, double value, Balance balance){
    
        this.name = name;
        this.value = value;
        this.balance = balance;
    }
    
    //Método abstrato que será herdado
    public abstract void doTransaction();
    
    //Retorna a balança
    public Balance getBalance(){
    
        return balance;
    }
    
    public int getBalanceId(){
    
        return balance.getId();
    }
    
    //Retorna o valor
    public double getValue(){
    
        return value;
    }
    
    //Retorna o nome
    public String getName(){
    
        return name;
    }
}
