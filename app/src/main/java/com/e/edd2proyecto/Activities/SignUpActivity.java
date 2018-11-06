package com.e.edd2proyecto.Activities;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.e.edd2proyecto.Classes.Usuarios;
import com.e.edd2proyecto.R;

public class SignUpActivity extends AppCompatActivity {

    EditText etNombre, etApellido, etUsuario, etPassword, etPasswordConf, etFecha, etEdad;
    String nombre, apellido, user, password, passwordConf, fecha;
    int edad;
    Usuarios usuario;
    Button btnGuardar, btnCancelar;

    @SuppressLint("ResourceType")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);
        etNombre = (EditText)findViewById(R.id.etNombre);
        etApellido = (EditText) findViewById(R.id.etApellido);
        etUsuario = (EditText) findViewById(R.id.etUsuario);
        etPassword = (EditText) findViewById(R.id.etPassword);
        etPasswordConf = (EditText) findViewById(R.id.etPasswordConf);
        etFecha = (EditText) findViewById(R.id.etNacimiento);
        etEdad = (EditText) findViewById(R.id.etEdad);
        btnGuardar = (Button)findViewById(R.id.btnCrear);

        btnGuardar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                agregarUsuario();
            }
        });

        btnCancelar = (Button)findViewById(R.id.btnCancelar);

        btnCancelar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

    }

    public Usuarios agregarUsuario() {
        try{
            nombre = String.valueOf(etNombre.getText());
            apellido = String.valueOf(etApellido.getText());
            user = String.valueOf(etUsuario.getText());
            password = String.valueOf(etPassword.getText());
            passwordConf = String.valueOf(etPasswordConf.getText());
            fecha = String.valueOf(etFecha.getText());
            edad = Integer.valueOf(String.valueOf(etEdad.getText()));
            boolean disponible = true;
            //Metodo para ir a buscar a la BD si el usuario ya existe retornando un boolean, si es falso permite entrar

            if(disponible) {
                if(password.equals(passwordConf)) {
                    usuario = new Usuarios(nombre, apellido, fecha, user,password, edad);
                }
                else {
                    Toast toast = Toast.makeText(getApplicationContext(), "La contraseña no coincide con la confirmación", Toast.LENGTH_SHORT);
                    toast.show();
                }
            }
            else {
                Toast toast = Toast.makeText(getApplicationContext(), "El usuario seleccinado ya existe", Toast.LENGTH_SHORT);
                toast.show();
            }
            return usuario;

        }
        catch (Exception e) {
            Toast toast = Toast.makeText(getApplicationContext(), "Error, verifique los datos ingresados", Toast.LENGTH_SHORT);
            toast.show();
        }
        return usuario;
    }



}
