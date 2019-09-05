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
public class Telefone {
    
     private int telefoneid, clienteid;
        private String numero, ddd;
        
       public void setID (int telefoneid) {
           this.telefoneid = telefoneid;
       }
       
       public int gettelefoneid () {
           return this.telefoneid;
       }
       
       public void setid (int clienteid) {
           this.clienteid = clienteid;
       }
       
       public int getclienteid () {
           return this.clienteid;
       }
       
       public void setnumero (String numero) {
           this.numero = numero;
       }
       
       public String getnumero () {
           return this.numero;
       }
       
       public void setddd (String ddd){
           this.ddd = ddd;
       }
       
       public String getddd(){
           return this.ddd;
       }
}
