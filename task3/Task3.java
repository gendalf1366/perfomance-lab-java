package task3;

import task3.model.Root;

public class Task3 {
    public static void main(String[] args) {

        GsonParser parser = new GsonParser();

        Root root = parser.parse();

        System.out.println("Root" + root);
    }
}
