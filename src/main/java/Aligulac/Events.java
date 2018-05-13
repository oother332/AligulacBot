package Aligulac;


public class Events
{
    private String id;

    private String fullname;

    public String getId ()
    {
        return id;
    }

    public void setId (String id)
    {
        this.id = id;
    }

    public String getFullname ()
    {
        return fullname;
    }

    public void setFullname (String fullname)
    {
        this.fullname = fullname;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [id = "+id+", fullname = "+fullname+"]";
    }
}