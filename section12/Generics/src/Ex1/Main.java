package Ex1;

public class Main {

     interface Player{
    }
    
    public record BaseballPlayer(String name, String position) implements Player{

        @Override
        public String toString() {
            return "My name is " + this.name + ", and I play " + this.position;
        }
    }

    public record FootballPlayer(String name, String position) implements Player{
        @Override
        public String toString() {
            return "My name is " + this.name + ", and I play " + this.position;
        }
    }

    public static void main(String[] args) {

        // dodgers sports team
        SportsTeam<BaseballPlayer> dodgers = new SportsTeam("Brooklyn Dodgers");
        dodgers.addTeamMember(new BaseballPlayer("Vlad Guerroro", "left field"));
        dodgers.addTeamMember(new BaseballPlayer("Chris Sale", "pitcher"));
        dodgers.listTeamMembers();

        // ranger sports team
        SportsTeam<BaseballPlayer> rangers = new SportsTeam("Texas Rangers");
        rangers.addTeamMember(new BaseballPlayer("Nolan Ryan", "pitcher"));
        rangers.addTeamMember(new BaseballPlayer("Ian Kinsler", "second"));
        rangers.listTeamMembers();

        // Cowboys sports team
        SportsTeam<FootballPlayer> cowboys = new SportsTeam("Dallas Cowboys");
        cowboys.addTeamMember(new FootballPlayer("Dak Prescott", "Quarterback"));
        cowboys.addTeamMember(new FootballPlayer("Jason Witten", "Tide end"));
        // this fails at compile time because it cannot convert BaseballPlayer to FootballPlayer
//        cowboys.addTeamMember(new BaseballPlayer("Roberto Clemente", "Outfield"));
        cowboys.listTeamMembers();

        // raw use
        SportsTeam cardinals = new SportsTeam("Saint Louis Cardinals");
        // see how when we use raw types there is no type checking
        cardinals.addTeamMember(new BaseballPlayer("Yadier Molina", "catcher"));
        cardinals.addTeamMember(new FootballPlayer("Emmit Smith", "running back"));
        cardinals.listTeamMembers();
    }

    public static void scoreResult(SportsTeam<Player> t1, int t1_score,
                                   SportsTeam<Player> t2, int t2_score){
        String message = t1.setScore(t1_score, t2_score);
        t2.setScore(t2_score, t1_score);
        System.out.printf("%s %s %s\n", t1, message, t2);
    }
}