package com.e.edd2proyecto.ChatModels;

public class MensajeRecibido {

    public String respuesta;
    public String id;
    public int resultado;
    public String mensaje;

    public MensajeRecibido(String respuesta, String id, int resultado, String mensaje) {
        this.respuesta = respuesta;
        this.id = id;
        this.resultado = resultado;
        this.mensaje = mensaje;
    }

    public String getRespuesta() {
        return respuesta;
    }

    public void setRespuesta(String respuesta) {
        this.respuesta = respuesta;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getResultado() {
        return resultado;
    }

    public void setResultado(int resultado) {
        this.resultado = resultado;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }


}
