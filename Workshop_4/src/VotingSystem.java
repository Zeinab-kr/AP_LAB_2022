import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class VotingSystem {
    private ArrayList<Voting> votingList;

    public VotingSystem() {
        this.votingList = new ArrayList<>();
    }

    public ArrayList<Voting> getVotingList() {
        return votingList;
    }

    public void setVotingList(ArrayList<Voting> votingList) {
        this.votingList = votingList;
    }

    public void createVoting(String question, boolean isAnonymous, int type, ArrayList<String> choices){
        Voting voting = new Voting(type, question, isAnonymous);
        HashMap<String, HashSet<Vote>> x = new HashMap<>();
        for (String choice : choices) {
            x.put(choice, null);
        }

        votingList.add(voting);
    }


    public Voting getVoting(int index){
        return votingList.get(index);
    }


    public void printResults(int index){
        votingList.get(index).printResult();
    }


    public void printVoters(int index){
        votingList.get(index).getVoters();
        for (int i = 0; i < votingList.get(index).getVoters().size(); i++) {
            votingList.get(index).getVoters().get(i).toString();
        }

    }


    public void printVoting(int index){
        votingList.get(index).printResult();
    }





}
