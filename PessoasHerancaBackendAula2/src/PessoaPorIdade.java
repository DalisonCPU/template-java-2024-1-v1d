import java.util.Comparator;

public class PessoaPorIdade implements Comparator<Pessoa> {

    @Override
    public int compare(Pessoa p1, Pessoa p2) {
        return Integer.compare(p1.getIdade(), p2.getIdade());
    }

}
