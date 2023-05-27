package shop;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

    Toys toys1 = new Toys("cars", 145, 0000, 25);
    Toys toys2 = new Toys("dolls", 60, 1111, 20);
    Toys toys3 = new Toys("puzzles", 100, 2222, 15);
    Toys toys4 = new Toys("balls", 70, 3333, 20);
    Toys toys5 = new Toys("stuffed toys", 80, 4444, 20);

    ArrayList<String> AllToys = new ArrayList();
    AllToys.add(String.valueOf(toys1));
    AllToys.add(String.valueOf(toys2));
    AllToys.add(String.valueOf(toys3));
    AllToys.add(String.valueOf(toys4));
    AllToys.add(String.valueOf(toys5));






}
