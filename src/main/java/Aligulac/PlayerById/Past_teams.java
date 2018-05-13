package Aligulac.PlayerById;

public class Past_teams {
    private String playing;

    private String id;

    private String start;

    private String resource_uri;

    private Team team;

    private String end;

    public String getPlaying ()
    {
        return playing;
    }

    public void setPlaying (String playing)
    {
        this.playing = playing;
    }

    public String getId ()
    {
        return id;
    }

    public void setId (String id)
    {
        this.id = id;
    }

    public String getStart ()
    {
        return start;
    }

    public void setStart (String start)
    {
        this.start = start;
    }

    public String getResource_uri ()
    {
        return resource_uri;
    }

    public void setResource_uri (String resource_uri)
    {
        this.resource_uri = resource_uri;
    }

    public Team getTeam ()
    {
        return team;
    }

    public void setTeam (Team team)
    {
        this.team = team;
    }

    public String getEnd ()
    {
        return end;
    }

    public void setEnd (String end)
    {
        this.end = end;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [playing = "+playing+", id = "+id+", start = "+start+", resource_uri = "+resource_uri+", team = "+team+", end = "+end+"]";
    }
}
