/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Login;

/**
 *
 * @author Vítor
 */
public class Credenciais {

    private String usuario;
    private String senha;
    private String servidor;
    
    public Credenciais(){
        
        usuario = "";
        senha = "";
        servidor = "";
        
    }

    public Boolean isNull() {

        if (usuario.equals("") || senha.equals("") || servidor.equals("")) {
            System.out.println("Alguns campos não foram preenchidos. Favor preencher todos os campos");
            return Boolean.TRUE;
        } else {
            return Boolean.FALSE;
        }

    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getServidor() {
        return servidor;
    }

    public void setServidor(String servidor) {
        this.servidor = servidor;
    }

}
