package fi.csc.smear.db.model.impl;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.json.JSON;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.impl.BaseModelImpl;
import com.liferay.portal.service.ServiceContext;

import com.liferay.portlet.expando.model.ExpandoBridge;
import com.liferay.portlet.expando.util.ExpandoBridgeFactoryUtil;

import fi.csc.smear.db.model.Smearstation;
import fi.csc.smear.db.model.SmearstationModel;
import fi.csc.smear.db.model.SmearstationSoap;

import java.io.Serializable;

import java.sql.Types;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * The base model implementation for the Smearstation service. Represents a row in the &quot;station&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link fi.csc.smear.db.model.SmearstationModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link SmearstationImpl}.
 * </p>
 *
 * @author pj
 * @see SmearstationImpl
 * @see fi.csc.smear.db.model.Smearstation
 * @see fi.csc.smear.db.model.SmearstationModel
 * @generated
 */
@JSON(strict = true)
public class SmearstationModelImpl extends BaseModelImpl<Smearstation>
    implements SmearstationModel {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this class directly. All methods that expect a smearstation model instance should use the {@link fi.csc.smear.db.model.Smearstation} interface instead.
     */
    public static final String TABLE_NAME = "station";
    public static final Object[][] TABLE_COLUMNS = {
            { "stationID", Types.BIGINT },
            { "dcmipoint", Types.VARCHAR },
            { "name", Types.VARCHAR },
            { "dataAvail", Types.BOOLEAN }
        };
    public static final String TABLE_SQL_CREATE = "create table station (stationID LONG not null primary key,dcmipoint VARCHAR(75) null,name VARCHAR(75) null,dataAvail BOOLEAN)";
    public static final String TABLE_SQL_DROP = "drop table station";
    public static final String ORDER_BY_JPQL = " ORDER BY smearstation.stationID ASC";
    public static final String ORDER_BY_SQL = " ORDER BY station.stationID ASC";
    public static final String DATA_SOURCE = "smear";
    public static final String SESSION_FACTORY = "smearSessionFactory";
    public static final String TX_MANAGER = "liferayTransactionManager";
    public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
                "value.object.entity.cache.enabled.fi.csc.smear.db.model.Smearstation"),
            true);
    public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
                "value.object.finder.cache.enabled.fi.csc.smear.db.model.Smearstation"),
            true);
    public static final boolean COLUMN_BITMASK_ENABLED = false;
    public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(com.liferay.util.service.ServiceProps.get(
                "lock.expiration.time.fi.csc.smear.db.model.Smearstation"));
    private static ClassLoader _classLoader = Smearstation.class.getClassLoader();
    private static Class<?>[] _escapedModelInterfaces = new Class[] {
            Smearstation.class
        };
    private long _stationID;
    private String _dcmipoint;
    private String _name;
    private boolean _dataAvail;
    private Smearstation _escapedModel;

    public SmearstationModelImpl() {
    }

    /**
     * Converts the soap model instance into a normal model instance.
     *
     * @param soapModel the soap model instance to convert
     * @return the normal model instance
     */
    public static Smearstation toModel(SmearstationSoap soapModel) {
        if (soapModel == null) {
            return null;
        }

        Smearstation model = new SmearstationImpl();

        model.setStationID(soapModel.getStationID());
        model.setDcmipoint(soapModel.getDcmipoint());
        model.setName(soapModel.getName());
        model.setDataAvail(soapModel.getDataAvail());

        return model;
    }

    /**
     * Converts the soap model instances into normal model instances.
     *
     * @param soapModels the soap model instances to convert
     * @return the normal model instances
     */
    public static List<Smearstation> toModels(SmearstationSoap[] soapModels) {
        if (soapModels == null) {
            return null;
        }

        List<Smearstation> models = new ArrayList<Smearstation>(soapModels.length);

        for (SmearstationSoap soapModel : soapModels) {
            models.add(toModel(soapModel));
        }

        return models;
    }

    @Override
    public long getPrimaryKey() {
        return _stationID;
    }

    @Override
    public void setPrimaryKey(long primaryKey) {
        setStationID(primaryKey);
    }

    @Override
    public Serializable getPrimaryKeyObj() {
        return _stationID;
    }

    @Override
    public void setPrimaryKeyObj(Serializable primaryKeyObj) {
        setPrimaryKey(((Long) primaryKeyObj).longValue());
    }

    @Override
    public Class<?> getModelClass() {
        return Smearstation.class;
    }

    @Override
    public String getModelClassName() {
        return Smearstation.class.getName();
    }

    @Override
    public Map<String, Object> getModelAttributes() {
        Map<String, Object> attributes = new HashMap<String, Object>();

        attributes.put("stationID", getStationID());
        attributes.put("dcmipoint", getDcmipoint());
        attributes.put("name", getName());
        attributes.put("dataAvail", getDataAvail());

        return attributes;
    }

    @Override
    public void setModelAttributes(Map<String, Object> attributes) {
        Long stationID = (Long) attributes.get("stationID");

        if (stationID != null) {
            setStationID(stationID);
        }

        String dcmipoint = (String) attributes.get("dcmipoint");

        if (dcmipoint != null) {
            setDcmipoint(dcmipoint);
        }

        String name = (String) attributes.get("name");

        if (name != null) {
            setName(name);
        }

        Boolean dataAvail = (Boolean) attributes.get("dataAvail");

        if (dataAvail != null) {
            setDataAvail(dataAvail);
        }
    }

    @JSON
    @Override
    public long getStationID() {
        return _stationID;
    }

    @Override
    public void setStationID(long stationID) {
        _stationID = stationID;
    }

    @JSON
    @Override
    public String getDcmipoint() {
        if (_dcmipoint == null) {
            return StringPool.BLANK;
        } else {
            return _dcmipoint;
        }
    }

    @Override
    public void setDcmipoint(String dcmipoint) {
        _dcmipoint = dcmipoint;
    }

    @JSON
    @Override
    public String getName() {
        if (_name == null) {
            return StringPool.BLANK;
        } else {
            return _name;
        }
    }

    @Override
    public void setName(String name) {
        _name = name;
    }

    @JSON
    @Override
    public boolean getDataAvail() {
        return _dataAvail;
    }

    @Override
    public boolean isDataAvail() {
        return _dataAvail;
    }

    @Override
    public void setDataAvail(boolean dataAvail) {
        _dataAvail = dataAvail;
    }

    @Override
    public ExpandoBridge getExpandoBridge() {
        return ExpandoBridgeFactoryUtil.getExpandoBridge(0,
            Smearstation.class.getName(), getPrimaryKey());
    }

    @Override
    public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
        ExpandoBridge expandoBridge = getExpandoBridge();

        expandoBridge.setAttributes(serviceContext);
    }

    @Override
    public Smearstation toEscapedModel() {
        if (_escapedModel == null) {
            _escapedModel = (Smearstation) ProxyUtil.newProxyInstance(_classLoader,
                    _escapedModelInterfaces, new AutoEscapeBeanHandler(this));
        }

        return _escapedModel;
    }

    @Override
    public Object clone() {
        SmearstationImpl smearstationImpl = new SmearstationImpl();

        smearstationImpl.setStationID(getStationID());
        smearstationImpl.setDcmipoint(getDcmipoint());
        smearstationImpl.setName(getName());
        smearstationImpl.setDataAvail(getDataAvail());

        smearstationImpl.resetOriginalValues();

        return smearstationImpl;
    }

    @Override
    public int compareTo(Smearstation smearstation) {
        long primaryKey = smearstation.getPrimaryKey();

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

        if (!(obj instanceof Smearstation)) {
            return false;
        }

        Smearstation smearstation = (Smearstation) obj;

        long primaryKey = smearstation.getPrimaryKey();

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
    public CacheModel<Smearstation> toCacheModel() {
        SmearstationCacheModel smearstationCacheModel = new SmearstationCacheModel();

        smearstationCacheModel.stationID = getStationID();

        smearstationCacheModel.dcmipoint = getDcmipoint();

        String dcmipoint = smearstationCacheModel.dcmipoint;

        if ((dcmipoint != null) && (dcmipoint.length() == 0)) {
            smearstationCacheModel.dcmipoint = null;
        }

        smearstationCacheModel.name = getName();

        String name = smearstationCacheModel.name;

        if ((name != null) && (name.length() == 0)) {
            smearstationCacheModel.name = null;
        }

        smearstationCacheModel.dataAvail = getDataAvail();

        return smearstationCacheModel;
    }

    @Override
    public String toString() {
        StringBundler sb = new StringBundler(9);

        sb.append("{stationID=");
        sb.append(getStationID());
        sb.append(", dcmipoint=");
        sb.append(getDcmipoint());
        sb.append(", name=");
        sb.append(getName());
        sb.append(", dataAvail=");
        sb.append(getDataAvail());
        sb.append("}");

        return sb.toString();
    }

    @Override
    public String toXmlString() {
        StringBundler sb = new StringBundler(16);

        sb.append("<model><model-name>");
        sb.append("fi.csc.smear.db.model.Smearstation");
        sb.append("</model-name>");

        sb.append(
            "<column><column-name>stationID</column-name><column-value><![CDATA[");
        sb.append(getStationID());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>dcmipoint</column-name><column-value><![CDATA[");
        sb.append(getDcmipoint());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>name</column-name><column-value><![CDATA[");
        sb.append(getName());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>dataAvail</column-name><column-value><![CDATA[");
        sb.append(getDataAvail());
        sb.append("]]></column-value></column>");

        sb.append("</model>");

        return sb.toString();
    }
}
