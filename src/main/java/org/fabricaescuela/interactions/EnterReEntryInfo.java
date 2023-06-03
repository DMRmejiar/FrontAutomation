package org.fabricaescuela.interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.SendKeys;
import org.fabricaescuela.userinterfaces.ReEntryApplication;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class EnterReEntryInfo implements Interaction {
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                SendKeys.of("1127605590").into(ReEntryApplication.IDENTIFICATION_NUMBER),
                SendKeys.of("Laboral").into(ReEntryApplication.REENTRY_REASON),
                Click.on(ReEntryApplication.REENTRY_TYPE),
                Click.on(ReEntryApplication.NORMAL),
                SendKeys.of("Ninguno").into(ReEntryApplication.CHANGES)
        );
    }
    public static EnterReEntryInfo makeInformation(){
        return instrumented(EnterReEntryInfo.class);
    }
}
