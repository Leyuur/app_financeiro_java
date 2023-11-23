package dao;

import java.sql.ResultSet;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import model.Deposit;

public class DepositDAO {
    
    private final Connection connection;

    public DepositDAO(Connection connection) {
	
        this.connection = connection;
    }
    
    public void insert(Deposit deposit) throws SQLException {
	
        String sql = ("insert into deposito (nome, valor, balanca_id) values ('" + deposit.getName() + "', '"+ deposit.getValue() + "', '" + deposit.getBalanceId() + "');");

        PreparedStatement statement = connection.prepareStatement(sql);

        statement.execute();
        
        connection.close();
    }
    
    public void delete(Deposit deposit) throws SQLException {
	
        String sql = ("DELETE FROM deposito WHERE nome = '" + deposit.getName() + "'" + " AND valor = " + "'" + deposit.getValue() + "'");

        PreparedStatement statement = connection.prepareStatement(sql);

        statement.execute();
        
        connection.close();
    }
}
