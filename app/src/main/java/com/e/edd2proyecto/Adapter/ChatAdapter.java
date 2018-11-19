package com.e.edd2proyecto.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import com.e.edd2proyecto.ChatModels.MensajeEnviado;
import com.e.edd2proyecto.ChatModels.MensajeRecibido;
import com.e.edd2proyecto.R;
import com.github.library.bubbleview.BubbleTextView;

import java.util.List;

public class ChatAdapter extends BaseAdapter {

    private List<MensajeEnviado> list_mensajeEnviado;
    private List<MensajeRecibido> list_mensajeRecibido;
    private Context context;
    private LayoutInflater layoutInflater;
    int count = 0;

    public ChatAdapter(List<MensajeEnviado> list_mensaje, Context context) {
        this.list_mensajeEnviado = list_mensaje;
        this.context = context;
        layoutInflater = (LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public int getCount() {
        return list_mensajeEnviado.size();
    }

    @Override
    public Object getItem(int position) {
        return list_mensajeEnviado.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
       View view = convertView;
       if(view == null) {
           if(list_mensajeEnviado.get(position).isEsEnviado()) {
               view = layoutInflater.inflate(R.layout.list_item_mensaje_enviar,null);
           }
           else {
               view = layoutInflater.inflate(R.layout.list_item_mensaje_recibir,null);
           }
           BubbleTextView mensaje = (BubbleTextView)view.findViewById(R.id.mensaje_texto);
           mensaje.setText(list_mensajeEnviado.get(position).getMensaje());
       }

       return view;
    }
}
