package org.example;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class produtoDAO {

    public void inserir(String nome, double preco, int quantidade) {
        String sql = "insert into produtos (nome, preco, quantidade) VALUES (? ,?,?)";

        try (Connection conn = Conexao.conectar();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setString(1, nome);
            stmt.setDouble(2, preco);
            stmt.setInt(3, quantidade);
            stmt.executeUpdate();
            System.out.println("Aluno inserido com sucesso!");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
