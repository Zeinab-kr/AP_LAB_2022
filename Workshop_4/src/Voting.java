import java.util.Random;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class Voting {

    Random rand = new Random();
    private int type;
    private String question;
    private HashMap<String, HashSet<Vote>> choices;
    private boolean isAnonymous;
    private ArrayList<Person> voters;
    private HashSet<Vote> y = new HashSet<>();


    public Voting(int type, String question, boolean isAnonymous) {
        this.type = type;
        this.question = question;
        this.choices = new HashMap<>();
        this.isAnonymous = isAnonymous;
        this.voters = new ArrayList<>();

    }

    public void setType(int type) {
        this.type = type;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public void setChoices(HashMap<String, HashSet<Vote>> choices) {
        this.choices = choices;
    }

    public void setAnonymous(boolean anonymous) {
        isAnonymous = anonymous;
    }

    public void setVoters(ArrayList<Person> voters) {
        this.voters = voters;
    }

    public int getType() {
        return type;
    }

    public ArrayList<Person> getVoters() {
        return voters;
    }

    public String getQuestion() {
        return question;
    }

    public boolean getIsAnonymous() {
        return isAnonymous;
    }

    public ArrayList<String> getChoices() {
        ArrayList<String> choicesA = new ArrayList<>();

        choicesA.addAll(choices.keySet());
        return choicesA;
    }

    public void createChoice(String choice) {
        y = new HashSet<>();
        choices.put(choice, y);
    }


    public void vote(Person voter, ArrayList<String> voterChoice) {
        Vote x = new Vote(voter);


        for (String s : voterChoice) {
            if (choices.containsKey(s)) {
                y = choices.get(s);
                y.add(x);
                choices.replace(s, y);
                this.voters.add(x.getVoter());
            }
        }
    }
    public void vote(Person person) {
        Vote x = new Vote(person);
        ArrayList<String> o = new ArrayList<>(choices.keySet());

        int index = rand.nextInt(choices.size());

        y = choices.get(o.get(index));
        y.add(x);
        choices.replace(o.get(index), y);
        this.voters.add(x.getVoter());

    }

    public void printResult() {
        System.out.println("\nQuestion: " + getQuestion() + "\n");
        if (getIsAnonymous()) {
            for (String p: choices.keySet()) {
                System.out.println(p + " ---> " + choices.get(p).size());
            }
        }
        else {
            printVoters();
        }

    }

    public void printVoters(){
        if (!getIsAnonymous()){
            System.out.println("\nQuestion: " + getQuestion() + "\n");
            for (String p: choices.keySet()) {
                System.out.println(p + " ---> " + choices.get(p).toString());
            }
        }
    }
}
