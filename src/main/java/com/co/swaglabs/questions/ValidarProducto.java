package com.co.swaglabs.questions;

import com.co.swaglabs.taks.ProductoPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;


public class ValidarProducto implements Question<String> {

    @Override
    public String answeredBy(Actor actor) {
        return Text.of(ProductoPage.LBL_COMPARACION_PRODUCTO).viewedBy(actor).asString();
    }
    public static ValidarProducto compare(){
        return new ValidarProducto();
    }
}
