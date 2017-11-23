package br.usjt.ftce.arqdesis.cardapio;

/**
 * Created by jeanl on 22/11/2017.
 */

import android.app.Activity;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class DetalheCardapioActivity extends Activity {
    ImageView cardapioImageView;
    Cardapio cardapio;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalhe_cardapio);
        Intent intent = getIntent();
        cardapio = (Cardapio) intent.getSerializableExtra(ListaCardapioActivity.CARDAPIO);
        cardapioImageView = (ImageView) findViewById(R.id.cardapio_image_view);
        Drawable drawable = Util.getDrawable(this, cardapio.getFoto());
        cardapioImageView.setImageDrawable(drawable);

        TextView nome = (TextView) findViewById(R.id.txt_cardapio_nome);
        TextView detalhe = (TextView) findViewById(R.id.txt_cardapio_detalhe);
        TextView ingrediente = (TextView) findViewById(R.id.txt_cardapio_ingrediente);

        nome.setText(cardapio.getNome());
        detalhe.setText(cardapio.getDetalhe());
        ingrediente.setText(cardapio.getIngrediente());
    }
}
