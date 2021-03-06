package fi.csc.avaa.smear.db.model.impl;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.json.JSON;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.impl.BaseModelImpl;
import com.liferay.portal.service.ServiceContext;

import com.liferay.portlet.expando.model.ExpandoBridge;
import com.liferay.portlet.expando.util.ExpandoBridgeFactoryUtil;

import fi.csc.avaa.smear.db.model.HyyCoord;
import fi.csc.avaa.smear.db.model.HyyCoordModel;
import fi.csc.avaa.smear.db.model.HyyCoordSoap;

import java.io.Serializable;

import java.sql.Types;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * The base model implementation for the HyyCoord service. Represents a row in the &quot;coord_hyy&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link fi.csc.avaa.smear.db.model.HyyCoordModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link HyyCoordImpl}.
 * </p>
 *
 * @author tkantola
 * @see HyyCoordImpl
 * @see fi.csc.avaa.smear.db.model.HyyCoord
 * @see fi.csc.avaa.smear.db.model.HyyCoordModel
 * @generated
 */
@JSON(strict = true)
public class HyyCoordModelImpl extends BaseModelImpl<HyyCoord>
    implements HyyCoordModel {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this class directly. All methods that expect a hyy coord model instance should use the {@link fi.csc.avaa.smear.db.model.HyyCoord} interface instead.
     */
    public static final String TABLE_NAME = "coord_hyy";
    public static final Object[][] TABLE_COLUMNS = {
            { "arrTimeID", Types.BIGINT },
            { "arrTime", Types.TIMESTAMP },
            { "matTime", Types.FLOAT },
            { "year", Types.INTEGER },
            { "month", Types.INTEGER },
            { "day", Types.INTEGER },
            { "hour", Types.INTEGER },
            { "doy", Types.INTEGER },
            { "backTime", Types.INTEGER },
            { "lat100", Types.FLOAT },
            { "lon100", Types.FLOAT },
            { "alt100", Types.FLOAT },
            { "azim100", Types.FLOAT },
            { "lat250", Types.FLOAT },
            { "lon250", Types.FLOAT },
            { "alt250", Types.FLOAT },
            { "azim250", Types.FLOAT },
            { "lat500", Types.FLOAT },
            { "lon500", Types.FLOAT },
            { "alt500", Types.FLOAT },
            { "azim500", Types.FLOAT }
        };
    public static final String TABLE_SQL_CREATE = "create table coord_hyy (arrTimeID LONG not null primary key,arrTime DATE null,matTime DOUBLE,year INTEGER,month INTEGER,day INTEGER,hour INTEGER,doy INTEGER,backTime INTEGER,lat100 DOUBLE,lon100 DOUBLE,alt100 DOUBLE,azim100 DOUBLE,lat250 DOUBLE,lon250 DOUBLE,alt250 DOUBLE,azim250 DOUBLE,lat500 DOUBLE,lon500 DOUBLE,alt500 DOUBLE,azim500 DOUBLE)";
    public static final String TABLE_SQL_DROP = "drop table coord_hyy";
    public static final String ORDER_BY_JPQL = " ORDER BY hyyCoord.arrTimeID ASC";
    public static final String ORDER_BY_SQL = " ORDER BY coord_hyy.arrTimeID ASC";
    public static final String DATA_SOURCE = "trajektori";
    public static final String SESSION_FACTORY = "trajektoriSessionFactory";
    public static final String TX_MANAGER = "liferayTransactionManager";
    public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
                "value.object.entity.cache.enabled.fi.csc.avaa.smear.db.model.HyyCoord"),
            true);
    public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
                "value.object.finder.cache.enabled.fi.csc.avaa.smear.db.model.HyyCoord"),
            true);
    public static final boolean COLUMN_BITMASK_ENABLED = false;
    public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(com.liferay.util.service.ServiceProps.get(
                "lock.expiration.time.fi.csc.avaa.smear.db.model.HyyCoord"));
    private static ClassLoader _classLoader = HyyCoord.class.getClassLoader();
    private static Class<?>[] _escapedModelInterfaces = new Class[] {
            HyyCoord.class
        };
    private long _arrTimeID;
    private Date _arrTime;
    private float _matTime;
    private int _year;
    private int _month;
    private int _day;
    private int _hour;
    private int _doy;
    private int _backTime;
    private float _lat100;
    private float _lon100;
    private float _alt100;
    private float _azim100;
    private float _lat250;
    private float _lon250;
    private float _alt250;
    private float _azim250;
    private float _lat500;
    private float _lon500;
    private float _alt500;
    private float _azim500;
    private HyyCoord _escapedModel;

    public HyyCoordModelImpl() {
    }

    /**
     * Converts the soap model instance into a normal model instance.
     *
     * @param soapModel the soap model instance to convert
     * @return the normal model instance
     */
    public static HyyCoord toModel(HyyCoordSoap soapModel) {
        if (soapModel == null) {
            return null;
        }

        HyyCoord model = new HyyCoordImpl();

        model.setArrTimeID(soapModel.getArrTimeID());
        model.setArrTime(soapModel.getArrTime());
        model.setMatTime(soapModel.getMatTime());
        model.setYear(soapModel.getYear());
        model.setMonth(soapModel.getMonth());
        model.setDay(soapModel.getDay());
        model.setHour(soapModel.getHour());
        model.setDoy(soapModel.getDoy());
        model.setBackTime(soapModel.getBackTime());
        model.setLat100(soapModel.getLat100());
        model.setLon100(soapModel.getLon100());
        model.setAlt100(soapModel.getAlt100());
        model.setAzim100(soapModel.getAzim100());
        model.setLat250(soapModel.getLat250());
        model.setLon250(soapModel.getLon250());
        model.setAlt250(soapModel.getAlt250());
        model.setAzim250(soapModel.getAzim250());
        model.setLat500(soapModel.getLat500());
        model.setLon500(soapModel.getLon500());
        model.setAlt500(soapModel.getAlt500());
        model.setAzim500(soapModel.getAzim500());

        return model;
    }

    /**
     * Converts the soap model instances into normal model instances.
     *
     * @param soapModels the soap model instances to convert
     * @return the normal model instances
     */
    public static List<HyyCoord> toModels(HyyCoordSoap[] soapModels) {
        if (soapModels == null) {
            return null;
        }

        List<HyyCoord> models = new ArrayList<HyyCoord>(soapModels.length);

        for (HyyCoordSoap soapModel : soapModels) {
            models.add(toModel(soapModel));
        }

        return models;
    }

    @Override
    public long getPrimaryKey() {
        return _arrTimeID;
    }

    @Override
    public void setPrimaryKey(long primaryKey) {
        setArrTimeID(primaryKey);
    }

    @Override
    public Serializable getPrimaryKeyObj() {
        return _arrTimeID;
    }

    @Override
    public void setPrimaryKeyObj(Serializable primaryKeyObj) {
        setPrimaryKey(((Long) primaryKeyObj).longValue());
    }

    @Override
    public Class<?> getModelClass() {
        return HyyCoord.class;
    }

    @Override
    public String getModelClassName() {
        return HyyCoord.class.getName();
    }

    @Override
    public Map<String, Object> getModelAttributes() {
        Map<String, Object> attributes = new HashMap<String, Object>();

        attributes.put("arrTimeID", getArrTimeID());
        attributes.put("arrTime", getArrTime());
        attributes.put("matTime", getMatTime());
        attributes.put("year", getYear());
        attributes.put("month", getMonth());
        attributes.put("day", getDay());
        attributes.put("hour", getHour());
        attributes.put("doy", getDoy());
        attributes.put("backTime", getBackTime());
        attributes.put("lat100", getLat100());
        attributes.put("lon100", getLon100());
        attributes.put("alt100", getAlt100());
        attributes.put("azim100", getAzim100());
        attributes.put("lat250", getLat250());
        attributes.put("lon250", getLon250());
        attributes.put("alt250", getAlt250());
        attributes.put("azim250", getAzim250());
        attributes.put("lat500", getLat500());
        attributes.put("lon500", getLon500());
        attributes.put("alt500", getAlt500());
        attributes.put("azim500", getAzim500());

        return attributes;
    }

    @Override
    public void setModelAttributes(Map<String, Object> attributes) {
        Long arrTimeID = (Long) attributes.get("arrTimeID");

        if (arrTimeID != null) {
            setArrTimeID(arrTimeID);
        }

        Date arrTime = (Date) attributes.get("arrTime");

        if (arrTime != null) {
            setArrTime(arrTime);
        }

        Float matTime = (Float) attributes.get("matTime");

        if (matTime != null) {
            setMatTime(matTime);
        }

        Integer year = (Integer) attributes.get("year");

        if (year != null) {
            setYear(year);
        }

        Integer month = (Integer) attributes.get("month");

        if (month != null) {
            setMonth(month);
        }

        Integer day = (Integer) attributes.get("day");

        if (day != null) {
            setDay(day);
        }

        Integer hour = (Integer) attributes.get("hour");

        if (hour != null) {
            setHour(hour);
        }

        Integer doy = (Integer) attributes.get("doy");

        if (doy != null) {
            setDoy(doy);
        }

        Integer backTime = (Integer) attributes.get("backTime");

        if (backTime != null) {
            setBackTime(backTime);
        }

        Float lat100 = (Float) attributes.get("lat100");

        if (lat100 != null) {
            setLat100(lat100);
        }

        Float lon100 = (Float) attributes.get("lon100");

        if (lon100 != null) {
            setLon100(lon100);
        }

        Float alt100 = (Float) attributes.get("alt100");

        if (alt100 != null) {
            setAlt100(alt100);
        }

        Float azim100 = (Float) attributes.get("azim100");

        if (azim100 != null) {
            setAzim100(azim100);
        }

        Float lat250 = (Float) attributes.get("lat250");

        if (lat250 != null) {
            setLat250(lat250);
        }

        Float lon250 = (Float) attributes.get("lon250");

        if (lon250 != null) {
            setLon250(lon250);
        }

        Float alt250 = (Float) attributes.get("alt250");

        if (alt250 != null) {
            setAlt250(alt250);
        }

        Float azim250 = (Float) attributes.get("azim250");

        if (azim250 != null) {
            setAzim250(azim250);
        }

        Float lat500 = (Float) attributes.get("lat500");

        if (lat500 != null) {
            setLat500(lat500);
        }

        Float lon500 = (Float) attributes.get("lon500");

        if (lon500 != null) {
            setLon500(lon500);
        }

        Float alt500 = (Float) attributes.get("alt500");

        if (alt500 != null) {
            setAlt500(alt500);
        }

        Float azim500 = (Float) attributes.get("azim500");

        if (azim500 != null) {
            setAzim500(azim500);
        }
    }

    @JSON
    @Override
    public long getArrTimeID() {
        return _arrTimeID;
    }

    @Override
    public void setArrTimeID(long arrTimeID) {
        _arrTimeID = arrTimeID;
    }

    @JSON
    @Override
    public Date getArrTime() {
        return _arrTime;
    }

    @Override
    public void setArrTime(Date arrTime) {
        _arrTime = arrTime;
    }

    @JSON
    @Override
    public float getMatTime() {
        return _matTime;
    }

    @Override
    public void setMatTime(float matTime) {
        _matTime = matTime;
    }

    @JSON
    @Override
    public int getYear() {
        return _year;
    }

    @Override
    public void setYear(int year) {
        _year = year;
    }

    @JSON
    @Override
    public int getMonth() {
        return _month;
    }

    @Override
    public void setMonth(int month) {
        _month = month;
    }

    @JSON
    @Override
    public int getDay() {
        return _day;
    }

    @Override
    public void setDay(int day) {
        _day = day;
    }

    @JSON
    @Override
    public int getHour() {
        return _hour;
    }

    @Override
    public void setHour(int hour) {
        _hour = hour;
    }

    @JSON
    @Override
    public int getDoy() {
        return _doy;
    }

    @Override
    public void setDoy(int doy) {
        _doy = doy;
    }

    @JSON
    @Override
    public int getBackTime() {
        return _backTime;
    }

    @Override
    public void setBackTime(int backTime) {
        _backTime = backTime;
    }

    @JSON
    @Override
    public float getLat100() {
        return _lat100;
    }

    @Override
    public void setLat100(float lat100) {
        _lat100 = lat100;
    }

    @JSON
    @Override
    public float getLon100() {
        return _lon100;
    }

    @Override
    public void setLon100(float lon100) {
        _lon100 = lon100;
    }

    @JSON
    @Override
    public float getAlt100() {
        return _alt100;
    }

    @Override
    public void setAlt100(float alt100) {
        _alt100 = alt100;
    }

    @JSON
    @Override
    public float getAzim100() {
        return _azim100;
    }

    @Override
    public void setAzim100(float azim100) {
        _azim100 = azim100;
    }

    @JSON
    @Override
    public float getLat250() {
        return _lat250;
    }

    @Override
    public void setLat250(float lat250) {
        _lat250 = lat250;
    }

    @JSON
    @Override
    public float getLon250() {
        return _lon250;
    }

    @Override
    public void setLon250(float lon250) {
        _lon250 = lon250;
    }

    @JSON
    @Override
    public float getAlt250() {
        return _alt250;
    }

    @Override
    public void setAlt250(float alt250) {
        _alt250 = alt250;
    }

    @JSON
    @Override
    public float getAzim250() {
        return _azim250;
    }

    @Override
    public void setAzim250(float azim250) {
        _azim250 = azim250;
    }

    @JSON
    @Override
    public float getLat500() {
        return _lat500;
    }

    @Override
    public void setLat500(float lat500) {
        _lat500 = lat500;
    }

    @JSON
    @Override
    public float getLon500() {
        return _lon500;
    }

    @Override
    public void setLon500(float lon500) {
        _lon500 = lon500;
    }

    @JSON
    @Override
    public float getAlt500() {
        return _alt500;
    }

    @Override
    public void setAlt500(float alt500) {
        _alt500 = alt500;
    }

    @JSON
    @Override
    public float getAzim500() {
        return _azim500;
    }

    @Override
    public void setAzim500(float azim500) {
        _azim500 = azim500;
    }

    @Override
    public ExpandoBridge getExpandoBridge() {
        return ExpandoBridgeFactoryUtil.getExpandoBridge(0,
            HyyCoord.class.getName(), getPrimaryKey());
    }

    @Override
    public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
        ExpandoBridge expandoBridge = getExpandoBridge();

        expandoBridge.setAttributes(serviceContext);
    }

    @Override
    public HyyCoord toEscapedModel() {
        if (_escapedModel == null) {
            _escapedModel = (HyyCoord) ProxyUtil.newProxyInstance(_classLoader,
                    _escapedModelInterfaces, new AutoEscapeBeanHandler(this));
        }

        return _escapedModel;
    }

    @Override
    public Object clone() {
        HyyCoordImpl hyyCoordImpl = new HyyCoordImpl();

        hyyCoordImpl.setArrTimeID(getArrTimeID());
        hyyCoordImpl.setArrTime(getArrTime());
        hyyCoordImpl.setMatTime(getMatTime());
        hyyCoordImpl.setYear(getYear());
        hyyCoordImpl.setMonth(getMonth());
        hyyCoordImpl.setDay(getDay());
        hyyCoordImpl.setHour(getHour());
        hyyCoordImpl.setDoy(getDoy());
        hyyCoordImpl.setBackTime(getBackTime());
        hyyCoordImpl.setLat100(getLat100());
        hyyCoordImpl.setLon100(getLon100());
        hyyCoordImpl.setAlt100(getAlt100());
        hyyCoordImpl.setAzim100(getAzim100());
        hyyCoordImpl.setLat250(getLat250());
        hyyCoordImpl.setLon250(getLon250());
        hyyCoordImpl.setAlt250(getAlt250());
        hyyCoordImpl.setAzim250(getAzim250());
        hyyCoordImpl.setLat500(getLat500());
        hyyCoordImpl.setLon500(getLon500());
        hyyCoordImpl.setAlt500(getAlt500());
        hyyCoordImpl.setAzim500(getAzim500());

        hyyCoordImpl.resetOriginalValues();

        return hyyCoordImpl;
    }

    @Override
    public int compareTo(HyyCoord hyyCoord) {
        long primaryKey = hyyCoord.getPrimaryKey();

        if (getPrimaryKey() < primaryKey) {
            return -1;
        } else if (getPrimaryKey() > primaryKey) {
            return 1;
        } else {
            return 0;
        }
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (!(obj instanceof HyyCoord)) {
            return false;
        }

        HyyCoord hyyCoord = (HyyCoord) obj;

        long primaryKey = hyyCoord.getPrimaryKey();

        if (getPrimaryKey() == primaryKey) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public int hashCode() {
        return (int) getPrimaryKey();
    }

    @Override
    public void resetOriginalValues() {
    }

    @Override
    public CacheModel<HyyCoord> toCacheModel() {
        HyyCoordCacheModel hyyCoordCacheModel = new HyyCoordCacheModel();

        hyyCoordCacheModel.arrTimeID = getArrTimeID();

        Date arrTime = getArrTime();

        if (arrTime != null) {
            hyyCoordCacheModel.arrTime = arrTime.getTime();
        } else {
            hyyCoordCacheModel.arrTime = Long.MIN_VALUE;
        }

        hyyCoordCacheModel.matTime = getMatTime();

        hyyCoordCacheModel.year = getYear();

        hyyCoordCacheModel.month = getMonth();

        hyyCoordCacheModel.day = getDay();

        hyyCoordCacheModel.hour = getHour();

        hyyCoordCacheModel.doy = getDoy();

        hyyCoordCacheModel.backTime = getBackTime();

        hyyCoordCacheModel.lat100 = getLat100();

        hyyCoordCacheModel.lon100 = getLon100();

        hyyCoordCacheModel.alt100 = getAlt100();

        hyyCoordCacheModel.azim100 = getAzim100();

        hyyCoordCacheModel.lat250 = getLat250();

        hyyCoordCacheModel.lon250 = getLon250();

        hyyCoordCacheModel.alt250 = getAlt250();

        hyyCoordCacheModel.azim250 = getAzim250();

        hyyCoordCacheModel.lat500 = getLat500();

        hyyCoordCacheModel.lon500 = getLon500();

        hyyCoordCacheModel.alt500 = getAlt500();

        hyyCoordCacheModel.azim500 = getAzim500();

        return hyyCoordCacheModel;
    }

    @Override
    public String toString() {
        StringBundler sb = new StringBundler(43);

        sb.append("{arrTimeID=");
        sb.append(getArrTimeID());
        sb.append(", arrTime=");
        sb.append(getArrTime());
        sb.append(", matTime=");
        sb.append(getMatTime());
        sb.append(", year=");
        sb.append(getYear());
        sb.append(", month=");
        sb.append(getMonth());
        sb.append(", day=");
        sb.append(getDay());
        sb.append(", hour=");
        sb.append(getHour());
        sb.append(", doy=");
        sb.append(getDoy());
        sb.append(", backTime=");
        sb.append(getBackTime());
        sb.append(", lat100=");
        sb.append(getLat100());
        sb.append(", lon100=");
        sb.append(getLon100());
        sb.append(", alt100=");
        sb.append(getAlt100());
        sb.append(", azim100=");
        sb.append(getAzim100());
        sb.append(", lat250=");
        sb.append(getLat250());
        sb.append(", lon250=");
        sb.append(getLon250());
        sb.append(", alt250=");
        sb.append(getAlt250());
        sb.append(", azim250=");
        sb.append(getAzim250());
        sb.append(", lat500=");
        sb.append(getLat500());
        sb.append(", lon500=");
        sb.append(getLon500());
        sb.append(", alt500=");
        sb.append(getAlt500());
        sb.append(", azim500=");
        sb.append(getAzim500());
        sb.append("}");

        return sb.toString();
    }

    @Override
    public String toXmlString() {
        StringBundler sb = new StringBundler(67);

        sb.append("<model><model-name>");
        sb.append("fi.csc.avaa.smear.db.model.HyyCoord");
        sb.append("</model-name>");

        sb.append(
            "<column><column-name>arrTimeID</column-name><column-value><![CDATA[");
        sb.append(getArrTimeID());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>arrTime</column-name><column-value><![CDATA[");
        sb.append(getArrTime());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>matTime</column-name><column-value><![CDATA[");
        sb.append(getMatTime());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>year</column-name><column-value><![CDATA[");
        sb.append(getYear());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>month</column-name><column-value><![CDATA[");
        sb.append(getMonth());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>day</column-name><column-value><![CDATA[");
        sb.append(getDay());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>hour</column-name><column-value><![CDATA[");
        sb.append(getHour());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>doy</column-name><column-value><![CDATA[");
        sb.append(getDoy());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>backTime</column-name><column-value><![CDATA[");
        sb.append(getBackTime());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>lat100</column-name><column-value><![CDATA[");
        sb.append(getLat100());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>lon100</column-name><column-value><![CDATA[");
        sb.append(getLon100());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>alt100</column-name><column-value><![CDATA[");
        sb.append(getAlt100());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>azim100</column-name><column-value><![CDATA[");
        sb.append(getAzim100());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>lat250</column-name><column-value><![CDATA[");
        sb.append(getLat250());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>lon250</column-name><column-value><![CDATA[");
        sb.append(getLon250());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>alt250</column-name><column-value><![CDATA[");
        sb.append(getAlt250());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>azim250</column-name><column-value><![CDATA[");
        sb.append(getAzim250());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>lat500</column-name><column-value><![CDATA[");
        sb.append(getLat500());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>lon500</column-name><column-value><![CDATA[");
        sb.append(getLon500());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>alt500</column-name><column-value><![CDATA[");
        sb.append(getAlt500());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>azim500</column-name><column-value><![CDATA[");
        sb.append(getAzim500());
        sb.append("]]></column-value></column>");

        sb.append("</model>");

        return sb.toString();
    }
}
