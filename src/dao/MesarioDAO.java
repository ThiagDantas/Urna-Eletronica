/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import classes.Mesario;
import java.sql.*;
/**
 *
 * @author UX007350
 */
public class MesarioDAO {
    //RETORNA OS DADOS DO Eleitor
     public Mesario getMesario(String Login, String Senha) {

        Mesario mesario = new Mesario();

        try {
            Connection con = Conecta.getConexao();
            String sql = "SELECT * FROM mesario WHERE Login= ? AND Senha= ?;";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, Login);
            ps.setString(2, Senha);
            
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                mesario.setIdMesario(rs.getString("ID_Mesario"));
                mesario.setNomeMesario(rs.getString("Nome_Mesario"));
                mesario.setSecaoMesario(rs.getString("Secao"));
                mesario.setPapel(rs.getString("Papel"));
                
            } else {
                mesario = null;
            }

            rs.close();
            ps.close();
            con.close();
        } catch (Exception e) {
            mesario = null;
        }

        return mesario;
    }
}
