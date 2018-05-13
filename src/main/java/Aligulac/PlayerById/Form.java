package Aligulac.PlayerById;

public class Form {
    private String[] total;

    private String[] T;

    private String[] P;

    private String[] Z;

    public String[] getTotal ()
    {
        return total;
    }

    public void setTotal (String[] total)
    {
        this.total = total;
    }

    public String[] getT ()
    {
        return T;
    }

    public void setT (String[] T)
    {
        this.T = T;
    }

    public String[] getP ()
    {
        return P;
    }

    public void setP (String[] P)
    {
        this.P = P;
    }

    public String[] getZ ()
    {
        return Z;
    }

    public void setZ (String[] Z)
    {
        this.Z = Z;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [total = "+total+", T = "+T+", P = "+P+", Z = "+Z+"]";
    }
}
