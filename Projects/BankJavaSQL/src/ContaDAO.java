import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ContaDAO {
    private Connection conn;

    public ContaDAO(Connection conn) {
        this.conn = conn;
    }

    public void criarConta(int clienteId) throws SQLException {
        String sql = "INSERT INTO contas (cliente_id, saldo) VALUES (?, 0)";
        PreparedStatement stmt = conn.prepareStatement(sql);
        stmt.setInt(1, clienteId);
        stmt.executeUpdate();
    }

    public void depositar(int contaId, double valor) throws SQLException {
        String sql = "UPDATE contas SET saldo = saldo + ? WHERE id = ?";
        PreparedStatement stmt = conn.prepareStatement(sql);
        stmt.setDouble(1, valor);
        stmt.setInt(2, contaId);
        stmt.executeUpdate();
    }

    public void sacar(int contaId, double valor) throws SQLException {
        String sql = "UPDATE contas SET saldo = saldo - ? WHERE id = ?";
        PreparedStatement stmt = conn.prepareStatement(sql);
        stmt.setDouble(1, valor);
        stmt.setInt(2, contaId);
        stmt.executeUpdate();
    }

    public void deletarCliente(int clienteId) throws SQLException {
        String excluirContas = "DELETE FROM contas WHERE cliente_id = ?";
        PreparedStatement stmtContas = conn.prepareStatement(excluirContas);
        stmtContas.setInt(1, clienteId);
        stmtContas.executeUpdate();
    
        String excluirCliente = "DELETE FROM clientes WHERE id = ?";
        PreparedStatement stmtCliente = conn.prepareStatement(excluirCliente);
        stmtCliente.setInt(1, clienteId);
        stmtCliente.executeUpdate();
    }  

    public List<Conta> listarContasDoCliente(int clienteId) throws SQLException {
        List<Conta> lista = new ArrayList<>();
        String sql = "SELECT * FROM contas WHERE cliente_id = ?";
        PreparedStatement stmt = conn.prepareStatement(sql);
        stmt.setInt(1, clienteId);
        ResultSet rs = stmt.executeQuery();
        while (rs.next()) {
            lista.add(new Conta(rs.getInt("id"), rs.getInt("cliente_id"), rs.getDouble("saldo")));
        }
        return lista;
    }
}