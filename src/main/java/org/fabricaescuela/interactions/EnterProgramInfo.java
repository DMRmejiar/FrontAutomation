package org.fabricaescuela.interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.actions.Click;
import org.fabricaescuela.userinterfaces.ProgramInfo;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class EnterProgramInfo implements Interaction {
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(ProgramInfo.REGION),
                Click.on(ProgramInfo.MY_REGION),
                Click.on(ProgramInfo.SEDE),
                Click.on(ProgramInfo.SEDE_NAME),
                Click.on(ProgramInfo.PROGRAM),
                Click.on(ProgramInfo.PROGRAM_NAME),
                Click.on(ProgramInfo.MODALITY),
                Click.on(ProgramInfo.MODALITY_TYPE),
                Click.on(ProgramInfo.INITIAL_DATE),
                Click.on(ProgramInfo.DATE),
                Click.on(ProgramInfo.ADMISSION),
                Click.on(ProgramInfo.TYPE_ADMISSION),
                Click.on(ProgramInfo.FINISH_BTN)
        );
    }
    public static EnterProgramInfo makeInformation(){
        return instrumented(EnterProgramInfo.class);
    }
}
