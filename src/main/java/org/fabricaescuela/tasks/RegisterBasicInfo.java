package org.fabricaescuela.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import org.fabricaescuela.interactions.*;
import org.fabricaescuela.userinterfaces.AdmissionsPage;

import static net.serenitybdd.screenplay.Tasks.instrumented;
public class RegisterBasicInfo implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(EnterBasicInfo.makeInformation());
        actor.attemptsTo(EnterAcademicInfo.makeInformation());
        actor.attemptsTo(EnterEconomicInfo.makeInformation());
        actor.attemptsTo(EnterProgramInfo.makeInformation());
    }
    public static RegisterBasicInfo makeInformation(){
        return instrumented(RegisterBasicInfo.class);
    }
}
