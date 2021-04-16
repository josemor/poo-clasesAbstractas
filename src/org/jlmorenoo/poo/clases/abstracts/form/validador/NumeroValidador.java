package org.jlmorenoo.poo.clases.abstracts.form.validador;

public class NumeroValidador extends Validador {
    protected String mensaje = "El campo %s debe ser un número";

    @Override
    public boolean isValidado(String valor) {
        try {
            Integer.parseInt(valor);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
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
