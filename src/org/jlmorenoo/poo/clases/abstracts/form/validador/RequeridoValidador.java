package org.jlmorenoo.poo.clases.abstracts.form.validador;

public class RequeridoValidador extends Validador {

    protected String mensaje = "El campo %s es requerido";
    @Override
    public boolean isValidado(String valor) {
        return (valor != null && valor.length() > 0);
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
