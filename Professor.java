public class Professor extends Autenticavel{

    private String materia;
    private double salario;
    
    public void setMateria(String materia) {
        this.materia = materia;
    }

    public String getMateria() {
        return materia;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public double getSalario() {
        return salario;
    }

    public boolean autenticaSenha(int senha){
        if (this.getSenha() == senha){
            System.out.println("Bem Vindo Professor!");
            return true;
        } else {
            System.out.println("Quem é você??");
            return false;
        }
    }
}
