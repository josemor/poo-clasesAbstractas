package org.jlmorenoo.poo.clases.abstracts.form.validador;

public class EmailValidador extends Validador {

    protected String mensaje = "El campo %s tiene un formato de correo inválido";
    private final static String EMAIL_REGEX = "^[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:\\.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*@(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?\\.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?$";

    @Override
    public boolean isValidado(String valor) {
        return valor.matches(EMAIL_REGEX);
    }

    @Override
    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    @Override
    public String getMensaje() {
        return this.mensaje;
    }
}
