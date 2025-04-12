import java.util.ArrayList;

public class Main {
  public static void main(String[] args) {

    ContaBancaria vittor = new ContaBancaria("Vittor", 10);
    ContaBancaria lucas = new ContaBancaria("Lucas", 50);

    vittor.depositar(150000);
    lucas.depositar(5);

    /*
     * System.out.println("Saldo Vittor: " + vittor.getSaldo());
     * System.out.println("Saldo Lucas: " + lucas.getSaldo());
     */

    vittor.sacar(150);
    lucas.sacar(20);

    /*
     * System.out.println("Saldo Vittor: " + vittor.getSaldo());
     * System.out.println("Saldo Lucas: " + lucas.getSaldo());
     */
    ArrayList<ContaBancaria> contas = new ArrayList<>();

    contas.add(vittor);
    contas.add(lucas);

    for (int i = 0; i < contas.size(); i++) {
      System.out
          .println("\nTitular: " + contas.get(i).getTitular() + "\nSaldo: R$" + contas.get(i).getSaldo());
    }

  }
}
