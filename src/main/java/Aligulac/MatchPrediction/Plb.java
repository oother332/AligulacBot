package Aligulac.MatchPrediction;

public class Plb
{
    private String id;

    private String tag;

    private String resource_uri;

    private String race;

    private String country;

    public String getId ()
    {
        return id;
    }

    public void setId (String id)
    {
        this.id = id;
    }

    public String getTag ()
    {
        return tag;
    }

    public void setTag (String tag)
    {
        this.tag = tag;
    }

    public String getResource_uri ()
    {
        return resource_uri;
    }

    public void setResource_uri (String resource_uri)
    {
        this.resource_uri = resource_uri;
    }

    public String getRace ()
    {
        return race;
    }

    public void setRace (String race)
    {
        this.race = race;
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
        return "ClassPojo [id = "+id+", tag = "+tag+", resource_uri = "+resource_uri+", race = "+race+", country = "+country+"]";
    }
}