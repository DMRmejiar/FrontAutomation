package org.fabricaescuela.interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.actions.Click;
import org.fabricaescuela.userinterfaces.ReEntryApplication;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class SendReEntryInfo implements Interaction {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(ReEntryApplication.SENDAPPLICATION_BTN)
        );
    }
    public static SendReEntryInfo makeInformation(){
        return instrumented(SendReEntryInfo.class);
    }
}
