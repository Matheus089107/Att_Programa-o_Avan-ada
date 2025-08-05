package org.example;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class livrosDAO {

    public void inserir(String titulo, String autor, String ano_publicacao) {
        String sql = "insert into livros (titulo, autor, ano_publicacao) VALUES (? ,?,?)";

        try (Connection conn = Conexao.conectar();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setString(1, titulo);
            stmt.setString(2, autor);
            stmt.setString(3, ano_publicacao);
            stmt.executeUpdate();
            System.out.println("livro inserido com sucesso!");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
