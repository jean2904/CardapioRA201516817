package br.usjt.ftce.arqdesis.cardapio;

/**
 * Created by jeanl on 22/11/2017.
 */

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

public class ListaCardapioActivity extends Activity {
    public static final String CARDAPIO = "br.usjt.ftce.arqdesis.cardapio.cardapio";
    String busca;
    Cardapio[] cardapios;
    ListView listView;
    Activity activity;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_cardapios);
        activity = this;
        Intent intent = getIntent();
        busca = intent.getStringExtra(MainActivity.CHAVE);
        cardapios = Data.buscaCardapios(busca);
        CardapioAdapter adapter = new CardapioAdapter(this, cardapios);
        listView = (ListView)findViewById(R.id.listview);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent1 = new Intent(activity, DetalheCardapioActivity.class);
                intent1.putExtra(CARDAPIO, cardapios[position]);
                startActivity(intent1);
            }
        });

    }

}
