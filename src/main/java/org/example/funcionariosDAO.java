package org.example;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class funcionariosDAO {
    public void inserir(String nome, String cargo, double salario){
        String sql = "insert into funcionarios (nome, cargo, salario) VALUES (?,?,?)";

        try(Connection conn = Conexao.conectar();
            PreparedStatement sky = conn.prepareStatement(sql)){

            sky.setString(1,nome);
            sky.setString(2, cargo);
            sky.setDouble(3, salario);
            sky.executeUpdate();
            System.out.println("funcionario inserido com sucesso");
        } catch(SQLException e){
            e.printStackTrace();
        }
    }
}
