import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {



    public static void main(String[] args) {


        Cliente sofkau = new Cliente();

        executeGame(sofkau);


    }

    private static void executeGame(Cliente client) {
        Scanner sc = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);

        System.out.println("" +
                "1- Añadir mesero\n" +
                "2- Eliminar mesero \n" +
                "3- Generar una orden\n" +
                "4- Notificar a todos\n" +
                "8- Salir");
        int menuOption = sc.nextInt();

        switch (menuOption){
            case 1:
                System.out.println("Nombre del mesero a añadir");
                String nameToBeAdded = sc2.nextLine();

                Mesero mesero = new Mesero(nameToBeAdded);
                client.addObserver(mesero);

                System.out.println("Mesero añadido.");
                executeGame(client);
                break;

            case 2:
                client.getObservers().forEach(System.out::println);

                System.out.println("Eliminar mesero");
                String nameToBeRemoved = sc2.nextLine();

                client.removeByName(nameToBeRemoved);
                System.out.println("Mesero eliminado.");
                executeGame(client);
                break;

            case 3:
                System.out.println("Numero de mesa:");
                String tableNumber = sc2.nextLine();
                String productName = "0";
                List<Pedido> pedidosList = new ArrayList<>();
                do {
                    Scanner sc3 = new Scanner(System.in);
                    Scanner sc4 = new Scanner(System.in);
                    System.out.println("Producto:");
                    productName = sc3.nextLine();
                    System.out.println("Cantidad:");
                    String amount = sc4.nextLine();
                    if (!productName.equals("0"))
                        pedidosList.add(new Pedido(tableNumber, productName, new Double(amount)));
                }while(!productName.equals("0"));
                client.addOrder(pedidosList);0
                executeGame(client);
                break;
            case 4:
                client.notifiy();
                break;
            case 8:
                System.out.println("Gracias por utilizar nuestro sistema!");
                break;
            default:
                System.out.println("Opción incorrecta");
        }
        sc.close();
        sc2.close();
    }
}