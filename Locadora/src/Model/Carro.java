/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author aluno
 */
public class Carro {
    
     private int carroid;
        private String marca, placa, cor, modelo;
        
        
public void setID(int carroid){
              this.carroid = carroid;
}
    
    
public int getID(){
              return this.carroid;
} 
    
    
public void setmarca(String marca){
              this.marca = marca;
    }
    
    public String getmarca(){
              return this.marca;
}         
 
public void setPlaca(String placa){
              this.placa = placa;
    }
    
    public String getPlaca(){
              return this.placa;
    }  
    
    public void setcor (String cor){
        this.cor = cor;
    }
    
    public String getcor (){
        return this.cor;
    }
    
    public void setmodelo (String modelo){
        this.modelo = modelo;
    }

    public String getModelo() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String getCor() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String getMarca() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void setId(int parseInt) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void setCor(String string) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void setMarca(String string) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void setModelo(String string) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public Object getId() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
