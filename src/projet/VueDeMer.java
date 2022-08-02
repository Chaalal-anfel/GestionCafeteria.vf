package projet;

public class VueDeMer extends ReservationTable {

    public VueDeMer(TypeTable ttable) {
        super(ttable);
    }

    @Override

    public double prixReservation() {
        return super.prixReservation() * 1.5;   // prix intial fixé par le manager * 1.3 (si vue de le mer)
    }
}
