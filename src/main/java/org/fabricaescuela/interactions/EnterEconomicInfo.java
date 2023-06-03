package org.fabricaescuela.interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.SendKeys;
import org.fabricaescuela.userinterfaces.EconomicInfo;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class EnterEconomicInfo implements Interaction {
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(EconomicInfo.ESTRATO),
                Click.on(EconomicInfo.LEVEL_THREE),
                Click.on(EconomicInfo.WORK_STATUS),
                Click.on(EconomicInfo.YES),
                Click.on(EconomicInfo.COUNTRY),
                Click.on(EconomicInfo.COLOMBIA),
                SendKeys.of("Universidad de Antioquia").into(EconomicInfo.COMPANY),
                SendKeys.of("FrontEnd Developer").into(EconomicInfo.ROLE),
                Click.on(EconomicInfo.PEOPLE_INCHARGE),
                Click.on(EconomicInfo.ONE),
                Click.on(EconomicInfo.CONTINUE_BTN2)
        );
    }
    public static EnterEconomicInfo makeInformation(){
        return instrumented(EnterEconomicInfo.class);
    }
}
