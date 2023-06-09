package org.fabricaescuela.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import org.fabricaescuela.interactions.ClickReEntryButton;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class ClickReEntryBtn implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(ClickReEntryButton.makeInformation());
    }
    public static ClickReEntryBtn makeInformation(){
        return instrumented(ClickReEntryBtn.class);
    }
}
