package dao;

import java.sql.ResultSet;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import model.Reduction;

public class ReductionDAO {
    
    private final Connection connection;

    public ReductionDAO(Connection connection) {
	
        this.connection = connection;
    }
    
    public void insert(Reduction reduction) throws SQLException {
	
        String sql = ("insert into reducao (nome, valor, balanca_id) values ('" + reduction.getName() + "', '"+ reduction.getValue() + "', '" + reduction.getBalanceId() + "');");

        PreparedStatement statement = connection.prepareStatement(sql);

        statement.execute();
        
        connection.close();
    }
    
    public void delete(Reduction reduction) throws SQLException {
	
        String sql = ("DELETE FROM reducao WHERE nome = '" + reduction.getName() + "'" + " AND valor = " + "'" + reduction.getValue() + "'");

        PreparedStatement statement = connection.prepareStatement(sql);

        statement.execute();
        
        connection.close();
    }
}

