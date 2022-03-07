public abstract class Autenticavel {
    private String nome;
    private String cpf;
    private int senha;

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getCpf() {
        return cpf; 
    }

    public void setSenha(int senha) {
        this.senha = senha;
    }

    public int getSenha() {
        return senha;
    }

}
