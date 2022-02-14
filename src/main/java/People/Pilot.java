package People;

public class Pilot extends CabinCrewMember {

    private String licenceNumber;

    public Pilot(String name, Rank rank, String licenceNumber) {
        super(name, rank);
        this.licenceNumber = licenceNumber;
    }
}
