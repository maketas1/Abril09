package com.softtek.modelo.ejercicio2;

public class Calculadora {
    private static double dato1 = 5;
    private static double dato2 = 10;

    public static double sumar() {
        return dato1 + dato2;
    }

    public static double restar() {
        return dato1 - dato2;
    }

    public static double multiplicar() {
        return dato1 * dato2;
    }

    public static double dividir1() {
        if (dato1 == 0 || dato2 == 0) {
            try {
                throw new ExcepcionDe0();
            } catch (ExcepcionDe0 e) {
                e.printStackTrace();
                return 0;
            }
        } else {
            return dato1 / dato2;
        }
    }

    public static double dividir2() {
        dato1 = 0;
        dato2 = 5;
        if (dato1 == 0 || dato2 == 0) {
            try {
                throw new ExcepcionDe0();
            } catch (ExcepcionDe0 e) {
                e.printStackTrace();
                return 0;
            }
        } else {
            return dato1 / dato2;
        }
    }
}
