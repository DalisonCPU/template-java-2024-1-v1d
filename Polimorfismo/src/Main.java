import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Pessoa> pessoas = new ArrayList<>();
        Aluno aluno = new Aluno("Jhon doe", 1, "112233", "Desenvolvimento de Sistemas");
        pessoas.add(aluno);
        Professor professor = new Professor("Rafalino", 2, "senhaFraca10", "Design Cultural");
        pessoas.add(professor);

        Estagiario estagiario = new Estagiario("João", 3, "1221", "Desenvolvimento de Sistemas", "2500 pontos");
        pessoas.add(estagiario);


        for(Pessoa p: pessoas) {
            System.out.printf("Nome: %s. Senha: %s.\n", p.getNome(), p.getSenha());
            if(p.getClass() == Aluno.class) {
                Aluno convert = (Aluno) p;
                System.out.println("Curso matriculado: " + convert.getCurso());
            } else if(p.getClass() == Professor.class){
                Professor convert = (Professor) p;
                System.out.println("Área de atuação: " + convert.getArea());
        } else {
                Estagiario convert = (Estagiario) p;
                System.out.println("Curso matriculado: %s. Bolsa ganha: %s.", convert.getCurso(), convert.getBolsa());
            }
        }

    }
}