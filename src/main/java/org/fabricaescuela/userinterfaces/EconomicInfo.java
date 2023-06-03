package org.fabricaescuela.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class EconomicInfo {
    public static final Target ESTRATO = Target.the("estrato")
            .locatedBy("/html/body/div[1]/div/div[2]/div[2]/div[1]/div/div");

    public static final Target LEVEL_THREE = Target.the("levelThree")
            .locatedBy("//*[@id=\"menu-\"]/div[3]/ul/li[4]");

    public static final Target WORK_STATUS = Target.the("workStatus")
            .locatedBy("//*[@id=\"Trabaja-id\"]");
    public static final Target YES = Target.the("yes")
            .locatedBy("//*[@id=\"menu-\"]/div[3]/ul/li[2]");

    public static final Target COUNTRY = Target.the("country")
            .locatedBy("/html/body/div[1]/div/div[2]/div[3]/div[1]/div/div");

    public static final Target COLOMBIA = Target.the("colombia")
            .locatedBy("//*[@id=\"menu-\"]/div[3]/ul/li[3]");

    public static final Target COMPANY = Target.the("company")
            .locatedBy("/html/body/div[1]/div/div[2]/div[3]/div[2]/div/input");

    public static final Target ROLE = Target.the("role")
            .locatedBy("/html/body/div[1]/div/div[2]/div[4]/div[1]/div/input");

    public static final Target PEOPLE_INCHARGE = Target.the("peopleInCharge")
            .locatedBy("//*[@id=\"Npersonas-id\"]");

    public static final Target ONE = Target.the("one")
            .locatedBy("//*[@id=\"menu-\"]/div[3]/ul/li[2]");

    public static final Target CONTINUE_BTN2 = Target.the("continueBtn2")
            .locatedBy("//*[@id=\"margin\"]/div[3]/button[2]");

}
