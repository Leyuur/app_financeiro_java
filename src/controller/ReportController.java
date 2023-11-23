package controller;

import dao.Conexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.ResultSet;
import java.util.ArrayList;
import view.BalanceScreen;
import static view.DepositScreen.choice1;
import model.Transaction;

public class ReportController {
    
    public int index = 0;
    
    public static ArrayList<Double> reportValues = new ArrayList<>();
    public static double balanceValue = 0;
    
    public static void valuesDeposit(int i){ 
        
        try {
            Connection conexao = new Conexao().getConnection();
            
            String sql = "SELECT valor from deposito WHERE balanca_id = " + i;
            
            PreparedStatement statement = conexao.prepareStatement(sql);

            ResultSet resultSet = statement.executeQuery();
            
            
            while (resultSet.next()) {
               
                reportValues.add(resultSet.getDouble("valor"));
                balanceValue += resultSet.getDouble("valor");
            }
        } catch (SQLException ex) {
            Logger.getLogger(BalanceScreen.class.getName()).log(Level.SEVERE, null, ex);
        }   
    }
    
    public static void valuesReduction(int i){ 
        
        try {
            Connection conexao = new Conexao().getConnection();
            
            String sql = "SELECT valor from reducao WHERE balanca_id = " + i;
            
            PreparedStatement statement = conexao.prepareStatement(sql);

            ResultSet resultSet = statement.executeQuery();
            
            
            while (resultSet.next()) {
               
                reportValues.add(resultSet.getDouble("valor") - (resultSet.getDouble("valor") * 2));
                balanceValue -= resultSet.getDouble("valor");
            }
        } catch (SQLException ex) {
            Logger.getLogger(BalanceScreen.class.getName()).log(Level.SEVERE, null, ex);
        }   
    }
}
