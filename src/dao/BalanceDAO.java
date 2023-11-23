package dao;

import java.sql.ResultSet;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import model.Balance;

public class BalanceDAO {
    
    private final Connection connection;

    public BalanceDAO(Connection connection) {
	
        this.connection = connection;
    }
    
    public void insert(Balance balance) throws SQLException {
	
        String sql = ("insert into balanca (id, user_id, nome, valor, mes, ano) values ('" + balance.getId() + "', '"+ balance.getUserId() + "', '" + balance.getName() + "', '" + balance.getValue() + "', '" + balance.getMonth() +"', '" + balance.getYear() + "');");

        PreparedStatement statement = connection.prepareStatement(sql);

        statement.execute();
        
        connection.close();
    }
    
    public void delete(Balance balance) throws SQLException {
	
        String sql = ("DELETE FROM balanca WHERE id = " + balance.getId());
        PreparedStatement statement = connection.prepareStatement(sql);
        statement.execute();
        
        sql = ("DELETE FROM deposito WHERE balanca_id = " + balance.getId());
        statement = connection.prepareStatement(sql);
        statement.execute();
        
        sql = ("DELETE FROM reducao WHERE balanca_id = " + balance.getId());
        statement = connection.prepareStatement(sql);
        statement.execute();
        
        connection.close();
    }
    
    public void setbalance(Balance balance, double value) throws SQLException {
	
        String sql = ("UPDATE balanca SET valor = '" + value + "' WHERE id = '" + balance.getId() + "';");

        PreparedStatement statement = connection.prepareStatement(sql);

        statement.execute();
        
        connection.close();
    }
}
