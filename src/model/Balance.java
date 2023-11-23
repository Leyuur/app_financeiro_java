package model;

public class Balance {
   
    //Declaração de atributos
    private int id;
    private int userId ;
    private String name;
    private double value;
    private String month;
    private int year;
    
    //Método construtor
    public Balance(int id, int userId, String name, double value, String month, int year) {
        this.id = id;
        this.userId = userId;
        this.name = name;
        this.value = value;
        this.month = month;
        this.year = year;     
    }
    
    public Balance() {
          
    }
    
    //Retorna Id do objeto
    public int getId(){
    
        return id;
    }
    
    //Retorna o Id do usuário
    public int getUserId(){
    
        return userId;
    }
    
    //Retorna o nome do obejto
    public String getName(){
    
        return name;
    }
    
    //Retorna o valor do objeto
    public double getValue(){
    
        return value;
    }
    
    //Retorna mês do objeto
    public String getMonth(){
    
        return month;
    }
    
    //Retorna ano do objeto
    public int getYear(){
    
        return year;
    }
    
    //Muda o valor do objeto
    public void setValue(double value) {
        this.value = value;
    }
}
