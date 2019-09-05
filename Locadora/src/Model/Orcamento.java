/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.Date;

/**
 *
 * @author Aluno
 */
public class Orcamento {
    
    private int orcamentoid;
        private Date datainicio, datatermino;
        private float valordiaria, valortotal;
        
        public void setID(int orcamentoid){
              this.orcamentoid = orcamentoid;
        }
          
        public int getID(){
              return this.orcamentoid;
        } 
    
        public void setdatainicio(Date datainicio){
              this.datainicio = datainicio;
        }
          
        public Date getdatainicio(){
              return this.datainicio;
        }
        
        public void setdatatermino(Date datatermino){
              this.datatermino = datatermino;
        }
          
        public Date getdatatermino(){
              return this.datatermino;
        }  
        
        public void setvalordiaria(float valordiaria){
              this.valordiaria = valordiaria;
        }
          
        public float getvalordiaria(){
              return this.valordiaria;
        } 
        
        public void setvalortotal(float valortotal){
              this.valortotal = valortotal;
        }
          
        public float getvalortotal(){
              return this.valortotal;
        }
}
