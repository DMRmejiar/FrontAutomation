package org.fabricaescuela.interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.SendKeys;
import org.fabricaescuela.userinterfaces.BasicInfo;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class EnterBasicInfo implements Interaction {
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(BasicInfo.IDENTIFICATION_OPTION),
                Click.on(BasicInfo.CEDULA_CIUDADANIA),
                SendKeys.of("1127605590").into(BasicInfo.IDENTIFICATION_NUMBER),
                SendKeys.of("Stefany").into(BasicInfo.FIRSTNAME),
                SendKeys.of("Carolina").into(BasicInfo.SECONDNAME),
                SendKeys.of("De Sousa").into(BasicInfo.FIRSTLASTNAME),
                SendKeys.of("Lora").into(BasicInfo.SECONDLASTNAME),
                Click.on(BasicInfo.BIRTHDATE),
                Click.on(BasicInfo.YEAR),
                Click.on(BasicInfo.DATE),
                SendKeys.of("Calle 67 #53-108").into(BasicInfo.ADDRESS),
                SendKeys.of("stefany.desousa@udea.edu.co").into(BasicInfo.EMAILADDRESS),
                SendKeys.of("3018779878").into(BasicInfo.PHONENUMBER),
                Click.on(BasicInfo.GENDER_OPTION),
                Click.on(BasicInfo.MUJER),
                Click.on(BasicInfo.SIGUIENTE_BTN)
        );
    }
    public static EnterBasicInfo makeInformation(){
        return instrumented(EnterBasicInfo.class);
    }
}
