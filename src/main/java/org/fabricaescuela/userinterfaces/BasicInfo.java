package org.fabricaescuela.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
public class BasicInfo {
    public static final Target IDENTIFICATION_OPTION = Target.the("identificationOption")
            .locatedBy("//*[@id=\"margin\"]/div[2]/div[1]/div[1]/div/div");

    public static final Target CEDULA_CIUDADANIA = Target.the("cedulaCiudadania")
            .locatedBy("//*[@id=\"menu-\"]/div[3]/ul/li[2]");

    public static final Target IDENTIFICATION_NUMBER = Target.the("identificationNumber")
            .locatedBy("//*[@id=\"Identificacion\"]");
    public static final Target FIRSTNAME = Target.the("firstName")
            .locatedBy("//*[@id=\"Primer-nombre\"]");

    public static final Target SECONDNAME = Target.the("secondName")
            .locatedBy("//*[@id=\"Segundo-nombre\"]");

    public static final Target FIRSTLASTNAME = Target.the("firstLastName")
            .locatedBy("//*[@id=\"Primer-apellido\"]");

    public static final Target SECONDLASTNAME = Target.the("secondLastName")
            .locatedBy("//*[@id=\"Segundo-apellido\"]");

    public static final Target BIRTHDATE = Target.the("birthDate")
            .locatedBy("//*[@id=\"Fecha de nacimiento\"]");

    public static final Target YEAR = Target.the("year")
            .locatedBy("/html/body/div[3]/div[2]/div/div/div/div[2]/div/div/div[96]/button");

    public static final Target DATE = Target.the("date")
            .locatedBy("/html/body/div[3]/div[2]/div/div/div/div[2]/div/div/div[2]/div/div[3]/button[7]");

    public static final Target ADDRESS = Target.the("address")
            .locatedBy("//*[@id=\"Direccion\"]");

    public static final Target EMAILADDRESS = Target.the("emailAddress")
            .locatedBy("//*[@id=\"Correo-electronico\"]");

    public static final Target PHONENUMBER = Target.the("phoneNumber")
            .locatedBy("//*[@id=\"Celular\"]");

    public static final Target GENDER_OPTION = Target.the("genderOption")
            .locatedBy("//*[@id=\"margin\"]/div[2]/div[6]/div/div/div/div");

    public static final Target MUJER = Target.the("mujer")
            .locatedBy("//*[@id=\"menu-\"]/div[3]/ul/li[2]");
    public static final Target SIGUIENTE_BTN = Target.the("siguienteBtn")
            .locatedBy("//*[@id=\"margin\"]/div[3]/button[2]");




}
