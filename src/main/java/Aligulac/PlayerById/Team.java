package Aligulac.PlayerById;

public class Team {
    private String id;

    private String name;

    private String shortname;

    private String resource_uri;

    public String getId ()
    {
        return id;
    }

    public void setId (String id)
    {
        this.id = id;
    }

    public String getName ()
    {
        return name;
    }

    public void setName (String name)
    {
        this.name = name;
    }

    public String getShortname ()
    {
        return shortname;
    }

    public void setShortname (String shortname)
    {
        this.shortname = shortname;
    }

    public String getResource_uri ()
    {
        return resource_uri;
    }

    public void setResource_uri (String resource_uri)
    {
        this.resource_uri = resource_uri;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [id = "+id+", name = "+name+", shortname = "+shortname+", resource_uri = "+resource_uri+"]";
    }
}
