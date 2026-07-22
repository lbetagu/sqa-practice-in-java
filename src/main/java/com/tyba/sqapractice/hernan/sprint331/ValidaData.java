package com.tyba.sqapractice;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Helpers {

    private static final Logger logger = LoggerFactory.getLogger(Helpers.class);

    public static int pedirNumero(String mensaje, Scanner sc) {

        boolean esValido = false;
        int numeroCorrecto = 0;
        do {
            try {
                logger.info(mensaje);
                numeroCorrecto = sc.nextInt();
                sc.nextLine();
                if (numeroCorrecto > 0) {
                    esValido = true;
                } else {
                    logger.warn("El numero debe ser mayor a 0");
                }
            } catch (InputMismatchException ex) {
                logger.warn("Error: El valor ingresado no es un numero");
                sc.nextLine();
            }

        } while (!esValido);

        return numeroCorrecto;
    }

    public static String pedirTexto(String mensaje, Scanner sc) {

        boolean esValido = false;
        String textoCorrecto = "";
        do {
            try {
                logger.info(mensaje);
                textoCorrecto = sc.nextLine();
                Float.parseFloat(textoCorrecto);
                if (textoCorrecto.length() > 0) {
                    esValido = true;
                } else {
                    logger.warn("El texto no puede estar vacio");
                }
            } catch (NumberFormatException ex) {
                logger.info(mensaje);
                textoCorrecto = sc.nextLine();
                if (textoCorrecto.length() > 0) {
                    esValido = true;
                } else {
                    logger.warn("El texto no puede estar vacio");
                }
            }
        } while (!esValido);

        return textoCorrecto;
    }

}
