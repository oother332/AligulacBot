package Aligulac.PlayerByName;


public class NameSearchResult
{
    private String[] teams;

    private Events[] events;

    private Players[] players;

    public String[] getTeams ()
    {
        return teams;
    }

    public void setTeams (String[] teams)
    {
        this.teams = teams;
    }

    public Events[] getEvents ()
    {
        return events;
    }

    public void setEvents (Events[] events)
    {
        this.events = events;
    }

    public Players[] getPlayers ()
    {
        return players;
    }

    public void setPlayers (Players[] players)
    {
        this.players = players;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [teams = "+teams+", events = "+events+", players = "+players+"]";
    }
}