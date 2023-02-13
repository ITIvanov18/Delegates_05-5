public class Delegate {
    public String delegateName;
    private long UCN;
    private String placeOfResidence;
    private Double travelExpenses;

    public Delegate(String delegateName, long UCN, String placeOfResidence, Double travelExpenses) {
        this.delegateName = delegateName;
        this.UCN = UCN;
        this.placeOfResidence = placeOfResidence;
        this.travelExpenses = travelExpenses;
    }

    public String getDelegateName() {
        return delegateName;
    }

    public long getUCN() {
        return UCN;
    }

    public String getPlaceOfResidence() {
        return placeOfResidence;
    }

    public Double getTravelExpenses() {
        return travelExpenses;
    }

    public void setDelegateName(String delegateName) {
        this.delegateName = delegateName;
    }

    public void setUCN(long UCN) {
        this.UCN = UCN;
    }

    public void setPlaceOfResidence(String placeOfResidence) {
        this.placeOfResidence = placeOfResidence;
    }

    public void setTravelExpenses(Double travelExpenses) {
        this.travelExpenses = travelExpenses;
    }

    public Delegate() {
        this.delegateName = "Kragioz";
        this.UCN = 9448710689L;
        this.placeOfResidence = "Dupnica";
        this.travelExpenses = 599.99;



    }
}
