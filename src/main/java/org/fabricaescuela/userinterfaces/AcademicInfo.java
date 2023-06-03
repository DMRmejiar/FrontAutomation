package org.fabricaescuela.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class AcademicInfo {
    public static final Target ACADEMICINFO_BUTTON = Target.the("academicInfoButton")
            .locatedBy("//*[@id=\"margin\"]/div[2]/div[2]/button");

    public static final Target FORMATION_LEVEL = Target.the("formationLevel")
            .locatedBy("//*[@id=\"NivelForm-id\"]");

    public static final Target PREGRADO = Target.the("pregrado")
            .locatedBy("//*[@id=\"menu-\"]/div[3]/ul/li[1]");
    public static final Target INSTITUTION_NAME = Target.the("institutionName")
            .locatedBy("/html/body/div[1]/div/div[2]/div[2]/div/div[2]/div/div/div[1]/div[2]/div/input");

    public static final Target TITLE_OBTAINED = Target.the("titleObtained")
            .locatedBy("/html/body/div[1]/div/div[2]/div[2]/div/div[2]/div/div/div[2]/div[1]/div/input");

    public static final Target GRADUATION_STATUS = Target.the("graduationStatus")
            .locatedBy("//*[@id=\"Graduado-id\"]");

    public static final Target NOGRADUATED = Target.the("noGraduated")
            .locatedBy("//*[@id=\"menu-\"]/div[3]/ul/li[2]");

    public static final Target GRAD_YEAR = Target.the("graduationYear")
            .locatedBy("/html/body/div[1]/div/div[2]/div[2]/div/div[2]/div/div/div[3]/div/div/div/input");

    public static final Target ADD_BTN = Target.the("addBtn")
            .locatedBy("//*[@id=\"margin\"]/div[2]/div[2]/div/div[2]/div/div/div[4]/div/button[2]");

    public static final Target DELETE_BTN = Target.the("addBtn")
            .locatedBy("/html/body/div[1]/div/div[2]/div[1]/div/div[2]/div[2]/div/div/div/div/div[6]/div/button[2]");

    public static final Target MODIFY_BTN = Target.the("addBtn")
            .locatedBy("/html/body/div[1]/div/div[2]/div[1]/div/div[2]/div[2]/div/div/div/div/div[6]/div/button[1]");

    public static final Target MODIFY_YEAR = Target.the("modifyYear")
            .locatedBy("/html/body/div[1]/div/div[2]/div[2]/div/div[2]/div/div/div[3]/div/div/div/input");

    public static final Target ADD_CHANGES = Target.the("addChanges")
            .locatedBy("/html/body/div[1]/div/div[2]/div[2]/div/div[2]/div/div/div[4]/div/button[2]");
    public static final Target CONTINUE_BTN = Target.the("continueBtn")
            .locatedBy("//*[@id=\"margin\"]/div[3]/button[2]");

}
