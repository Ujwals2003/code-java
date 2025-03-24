public class IPLTeamsEnum {
    public static void main(String[] args) {

        IPLTeams[] teams = IPLTeams.values();


        System.out.println("Total number of teams in IPL: " + teams.length);


        System.out.println("List of IPL Teams:");
        for (IPLTeams team : teams) {
            System.out.println("- " + team);
        }
    }
}