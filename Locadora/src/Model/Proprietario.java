/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author Aluno
 */
public class Proprietario {
    
    private int usuarioid;
        private String cpf, endereco, telefone, cadastro;
        
        public void setID(int usuarioid){
              this.usuarioid = usuarioid;
        }
          
        public int getID(){
              return this.usuarioid;
        } 
        
        public void setcpf(String cpf){
              this.cpf = cpf;
        }
          
        public String getcpf(){
              return this.cpf;
        } 
        
        public void setEndereco(String endereco){
              this.endereco = endereco;
        }
          
        public String getendereco(){
              return this.endereco;
        } 
        
        public void settelefone(String telefone){
              this.telefone = telefone;
        }
          
        public String gettelefone(){
              return this.telefone;
        }
        
        public void setcadastro (String cadastro){
            this.cadastro = cadastro;
        }
        
        public String getcadastro (){ 
            return this.cadastro;
        }
}
