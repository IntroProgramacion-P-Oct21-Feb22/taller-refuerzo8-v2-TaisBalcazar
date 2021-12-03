/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tallerrefuerzo;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author USUARIO
 */
public class TallerRefuerzo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        
        String nombre;
        int cedula;
        int tipo;
        int compu;
        int compu1 = 1000;
        int compu2 = 1100;
        int compu3 = 900;
        double des1 = 1;
        double des2 = 5;
        double des3 = 10;
        double des4 = 15;
        int p_ind = 0;
        double descuento;
        int cantidad;
        String cadena_final = "";
        String salida;
        boolean bandera = true;
        int subtotal;
        double total = 0;
        double total_definitivo = 0;

        while (bandera) {

            System.out.println("Ingrese su nombre: ");
            nombre = entrada.nextLine();

            System.out.println("Ingrese su número de cédula: ");
            cedula = entrada.nextInt();

            entrada.nextLine(); //limpieza del buffer

            System.out.println("Ingrese el tipo de cliente que es: ");
            tipo = entrada.nextInt();

            System.out.println("Ingrese el tipo de computadora que desee: ");
            compu = entrada.nextInt();

            System.out.println("Ingrese la cantidad de computadoras que desee: ");
            cantidad = entrada.nextInt();

            if (compu == 1) {
                p_ind = compu1;
                if (tipo == 1) {
                    subtotal = p_ind * cantidad;
                    descuento = (subtotal * des1) / 100;
                    total = subtotal - descuento;

                } else {
                    if (tipo == 2) {
                        subtotal = p_ind * cantidad;
                        descuento = (subtotal * des2) / 100;
                        total = subtotal - descuento;

                    } else {
                        if (tipo == 3) {
                            subtotal = p_ind * cantidad;
                            descuento = (subtotal * des3) / 100;
                            total = subtotal - descuento;

                        } else {
                            if (tipo == 4) {
                                subtotal = p_ind * cantidad;
                                descuento = (subtotal * des4) / 100;
                                total = subtotal - descuento;
                            }

                        }

                    }
                }

            } else {
                if (compu == 2) {
                    p_ind = compu2;
                    if (tipo == 1) {
                        subtotal = p_ind * cantidad;
                        descuento = (subtotal * des1) / 100;
                        total = subtotal - descuento;

                    } else {
                        if (tipo == 2) {
                            subtotal = p_ind * cantidad;
                            descuento = (subtotal * des2) / 100;
                            total = subtotal - descuento;

                        } else {
                            if (tipo == 3) {
                                subtotal = p_ind * cantidad;
                                descuento = (subtotal * des3) / 100;
                                total = subtotal - descuento;

                            } else {
                                if (tipo == 4) {
                                    subtotal = p_ind * cantidad;
                                    descuento = (subtotal * des4) / 100;
                                    total = subtotal - descuento;
                                }
                            }
                        }
                    }

                } else {
                    if (compu == 3) {
                        p_ind = compu3;
                        if (tipo == 1) {
                            subtotal = p_ind * cantidad;
                            descuento = (subtotal * des1) / 100;
                            total = subtotal - descuento;

                        } else {
                            if (tipo == 2) {
                                subtotal = p_ind * cantidad;
                                descuento = (subtotal * des2) / 100;
                                total = subtotal - descuento;

                            } else {
                                if (tipo == 3) {
                                    subtotal = p_ind * cantidad;
                                    descuento = (subtotal * des3) / 100;
                                    total = subtotal - descuento;

                                } else {
                                    if (tipo == 4) {
                                        subtotal = p_ind * cantidad;
                                        descuento = (subtotal * des4) / 100;
                                        total = subtotal - descuento;
                                    }

                                }

                            }
                        }

                    }
                }
            }
            entrada.nextLine();
            System.out.println("Ingrese si para dejar de ingresar datos");
            salida = entrada.nextLine();
            total_definitivo = total_definitivo + total;
            if (salida.equals("si")||(salida.equals("Si"))) {
                bandera = false;
                
            }
            cadena_final = String.format("%sCliente %s, "
                    + "con cédula %d, "
                    + "compra %d computadora(s) con precio individual %d. "
                    + "Total a pagar %.2f\n"
                    , cadena_final
                    , nombre
                    , cedula
                    , cantidad
                    , p_ind
                    , total);
        }
        
        System.out.printf("%s\nTotal venta de computadoras:%s\n"
                , cadena_final
                , total_definitivo);
    }
    
}
