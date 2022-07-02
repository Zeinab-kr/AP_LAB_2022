import java.util.Objects;

public class Vote {

    private final Person voter;
    private final String date;

    public Vote(Person voter, String  date) {
        this.voter = voter;
        this.date = date;
    }

    public Person getVoter() {
        return voter;
    }

    public String getDate() {
        return date;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Vote that)) return false;
        return Objects.equals(voter, that.voter) && Objects.equals(date, that.date);
    }

    @Override
    public int hashCode() {
        return Objects.hash(voter, date);
    }


    @Override
    public String toString() {
        return "" + voter;
    }
}
