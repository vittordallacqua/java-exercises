import java.sql.Connection;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Connection conn = Database.getConnection()) {
            ClienteDAO clienteDAO = new ClienteDAO(conn);
            ContaDAO contaDAO = new ContaDAO(conn);
            Scanner sc = new Scanner(System.in);
            while (true) {
                System.out.println("\n =========== MENU ===========\n");
                System.out.println("1. Cadastrar Cliente");
                System.out.println("2. Listar Clientes");
                System.out.println("3. Criar Conta para Cliente");
                System.out.println("4. Listar Contas de um Cliente");
                System.out.println("5. Depositar");
                System.out.println("6. Sacar");
                System.out.println("7. Excluir Conta");
                System.out.println("0. Sair");
                System.out.print("\nSelecione uma opção: ");
                int opcao = sc.nextInt();
                sc.nextLine();
                if (opcao == 0) break;

                switch (opcao) {
                    case 1:
                        System.out.print("Nome do cliente: ");
                        String nome = sc.nextLine();
                        clienteDAO.cadastrarCliente(nome);
                        break;
                    case 2:
                        List<Cliente> clientes = clienteDAO.listarClientes();
                        for (Cliente c : clientes)
                            System.out.println("ID: " + c.getId() + " | Nome: " + c.getNome());
                        break;
                    case 3:
                        System.out.print("ID do cliente: ");
                        int clienteId = sc.nextInt();
                        contaDAO.criarConta(clienteId);
                        break;
                    case 4:
                        System.out.print("ID do cliente: ");
                        clienteId = sc.nextInt();
                        List<Conta> contas = contaDAO.listarContasDoCliente(clienteId);
                        for (Conta conta : contas)
                            System.out.println("Conta ID: " + conta.getId() + " | Saldo: R$ " + conta.getSaldo());
                        break;
                    
                    case 5:
                        System.out.print("ID da conta: ");
                        int contaId = sc.nextInt();
                        System.out.print("Valor: R$ ");
                        double valor = sc.nextDouble();
                        contaDAO.depositar(contaId, valor);
                        break;
                    case 6:
                        System.out.print("ID da conta: ");
                        contaId = sc.nextInt();
                        System.out.print("Valor: R$ ");
                        valor = sc.nextDouble();
                        contaDAO.sacar(contaId, valor);
                        break;
                    case 7:
                        System.out.print("ID do cliente: ");
                        clienteId = sc.nextInt();                       
                        contaDAO.deletarCliente(clienteId);
                        break;    
                    default:
                        sc.close();
                        System.out.println("Opção inválida.");
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}