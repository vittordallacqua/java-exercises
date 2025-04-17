import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {

        List<String> exemploListaString = Arrays.asList("Vittor","Livia","Lais");
        List<Integer> exemploListaInteiros = Arrays.asList(1, 2, 3, 4, 5);
        List<String> exemploListaStringB = new ArrayList<>();

        exemploListaStringB.add("Rua Luiz Gallieri");
        exemploListaStringB.add("Rua Jose Martin");
        exemploListaStringB.add("Rua Bernardo Dombrowski");

        Carro astra = new Carro("Astra", 1990);
        Carro chevette = new Carro("Chevette", 1980);
        Carro kadett = new Carro("Kadett", 1990);

        List<Carro> exemploCarros = new ArrayList<>();

        exemploCarros.add(astra);
        exemploCarros.add(chevette);
        exemploCarros.add(kadett);

        Utilitario.imprimeLista(exemploListaStringB);

        System.out.println("Contagem de carros: " + kadett.getContador());
        kadett.buzina().acenderFarol(2).buzina().acenderFarol(4);
    }
}
