package services.hql;

import org.hibernate.Query;
import services.Services;

/**
 * Created by neeraj on 26/6/16.
 */
public class CityServices extends Services {

    // This Method is used to get CityTypeID from CityName
    public int CityIdLocator(String cityName)
    {
        int cityId;
        String hql = "select cl.cityId from CityEntity cl where cl.cityName= :_cityName";
        Query query = getSession().createQuery(hql).setParameter("_cityName",cityName);
        try
        {
            cityId = (Integer)query.list().get(0);
        }catch(IndexOutOfBoundsException indexOutOfBoundsException )
        {
            cityId = 0;
        }
        return cityId;
    }

    // This Method is used to get CityName from CityId
    public String CityIdLocator(int cityId)
    {
        String cityName;
        String hql = "select cl.cityName from CityEntity cl where cl.cityId= :_cityId";
        Query query = getSession().createQuery(hql).setParameter("_cityId",cityId);
        try
        {
            cityName = (String)query.list().get(0);
        }catch(IndexOutOfBoundsException indexOutOfBoundsException )
        {
            cityName = "";
        }
        return cityName;
    }
}
