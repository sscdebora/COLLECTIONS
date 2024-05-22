package set.OperacoesBasicas;
import java.util.HashSet;
import java.util.Set;

public class ConjuntoPalavrasUnicas {
    private Set<String> palavrasUnicas;

    // Construtor da classe
    public ConjuntoPalavrasUnicas() {
        this.palavrasUnicas = new HashSet<>();
    }

    // Método para adicionar uma palavra ao conjunto
    public void adicionarPalavra(String palavra) {
        palavrasUnicas.add(palavra);
    }

    // Método para remover uma palavra do conjunto
    public void removerPalavra(String palavra) {
        palavrasUnicas.remove(palavra);
    }

    // Método para verificar se uma palavra está presente no conjunto
    public boolean verificarPalavra(String palavra) {
        return palavrasUnicas.contains(palavra);
    }

    // Método para exibir todas as palavras únicas do conjunto
    public void exibirPalavrasUnicas() {
        if (!palavrasUnicas.isEmpty()) {
            for (String palavra : palavrasUnicas) {
                System.out.println(palavra);
            }
        } else {
            System.out.println("O conjunto está vazio!");
        }
    }

    // Método principal para testar a classe
    public static void main(String[] args) {
        ConjuntoPalavrasUnicas conjunto = new ConjuntoPalavrasUnicas();
        conjunto.adicionarPalavra("maçã");
        conjunto.adicionarPalavra("banana");
        conjunto.adicionarPalavra("laranja");
        
        conjunto.exibirPalavrasUnicas();
        
        System.out.println("Verificar se 'banana' está presente: " + conjunto.verificarPalavra("banana"));
        
        conjunto.removerPalavra("banana");
        
        conjunto.exibirPalavrasUnicas();
        
        System.out.println("Verificar se 'banana' está presente: " + conjunto.verificarPalavra("banana"));
    }
}
