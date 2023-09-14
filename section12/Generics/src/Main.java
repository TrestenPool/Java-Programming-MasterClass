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
//        BaseballTeam dodgers1 = new BaseballTeam("Brooklyn Dodgers");
//        BaseballTeam rangers1 = new BaseballTeam("Texas Rangers");

        // dodgers sports team
        SportsTeam dodgers = new SportsTeam("Brooklyn Dodgers");
        dodgers.addTeamMember(new BaseballPlayer("Vlad Guerroro", "left field"));
        dodgers.addTeamMember(new BaseballPlayer("Chris Sale", "pitcher"));
        dodgers.listTeamMembers();

        // ranger sports team
        SportsTeam rangers = new SportsTeam("Texas Rangers");
        rangers.addTeamMember(new BaseballPlayer("Nolan Ryan", "pitcher"));
        rangers.addTeamMember(new BaseballPlayer("Ian Kinsler", "second"));
        rangers.listTeamMembers();

        // Cowboys team
        SportsTeam cowboys = new SportsTeam("Dallas Cowboys");
        cowboys.addTeamMember(new FootballPlayer("Dak Prescott", "Quarterback"));
        cowboys.addTeamMember(new FootballPlayer("Jason Witten", "Tide end"));
        cowboys.listTeamMembers();


    }

    public static void scoreResult(BaseballTeam t1, int t1_score,
                                   BaseballTeam t2, int t2_score){
        String message = t1.setScore(t1_score, t2_score);
        t2.setScore(t2_score, t1_score);
        System.out.printf("%s %s %s\n", t1, message, t2);
    }

    public static void scoreResult(SportsTeam t1, int t1_score,
                                   SportsTeam t2, int t2_score){
        String message = t1.setScore(t1_score, t2_score);
        t2.setScore(t2_score, t1_score);
        System.out.printf("%s %s %s\n", t1, message, t2);
    }
}