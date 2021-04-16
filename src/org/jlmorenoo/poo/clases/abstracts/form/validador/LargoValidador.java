package org.jlmorenoo.poo.clases.abstracts.form.validador;

import org.jlmorenoo.poo.clases.abstracts.form.validador.mensaje.IMensajeFormateable;

public class LargoValidador extends Validador implements IMensajeFormateable {

    protected String mensaje = "El campo %s debe tener mínimo %d caracteres y máximo %d caracteres";
    private int min;
    private int max = Integer.MAX_VALUE;

    public LargoValidador() {
    }

    public void setMin(int min) {
        this.min = min;
    }

    public void setMax(int max) {
        this.max = max;
    }

    public LargoValidador(int min, int max) {
        this.min = min;
        this.max = max;
    }

    @Override
    public boolean isValidado(String valor) {
        // this.mensaje = String.format(this.mensaje, this.min, this.max);

        if (valor == null) {
            return true;
        }
        int largo = valor.length();
        return (largo >= min && largo <= max);
    }

   /* public String getMensajeFormateado(String campo) {
        return this.mensaje = String.format(this.mensaje, campo,this.min, this.max);
    }*/

    @Override
    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    @Override
    public String getMensaje() {
        return this.mensaje;
    }

    @Override
    public String getMensajeFormateado(String campo) {
        return this.mensaje = String.format(this.mensaje, campo,this.min, this.max);
    }
}
