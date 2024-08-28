import java.util.Comparator;

public class PessoaPorValores implements Comparator<Pessoa> {
    public int compare(Pessoa p1, Pessoa p2) {
//        if (Integer.compare(p1.getIdade(), p2.getIdade()) <= 0)
            return p1.getNome().compareTo(p2.getNome());
//        else
//            return 1;
    }
}
