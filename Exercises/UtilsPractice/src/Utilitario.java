import java.util.List;

public class Utilitario {
  public static void imprimeLista(List<?> lista) {
    for (Object frase : lista) {
      System.out.println(frase);
    }
  }
}
