import java.util.ArrayList;

public class Main {

  public static void main(String[] args) {
    /*
     * Pessoa p1 = new Pessoa(12345, "Vittor");
     * Pessoa p2 = new Pessoa(67890, "Livia");
     * 
     * 
     * System.out.println("O RG é: " + p1.getRg());
     * System.out.println("O nome é: " + p1.getNome());
     * 
     * p1.setRg(515069);
     * p1.setNome("Dallacqua");
     * 
     * System.out.println("O RG é: " + p1.getRg());
     * System.out.println("O nome é: " + p1.getNome());
     * 
     * System.out.println("O RG é: " + p2.getRg());
     * System.out.println("O nome é: " + p2.getNome());
     * 
     * ArrayList<Pessoa> ar = new ArrayList<>();
     * ar.add(p1);
     * ar.add(p2);
     * 
     * for (int i = 0; i < ar.size(); i++) {
     * System.out.println(ar.get(i).getNome());
     * }
     */

    Funcionario vittor = new Funcionario(2305, "Desenvolvedor", "Vittor", 515069);
    Funcionario livia = new Funcionario(6910, "Designer", "Lívia", 985641);
    Funcionario lais = new Funcionario(4159, "Veterinária", "Laís", 874596);

    /*
     * System.out.println("Nome do Funcionário: " + vittor.getNome());
     * System.out.println("Matrícula: " + vittor.getNumeroMatricula());
     * System.out.println("Cargo: " + vittor.getCargo());
     * System.out.println("RG: " + vittor.getRg());
     */

    ArrayList<Funcionario> fn = new ArrayList<>();

    fn.add(vittor);
    fn.add(livia);
    fn.add(lais);

    for (int i = 0; i < fn.size(); i++) {
      System.out.println("Nome: " + fn.get(i).getNome());
      System.out.println("Matrícula: " + fn.get(i).getNumeroMatricula());
      System.out.println("Cargo: " + fn.get(i).getCargo());
      System.out.println("RG: " + fn.get(i).getRg());
      System.out.println("\n");
    }
  }
}