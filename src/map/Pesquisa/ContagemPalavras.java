package map.Pesquisa;

import java.util.HashMap;
import java.util.Map;

public class ContagemPalavras {
    // atributos
    private Map<String, Integer> palavras;

    public ContagemPalavras() {
        this.palavras = new HashMap<>();
    }

    public void adicionarPalavra(String palavra, Integer contagem){
            palavras.put(palavra, contagem)
    }

    public void removerPalavra(String palavra) {
        if (!palavras.isEmpty()) {
            palavras.remove(palavra);
        } else {
            System.out.println("O Map está vazio.");
        }
    }

    public int exibirContagemPalavras() {
        int contagemTotal = 0;
        for (int contagem : palavras.values()) {
            contagemTotal += contagem;
        }
        return contagemTotal;
    }

    public String encontrarPalavrasMaisFrequente() {
        String linguagemMaisFrequente = null; //variavel p guardar a palavra +usada. Null diz que ainda nao tem palavra p guardar
        int maiorContagem = 0; //guarda > numero de vezes que uma palavra aparece
        //Map.Entry<String, Integer> diz que cada entry tem uma palavra (String) e um número (Integer) que diz quantas vezes essa palavra aparece.
        for (Map.Entry<String, Integer> entry : palavras.entrySet()) { //Para cada par chave-valor (entry) no conjunto de pares chave-valor (palavras.entrySet()), faça
            if (entry.getValue() > maiorContagem) {
                maiorContagem = entry.getValue();
                linguagemMaisFrequente = entry.getKey();
            }
        }
        return linguagemMaisFrequente; 
        //palavras.entrySet(): Pega todos os pares palavra-contagem do dicionário.
        //entry.getValue(): Pega o número de vezes que a palavra aparece.
        //entry.getKey(): Pega a palavra em si.
    }

}
