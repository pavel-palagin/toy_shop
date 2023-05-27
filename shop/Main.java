package shop;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
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

        int n = (int) Math.floor(Math.random() * AllToys.size());
        System.out.println(AllToys.get(n));

        File file = new File("C:\\Users\\Pavel\\IdeaProjects\\untitled3\\toy_shop\\shop\\file.txt");
        String text = AllToys.get(n);

        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(file, true));
            String lineSeparator = System.getProperty("line.separator");
            writer.write(text + lineSeparator);
            writer.flush();
            writer.close();
            System.out.println("Successfully written data to the file");
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
