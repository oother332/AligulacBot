package Aligulac.PlayerByName;


public class Players
{
    private String id;

    private String[] teams;

    private String tag;

    private String race;

    private String[] aliases;

    private String country;

    public String getId ()
    {
        return id;
    }

    public void setId (String id)
    {
        this.id = id;
    }

    public String[] getTeams ()
    {
        return teams;
    }

    public void setTeams (String[] teams)
    {
        this.teams = teams;
    }

    public String getTag ()
    {
        return tag;
    }

    public void setTag (String tag)
    {
        this.tag = tag;
    }

    public String getRace ()
    {
        return race;
    }

    public void setRace (String race)
    {
        this.race = race;
    }

    public String[] getAliases ()
    {
        return aliases;
    }

    public void setAliases (String[] aliases)
    {
        this.aliases = aliases;
    }

    public String getCountry ()
    {
        return country;
    }

    public void setCountry (String country)
    {
        this.country = country;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [id = "+id+", teams = "+teams+", tag = "+tag+", race = "+race+", aliases = "+aliases+", country = "+country+"]";
    }
}