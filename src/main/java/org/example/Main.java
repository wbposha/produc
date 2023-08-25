package org.example;

public class Main {
    public static void main (String[] args) {
        Product book = new Book(
                1,
                "Spring",
                200,
                "Walter White",
                100,
                1488
        );

        book.use();

        Product tShirt = new TShirt(
                2,
                "Comme Des Garcon",
                10000,
                "Black",
                "XL"


        );

        tShirt.use();
    }


}
