/*
Autor: Guillem Susial 1DAM
 */
package pzeller01;

import java.util.Scanner;

public class Pzeller01 {

    static Scanner keyboard = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Guillem Susial 1DAM");

        int dia = 10, mes = 9, any = 0;
        System.out.print("Introduce el año: ");
        any = keyboard.nextInt();
        String strDia = functionDiaNacimiento(dia, mes, any);
        System.out.println("Dia internacional del programador: " + strDia +" "+ dia);
        boolean bisiesto=functionB(any);
        if (bisiesto==false){
            System.out.println("El año no es bisiesto.");
        }else{
        System.out.println("El año es bisiesto.");
        }
    }
    
    private static boolean functionB(int yyyy){
        return yyyy%4==0 && (yyyy%100 !=0 || yyyy%400 == 0);
    }
    
    private static String functionDiaNacimiento(int dia, int mes, int any) {
        String diaString = "";
        String[] semana
                = {"Domingo", "Lunes", "Martes", "Miercoles", "Jueves", "Viernes", "Sabado"};

        int a, y, m, d;
        a = (14 - mes) / 12;
        y = any - a;
        m = mes + 12 * a - 2;
        d = (dia + y + y / 4 - y / 100 + y / 400 + (31 * m) / 12) % 7;
        diaString = semana[d];
        return diaString;
    }
}
