package br.usjt.ftce.arqdesis.cardapio;

/**
 * Created by jeanl on 22/11/2017.
 */

import android.app.Activity;
import android.graphics.drawable.Drawable;

import java.lang.reflect.Field;

public class Util {
    public static Drawable getDrawable(Activity context, String drawableName){
        //procurar a imagem por meio de reflection
        Class<?> c = R.drawable.class;
        try {
            Field idField = c.getDeclaredField(drawableName);
            int id = idField.getInt(idField);
            return context.getResources().getDrawable(id, null);
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        return null;
    }

}
