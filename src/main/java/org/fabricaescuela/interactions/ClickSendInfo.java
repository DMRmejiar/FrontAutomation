package org.fabricaescuela.interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.actions.Click;
import org.fabricaescuela.userinterfaces.AdmissionsPage;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class ClickSendInfo implements Interaction {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(AdmissionsPage.SEND_BTN)
        );
    }
    public static ClickSendInfo makeInformation(){
        return instrumented(ClickSendInfo.class);
    }
}
