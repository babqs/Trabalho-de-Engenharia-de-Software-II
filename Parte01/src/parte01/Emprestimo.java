package parte01;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

public class Emprestimo {

    Date dataEmprestimo = new Date();

    /*metodo para gegar a variavel dataEmprestimo*/
    public Date getDataEmprestimo() {
        return dataEmprestimo;
    }

    /*metodo para setar a variavel dataEmprestimo*/
    public void setDataEmprestimo(Date dataEmprestimo) {
        this.dataEmprestimo = dataEmprestimo;
    }

    /*utilize essas váriaveis para calcular a data final de devolução*/
    Date dataPrevista = new Date();
    Date data_aux = new Date();
    String nome;

    /*Cada Emprestimo é composto de vários itens*/
    List<Item> i = new ArrayList<>();

    //Metodo responsável por calcular a data de devolução
    public Date CalculaDataDevolucao() {
        Date date = new Date();
        /*Você precisa implementar as regras do cálculo da devolução dentro deste método*/
        /*Não esqueça de chamar o método para calcular a data de devolução de cada item*/
        for(int j = 0; j < i.size(); j++){
        data_aux = i.get(j).calculaDataDevolucao(date);
          if(dataPrevista.compareTo(data_aux) < 0){
              dataPrevista = data_aux;
          }
        }
        //Dica use o calendar para calcular as data
        if(i.size() >= 3){
            Calendar calendar = Calendar.getInstance();
            calendar.setTime(dataPrevista);
            calendar.add(Calendar.DATE, (i.size() - 2 )*2);
            dataPrevista = calendar.getTime();
        }
        for(int k = 0; k < i.size(); k++){
            i.get(k).setDataDevolucao(dataPrevista);
        }
        return dataPrevista;
    }
}
