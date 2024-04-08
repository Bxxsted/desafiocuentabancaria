import java.util.Scanner;

public class Main {
          public static void main(String[] args) {
            String nombre = "Julian";
            String tipoDeCuenta = "Ahorros";
            double saldo = 2000.00;
            int opcion = 0;

            System.out.println("********************************************");
            System.out.println("\nNombre del cliente: " + nombre);
            System.out.println("EL tipo de cuenta es: " + tipoDeCuenta);
            System.out.println("Su saldo disponible es: " + saldo + "USD");
            System.out.println("********************************************");


            String menu = """
                ***Escriba la accion que desea realizar***
                1) Consultar saldo
                2) Retirar
                3) Depositar
                9) Salir
                """;
            Scanner teclado = new Scanner(System.in);
            while (opcion != 9) {
                System.out.println(menu);
                opcion = teclado.nextInt();

                switch (opcion){
                    case 1 :
                        System.out.println("EL saldo es: " + saldo + "USDS");
                        break;
                    case 2:
                        System.out.println("Cual es el valor a retirar?");
                        double valorRetiro = teclado.nextDouble();
                        if(saldo < valorRetiro){
                            System.out.println("Saldo insuficiente");
                        } else{
                            saldo = saldo - valorRetiro;
                            System.out.println("Su saldo es: " + saldo + "USD");
                        }
                        break;
                    case 3:
                        System.out.println("Cuanto desea depositar?");
                        double valorDeposito = teclado.nextDouble();
                        saldo += valorDeposito;
                        System.out.println("EL saldo actualizado es: " + saldo + "USD");
                        break;
                    case 9:
                        System.out.println("Saliendo del programa, gracias por utilizar nuestros servicios");
                        break;
                    default:
                        System.out.println("Opcion no valida");


                }
            }
        }
    }
