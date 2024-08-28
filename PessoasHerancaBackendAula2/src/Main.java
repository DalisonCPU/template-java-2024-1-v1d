import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {

        //ArrayList<Estudante> estudantes = new ArrayList<>();

        //estudantes.add(new Estudante("Yume", 25, 226, "Desenvolvimento de sistemas"));
        //estudantes.add(new Estudante("David", 26, 223, "Desenvolvimento de Sistemas"));

        //Collections.sort(estudantes);

        ArrayList<Pessoa> pessoas = new ArrayList<>();
        pessoas.add(new Pessoa("David", 20));
        pessoas.add(new Pessoa("Yume", 23));
        pessoas.add(new Pessoa("João", 20));
        pessoas.add(new Pessoa("Beatriz", 30));
        Collections.sort(pessoas, new PessoaPorValores());
        Collections.sort(pessoas, new PessoaPorIdade());

        for(Pessoa pessoa: pessoas) {
            System.out.println(pessoa.getNome()+": " + pessoa.getIdade()+" anos.");
        }
    }
}