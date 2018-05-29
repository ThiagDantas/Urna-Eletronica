
package dao;

import classes.Eleitor;
import java.sql.*;
/**
 *
 * @author UX007350
 */
public class EleitorDAO {
    //RETORNA OS DADOS DO Eleitor
     public Eleitor getEleitor(String titulo) {

        Eleitor eleitor = new Eleitor();

        try {
            Connection con = Conecta.getConexao();
            String sql = "SELECT * FROM eleitor WHERE Titulo =?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, titulo);
    
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                eleitor.setIdEleitor(rs.getString("ID_Eleitor"));
                eleitor.setNomeEleitor(rs.getString("Nome_Eleitor"));
                eleitor.setTitulo(rs.getString("Titulo"));
                eleitor.setSecao(rs.getString("Secao_Eleitor"));
                eleitor.setVoto(rs.getString("Voto"));
               
            } else {
                eleitor = null;
            }

            rs.close();
            ps.close();
            con.close();
        } catch (Exception e) {
            eleitor = null;
        }

        return eleitor;
    }
}
