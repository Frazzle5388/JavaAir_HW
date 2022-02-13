public enum PlaneType {

    BOEING747(200),
    AIRBUSA380(300);

    private final int capacity;

    PlaneType(int capacity) {
        this.capacity = capacity;
    }

    public int getCapacity() {
        return capacity;
    }
}
