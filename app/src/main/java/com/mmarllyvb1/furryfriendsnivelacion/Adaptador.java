package com.mmarllyvb1.furryfriendsnivelacion;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class Adaptador extends BaseAdapter {

    private static LayoutInflater inflater = null;

    Context contexto;
    String[][] datos;
    int[] datosImg;

    public Adaptador(Context context, String [][] datos, int[] imagenes){
        this.contexto = context;
        this.datos = datos;
        this.datosImg = imagenes;
        inflater = (LayoutInflater) context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public View getView(int i, View convertView, ViewGroup parent) {

        final View vista = inflater.inflate(R.layout.elemento_lista, null);
        TextView nombre = (TextView) vista.findViewById(R.id.txtName);
        TextView caract = (TextView) vista.findViewById(R.id.txtCaracteristica);
        TextView edadp = (TextView) vista.findViewById(R.id.txtEdad);
        ImageView imagen = (ImageView) vista.findViewById(R.id.imageViewFoto);

        nombre.setText(datos[i][0]);
        caract.setText(datos[i][1]);
        edadp.setText(datos[i][2]);
        imagen.setImageResource(datosImg[i]);

        return vista;
    }

    @Override
    public int getCount() {
        return datosImg.length;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

}
