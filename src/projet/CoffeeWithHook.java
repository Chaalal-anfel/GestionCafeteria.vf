package projet;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;


public class CoffeeWithHook extends CaffeineBeverageWithHook{
    public void mixer() {
        System.out.println("Gouttes de café à travers le filtre\n...");
    }

    public void addCondiments() {
        System.out.println("Adding sugar and milk...");
    }

    public boolean clientVeutCondiments() {
        String reponse = getUserInput();

        if (reponse.toLowerCase().startsWith("y")) {
            return true;
        } else {
            return false;
        }
    }

    private String getUserInput() {
        String reponse = null;

        System.out.print("veut tu ajouter du lait et du sucre a ton caffée ? (y/n) ");

        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        try {
            reponse = in.readLine();
        } catch (IOException ioe) {
            System.err.println("IO error essayer de lire ta reponse");
        }

        if (reponse == null) {
            return "no";
        }

        return reponse;
    }
}
