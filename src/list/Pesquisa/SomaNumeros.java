package list.Pesquisa;
import java.util.ArrayList;
import java.util.List;

public class SomaNumeros {
    //atributos
    private List<Integer> numeros;

    public SomaNumeros(){
        this.numeros = new ArrayList<>();
    }

    public void adicionarNumero(int numero){
        numeros.add(numero);
    }
    public int calcularSoma(){
        int soma = 0;
        for(int numero : numeros){
            soma += numero;
        }
        return soma;
    }
    public int encontrarMaiorNumero(){
        if (numeros.isEmpty()) {
            throw new IllegalStateException("A lista está vazia.");
        }
        int maior = numeros.get(0);
        for(int numero : numeros){
            if(numero > maior){
                maior = numero;
            }
        }
        return maior;
    }
    public int encontrarMenorNumero(){
        if (numeros.isEmpty()){
            throw new IllegalStateException("A lista está vazia.");
        }
        int menor = numeros.get(0);
        for(int numero : numeros){
            if(numero < menor){
                menor = numero;
            }
        }
        return menor;
    }
    public List<Integer> exibirNumeros() {
        return new ArrayList<>(numeros);
    }
}
