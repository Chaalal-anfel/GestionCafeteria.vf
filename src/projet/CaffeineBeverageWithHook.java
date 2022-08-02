package projet;

public abstract class CaffeineBeverageWithHook extends BoissonsChaud {
      final void prepareRecipe() {
        boullirEau();
        mixer();
        versserDansCup();
        if (clientVeutCondiments()) {
            addCondiments();
        }
    }

    abstract void mixer();

    abstract void addCondiments();

    void boullirEau() {
        System.out.println("boullir de l'eau ...");
    }

    void versserDansCup() {
        System.out.println("verser dans un cup...");
    }

    boolean clientVeutCondiments() {
        return true;
    }
}
