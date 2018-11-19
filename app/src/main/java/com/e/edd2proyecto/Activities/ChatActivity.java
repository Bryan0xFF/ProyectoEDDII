package com.e.edd2proyecto.Activities;

import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ListView;

import com.e.edd2proyecto.Adapter.ChatAdapter;
import com.e.edd2proyecto.ChatModels.MensajeEnviado;
import com.e.edd2proyecto.ChatModels.MensajeRecibido;
import com.e.edd2proyecto.R;

import java.util.ArrayList;
import java.util.List;

public class ChatActivity extends AppCompatActivity {

    ListView listView;
    EditText editText;
    List<MensajeEnviado> list_chat = new ArrayList<>();
    List<MensajeRecibido> list_chat_R = new ArrayList<>();
    FloatingActionButton btnEnviarMensaje;
    boolean flag = true;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chat);
        listView = (ListView)findViewById(R.id.lista_mensaje);
        editText = (EditText)findViewById(R.id.mensaje_usuario);
        btnEnviarMensaje = (FloatingActionButton)findViewById(R.id.fab);

        btnEnviarMensaje.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String texto = editText.getText().toString();
                if(flag) {
                    MensajeEnviado newMessage = new MensajeEnviado(texto,true);
                    list_chat.add(newMessage);
                }
                else {
                    MensajeEnviado newMessage = new MensajeEnviado(texto,false);
                    list_chat.add(newMessage);
                }
                ChatAdapter chatAdapter = new ChatAdapter(list_chat,getBaseContext());
                listView.setAdapter(chatAdapter);
                editText.setText("");
                flag = !flag;
            }
        });
    }
}
