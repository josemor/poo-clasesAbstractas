package org.jlmorenoo.poo.clases.abstracts.form.validador;

abstract public class Validador {

    protected String mensaje;


    abstract public boolean isValidado(String valor);
    abstract public void setMensaje(String mensaje);
    abstract public String getMensaje();
}
