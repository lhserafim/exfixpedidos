package application;

import entities.Client;
import entities.Product;
import entities.enums.OrderStatus;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String args[]) throws ParseException {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        // Cliente Data
        System.out.println("Enter cliente data:");
        System.out.print("Name: ");
        String name = sc.nextLine();
        System.out.print("Email: ");
        String email = sc.next();
        System.out.print("Birth date (DD/MM/YYYY):");
        Date birthDate =  sdf.parse(sc.next());
        Client client = new Client(name, email, birthDate);

        // Order Data
        System.out.println("Enter order data:");
        System.out.print("Status: ");
        String orderStatus = sc.next();
        System.out.print("How many items to this order? ");
        int n = sc.nextInt();
        for (int i=1;i<=n;i++) {
            sc.nextLine();
            System.out.printf("Enter #%d item data:\n",i);
            System.out.print("Product name: ");
            String productName = sc.nextLine();
            System.out.print("Product price: ");
            Double productPrice = sc.nextDouble();
            Product product = new Product(productName, productPrice);
        }
        System.out.println(client);

        sc.close();
    }
}
