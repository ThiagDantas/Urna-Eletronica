package classes;

public abstract class Usuario {
    private String nome;
    private String id;
    //private int votacaoAno;
    
    public Usuario(String nome, String id){
    this.nome=nome;
    this.id=id;
    //this.votacaoAno=votacaoAno;
}

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
    this.nome = nome;
    }

    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
   /*/     public int getVotacaoAno() {
        return votacaoAno;
    }
    public void setVotacaoAno(int id) {
        this.votacaoAno = id;
    }*/
}
