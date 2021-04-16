package org.jlmorenoo.poo.clases.abstracts.form.elementos;

import org.jlmorenoo.poo.clases.abstracts.form.validador.LargoValidador;
import org.jlmorenoo.poo.clases.abstracts.form.validador.Validador;
import org.jlmorenoo.poo.clases.abstracts.form.validador.mensaje.IMensajeFormateable;

import java.util.ArrayList;
import java.util.List;

abstract public class ElementoForm {

    protected String nombre;
    protected String valor;

    private List<Validador> validadorList;
    private List<String> erroresList;

    public ElementoForm() {
        this.validadorList = new ArrayList<>();
        this.erroresList = new ArrayList<>();
    }

    public ElementoForm(String nombre) {
        this();
        this.nombre = nombre;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }

    public ElementoForm addValidador(Validador validador) {
        this.validadorList.add(validador);
        //con This Retorna el mismo tipo de clase.
        return this;
    }

    public List<String> getErroresList() {
        return erroresList;
    }

    public boolean isValido() {
        for (Validador val : validadorList) {
            if (!val.isValidado(this.valor)) {
                if (val instanceof IMensajeFormateable) {
                    this.erroresList.add(((IMensajeFormateable) val).getMensajeFormateado(nombre));
                } else {
                    this.erroresList.add(String.format(val.getMensaje(), nombre));
                }
            }
        }
        return this.erroresList.isEmpty();
    }

    abstract public String dibujarHtml();


}
