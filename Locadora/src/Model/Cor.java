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
public class Cor {
    
    private int corid;
        private String nome;
        
       public void setID (int corid){
           this.corid = corid;
       }
       
       public int getID (){
           return this.corid;
       }
       
       public void setNome (String nome) {
           this.nome = nome;
       }
       
       public String getNome () {
           return this.nome;
       }
    
}
