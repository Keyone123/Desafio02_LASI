public class TODO {
    String nome;
    boolean progresso;
    TODO prox;
    String categoria;
    String descricao;

    public TODO(String nome, String categoria, String descricao){
        this.nome = nome;
        this.progresso = false;
        this.prox = null;
        this.categoria = categoria;
        this.descricao = descricao;
    }
    public String getNome(){
        return nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public String getCategoria(){
        return categoria;
    }
    public void setCategoria(String categoria){
        this.categoria = categoria;
    }
    public boolean getProgresso(){
        return progresso;
    }
    public void setProgresso(boolean progresso){
        this.progresso = progresso;
    }
    public TODO getProx(){
        return prox;
    }
    public void setProx(TODO prox){
        this.prox = prox;
    }
    public String getDescricao(){
        return descricao;
    }
    public void setDescricao(String descricao){
        this.descricao = descricao;
    }
}

