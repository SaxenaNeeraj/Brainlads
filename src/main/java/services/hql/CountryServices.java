package services.hql;

import org.hibernate.Query;
import services.Services;

/**
 * Created by neeraj on 26/6/16.
 */
public class CountryServices extends Services {

    // This Method is used to get CountryTypeID from CountryName
    public int CountryIdLocator(String countryName)
    {
        int countryId;
        String hql = "select cl.countryId from CountryEntity cl where cl.countryName= :_countryName";
        Query query = getSession().createQuery(hql).setParameter("_countryName",countryName);
        try
        {
            countryId = (Integer)query.list().get(0);
        }catch(IndexOutOfBoundsException indexOutOfBoundsException )
        {
            countryId = 0;
        }
        return countryId;
    }

    // This Method is used to get CountryName from CountryId
    public String CountryIdLocator(int countryId)
    {
        String countryName;
        String hql = "select cl.countryName from CountryEntity cl where cl.countryId= :_countryId";
        Query query = getSession().createQuery(hql).setParameter("_countryId",countryId);
        try
        {
            countryName = (String)query.list().get(0);
        }catch(IndexOutOfBoundsException indexOutOfBoundsException )
        {
            countryName = "";
        }
        return countryName;
    }
}
