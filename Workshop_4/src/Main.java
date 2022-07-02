import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        VotingSystem votingSystem = new VotingSystem();
        ArrayList<Voting> x = new ArrayList<>();

        Voting v1 = new Voting(1, "Who wins the game?", false);
        v1.createChoice("Real Madrid");
        v1.createChoice("Barcelona");
        v1.createChoice("Equal");

        ArrayList<String> y = new ArrayList<>();
        y.add("Real Madrid");
        y.add("Barcelona");
        y.add("Equal");

        Person p1 = new Person("Zeinab", "Karakani");
        Person p2 = new Person("MohamadJ", "Pourmohamadi");
        Person p3 = new Person("Fatemeh", "Abdi");

        Vote meV = new Vote(p1);
        Vote heV = new Vote(p2);
        Vote sheV = new Vote(p3);

        v1.vote(p1, y);
        v1.vote(p2);
        v1.vote(p3);

        x.add(v1);
        votingSystem.setVotingList(x);
        votingSystem.printResults(0);
    }
}

