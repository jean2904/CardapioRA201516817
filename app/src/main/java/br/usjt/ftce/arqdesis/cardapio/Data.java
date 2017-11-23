package br.usjt.ftce.arqdesis.cardapio;

/**
 * Created by jeanl on 22/11/2017.
 */

import java.util.ArrayList;
import java.util.Arrays;

public class Data {
    public static Cardapio[] _lista;

    public static Cardapio[] geraListaCardapios(){
        if(_lista == null) {
            Cardapio[] lista = new Cardapio[9];
            lista[0] = new Cardapio(1,"Macarrão de Forno",    "Pra matar a fome ;)", "Macarrão, molho de tomate e muito queijo.","macarrao_forno");
            lista[1] = new Cardapio(2,"Torta de Frango",      "Pra matar a fome ;)", "Torta de frango, azeitona e orégano.","torta_frango");
            lista[2] = new Cardapio(3,"Hambúrguer",           "Pra matar a fome ;)", "Hambúrguer 200g, molho, salada e muito queijo.","hamburguer");
            lista[3] = new Cardapio(4,"Bolo de Doce de Leite","Delícia!",            "Bolo com cobertura e recheio de doce de leite.","bolo");
            lista[4] = new Cardapio(5,"Brigadeiro",           "Delícia!",            "Brigadeiro de chocolate.","brigadeiro");
            lista[5] = new Cardapio(6,"Brownie",              "Delícia!",            "Brownie e sorvete de creme.","brownie");
            lista[6] = new Cardapio(7,"Eisenbahn",            "Pra refrescar",       "-","eisenbahn");
            lista[7] = new Cardapio(8,"Coca-Cola",            "Pra refrescar",       "-","coca_cola");
            lista[8] = new Cardapio(9,"Red Label",            "Pra refrescar",       "-","whisky");
            Arrays.sort(lista);
            _lista = lista;
        }
        return _lista;
    }

    public static Cardapio[] buscaCardapios(String chave){
        Cardapio[] lista = geraListaCardapios();
        if (chave == null || chave.length() == 0){
            return lista;
        } else {
            ArrayList<Cardapio> subLista = new ArrayList<>();
            for(Cardapio cardapio:lista){
                if(cardapio.getNome().toUpperCase().contains(chave.toUpperCase())){
                    subLista.add(cardapio);
                }
            }
            return subLista.toArray(new Cardapio[0]);
        }
    }
}
