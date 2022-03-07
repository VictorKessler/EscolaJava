public class Alunos extends Autenticavel implements AutenticaPessoas{

    private int turma;
    private float media;

    public void setTurma(int escola) {
        this.turma = escola;
    }

    public int getTurma() {
        return turma;
    }

    public void setMedia(float media) {
        this.media = media;
    }

    public float getMedia() {
        return media;
    }
    
    public boolean autenticaSenha(int senha){
        if (this.getSenha() == senha){
            System.out.println("Bem vindo Aluno!");
            return true;
        } else {
            System.out.println("Quem é você??");
            return false;
        }
    }
    
}
