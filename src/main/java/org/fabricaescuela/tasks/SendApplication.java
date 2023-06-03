package org.fabricaescuela.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import org.fabricaescuela.interactions.SendReEntryInfo;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class SendApplication implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(SendReEntryInfo.makeInformation());
    }
    public static SendApplication makeInformation(){
        return instrumented(SendApplication.class);
    }
}
