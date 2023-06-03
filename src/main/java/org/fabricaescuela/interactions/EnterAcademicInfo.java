package org.fabricaescuela.interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.SendKeys;
import org.fabricaescuela.userinterfaces.AcademicInfo;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class EnterAcademicInfo implements Interaction {
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(AcademicInfo.ACADEMICINFO_BUTTON),
                Click.on(AcademicInfo.FORMATION_LEVEL),
                Click.on(AcademicInfo.PREGRADO),
                SendKeys.of("Universidad de Antioquia").into(AcademicInfo.INSTITUTION_NAME),
                SendKeys.of("Ingeniero de Sistemas").into(AcademicInfo.TITLE_OBTAINED),
                Click.on(AcademicInfo.GRADUATION_STATUS),
                Click.on(AcademicInfo.NOGRADUATED),
                SendKeys.of("2023").into(AcademicInfo.GRAD_YEAR),
                Click.on(AcademicInfo.ADD_BTN),
                Click.on(AcademicInfo.DELETE_BTN),
                Click.on(AcademicInfo.ACADEMICINFO_BUTTON),
                Click.on(AcademicInfo.FORMATION_LEVEL),
                Click.on(AcademicInfo.PREGRADO),
                SendKeys.of("Universidad de Antioquia").into(AcademicInfo.INSTITUTION_NAME),
                SendKeys.of("Ingeniero de Sistemas").into(AcademicInfo.TITLE_OBTAINED),
                Click.on(AcademicInfo.GRADUATION_STATUS),
                Click.on(AcademicInfo.NOGRADUATED),
                SendKeys.of("2023").into(AcademicInfo.GRAD_YEAR),
                Click.on(AcademicInfo.ADD_BTN),
                Click.on(AcademicInfo.MODIFY_BTN),
                SendKeys.of("2022").into(AcademicInfo.MODIFY_YEAR),
                Click.on(AcademicInfo.ADD_CHANGES),
                Click.on(AcademicInfo.CONTINUE_BTN)
        );
    }
    public static EnterAcademicInfo makeInformation(){
        return instrumented(EnterAcademicInfo.class);
    }
}
