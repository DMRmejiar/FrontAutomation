package org.fabricaescuela.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import org.fabricaescuela.interactions.EnterReEntryInfo;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class ReEntryInfo implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(EnterReEntryInfo.makeInformation());
    }
    public static ReEntryInfo makeInformation(){
        return instrumented(ReEntryInfo.class);
    }
}
