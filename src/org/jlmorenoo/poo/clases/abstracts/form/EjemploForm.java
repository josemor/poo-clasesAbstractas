package org.jlmorenoo.poo.clases.abstracts.form;

import org.jlmorenoo.poo.clases.abstracts.form.elementos.ElementoForm;
import org.jlmorenoo.poo.clases.abstracts.form.elementos.InputForm;
import org.jlmorenoo.poo.clases.abstracts.form.elementos.SelectForm;
import org.jlmorenoo.poo.clases.abstracts.form.elementos.TextareaForm;
import org.jlmorenoo.poo.clases.abstracts.form.elementos.select.Opcion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class EjemploForm {
    public static void main(String[] args) {

        /*
        * No se puede instaciar una clase abstracta,
        * para poder solucionar este inconveniente se crea una clase anónima
        **/

       /* ElementoForm elementoForm = new ElementoForm() {
            @Override
            public String dibujarHtml() {
                return null;
            }
        };*/

        InputForm username = new InputForm("username");
        InputForm password = new InputForm("clave", "password");
        InputForm email = new InputForm("email", "email");
        InputForm edad = new InputForm("edad", "number");

        TextareaForm experiencia = new TextareaForm("exp", 5, 9);

        SelectForm lenguaje = new SelectForm("Lenguaje");

        Opcion java = new Opcion("Java", "1");
        lenguaje.addOpcion(java)
        .addOpcion(new Opcion("Python", "2"))
        .addOpcion(new Opcion("JavaScript", "3"))
        .addOpcion(new Opcion("TypeScript", "4"))
        .addOpcion(new Opcion("PHP", "5"));


        username.setValor("jlmoreno.ospina");
        password.setValor("1a586");
        email.setValor("josel.moreno@correo.com");
        edad.setValor("34");
        experiencia.setValor("... más de 10 años de experiencia ... ");
        java.setSelected(true);

        /*List<ElementoForm> elementoFormList = new ArrayList<>();
        elementoFormList.add(username);
        elementoFormList.add(password);
        elementoFormList.add(email);
        elementoFormList.add(edad);
        elementoFormList.add(experiencia);
        elementoFormList.add(lenguaje);*/
        List<ElementoForm> elementoFormList = Arrays.asList(username,
                password,
                email,
                edad,
                experiencia,
                lenguaje);

        /*for (ElementoForm elmElementoForm : elementoFormList) {
            System.out.println(elmElementoForm.dibujarHtml());
            System.out.println("<br>");
        }*/
        elementoFormList.forEach( elem -> {
            System.out.println(elem.dibujarHtml());
            System.out.println("<br>");
        });


    }
}
