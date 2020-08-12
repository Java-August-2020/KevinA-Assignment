public class Iphone extends Phone implements Ringable{
    public Iphone(String versionNumber, int batteryPercentage, String carrier, String ringTone) {
        super(versionNumber, batteryPercentage, carrier, ringTone);
    }

    @Override
    public void displayInfo() {
        System.out.println("iPhone " + this.getVersionNumber() + " " + "from " + this.getCarrier());

    }

    @Override
    public String ring() {
        return "iPhone " + "says "+ this.getVersionNumber() + " " + this.getRingTone() + "!";
    }

    @Deprecated
    public String unlock() {
        return "Unlocking via facial recognition";
    }
}
