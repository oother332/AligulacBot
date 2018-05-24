package Aligulac.MatchPrediction;

public class Outcomes
{
    private String scb;

    private String sca;

    private String prob;

    public String getScb ()
    {
        return scb;
    }

    public void setScb (String scb)
    {
        this.scb = scb;
    }

    public String getSca ()
    {
        return sca;
    }

    public void setSca (String sca)
    {
        this.sca = sca;
    }

    public String getProb ()
    {
        return prob;
    }

    public void setProb (String prob)
    {
        this.prob = prob;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [scb = "+scb+", sca = "+sca+", prob = "+prob+"]";
    }
}

