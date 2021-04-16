package org.jlmorenoo.poo.clases.abstracts.form.validador;

public class NoNuloValidador extends Validador{
    protected String mensaje = "El campo %s no puede ser nulo";
    @Override
    public boolean isValidado(String valor) {
        return (valor != null);
    }

    @Override
    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    @Override
    public String getMensaje() {
        return mensaje;
    }
}
