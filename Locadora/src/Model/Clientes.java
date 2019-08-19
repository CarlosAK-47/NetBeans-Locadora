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
public class Clientes {
 
    private int clienteid;
     private String  rg, cpf, estado, cidade, cep;
     
     public void setID (int clienteid) {
         this.clienteid = clienteid;
     }
     
     public int getID () {
         return this.clienteid;
     }
     
     public void setrg (String rg) {
         this.rg = rg;
     }
     
     public String getrg() {
         return this.rg;
     }
     
     public void setcpf (String cpf){
         this.cpf = cpf;
     }
     
     public String getcpf (){
         return this.cpf;
     }
     
     public void setestado (String estado){
         this.estado = estado;
     }
     
     public String getestado () {
         return this.estado;
     }
     
     public void setcidade (String cidade) {
         this.cidade = cidade;
     }
     
     public String getcidade (){
         return this.cidade;
     }
     
     public void setcep (String cep) {
         this.cep = cep;
     }
     
     public String getcep () {
         return this.cep;
     }
}
