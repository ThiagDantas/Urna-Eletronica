
package classes;

import java.util.ArrayList;
import java.util.List;
import view.ViewUrna;
import view.viewPrincipal;


public class Urna {


    private int idUrna;
    private  List<Candidato> listadeCandidatos = new ArrayList<>();
    private List<Eleitor> listadeEleitores = new ArrayList<>();
    private List<Eleitor> eleitoresQueVotaram = new ArrayList<>();
    private int votosNulos, votosBrancos, votosValidos;
    private boolean urnaLivre;

    public Urna(int idUrna) {
        this.idUrna=idUrna;
        this.listadeCandidatos=null;
        this.listadeEleitores=null;
        //Confirmar se vão existir votos nulos this.votosNulos=0;
        this.votosBrancos=0;
        this.votosValidos=0;   
        this.urnaLivre=false;
               
    }
    
    public void urnaCarregada(){
        if(!(this.listadeCandidatos.isEmpty()&&this.listadeCandidatos.isEmpty()))
            seturnaLivre(true);
    }
    
    public static void votouOuNao(String numTitulo, List<Eleitor>todosEleitores, List<Eleitor>eleitorQueJaVotou){
       //vou guardar os eleitores da lista
        int eleitoresQueJaVotaram=0, eleitorQueEstaoNaLista=0;
        
        //pegando o eleitor na posição i e verificando se existe 
        for(int i=0;i<todosEleitores.size();i++){
            if(todosEleitores.get(i).getId()==numTitulo);   
        }
        //chechando se o eleitor na posição i já votou ou não
        for(int i=0;i<eleitorQueJaVotou.size();i++){
            if (eleitorQueJaVotou.get(i).getId()==numTitulo) {
                eleitoresQueJaVotaram=1;
            }
        }
        /*se ele está na lista mas está zerado marcando que não votou, ele é 
        liberado*/
        if(eleitorQueEstaoNaLista==1&&eleitoresQueJaVotaram==0){
            //viewPrincipal teste=new viewPrincipal();
            
        }
        else{
            //Adicionar popup para votar apenas uma vez
        }
    }
    public static void enviarVoto(String numTitulo, List<Eleitor>todosEleitores,List<Eleitor>eleitorQueJaVotou,String numCandidato,List<Candidato>listaDeCandidatos){
        /*Usei um foreach com lambda só pra reduzir o tamanho do código
        http://blog.caelum.com.br/o-minimo-que-voce-deve-saber-de-java-8/
        */
        todosEleitores.forEach((obj)->{
            if(obj.getId()==numTitulo){
            eleitorQueJaVotou.add(obj);
        }
            for(int i=0; i<todosEleitores.size();i++){
                if (listaDeCandidatos.get(i).getId()==numCandidato){
                    listaDeCandidatos.get(i).setNumVotos(listaDeCandidatos.get(i).getNumVotos()+1);
                    
                }
            }
    });
    }
    
    
    
   
    
    

      
    
    

    public int getIdUrna() {
        return idUrna;
    }

    public void setIdUrna(int idUrna) {
        this.idUrna = idUrna;
    }

    public List<Candidato> getListadeCandidatos() {
        return listadeCandidatos;
    }

    public void setListadeCandidatos(List<Candidato> listadeCandidatos) {
        this.listadeCandidatos = listadeCandidatos;
    }

    public List<Eleitor> getListadeEleitores() {
        return listadeEleitores;
    }

    public void setListadeEleitores(List<Eleitor> listadeEleitores) {
        this.listadeEleitores = listadeEleitores;
    }

    public List<Eleitor> getEleitoresQueVotaram() {
        return eleitoresQueVotaram;
    }

    public void setEleitoresQueVotaram(List<Eleitor> eleitoresQueVotaram) {
        this.eleitoresQueVotaram = eleitoresQueVotaram;
    }

    public int getVotosNulos() {
        return votosNulos;
    }

    public void setVotosNulos(int votosNulos) {
        this.votosNulos = votosNulos;
    }

    public int getVotosBrancos() {
        return votosBrancos;
    }

    public void setVotosBrancos(int votosBrancos) {
        this.votosBrancos = votosBrancos;
    }

    public int getVotosValidos() {
        return votosValidos;
    }

    public void setVotosValidos(int votosValidos) {
        this.votosValidos = votosValidos;
    }

    public boolean isurnaLivre() {
        return urnaLivre;
    }

    public void seturnaLivre(boolean urnaLivre) {
        this.urnaLivre = urnaLivre;
    }

}
