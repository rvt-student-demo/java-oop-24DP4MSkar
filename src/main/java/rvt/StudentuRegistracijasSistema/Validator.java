package rvt.StudentuRegistracijasSistema;

public class Validator {

    public static boolean validateName(String name) {
        return name.matches("^[A-Za-z]{3,}$");
    }

    public static boolean validateEmail(String email) {
        return email.matches("^[A-Za-z0-9+_.-]+@(.+)$");
    }

    public static boolean validatePersonalCode(String code) {
        return code.matches("^\\d{11}$");
    }
}