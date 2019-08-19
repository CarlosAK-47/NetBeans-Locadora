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
public class Modelo {
    
    private int modeloid;
        private String nome;
    
    public void setID(int modeloid){
              this.modeloid = modeloid;
    }
    
    
    public int getID(){
              return this.modeloid;
    } 
    
    
    public void setNome(String nome){
              this.nome = nome;
    }
    
    public String getNome(){
              return this.nome;
          } 
    
}
