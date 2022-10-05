public class Sport extends Dealer {

    Dealer dl = new Dealer();
    
    private String bikeName = "Panigale";
    private String bikeSeries = "V4S";
    private Integer bikeCc = 1299;
    private Integer bikePower = 189;
    private Integer bikeTorque = 129;

    // Change Bike Type
    private String bikeType = (dl.bikeType = "Sports");

    
    public String getBikeType() {
        return bikeType;
    }
    public String getBikeName() {
        return bikeName;
    }
    public String getBikeSeries() {
        return bikeSeries;
    }
    public Integer getBikeCc() {
        return bikeCc;
    }
    public Integer getBikePower() {
        return bikePower;
    }
    public Integer getBikeTorque() {
        return bikeTorque;
    }

}
