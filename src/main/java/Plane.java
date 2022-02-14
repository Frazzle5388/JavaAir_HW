public class Plane {

    private PlaneType type;

    public Plane(PlaneType planeType) {
        super(planeType.getCapacity(), planeType.getWeight());
    }
}
