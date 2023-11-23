package controller;

import java.sql.Connection;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import dao.Conexao;


import model.Deposit;
import dao.DepositDAO;
import model.Deposit;


public class DepositController {
    
    
    
    public static void newDeposit(Deposit deposit){
	
        try{
            
            Connection conexao = new Conexao().getConnection();
            DepositDAO depositdao = new DepositDAO(conexao);    
            depositdao.insert(deposit);
            
            JOptionPane.showMessageDialog(null, "Novo Depósito Registrado com Sucesso!", "Depósito", JOptionPane.INFORMATION_MESSAGE);
        }
        catch (SQLException e) {

            JOptionPane.showMessageDialog(null, "Erro ao registrar saldo no banco de dados: " + e.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
        }       
    }
    
    public static void DeleteDeposit(Deposit deposit){
	
        try{
        
            Connection conexao = new Conexao().getConnection();
            DepositDAO depositdao = new DepositDAO(conexao);    
            depositdao.delete(deposit);
            JOptionPane.showMessageDialog(null, "Saldo Deletado", "Redução", JOptionPane.INFORMATION_MESSAGE);
        }
        catch (SQLException e) {

            JOptionPane.showMessageDialog(null, "Erro ao registrar saldo no banco de dados: " + e.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
            System.out.println(e.getClass());
        }       
    }
}
