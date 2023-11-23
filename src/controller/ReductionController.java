package controller;

import java.sql.Connection;
import java.sql.SQLException;
import javax.swing.JOptionPane;

import dao.Conexao;

import dao.ReductionDAO;
import model.Reduction;


public class ReductionController {
    
    
    public static void newReduction(Reduction reduction){
	
        try{
            
            Connection conexao = new Conexao().getConnection();
            ReductionDAO reductiondao = new ReductionDAO(conexao);    
            reductiondao.insert(reduction);
            
            JOptionPane.showMessageDialog(null, "Nova Redução Registrada com Sucesso!", "Redução", JOptionPane.INFORMATION_MESSAGE);
        }
        catch (SQLException e) {

            JOptionPane.showMessageDialog(null, "Erro ao registrar saldo no banco de dados: " + e.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);     
        }       
    }
    
    public static void DeleteReduction(Reduction reduction){
	
        try{
        
            Connection conexao = new Conexao().getConnection();
            ReductionDAO reductiondao = new ReductionDAO(conexao);    
            reductiondao.delete(reduction);
            JOptionPane.showMessageDialog(null, "Saldo Deletado", "Redução", JOptionPane.INFORMATION_MESSAGE);
        }
        catch (SQLException e) {

            JOptionPane.showMessageDialog(null, "Erro ao registrar saldo no banco de dados: " + e.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
            System.out.println(e.getClass());
        }       
    }
}
