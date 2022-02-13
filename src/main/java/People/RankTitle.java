package People;

public enum RankTitle {
    CAPTAIN(1),
    FIRSTOFFICER(2),
    PURSER(3),
    FLIGHTATTENDANT(4),
    PILOT(5);

    private final int value;

    RankTitle(int value) {
        this.value = value;
    }

    public int getValue() {
        return this.value;
    }
}
