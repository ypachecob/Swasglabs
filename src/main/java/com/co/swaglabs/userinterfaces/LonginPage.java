package com.co.swaglabs.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class LonginPage {

    public static final Target TXT_USERNAME = Target.the("enter the username")
            .locatedBy("//*[@id='user-name']");

    public static final Target TXT_PASSWORD = Target.the("enter the password")
            .locatedBy("//*[@id='password']");

    public static final Target BTN_LOGIN = Target.the("click the button login")
            .locatedBy("//*[@id='login-button']");


}

