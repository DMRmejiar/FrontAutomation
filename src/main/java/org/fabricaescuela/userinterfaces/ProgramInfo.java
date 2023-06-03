package org.fabricaescuela.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class ProgramInfo {
    public static final Target REGION = Target.the("region")
            .locatedBy("/html/body/div[1]/div/div[2]/div[2]/div[1]/div/div");

    public static final Target MY_REGION = Target.the("myRegion")
            .locatedBy("//*[@id=\"menu-\"]/div[3]/ul/li[9]");

    public static final Target SEDE = Target.the("sede")
            .locatedBy("/html/body/div[1]/div/div[2]/div[2]/div[2]/div/div");
    public static final Target SEDE_NAME = Target.the("sedeName")
            .locatedBy("//*[@id=\"menu-\"]/div[3]/ul/li");

    public static final Target PROGRAM = Target.the("program")
            .locatedBy("//*[@id=\"Programa-id\"]");

    public static final Target PROGRAM_NAME = Target.the("programName")
            .locatedBy("//*[@id=\"menu-\"]/div[3]/ul/li[5]");

    public static final Target MODALITY = Target.the("modality")
            .locatedBy("//*[@id=\"Modalidad-id\"]");

    public static final Target MODALITY_TYPE = Target.the("modalityType")
            .locatedBy("//*[@id=\"menu-\"]/div[3]/ul/li[2]");

    public static final Target INITIAL_DATE = Target.the("initialDate")
            .locatedBy("/html/body/div[1]/div/div[2]/div[4]/div[1]/div/input");

    public static final Target DATE = Target.the("date")
            .locatedBy("/html/body/div[3]/div[2]/div/div/div/div[2]/div/div/div[2]/div/div[1]/button[2]");

    public static final Target ADMISSION = Target.the("admission")
            .locatedBy("//*[@id=\"Entry-type-id\"]");

    public static final Target TYPE_ADMISSION = Target.the("typeAdmission")
            .locatedBy("//*[@id=\"menu-\"]/div[3]/ul/li[1]");

    public static final Target FINISH_BTN = Target.the("finishBtn")
            .locatedBy("//*[@id=\"margin\"]/div[3]/button[2]");

}
