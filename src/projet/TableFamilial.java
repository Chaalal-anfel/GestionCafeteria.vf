package projet;

public class TableFamilial implements TypeTable{

    int tableVide = 0;
    public TableFamilial(int tableVide){this.tableVide= tableVide; }

    public TableFamilial() {

    }

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
        return 0.5 ;
    }
}
