package br.usjt.ftce.arqdesis.cardapio;

/**
 * Created by jeanl on 22/11/2017.
 */

import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class CardapioAdapter extends BaseAdapter {
    Activity contexto;
    Cardapio[] cardapios;

    public CardapioAdapter(Activity contexto, Cardapio[] cardapios) {
        this.contexto = contexto;
        this.cardapios = cardapios;
    }

    @Override
    public int getCount() {
        return cardapios.length;
    }

    @Override
    public Object getItem(int position) {
        if (position >=0 && position < cardapios.length)
            return cardapios[position];
        else
            return null;
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View view = convertView;
        if(view == null) {
            LayoutInflater inflater = (LayoutInflater)
                    contexto.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            view = inflater.inflate(R.layout.linha_cardapio, parent, false);

            ImageView foto = (ImageView) view.findViewById(R.id.foto_cardapio);
            TextView nome = (TextView) view.findViewById(R.id.nome_cardapio);
            TextView detalhe = (TextView) view.findViewById(R.id.detalhe_cardapio);
            ViewHolder viewHolder = new ViewHolder(foto, nome, detalhe);
            view.setTag(viewHolder);
        }

        ViewHolder viewHolder = (ViewHolder)view.getTag();
        viewHolder.getNome().setText(cardapios[position].getNome());
        viewHolder.getDetalhe().setText(cardapios[position].getDetalhe());
        Drawable drawable = Util.getDrawable(contexto, cardapios[position].getFoto());
        System.out.println(cardapios[position].getFoto());
        viewHolder.getFoto().setImageDrawable(drawable);

        return view;
    }
}
