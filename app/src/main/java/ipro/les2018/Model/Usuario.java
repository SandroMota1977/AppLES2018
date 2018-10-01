package ipro.les2018.Model;

public class Usuario {
    private String email;
    private String senha;
    private String tipo; //pode ser pessoa_fisica(cliente),profissional  (ou pessoa_juridica futuramente)

    public Usuario(){
        this.email = "noemail@nodomain.com";
        this.senha = "noPass";
        this.tipo = "pessoa_fisica";
    }

    public Usuario(String email, String senha,String tipo) {
        this.email = email;
        this.senha = senha;
        this.tipo = tipo;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return this.email;
    }
}
