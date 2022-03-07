public class testeEscola {
    public static void main(String[] args) {
        Alunos aluno = new Alunos();
        Professor prof = new Professor();

        aluno.setSenha(1234);
        prof.setSenha(4321);

        System.out.println(aluno.autenticaSenha(1234)); //intencionalmente usando a senha certa pra retornar true
        System.out.println(prof.autenticaSenha(1234)); //intencionalmente usando a senha errada pra retornar false
    }  
    
}
