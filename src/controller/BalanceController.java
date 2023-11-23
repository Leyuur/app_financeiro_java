package controller;

import java.sql.Connection;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import dao.Conexao;


import model.Balance;
import dao.BalanceDAO;


public class BalanceController {
    
    public static void newBalance(int id, int userId, String name, double value, String month, int year){
        
        Balance balance = new Balance(id, userId, name, value, month, year);
	
        try{
        
            Connection conexao = new Conexao().getConnection();
            BalanceDAO balancedao = new BalanceDAO(conexao);    
            balancedao.insert(balance);
            JOptionPane.showMessageDialog(null, "Novo Saldo Registrado com Sucesso!", "Redução", JOptionPane.INFORMATION_MESSAGE);
        }
        catch (SQLException e) {

            JOptionPane.showMessageDialog(null, "Erro ao registrar saldo no banco de dados: " + e.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
        }       
    }
    
    public static void DeleteBalance(Balance balance){
	
        try{
        
            Connection conexao = new Conexao().getConnection();
            BalanceDAO balancedao = new BalanceDAO(conexao);    
            balancedao.delete(balance);
            JOptionPane.showMessageDialog(null, "Saldo Deletado", "Redução", JOptionPane.INFORMATION_MESSAGE);
        }
        catch (SQLException e) {

            JOptionPane.showMessageDialog(null, "Erro ao registrar saldo no banco de dados: " + e.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
        }       
    }
    
    public static void setBalance(Balance balance, double value){
	
        try{
        
            Connection conexao = new Conexao().getConnection();
            BalanceDAO balancedao = new BalanceDAO(conexao);    
            balancedao.setbalance(balance, value);
            JOptionPane.showMessageDialog(null, "Saldo Deletado", "Redução", JOptionPane.INFORMATION_MESSAGE);
        }
        catch (SQLException e) {

            JOptionPane.showMessageDialog(null, "Erro ao registrar saldo no banco de dados: " + e.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
        }       
    }
}
