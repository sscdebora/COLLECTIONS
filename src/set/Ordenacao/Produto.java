package set.Ordenacao;

import java.util.Comparator;

public class Produto implements Comparable<Produto>{
    //atributos
    private String nome;
    private long codigo;
    private double preco;
    private int quantidade;

    //construtor usado p criar e inicializar um objeto produto com os valores fornecidos
    public Produto(String nome, long codigo, double preco, int quantidade){
        this.nome = nome;
        this.codigo = codigo;
        this.preco = preco;
        this.quantidade = quantidade;
    }
    //os metodos get sao usados para acessar os atributos do objeto. Ja o set seria para modificar
    public String getNome(){
        return nome;
    }
    public long getCodigo(){
        return codigo;
    }
    public double getPreco(){
        return preco;
    }
    public int getQuantidade(){
        return quantidade;
    }

    @Override //logica para comparar por codigo
    public boolean equals(Object o){
        if (this == o) return true;
        if (!(o instanceof Produto produto)) return false;
        return getCodigo() == produto.getCodigo();
    }

    //exibicao de informacao do objeto
    @Override //indica que o metodo ta sobrescrevendo um metodo da superclasse
    //sobrescrita significa que subclasse fornece implementacao de um metodo definido na superclasse 
    public String toString(){
        return "Produto{" +
        "nome=" + nome +
        ", codigo=" + codigo +
        ", preco=" + preco +
        ", quantidade=" + quantidade +
        '}';
    }

    @Override //comparar por nome do produto
    public int compareTo(Produto p){
        return nome.compareToIgnoreCase(p.getNome());
    }
}

class ComparatorPorPreco implements Comparator<Produto>{

    @Override
    public int compare(Produto p1, Produto p2){
        return Double.compare(p1.getPreco(), p2.getPreco());
    }

}