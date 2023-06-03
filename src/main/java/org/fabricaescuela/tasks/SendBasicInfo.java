package org.fabricaescuela.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import org.fabricaescuela.interactions.ClickSendInfo;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class SendBasicInfo implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(ClickSendInfo.makeInformation());
    }
    public static SendBasicInfo makeInformation(){
        return instrumented(SendBasicInfo.class);
    }
}
