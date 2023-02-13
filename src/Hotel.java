public class Hotel {
    private String hotelName;
    private int roomNumber;
    private double nightPrice;


    public Hotel(String hotelName, int roomNumber, double nightPrice) {
        this.hotelName = hotelName;
        this.roomNumber = roomNumber;
        this.nightPrice = nightPrice;
    }

    public Hotel() {
        this.hotelName = "Grand Hotel Bansko";
        this.roomNumber = 267;
        this.nightPrice = 500;
    }

    public String getHotelName() {
        return hotelName;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public double getNightPrice() {
        return nightPrice;
    }

    public void setHotelName(String hotelName) {
        this.hotelName = hotelName;
    }

    public void setRoomNumber(int roomNumber) {
        this.roomNumber = roomNumber;
    }

    public void setNightPrice(double nightPrice) {
        this.nightPrice = nightPrice;
    }

    @Override
    public String toString() {
        return "Hotel{" +
                "Hotel name='" + name + '\'' +
                ", Room Number='" + address + '\'' +
                ", Price for 1 night=" + phoneNumber +
                '}';
    }
}
