import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Pessoa> pessoas = new ArrayList<Pessoa>();

        Fornecedor fornecedor = new Fornecedor("Atacadão de pedra", 10, "1122", 10);
        Cliente cliente = new Cliente("William", 20, "123321", 0);
        cliente.compra(fornecedor, 2);
//        Aluno a = new Aluno("Dalison", 1, "1234", "Desenvolvimento de Sistemas");
//        a.fazerMatricula("Mecânico");
//        pessoas.add(a);
//
//        Professor professor = new Professor("Lucas", 2, "1357", "Sistemas");
//        pessoas.add(professor);
//        Aluno a2 = new Aluno("Flash", 3, "2468", "React a Vídeos de K Pop");
//        pessoas.add(a2);
//        Professor professor2 = new Professor("Jack", pessoas.size() + 1, "000", "Spring");
//        pessoas.add(professor2);
//        for(Pessoa p: pessoas) {
//            System.out.printf("Nome: %s. Senha: %s.\n", p.getNome(), p.getSenha());
//            if(p.getClass() == Aluno.class) {
//                Aluno convert = (Aluno) p;
//                System.out.println("Curso matriculado: " + convert.getCurso());
//            } else  {
//                Professor convert = (Professor) p;
//                System.out.println("Área de atuação: " + convert.getArea());
            //}
        //}
    }
}