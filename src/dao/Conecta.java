/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.*;


public class Conecta {
     public static Connection getConexao(){
    
        Connection con = null;
        
        try{
        
            String serverName = "localhost";
            String mydatabase = "eleicoes";
            
            String username = "root";
            String password = "root";
            
            String driverName = "com.mysql.jdbc.Driver";
            Class.forName(driverName);
            
          String url = "jdbc:mysql://" + serverName + "/" + mydatabase;
          con = DriverManager.getConnection(url, username, password);  
        }
        catch (ClassNotFoundException e) {
            System.out.println("Driver não encontrado " + e.toString());
        } 
        catch (SQLException e) {
            System.out.println("Erro ao conectar o Banco de Dados " + e.toString());
        }
          return con;    
    }
}

