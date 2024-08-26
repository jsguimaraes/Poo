import java.util.ArrayList;
import java.util.List;

public class Pessoa {
    
    private String nome;
    private ArrayList<Pessoa> amigos = new ArrayList<>();
    
    
    public Pessoa(String nome) {
        this.nome = nome;
    }


    public String getNome() {
        return nome;
    }


    public void setNome(String nome) {
        this.nome = nome;
    }


    public List<Pessoa> getAmigos() {
        return amigos;
    }


    public void setAmigos(ArrayList<Pessoa> amigos) {
        this.amigos = amigos;
    }


    public int getContagemAmigos() {
        return amigos.size();
    }


    public void adicionaAmigo(Pessoa p) {
        if(amigos.contains(p)){
            return;
        }
        if(p == this){
            return;
        }
        amigos.add(p);
        p.adicionaAmigo(this);
    }


    public Pessoa getAmigo(int i) {
        if(i >= amigos.size()){
            return null;
        }
        return amigos.get(i);
    }


    public void removeAmigo(Pessoa p) {
        if(!amigos.contains(p)){
            return;
        }
        amigos.remove(p);
        p.removeAmigo(this);
    }


    public void removeAmigo(int i) {
        amigos.remove(i);
        
    }
    
}