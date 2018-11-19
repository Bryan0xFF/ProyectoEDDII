package com.e.edd2proyecto.ChatModels;

public class MensajeEnviado {

    private String mensaje;
    private boolean esEnviado;

    public MensajeEnviado(String mensaje, boolean esEnviado) {
        this.mensaje = mensaje;
        this.esEnviado = esEnviado;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    public boolean isEsEnviado() {
        return esEnviado;
    }

    public void setEsEnviado(boolean esEnviado) {
        this.esEnviado = esEnviado;
    }

}
