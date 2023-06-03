package org.fabricaescuela.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class ReEntryApplication {
    public static final Target IDENTIFICATION_NUMBER = Target.the("identificationNumber")
            .locatedBy("/html/body/div[1]/div/div[2]/div[2]/div/div/div/input");

    public static final Target REENTRY_REASON = Target.the("reentryReason")
            .locatedBy("/html/body/div[1]/div/div[2]/div[3]/div/div/div/textarea[1]");

    public static final Target REENTRY_TYPE = Target.the("reentryType")
            .locatedBy("/html/body/div[1]/div/div[2]/div[5]/div/div/div/div");
    public static final Target NORMAL = Target.the("normal")
            .locatedBy("//*[@id=\"menu-\"]/div[3]/ul/li[1]");

    public static final Target CHANGES = Target.the("changes")
            .locatedBy("//*[@id=\"Changes\"]");

    public static final Target SENDAPPLICATION_BTN = Target.the("applicationBtn")
            .locatedBy("/html/body/div[1]/div/div[2]/div[6]/div/div/div/textarea[1]");


}
