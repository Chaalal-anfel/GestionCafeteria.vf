package projet;

public class TableCouple implements TypeTable{
    int tableVide = 1;
    public TableCouple(int tableVide){this.tableVide= tableVide; }

    public TableCouple() {

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
        return 1 ;
    }
}
