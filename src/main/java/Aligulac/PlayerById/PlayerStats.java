package Aligulac.PlayerById;

public class PlayerStats
{
    private String total_earnings;

    private String birthday;

    private String romanized_name;

    private String tlpd_db;

    private Past_teams[] past_teams;

    private Form form;

    private String tag;

    private String mcnum;

    private String sc2e_id;

    private String race;

    private String[] aliases;

    private String country;

    private String id;

    private String dom_end;

    private Current_teams[] current_teams;

    private Current_rating current_rating;

    private String tlpd_id;

    private String dom_val;

    private String name;

    private String resource_uri;

    private String lp_name;

    private String dom_start;

    public String getTotal_earnings ()
    {
        return total_earnings;
    }

    public void setTotal_earnings (String total_earnings)
    {
        this.total_earnings = total_earnings;
    }

    public String getBirthday ()
    {
        return birthday;
    }

    public void setBirthday (String birthday)
    {
        this.birthday = birthday;
    }

    public String getRomanized_name ()
    {
        return romanized_name;
    }

    public void setRomanized_name (String romanized_name)
    {
        this.romanized_name = romanized_name;
    }

    public String getTlpd_db ()
    {
        return tlpd_db;
    }

    public void setTlpd_db (String tlpd_db)
    {
        this.tlpd_db = tlpd_db;
    }

    public Past_teams[] getPast_teams ()
    {
        return past_teams;
    }

    public void setPast_teams (Past_teams[] past_teams)
    {
        this.past_teams = past_teams;
    }

    public Form getForm ()
    {
        return form;
    }

    public void setForm (Form form)
    {
        this.form = form;
    }

    public String getTag ()
    {
        return tag;
    }

    public void setTag (String tag)
    {
        this.tag = tag;
    }

    public String getMcnum ()
    {
        return mcnum;
    }

    public void setMcnum (String mcnum)
    {
        this.mcnum = mcnum;
    }

    public String getSc2e_id ()
    {
        return sc2e_id;
    }

    public void setSc2e_id (String sc2e_id)
    {
        this.sc2e_id = sc2e_id;
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

    public String getId ()
    {
        return id;
    }

    public void setId (String id)
    {
        this.id = id;
    }

    public String getDom_end ()
    {
        return dom_end;
    }

    public void setDom_end (String dom_end)
    {
        this.dom_end = dom_end;
    }

    public Current_teams[] getCurrent_teams ()
    {
        return current_teams;
    }

    public void setCurrent_teams (Current_teams[] current_teams)
    {
        this.current_teams = current_teams;
    }

    public Current_rating getCurrent_rating ()
    {
        return current_rating;
    }

    public void setCurrent_rating (Current_rating current_rating)
    {
        this.current_rating = current_rating;
    }

    public String getTlpd_id ()
    {
        return tlpd_id;
    }

    public void setTlpd_id (String tlpd_id)
    {
        this.tlpd_id = tlpd_id;
    }

    public String getDom_val ()
    {
        return dom_val;
    }

    public void setDom_val (String dom_val)
    {
        this.dom_val = dom_val;
    }

    public String getName ()
    {
        return name;
    }

    public void setName (String name)
    {
        this.name = name;
    }

    public String getResource_uri ()
    {
        return resource_uri;
    }

    public void setResource_uri (String resource_uri)
    {
        this.resource_uri = resource_uri;
    }

    public String getLp_name ()
    {
        return lp_name;
    }

    public void setLp_name (String lp_name)
    {
        this.lp_name = lp_name;
    }

    public String getDom_start ()
    {
        return dom_start;
    }

    public void setDom_start (String dom_start)
    {
        this.dom_start = dom_start;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [total_earnings = "+total_earnings+", birthday = "+birthday+", romanized_name = "+romanized_name+", tlpd_db = "+tlpd_db+", past_teams = "+past_teams+", form = "+form+", tag = "+tag+", mcnum = "+mcnum+", sc2e_id = "+sc2e_id+", race = "+race+", aliases = "+aliases+", country = "+country+", id = "+id+", dom_end = "+dom_end+", current_teams = "+current_teams+", current_rating = "+current_rating+", tlpd_id = "+tlpd_id+", dom_val = "+dom_val+", name = "+name+", resource_uri = "+resource_uri+", lp_name = "+lp_name+", dom_start = "+dom_start+"]";
    }
}