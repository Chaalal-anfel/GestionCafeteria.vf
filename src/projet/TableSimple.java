package projet;

public class TableSimple implements TypeTable{

    int tableVide = 0;
    public TableSimple(int tableVide){this.tableVide= tableVide; }

    @Override
    public int TableVides() {
        return tableVide;
    }

    @Override
    public void decrémenteTable() {
        this.tableVide-=1 ;
    }

    @Override
    public double getPrixCoeff() {
        return 0.75 ;
    }
}
