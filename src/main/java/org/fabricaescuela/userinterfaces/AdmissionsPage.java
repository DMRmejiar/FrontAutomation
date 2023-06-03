package org.fabricaescuela.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
public class AdmissionsPage {
    public static final Target INGRESO_BTN = Target.the("ingresoBtn")
            .locatedBy("//*[@id=\"__next\"]/div/div/a[1]");

    public static final Target SEND_BTN = Target.the("sendBtn")
            .locatedBy("/html/body/div[1]/div/div[3]/button[2]");

    public static final Target REGISTER_VALIDATION = Target.the("registerValidation")
            .locatedBy("//input[@value='Stefany Carolina De Sousa Lora']");

    public static final Target REINGRESO_BTN = Target.the("reingresoBtn")
            .locatedBy("/html/body/div[1]/div/div/a[2]");

}
