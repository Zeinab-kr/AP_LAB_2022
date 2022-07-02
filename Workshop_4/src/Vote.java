import java.time.LocalDateTime;
import java.util.Objects;

public class Vote {

    private final Person voter;
    private final LocalDateTime date;

    public Vote(Person voter, LocalDateTime date) {
        this.voter = voter;
        this.date = date;
    }

    public Vote(Person voter) {
        this.voter = voter;
        date = LocalDateTime.now();
    }

    public Person getVoter() {
        return voter;
    }

    public LocalDateTime getDate() {
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
