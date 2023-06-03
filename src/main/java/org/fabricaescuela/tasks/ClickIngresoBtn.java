package org.fabricaescuela.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import org.fabricaescuela.interactions.ClickIngresoButton;
import org.fabricaescuela.userinterfaces.AdmissionsPage;

import static net.serenitybdd.screenplay.Tasks.instrumented;
public class ClickIngresoBtn implements Task{
    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(ClickIngresoButton.makeInformation());
    }
    public static ClickIngresoBtn makeInformation(){
        return instrumented(ClickIngresoBtn.class);
    }
}
