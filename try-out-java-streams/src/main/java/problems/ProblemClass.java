package problems;

import problems.models.Order;
import problems.models.Product;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class ProblemClass {

    /**
     * Exercise 1 — Obtain a list of products belongs to category “Books” with price > 100
     * Input - List<Product>
     */
    void Problem1(){
        List<Product> products = new ArrayList<>();

        products.stream()
                .filter(product -> product.getCategory().equalsIgnoreCase("Books"))
                .filter(product -> product.getPrice()>100)
                .collect(Collectors.toList());
    }

    /**
     * Exercise 2 — Obtain a list of order with products belong to category “Baby”
     * Input - List<Order>
     */
    void Problem2(){
        List<Order> orders = new ArrayList<>();

        orders.stream()
                .filter(order -> order
                        .getProducts()
                        .stream()
                        .anyMatch(product -> product.getCategory().equalsIgnoreCase("Baby")))
                .toList();
    }

    /**
     * Exercise 3 — Obtain a list of product with category = “Toys” and then apply 10% discount
     * Input - List<Product>
     */
    void Problem3(){
        List<Product> products = new ArrayList<>();

        products.stream()
                .filter(product -> product.getCategory().equalsIgnoreCase("Toys"))
                .map(product -> product.withPrice(product.getPrice() * 0.9))
                .toList();
    }

    /**
     * Exercise 4 — Obtain a list of products ordered by customer of tier 2 between 01-Feb-2021 and 01-Apr-2021
     * Input - List<Order>
     */
    void Problem4(){
        List<Order> orders = new ArrayList<>();

        orders.stream()
                .filter(order -> order.getCustomer().getTier() == 2)
                .filter(order -> order.getOrderDate().compareTo(LocalDate.of(2021, 2, 1)) >= 0)
                .filter(order -> order.getOrderDate().compareTo(LocalDate.of(2021, 4, 1)) <= 0)
                .flatMap(order -> order.getProducts().stream())
                .distinct()
                .toList();
    }

    /**
     * Exercise 5 — Get the cheapest products of “Books” category
     * Input - List<Product>
     */
    void Problem5(){
        List<Product> products = new ArrayList<>();

        products.stream()
                .filter(product -> product.getCategory().equalsIgnoreCase("Books"))
                .min(Comparator.comparing(Product::getPrice));
    }

    /**
     * Exercise 6 — Get the 3 most recent placed order
     * Input - List<Order>
     */
    void Problem6(){
        List<Order> orders = new ArrayList<>();

        orders.stream()
                .sorted(Comparator.comparing(Order::getOrderDate).reversed())
                .limit(3)
                .toList();
    }

    /**
     * Exercise 7 — Get a list of orders which were ordered on 15-Mar-2021,
     * log the order records to the console and then return its product list
     * Input - List<Order>
     */
    void Problem7(){
        List<Order> orders = new ArrayList<>();

        orders.stream()
                .filter(order -> order.getOrderDate().compareTo(LocalDate.of(2021, 3, 15)) == 0)
                .peek(System.out::println)
                .flatMap(order -> order.getProducts().stream())
                .distinct()
                .toList();
    }

    /**
     * Exercise 8 — Calculate total lump sum of all orders placed in Feb 2021
     * Input - List<Order>
     */
    void Problem8(){
        List<Order> orders = new ArrayList<>();

        var a = orders.stream()
                .filter(o -> o.getOrderDate().compareTo(LocalDate.of(2021, 2, 1)) >= 0)
                .filter(o -> o.getOrderDate().compareTo(LocalDate.of(2021, 3, 1)) < 0)
                .flatMap(order -> order.getProducts().stream())
                .mapToDouble(product -> product.getPrice()).sum();
    }
}
