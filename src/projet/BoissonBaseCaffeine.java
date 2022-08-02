package projet;

public abstract class BoissonBaseCaffeine extends BoissonsChaud {
    final void prepareRecipe() {
        boullirEau();
        mixer();
        versserDansCup();
        ajouterCondiments();
    }

    abstract void mixer();

    abstract void ajouterCondiments();

    void boullirEau() {
        System.out.println("boullir de l'eau...");
    }

    void versserDansCup() {
        System.out.println("versser dans un cup...");
    }

}
