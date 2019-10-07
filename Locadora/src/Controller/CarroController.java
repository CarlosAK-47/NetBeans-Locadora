/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.Carro;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author aluno
 */
public class CarroController {
    
    private Conexao bd;
    
     public CarroController() throws SQLException, ClassNotFoundException {
        
        this.bd = new Conexao();        
    }  
    
    public void insert (Carro c) throws SQLException{
        
        PreparedStatement stmt = bd.getConn().prepareStatement("INSERT INTO carro (modelo, cor, marca, placa) VALUES (?,?, ?, ? )");
                
        stmt.setString(1, c.getModelo());
        stmt.setString(2, c.getCor());
        stmt.setString(3, c.getMarca());
        stmt.setString(4, c.getPlaca());
          
        stmt.execute();      
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
    
    public ArrayList<Carro> getAllRows() throws SQLException {
     
        ArrayList<Carro> lista_carros = new ArrayList<Carro>();
        
        PreparedStatement stmt = bd.getConn().prepareStatement("SELECT * FROM carro ");
        
        ResultSet rs = stmt.executeQuery();

        while (rs.next()) {

            Carro c = new Carro();
            
            c.setId(Integer.parseInt(rs.getString("id")));
            c.setCor(rs.getString("cor"));
            c.setMarca(rs.getString("marca"));
            c.setModelo(rs.getString("modelo"));
            c.setPlaca(rs.getString("placa"));

            lista_carros.add(c);
        }

        stmt.close();
        
        return lista_carros;        
    }
    
    
    
}
