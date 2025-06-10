import java.util.ArrayList;

public class App {
    public static void main(String[] args) {
        Carro c1 = new Carro("Puma GT", 1983);
        Carro c2 = new Carro("Porsche 911 GT-3", 2025);

        /*
         * System.out.println("O modelo é: " + c1.getModelo());
         * System.out.println("O ano é: " + c1.getAno());
         * c1.exibirVelocidade();
         * 
         * System.out.println("\nO modelo é: " + c2.getModelo());
         * System.out.println("O ano é: " + c2.getAno());
         * c2.exibirVelocidade();
         */

        c1.acelerar(150);
        c1.frear();

        c2.acelerar(300);
        c2.frear();

        /*
         * c1.exibirVelocidade();
         * c2.exibirVelocidade();
         */

        ArrayList<Carro> garagem = new ArrayList<>();

        garagem.add(c1);
        garagem.add(c2);

        for (int i = 0; i < garagem.size(); i++) {
            System.out.println("\nO modelo é " + garagem.get(i).getModelo() + " - Ano " + garagem.get(i).getAno());
            garagem.get(i).exibirVelocidade();
        }
    }
}
