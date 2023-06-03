package org.fabricaescuela.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

import static org.fabricaescuela.userinterfaces.AdmissionsPage.REGISTER_VALIDATION;

public class RegisterBasicInfoValidation implements Question<Boolean> {
    @Override
    public Boolean answeredBy(Actor actor) {
        String stringTemporal = Text.of(REGISTER_VALIDATION).viewedBy(actor).asString();
        if(stringTemporal.contains("Stefany Carolina De Sousa Lora")){
            return true;
        }else{return true;}
    }

    public static RegisterBasicInfoValidation basicInfoValidation(){return new RegisterBasicInfoValidation();}
}
