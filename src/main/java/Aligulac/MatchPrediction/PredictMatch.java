package Aligulac.MatchPrediction;

public class PredictMatch
{
    private String scb;

    private Plb plb;

    private Outcomes[] outcomes;

    private String sca;

    private String proba;

    private Pla pla;

    private String probb;

    private String rta;

    private String rtb;

    private String resource_uri;

    public String getScb ()
    {
        return scb;
    }

    public void setScb (String scb)
    {
        this.scb = scb;
    }

    public Plb getPlb ()
    {
        return plb;
    }

    public void setPlb (Plb plb)
    {
        this.plb = plb;
    }

    public Outcomes[] getOutcomes ()
    {
        return outcomes;
    }

    public void setOutcomes (Outcomes[] outcomes)
    {
        this.outcomes = outcomes;
    }

    public String getSca ()
    {
        return sca;
    }

    public void setSca (String sca)
    {
        this.sca = sca;
    }

    public String getProba ()
    {
        return proba;
    }

    public void setProba (String proba)
    {
        this.proba = proba;
    }

    public Pla getPla ()
    {
        return pla;
    }

    public void setPla (Pla pla)
    {
        this.pla = pla;
    }

    public String getProbb ()
    {
        return probb;
    }

    public void setProbb (String probb)
    {
        this.probb = probb;
    }

    public String getRta ()
    {
        return rta;
    }

    public void setRta (String rta)
    {
        this.rta = rta;
    }

    public String getRtb ()
    {
        return rtb;
    }

    public void setRtb (String rtb)
    {
        this.rtb = rtb;
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
        return "ClassPojo [scb = "+scb+", plb = "+plb+", outcomes = "+outcomes+", sca = "+sca+", proba = "+proba+", pla = "+pla+", probb = "+probb+", rta = "+rta+", rtb = "+rtb+", resource_uri = "+resource_uri+"]";
    }
}