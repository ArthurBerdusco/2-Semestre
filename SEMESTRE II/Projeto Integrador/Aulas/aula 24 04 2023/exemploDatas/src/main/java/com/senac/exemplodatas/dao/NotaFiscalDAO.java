package com.senac.exemplodatas.dao;

import com.senac.exemplodatas.views.model.NotaFiscal;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class NotaFiscalDAO {

    public static boolean salvar(NotaFiscal nota) {
        boolean retorno = false;
        Connection conexao = null;
        try {
            //Carregar Drive
            Class.forName("com.mysql.cj.jdbc.Driver");

            //Conexao sql
            String url = "jdbc:mysql://localhost:3306/basenotafiscal";
            conexao = DriverManager.getConnection(url, "root", "password");

            //Preparar comando sql
            PreparedStatement comandoSQL = conexao.prepareStatement("INSERT INTO notafiscal (numeroNota, valorNota, date) VALUES(?,?,?) ");
            comandoSQL.setInt(1, nota.getNumeroNota());
            comandoSQL.setDouble(2, nota.getNumeroNota());
            comandoSQL.setDate(3, new java.sql.Date(nota.getData().getTime()));
            
            int linhasAlteradas = comandoSQL.executeUpdate();
            if(linhasAlteradas > 0){
                retorno = true;
            }
        } catch (ClassNotFoundException ex) {
            System.out.println("Não foi possivel fazer a conexão");
        } catch (SQLException ex) {
            System.out.println("Erro ao conectar o sql");
            ex.printStackTrace();
        }

        return retorno;
    }
}
