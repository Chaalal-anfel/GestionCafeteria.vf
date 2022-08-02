package projet;

public abstract class ReservationTable {
    TypeTable ttable;
    double prix= 100;




        public ReservationTable(TypeTable ttable){
        this.ttable = ttable ;
    }

    public boolean reserver(){


        if( this.ttable.TableVides()<=0) return false;
        else {
            ttable.decrémenteTable();
            return true;
        }


    }

    public double prixReservation(){
        return ttable.getPrixCoeff()*prix;
        // le prix differe entre vuerestaurant et vuedemer* coeff (coeff ca depend du type de table
        // ( table couple a le coeff le plus élevé)  &  vuedemer plus chers que vuecafeteria

    }
}
