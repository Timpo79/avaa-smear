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

import fi.csc.smear.db.model.SmearTableMetadata;
import fi.csc.smear.db.model.SmearTableMetadataModel;
import fi.csc.smear.db.model.SmearTableMetadataSoap;

import java.io.Serializable;

import java.sql.Types;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * The base model implementation for the SmearTableMetadata service. Represents a row in the &quot;TableMetadata&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link fi.csc.smear.db.model.SmearTableMetadataModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link SmearTableMetadataImpl}.
 * </p>
 *
 * @author pj
 * @see SmearTableMetadataImpl
 * @see fi.csc.smear.db.model.SmearTableMetadata
 * @see fi.csc.smear.db.model.SmearTableMetadataModel
 * @generated
 */
@JSON(strict = true)
public class SmearTableMetadataModelImpl extends BaseModelImpl<SmearTableMetadata>
    implements SmearTableMetadataModel {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this class directly. All methods that expect a smear table metadata model instance should use the {@link fi.csc.smear.db.model.SmearTableMetadata} interface instead.
     */
    public static final String TABLE_NAME = "TableMetadata";
    public static final Object[][] TABLE_COLUMNS = {
            { "tableID", Types.BIGINT },
            { "identifier", Types.VARCHAR },
            { "title", Types.VARCHAR },
            { "spatial_coverage", Types.VARCHAR },
            { "name", Types.VARCHAR },
            { "ttimestamp", Types.TIMESTAMP },
            { "period", Types.INTEGER }
        };
    public static final String TABLE_SQL_CREATE = "create table TableMetadata (tableID LONG not null primary key,identifier VARCHAR(75) null,title VARCHAR(75) null,spatial_coverage VARCHAR(75) null,name VARCHAR(75) null,ttimestamp DATE null,period INTEGER)";
    public static final String TABLE_SQL_DROP = "drop table TableMetadata";
    public static final String ORDER_BY_JPQL = " ORDER BY smearTableMetadata.tableID ASC";
    public static final String ORDER_BY_SQL = " ORDER BY TableMetadata.tableID ASC";
    public static final String DATA_SOURCE = "smear";
    public static final String SESSION_FACTORY = "smearSessionFactory";
    public static final String TX_MANAGER = "liferayTransactionManager";
    public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
                "value.object.entity.cache.enabled.fi.csc.smear.db.model.SmearTableMetadata"),
            true);
    public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
                "value.object.finder.cache.enabled.fi.csc.smear.db.model.SmearTableMetadata"),
            true);
    public static final boolean COLUMN_BITMASK_ENABLED = false;
    public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(com.liferay.util.service.ServiceProps.get(
                "lock.expiration.time.fi.csc.smear.db.model.SmearTableMetadata"));
    private static ClassLoader _classLoader = SmearTableMetadata.class.getClassLoader();
    private static Class<?>[] _escapedModelInterfaces = new Class[] {
            SmearTableMetadata.class
        };
    private long _tableID;
    private String _identifier;
    private String _title;
    private String _spatial_coverage;
    private String _name;
    private Date _ttimestamp;
    private int _period;
    private SmearTableMetadata _escapedModel;

    public SmearTableMetadataModelImpl() {
    }

    /**
     * Converts the soap model instance into a normal model instance.
     *
     * @param soapModel the soap model instance to convert
     * @return the normal model instance
     */
    public static SmearTableMetadata toModel(SmearTableMetadataSoap soapModel) {
        if (soapModel == null) {
            return null;
        }

        SmearTableMetadata model = new SmearTableMetadataImpl();

        model.setTableID(soapModel.getTableID());
        model.setIdentifier(soapModel.getIdentifier());
        model.setTitle(soapModel.getTitle());
        model.setSpatial_coverage(soapModel.getSpatial_coverage());
        model.setName(soapModel.getName());
        model.setTtimestamp(soapModel.getTtimestamp());
        model.setPeriod(soapModel.getPeriod());

        return model;
    }

    /**
     * Converts the soap model instances into normal model instances.
     *
     * @param soapModels the soap model instances to convert
     * @return the normal model instances
     */
    public static List<SmearTableMetadata> toModels(
        SmearTableMetadataSoap[] soapModels) {
        if (soapModels == null) {
            return null;
        }

        List<SmearTableMetadata> models = new ArrayList<SmearTableMetadata>(soapModels.length);

        for (SmearTableMetadataSoap soapModel : soapModels) {
            models.add(toModel(soapModel));
        }

        return models;
    }

    @Override
    public long getPrimaryKey() {
        return _tableID;
    }

    @Override
    public void setPrimaryKey(long primaryKey) {
        setTableID(primaryKey);
    }

    @Override
    public Serializable getPrimaryKeyObj() {
        return _tableID;
    }

    @Override
    public void setPrimaryKeyObj(Serializable primaryKeyObj) {
        setPrimaryKey(((Long) primaryKeyObj).longValue());
    }

    @Override
    public Class<?> getModelClass() {
        return SmearTableMetadata.class;
    }

    @Override
    public String getModelClassName() {
        return SmearTableMetadata.class.getName();
    }

    @Override
    public Map<String, Object> getModelAttributes() {
        Map<String, Object> attributes = new HashMap<String, Object>();

        attributes.put("tableID", getTableID());
        attributes.put("identifier", getIdentifier());
        attributes.put("title", getTitle());
        attributes.put("spatial_coverage", getSpatial_coverage());
        attributes.put("name", getName());
        attributes.put("ttimestamp", getTtimestamp());
        attributes.put("period", getPeriod());

        return attributes;
    }

    @Override
    public void setModelAttributes(Map<String, Object> attributes) {
        Long tableID = (Long) attributes.get("tableID");

        if (tableID != null) {
            setTableID(tableID);
        }

        String identifier = (String) attributes.get("identifier");

        if (identifier != null) {
            setIdentifier(identifier);
        }

        String title = (String) attributes.get("title");

        if (title != null) {
            setTitle(title);
        }

        String spatial_coverage = (String) attributes.get("spatial_coverage");

        if (spatial_coverage != null) {
            setSpatial_coverage(spatial_coverage);
        }

        String name = (String) attributes.get("name");

        if (name != null) {
            setName(name);
        }

        Date ttimestamp = (Date) attributes.get("ttimestamp");

        if (ttimestamp != null) {
            setTtimestamp(ttimestamp);
        }

        Integer period = (Integer) attributes.get("period");

        if (period != null) {
            setPeriod(period);
        }
    }

    @JSON
    @Override
    public long getTableID() {
        return _tableID;
    }

    @Override
    public void setTableID(long tableID) {
        _tableID = tableID;
    }

    @JSON
    @Override
    public String getIdentifier() {
        if (_identifier == null) {
            return StringPool.BLANK;
        } else {
            return _identifier;
        }
    }

    @Override
    public void setIdentifier(String identifier) {
        _identifier = identifier;
    }

    @JSON
    @Override
    public String getTitle() {
        if (_title == null) {
            return StringPool.BLANK;
        } else {
            return _title;
        }
    }

    @Override
    public void setTitle(String title) {
        _title = title;
    }

    @JSON
    @Override
    public String getSpatial_coverage() {
        if (_spatial_coverage == null) {
            return StringPool.BLANK;
        } else {
            return _spatial_coverage;
        }
    }

    @Override
    public void setSpatial_coverage(String spatial_coverage) {
        _spatial_coverage = spatial_coverage;
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
    public Date getTtimestamp() {
        return _ttimestamp;
    }

    @Override
    public void setTtimestamp(Date ttimestamp) {
        _ttimestamp = ttimestamp;
    }

    @JSON
    @Override
    public int getPeriod() {
        return _period;
    }

    @Override
    public void setPeriod(int period) {
        _period = period;
    }

    @Override
    public ExpandoBridge getExpandoBridge() {
        return ExpandoBridgeFactoryUtil.getExpandoBridge(0,
            SmearTableMetadata.class.getName(), getPrimaryKey());
    }

    @Override
    public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
        ExpandoBridge expandoBridge = getExpandoBridge();

        expandoBridge.setAttributes(serviceContext);
    }

    @Override
    public SmearTableMetadata toEscapedModel() {
        if (_escapedModel == null) {
            _escapedModel = (SmearTableMetadata) ProxyUtil.newProxyInstance(_classLoader,
                    _escapedModelInterfaces, new AutoEscapeBeanHandler(this));
        }

        return _escapedModel;
    }

    @Override
    public Object clone() {
        SmearTableMetadataImpl smearTableMetadataImpl = new SmearTableMetadataImpl();

        smearTableMetadataImpl.setTableID(getTableID());
        smearTableMetadataImpl.setIdentifier(getIdentifier());
        smearTableMetadataImpl.setTitle(getTitle());
        smearTableMetadataImpl.setSpatial_coverage(getSpatial_coverage());
        smearTableMetadataImpl.setName(getName());
        smearTableMetadataImpl.setTtimestamp(getTtimestamp());
        smearTableMetadataImpl.setPeriod(getPeriod());

        smearTableMetadataImpl.resetOriginalValues();

        return smearTableMetadataImpl;
    }

    @Override
    public int compareTo(SmearTableMetadata smearTableMetadata) {
        long primaryKey = smearTableMetadata.getPrimaryKey();

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

        if (!(obj instanceof SmearTableMetadata)) {
            return false;
        }

        SmearTableMetadata smearTableMetadata = (SmearTableMetadata) obj;

        long primaryKey = smearTableMetadata.getPrimaryKey();

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
    public CacheModel<SmearTableMetadata> toCacheModel() {
        SmearTableMetadataCacheModel smearTableMetadataCacheModel = new SmearTableMetadataCacheModel();

        smearTableMetadataCacheModel.tableID = getTableID();

        smearTableMetadataCacheModel.identifier = getIdentifier();

        String identifier = smearTableMetadataCacheModel.identifier;

        if ((identifier != null) && (identifier.length() == 0)) {
            smearTableMetadataCacheModel.identifier = null;
        }

        smearTableMetadataCacheModel.title = getTitle();

        String title = smearTableMetadataCacheModel.title;

        if ((title != null) && (title.length() == 0)) {
            smearTableMetadataCacheModel.title = null;
        }

        smearTableMetadataCacheModel.spatial_coverage = getSpatial_coverage();

        String spatial_coverage = smearTableMetadataCacheModel.spatial_coverage;

        if ((spatial_coverage != null) && (spatial_coverage.length() == 0)) {
            smearTableMetadataCacheModel.spatial_coverage = null;
        }

        smearTableMetadataCacheModel.name = getName();

        String name = smearTableMetadataCacheModel.name;

        if ((name != null) && (name.length() == 0)) {
            smearTableMetadataCacheModel.name = null;
        }

        Date ttimestamp = getTtimestamp();

        if (ttimestamp != null) {
            smearTableMetadataCacheModel.ttimestamp = ttimestamp.getTime();
        } else {
            smearTableMetadataCacheModel.ttimestamp = Long.MIN_VALUE;
        }

        smearTableMetadataCacheModel.period = getPeriod();

        return smearTableMetadataCacheModel;
    }

    @Override
    public String toString() {
        StringBundler sb = new StringBundler(15);

        sb.append("{tableID=");
        sb.append(getTableID());
        sb.append(", identifier=");
        sb.append(getIdentifier());
        sb.append(", title=");
        sb.append(getTitle());
        sb.append(", spatial_coverage=");
        sb.append(getSpatial_coverage());
        sb.append(", name=");
        sb.append(getName());
        sb.append(", ttimestamp=");
        sb.append(getTtimestamp());
        sb.append(", period=");
        sb.append(getPeriod());
        sb.append("}");

        return sb.toString();
    }

    @Override
    public String toXmlString() {
        StringBundler sb = new StringBundler(25);

        sb.append("<model><model-name>");
        sb.append("fi.csc.smear.db.model.SmearTableMetadata");
        sb.append("</model-name>");

        sb.append(
            "<column><column-name>tableID</column-name><column-value><![CDATA[");
        sb.append(getTableID());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>identifier</column-name><column-value><![CDATA[");
        sb.append(getIdentifier());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>title</column-name><column-value><![CDATA[");
        sb.append(getTitle());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>spatial_coverage</column-name><column-value><![CDATA[");
        sb.append(getSpatial_coverage());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>name</column-name><column-value><![CDATA[");
        sb.append(getName());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>ttimestamp</column-name><column-value><![CDATA[");
        sb.append(getTtimestamp());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>period</column-name><column-value><![CDATA[");
        sb.append(getPeriod());
        sb.append("]]></column-value></column>");

        sb.append("</model>");

        return sb.toString();
    }
}
