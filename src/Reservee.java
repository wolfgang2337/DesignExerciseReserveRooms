public class Reservee {
    private String name;
    private CampusRank rank;

    public Reservee(String name, CampusRank rank) {
        this.name = name;
        this.rank = rank;
    }

    public String toString() {
        return String.format("I am %s and I am of rank %s", name, rank);
    }
}
