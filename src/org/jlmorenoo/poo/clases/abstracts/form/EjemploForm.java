package org.jlmorenoo.poo.clases.abstracts.form;

import org.jlmorenoo.poo.clases.abstracts.form.elementos.*;
import org.jlmorenoo.poo.clases.abstracts.form.elementos.select.Opcion;
import org.jlmorenoo.poo.clases.abstracts.form.validador.*;

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
        username.addValidador(new RequeridoValidador());

        InputForm password = new InputForm("clave", "password");
        password.addValidador(new RequeridoValidador())
                .addValidador(new LargoValidador(6, 12));

        InputForm email = new InputForm("email", "email");
        email.addValidador(new RequeridoValidador())
                .addValidador(new EmailValidador());

        InputForm edad = new InputForm("edad", "number");
        edad.addValidador(new NumeroValidador());

        TextareaForm experiencia = new TextareaForm("exp", 5, 9);

        SelectForm lenguaje = new SelectForm("Lenguaje");
        lenguaje.addValidador( new NoNuloValidador());

        //Opcion typeSccript = new  Opcion("TypeScript", "4");
        lenguaje.addOpcion(new Opcion("Java", "1").setSelected())
                .addOpcion(new Opcion("Python", "2"))
                .addOpcion(new Opcion("JavaScript", "3"))
                .addOpcion(new Opcion("TypeScript", "4"))
                .addOpcion(new Opcion("PHP", "5"));


        ElementoForm saludar = new ElementoForm("saludo") {
            @Override
            public String dibujarHtml() {
                return "<input disabled name=" + this.nombre + "' value=\"" + this.valor + "\">";
            }
        };


        saludar.setValor("Este campo esta deshabilitado");
        username.setValor("jose.moreno");
        password.setValor("sd585s75");
        email.setValor("josel.moreno@correo.com");
        edad.setValor("15");
        experiencia.setValor("... más de 10 años de experiencia ... ");
        //java.setSelected(true);
        //typeSccript.setSelected(true);

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
                lenguaje,
                saludar);

        /*for (ElementoForm elmElementoForm : elementoFormList) {
            System.out.println(elmElementoForm.dibujarHtml());
            System.out.println("<br>");
        }*/
        elementoFormList.forEach(elem -> {
            System.out.println(elem.dibujarHtml());
            System.out.println("<br>");
        });

        elementoFormList.forEach( elem -> {
            if (!elem.isValido()) {
                elem.getErroresList().forEach(System.out::println);
            }
        });


    }
}
