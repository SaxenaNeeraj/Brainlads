package services.hql;

import com.bm.hbm.ChannelTypeEntity;
import org.hibernate.Query;
import services.Services;
import sun.management.resources.agent;

import java.util.List;

/**
 * Created by neeraj on 26/6/16.
 */
public class ChannelServices extends Services {

    public boolean ChannelPinLocator(String channelCode, String pin)
    {
        String hql = "from ChannelEntity where ChannelEntity.channelId= :_channelCode and ChannelEntity.channelAd1Unit=:_pin";
        Query query = getSession().createQuery(hql).setParameter("_channelCode",channelCode).setParameter("_pin",pin);
        int size = query.list().size();
        return (size>0?true:false);
    }



    // This Method is used to get ChannelTypeID from ChannelTypeName
    public int ChannelTypeLocator(String channelTypeName)
    {
        int channelId;
        String hql = "select cl.channelTypeCode from ChannelTypeEntity cl where cl.channelTypeName= :_channelTypeName";
        Query query = getSession().createQuery(hql).setParameter("_channelTypeName",channelTypeName);
        try
        {
            channelId = (Integer)query.list().get(0);
        }catch(IndexOutOfBoundsException indexOutOfBoundsException )
        {
            channelId = 0;
        }
        return channelId;
    }

    // This Method is used to get ChannelTypeName from ChannelTypeId
    public String ChannelIdLocator(int channelId)
    {
        String channelName;
        String hql = "select cl.channelTypeName from ChannelTypeEntity cl where cl.channelTypeId= :_channelId";
        Query query = getSession().createQuery(hql).setParameter("_channelId",channelId);
        try
        {
            channelName = (String)query.list().get(0);
        }catch(IndexOutOfBoundsException indexOutOfBoundsException )
        {
            channelName = "";
        }
        return channelName;
    }
    public boolean SaveAgent()
    {

        return false;
    }

}
