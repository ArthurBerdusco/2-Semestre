package com.senac.exemplocrudjdbc.dao;

import com.senac.exemplocrudjdbc.model.NotaFiscal;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class NotaFiscalDAO {

    public static boolean salvar(NotaFiscal obj) {
        boolean retorno = true;
        Connection conexao;

        try {
            //PASSO 1 - Carregar o drive JDBC > vem da dependencia jdbc >mysqlconector> driver
            Class.forName("com.mysql.cj.jdbc.Driver");
            //PASSO 2 - Abrir conexação
            conexao = DriverManager.getConnection("jdbc:mysql://localhost:3306/basenotafiscal", "root", "password");
            //PASSO 3 - Criar comando SQL
            PreparedStatement comando = conexao.prepareStatement("INSERT INTO notafiscal(numeroNota,valorNota) "
                    + "VALUES(?,?)");
            //PASSO 4 - PARAMETROS
            comando.setInt(1, obj.getNumeroNota());
            comando.setDouble(2, obj.getValorNota());

            int linhasAfetadas = comando.executeUpdate();

            if (linhasAfetadas > 0) {
                retorno = true;
            }

        } catch (ClassNotFoundException ex) {
            System.out.println("Impossivel carregar drive");
        } catch (SQLException ex) {
            System.out.println("Impossivel realizar conexao");
        }

        return retorno;
    }

    public static ArrayList<NotaFiscal> listar() {
        ArrayList<NotaFiscal> lista = new ArrayList<>();

        Connection conexao;

        try {
            //PASSO 1 - Carregar o drive JDBC > vem da dependencia jdbc >mysqlconector> driver
            Class.forName("com.mysql.cj.jdbc.Driver");
            //PASSO 2 - Abrir conexação
            conexao = DriverManager.getConnection("jdbc:mysql://localhost:3306/basenotafiscal", "root", "password");
            //PASSO 3 - Criar comando SQL
            PreparedStatement comandoSQL = conexao.prepareStatement("select * from notafiscal");

            //Tabela na memoria
            ResultSet rs = comandoSQL.executeQuery();

            if (rs != null) {
                while (rs.next()) {
                    NotaFiscal novoObj = new NotaFiscal();
                    novoObj.setIdNota(rs.getInt("idNota"));
                    novoObj.setNumeroNota(rs.getInt("numeroNota"));
                    novoObj.setValorNota(rs.getInt("valorNota"));

                    lista.add(novoObj);
                }
            }

        } catch (ClassNotFoundException ex) {
            System.out.println("Impossivel carregar drive");
        } catch (SQLException ex) {
            System.out.println("Impossivel realizar conexao");
        }

        return lista;
    }

    public static boolean excluir(int id) {
        boolean retorno = false;
        try {
            //PASSO 1 - Carregar o drive JDBC > vem da dependencia jdbc >mysqlconector> driver
            Class.forName("com.mysql.cj.jdbc.Driver");
            //PASSO 2 - Abrir conexação
            Connection conexao = DriverManager.getConnection("jdbc:mysql://localhost:3306/basenotafiscal", "root", "password");
            //PASSO 3 - Criar comando SQL
            PreparedStatement comando = conexao.prepareStatement("DELETE FROM notafiscal WHERE idNota =?");
            //PASSO 4 - PARAMETROS
            comando.setInt(1, id);

            int linhasAfetadas = comando.executeUpdate();

            if (linhasAfetadas > 0) {
                retorno = true;
            }

        } catch (ClassNotFoundException ex) {
            System.out.println("Impossivel carregar drive");

        } catch (SQLException ex) {
            System.out.println("Impossivel realizar conexao");
        }
        return retorno;
    }

    public static boolean alterar(int editId, NotaFiscal attNota) {
        boolean retorno = true;
        try {
            //PASSO 1 - INSTANCIAR OU CARREGAR JDBC
            Class.forName("com.mysql.cj.jdbc.Driver");

            //PASSO 2 - CONEXÃO BANCO DE DAODS
            Connection conexao = DriverManager.getConnection("jdbc:mysql://localhost:3306/basenotafiscal", "root", "password");

            //PASSO 3 - PREPARAR INSTRUÇÃO
            PreparedStatement ps = conexao.prepareStatement("UPDATE notafiscal SET idNota = ?, numeroNota = ?, valorNota = ? WHERE idNota = ?");
            ps.setInt(1, attNota.getIdNota());
            ps.setInt(2, attNota.getNumeroNota());
            ps.setDouble(3, attNota.getValorNota());
            ps.setInt(4, editId);

            //PASSO 4 - EXECUCAO DA QUERY
            int linhasAfetadas = ps.executeUpdate();

            if (linhasAfetadas > 0) {
                retorno = true;
            } else {
                retorno = false;
            }

        } catch (ClassNotFoundException ex) {
            System.out.println("Instancia JDBC MYSQL não foi localizada");
        } catch (SQLException ex) {
            System.out.println("Não foi possivel realizar login no banco de dados");
        }

        return retorno;
    }
}
