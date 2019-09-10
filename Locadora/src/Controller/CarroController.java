/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.Carro;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author aluno
 */
public class CarroController {
    
    public void insert (Carro c) throws SQLException{
        try (PreparedStatement stmt = bd.getConn().PrepareStatement("INSERT INTO carro (modelo, cor, marca, placa) VALUES (?, ?, ?, ?)")) {
            stmt.setString(1, c.getModelo());
            stmt.setString(2, c.getCor());
            stmt.setString(3, c.getMarca());
            stmt.setString(4, c.getPlaca());
            
            stmt.execute();
        }        
        
    }
    
    public void update (Carro c){
        
    }
    
    public void delete (Carro c){
        
    }
    
    public Carro getById (int id) throws SQLException {
        Carro c = new Carro();
        
        PreparedStatement stmt;
        stmt = bd.getConn().prepareStatement("SELECT * FROM carro WHERE id = ? ");
        stmt.setInt(1, id);
        
        return c;
    }

    public void insert(View.Carro c) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
}
