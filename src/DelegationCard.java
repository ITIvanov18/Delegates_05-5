public class DelegationCard {
    private int delegateID;
    private String dateOfArrival;
    private String dateOfDeparture;

    public DelegationCard(int delegateID, String dateOfArrival, String dateOfDeparture) {
        this.delegateID = delegateID;
        this.dateOfArrival = dateOfArrival;
        this.dateOfDeparture = dateOfDeparture;
    }

    public DelegationCard() {
        this.delegateID = 865391805;
        this.dateOfArrival = "06.02.2023г.";
        this.dateOfDeparture = "10.02.2023г.";
    }

}
