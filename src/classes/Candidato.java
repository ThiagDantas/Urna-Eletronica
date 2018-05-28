
package classes;

/**
 *
 * @author thiag
 */
public class Candidato extends Usuario{

    public String getUrlFoto() {
        return urlFoto;
    }
    //CONSTRUTOR DO CANDIDATO
    public Candidato(String nome, String id, String urlFoto,int numVotos){
        super(nome,id);
        this.numVotos=numVotos;
        this.urlFoto=urlFoto;
    }

    public void setUrlFoto(String urlFoto) {
        this.urlFoto = urlFoto;
    }

    public int getNumVotos() {
        return numVotos;
    }

    public void setNumVotos(int numVotos) {
        this.numVotos = numVotos;
    }
    private String urlFoto;
    private int numVotos;
}
