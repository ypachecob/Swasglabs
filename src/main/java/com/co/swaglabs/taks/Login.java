package com.co.swaglabs.taks;

import com.co.swaglabs.models.Credentials;
import com.co.swaglabs.userinterfaces.LonginPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class Login implements Task {
    Credentials credentials;

    public Login(Credentials credentials) {
        this.credentials = credentials;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Enter.theValue(credentials.getUsername()).into(LonginPage.TXT_USERNAME));
        actor.attemptsTo(Enter.theValue(credentials.getPassword()).into(LonginPage.TXT_PASSWORD));
        actor.attemptsTo(Click.on(LonginPage.BTN_LOGIN));
    }

    public static Login enter(Credentials credentials){

        return Tasks.instrumented(Login.class,credentials);
    }


}
