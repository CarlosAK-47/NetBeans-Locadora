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
public class Veiculo {
    
     private int veiculoid;
        private String cadastro, placa;
        
        
public void setID(int veiculoid){
              this.veiculoid = veiculoid;
}
    
    
public int getID(){
              return this.veiculoid;
} 
    
    
public void setCadastro(String cadastro){
              this.cadastro = cadastro;
    }
    
    public String getCadastro(){
              return this.cadastro;
}         
 
public void setPlaca(String placa){
              this.placa = placa;
    }
    
    public String getPlaca(){
              return this.placa;
}     
}
