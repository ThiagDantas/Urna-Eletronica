
package dao;
import classes.Candidato;
import java.sql.*;

/**
 *
 * @author UX007350
 */
public class CandidatoDAO {
    
    //RETORNA OS DADOS DO CANDIDATO
     public Candidato getCandidato(String numero) {

        Candidato cand = new Candidato();

        try {
            Connection con = Conecta.getConexao();
            String sql = "SELECT * FROM candidato WHERE ID_Candidato=?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, numero);
    
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                cand.setIdCandidato(rs.getString("ID_Candidato"));
                cand.setNomeCandidato(rs.getString("Nome_Candidato"));
                cand.setPartidoCandidato(rs.getString("Partido_candidato"));
                cand.setConcorre(rs.getString("Concorre"));
                cand.setNumVotos(rs.getInt("Votos"));
               
            } else {
                cand = null;
            }

            rs.close();
            ps.close();
            con.close();
        } catch (Exception e) {
            cand = null;
        }

        return cand;
    }
}
