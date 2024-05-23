package map.Ordenacao;

import java.time.LocalDate;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class AgendaEventos {
    //atributos
    private Map<LocalDate, Evento> eventosMap;

    public AgendaEventos(){
        this.eventosMap = new HashMap<>();
    }

    public void adicionarEvento(LocalDate data, String nome, String atracao){
        //Evento evento = new Evento(nome, atracao);
        eventosMap.put(data, new Evento(nome, atracao));
    }

    public void exibirAgenda(){
        Map<LocalDate, Evento> eventosTreeMap = new TreeMap<>(eventosMap); //LocalDate sabe organizar em ordem crescente
        System.out.println(eventosTreeMap);
    }

    public void obterProximoEvento(){
       LocalDate dataAtual = LocalDate.now();
       LocalDate proximaData = null;
       Evento proximoEvento = null;
       Map<LocalDate, Evento> eventosTreeMap = new TreeMap<>(eventosMap);
       for(Map.Entry<LocalDate, Evento> entry : eventosMap.entrySet()){
        if(entry.getKey().isEqual(dataAtual) || entry.getKey().isAfter(dataAtual)){
            proximaData = entry.getKey();
            proximoEvento = entry.getValue();
            System.out.println("O proximo evento: " + proximoEvento + " acontecerá na data " + proximaData);
            break;
        }
       }
    }

    public static void main(String[] args) {
        AgendaEventos agendaEventos = new AgendaEventos();
    }
}
