package classes;

public class Eleitor{
    
    String idEleitor;
    String nomeEleitor;
    String titulo;
    String secao;
    String voto;

    public String getNomeEleitor() {
        return nomeEleitor;
    }

    public void setNomeEleitor(String nomeEleitor) {
        this.nomeEleitor = nomeEleitor;
    }
    
    public String getId(){
        return this.idEleitor;   
    }
    
    public String getIdEleitor() {
        return idEleitor;
    }

    public void setIdEleitor(String IdEleitor) {
        this.idEleitor = IdEleitor;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getSecao() {
        return secao;
    }

    public void setSecao(String secao) {
        this.secao = secao;
    }

    public String getVoto() {
        return voto;
    }

    public void setVoto(String voto) {
        this.voto = voto;
    }
    
    
}
