package com.senac.lojainformatica.dao;

import com.senac.lojainformatica.model.Computador;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class ComputadorDAO {

    public static final String DRIVER = "com.mysql.cj.jdbc.Driver";
    public static final String LOGIN = "root";
    private static final String SENHA = "password";
    private static final String URL = "jdbc:mysql://localhost:3306/lojainformatica";

    public static boolean salvar(Computador comp) {
        boolean retorno = false;
        PreparedStatement instrucaoSQL = null;
        Connection conexao = null;
        try {
            //PASSO 1 - Carregar o driver JDBC
            Class.forName(DRIVER);
            //PASSO 2 - Realizar conexão com o banco de dados
            conexao = DriverManager.getConnection(URL, LOGIN, SENHA);
            //PASSO 3 - Preparar comando SQL
            instrucaoSQL = conexao.prepareStatement("INSERT INTO computador (marca, HD, processador)"
                    + "VALUES(?,?,?)");
            //PASSO 4 - Passar os parâmetros para o Statement
            instrucaoSQL.setString(1, Computador.getMarca());
            instrucaoSQL.setString(2, comp.getHD());
            instrucaoSQL.setString(3, comp.getProcessador());

            int linhasAfetadas = instrucaoSQL.executeUpdate();

            if (linhasAfetadas > 0) {
                retorno = true;
            } else {
                throw new Exception("Por favor digite apenas letras no nome");
            }

        } catch (ClassNotFoundException e) {
            System.out.println("Não foi possível carregar o driver JDBC");
        } catch (SQLException e) {
            System.out.println("Não foi possível realizar conexão com o banco de dados");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            //Liberar os recursos da memória
            try {
                if (instrucaoSQL != null) {
                    instrucaoSQL.close();
                }
                if (conexao != null) {
                    if (!(conexao.isClosed())) {
                        conexao.close();
                    }
                }
            } catch (SQLException ex) {
                System.out.println("Não foi possivel fechar conexao com o banco");
            }
        }
        return retorno;
    }

    public static ArrayList<Computador> listar() {
        ArrayList<Computador> listaComputadores = new ArrayList<>();
        PreparedStatement instrucaoSQL = null;
        Connection conexao = null;
        try {
            //PASSO 1 - Carregar o driver JDBC
            Class.forName(DRIVER);
            //PASSO 2 - Realizar conexão com o banco de dados
            conexao = DriverManager.getConnection(URL, LOGIN, SENHA);
            //PASSO 3 - Preparar comando SQL
            instrucaoSQL = conexao.prepareStatement("SELECT * FROM computador");
            //PASSO 4 - Passar os parâmetros para o Statement

            ResultSet rs = instrucaoSQL.executeQuery();

            if (rs != null) {
                while (rs.next()) {
                    Computador computador = new Computador();
                    computador.setIdComputador(rs.getInt("idComputador"));
                    computador.setHD(rs.getString("HD"));
                    computador.setProcessador(rs.getString("processador"));
                    listaComputadores.add(computador);
                }
            } else {
                throw new Exception("Não foi possível listar os computadores do banco de dados");
            }

        } catch (ClassNotFoundException e) {
            System.out.println("Não foi possível carregar o driver JDBC");
        } catch (SQLException e) {
            System.out.println("Não foi possível realizar conexão com o banco de dados");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            //Liberar os recursos da memória
            try {
                if (instrucaoSQL != null) {
                    instrucaoSQL.close();
                }
                if (conexao != null) {
                    if (!(conexao.isClosed())) {
                        conexao.close();
                    }
                }
            } catch (SQLException ex) {
                System.out.println("Não foi possivel fechar conexao com o banco");
            }
        }
        return listaComputadores;
    }

    public static ArrayList<Computador> listar(String processador) {
        ArrayList<Computador> listaComputadores = new ArrayList<>();
        PreparedStatement instrucaoSQL = null;
        Connection conexao = null;
        try {
            //PASSO 1 - Carregar o driver JDBC
            Class.forName(DRIVER);
            //PASSO 2 - Realizar conexão com o banco de dados
            conexao = DriverManager.getConnection(URL, LOGIN, SENHA);
            //PASSO 3 - Preparar comando SQL
            instrucaoSQL = conexao.prepareStatement("SELECT * FROM computador "
                    + "WHERE processador = ?");
            //PASSO 4 - Passar os parâmetros para o Statement
            instrucaoSQL.setString(1, processador);
            ResultSet rs = instrucaoSQL.executeQuery();

            if (rs != null) {
                while (rs.next()) {
                    Computador computador = new Computador();
                    computador.setIdComputador(rs.getInt("idComputador"));
                    computador.setHD(rs.getString("HD"));
                    computador.setProcessador(rs.getString("processador"));
                    listaComputadores.add(computador);
                }
            } else {
                throw new Exception("Não foi possível listar os computadores do banco de dados");
            }

        } catch (ClassNotFoundException e) {
            System.out.println("Não foi possível carregar o driver JDBC");
        } catch (SQLException e) {
            System.out.println("Não foi possível realizar conexão com o banco de dados");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            //Liberar os recursos da memória
            try {
                if (instrucaoSQL != null) {
                    instrucaoSQL.close();
                }
                if (conexao != null) {
                    if (!(conexao.isClosed())) {
                        conexao.close();
                    }
                }
            } catch (SQLException ex) {
                System.out.println("Não foi possivel fechar conexao com o banco");
            }
        }
        return listaComputadores;
    }

    public static boolean alterar(int editId, Computador comp) {
        boolean retorno = false;
        Connection conexao = null;
        PreparedStatement instrucaoSQL = null;

        try {
            //PASSO 1 - Carregar o driver JDBC
            Class.forName(DRIVER);
            //PASSO 2 - Realizar conexão com o banco de dados
            conexao = DriverManager.getConnection(URL, LOGIN, SENHA);

            //PASSO 3 - PREPARAR INSTRUÇÃO
            instrucaoSQL = conexao.prepareStatement("UPDATE computador SET HD = ?, processador = ? WHERE idComputador = ?");
            instrucaoSQL.setString(1, comp.getHD());
            instrucaoSQL.setString(2, comp.getProcessador());
            instrucaoSQL.setInt(3, editId);

            //PASSO 4 - EXECUCAO DA QUERY
            int linhasAfetadas = instrucaoSQL.executeUpdate();

            if (linhasAfetadas > 0) {
                retorno = true;
            } else {
                retorno = false;
            }

        } catch (ClassNotFoundException ex) {
            System.out.println("Instancia JDBC MYSQL não foi localizada");
        } catch (SQLException ex) {
            System.out.println("Não foi possivel realizar login no banco de dados");
            ex.printStackTrace();
        } catch (Exception ex) {
            System.out.print(ex.getMessage());
        } finally {
            //Liberar os recursos da memória
            try {
                if (instrucaoSQL != null) {
                    instrucaoSQL.close();
                }
                if (conexao != null) {
                    if (!(conexao.isClosed())) {
                        conexao.close();
                    }
                }
            } catch (SQLException ex) {
                System.out.println("Não foi possivel fechar conexao com o banco");
            }
        }

        return retorno;
    }

    public static boolean deletar(int editId) {
        boolean retorno = false;
        Connection conexao = null;
        PreparedStatement instrucaoSQL = null;

        try {
            //PASSO 1 - Carregar o driver JDBC
            Class.forName(DRIVER);
            //PASSO 2 - Realizar conexão com o banco de dados
            conexao = DriverManager.getConnection(URL, LOGIN, SENHA);

            //PASSO 3 - PREPARAR INSTRUÇÃO
            instrucaoSQL = conexao.prepareStatement("DELETE FROM computador WHERE idComputador = ?");
            instrucaoSQL.setInt(1, editId);

            //PASSO 4 - EXECUCAO DA QUERY
            int linhasAfetadas = instrucaoSQL.executeUpdate();

            if (linhasAfetadas > 0) {
                retorno = true;
            } else {
                retorno = false;
            }

        } catch (ClassNotFoundException ex) {
            System.out.println("Instancia JDBC MYSQL não foi localizada");
        } catch (SQLException ex) {
            System.out.println("Não foi possivel realizar login no banco de dados");
            ex.printStackTrace();
        } catch (Exception ex) {
            System.out.print(ex.getMessage());
        } finally {
            //Liberar os recursos da memória
            try {
                if (instrucaoSQL != null) {
                    instrucaoSQL.close();
                }
                if (conexao != null) {
                    if (!(conexao.isClosed())) {
                        conexao.close();
                    }
                }
            } catch (SQLException ex) {
                System.out.println("Não foi possivel fechar conexao com o banco");
            }
        }
        return retorno;
    }
}
