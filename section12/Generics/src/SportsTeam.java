import java.util.ArrayList;
import java.util.List;

public class SportsTeam {
    // methods
    private String teamName;

    // this changed from BaseballPlayer to Player, BaseballPlayer implements Player
    // coding to an interface
    // thing is though, this is making it so that any type of player can be included in the list
    private List<Main.Player> teamMembers = new ArrayList<>();

    private int totalWins = 0;
    private int totalLosses = 0;
    private int totalTies = 0;

    // constructor
    public SportsTeam(String teamName) {
        this.teamName = teamName;
    }

    // methods
    public void addTeamMember(Main.Player player){
        // adds the team member if the player is not already in the list
        if(!teamMembers.contains(player)){
            teamMembers.add(player);
        }
    }

    public void listTeamMembers(){
        System.out.println(teamName + " Roster: ");
        System.out.println(teamMembers);
    }

    public int ranking(){
        return (totalLosses * 2) + totalTies + 1;
    }

    public String setScore(int ourScore, int theirScore){

        String message = "";

        // we won
        if(ourScore > theirScore){
            totalWins++;
            message = "beat";
        } else if (ourScore == theirScore) {
            totalTies++;
            message = "tied";
        }
        else {
            totalLosses++;
            message = "lost";
        }

        return message;
    }


    @Override
    public String toString() {
        return String.format("%s  (Ranked %d)", teamName, ranking());
    }

}
