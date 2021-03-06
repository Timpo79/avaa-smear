package fi.csc.smear.db.model.impl;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.json.JSON;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.impl.BaseModelImpl;

import fi.csc.smear.db.model.Smearmetadata;
import fi.csc.smear.db.model.SmearmetadataModel;
import fi.csc.smear.db.model.SmearmetadataSoap;

import java.io.Serializable;

import java.sql.Types;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * The base model implementation for the Smearmetadata service. Represents a row in the &quot;Metadata&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link fi.csc.smear.db.model.SmearmetadataModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link SmearmetadataImpl}.
 * </p>
 *
 * @author pj
 * @see SmearmetadataImpl
 * @see fi.csc.smear.db.model.Smearmetadata
 * @see fi.csc.smear.db.model.SmearmetadataModel
 * @generated
 */
@JSON(strict = true)
public class SmearmetadataModelImpl extends BaseModelImpl<Smearmetadata>
    implements SmearmetadataModel {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this class directly. All methods that expect a smearmetadata model instance should use the {@link fi.csc.smear.db.model.Smearmetadata} interface instead.
     */
    public static final String TABLE_NAME = "Metadata";
    public static final Object[][] TABLE_COLUMNS = {
            { "title", Types.VARCHAR },
            { "rightsCategory", Types.VARCHAR },
            { "access_rights", Types.VARCHAR },
            { "project", Types.VARCHAR },
            { "maintaining_organisation", Types.VARCHAR },
            { "contact", Types.VARCHAR },
            { "ref", Types.VARCHAR },
            { "creator", Types.VARCHAR },
            { "discipline", Types.VARCHAR },
            { "timestamp", Types.TIMESTAMP }
        };
    public static final String TABLE_SQL_CREATE = "create table Metadata (title VARCHAR(75) not null primary key,rightsCategory VARCHAR(75) null,access_rights VARCHAR(75) null,project VARCHAR(75) null,maintaining_organisation VARCHAR(75) null,contact VARCHAR(75) null,ref VARCHAR(75) null,creator VARCHAR(75) null,discipline VARCHAR(75) null,timestamp DATE null)";
    public static final String TABLE_SQL_DROP = "drop table Metadata";
    public static final String ORDER_BY_JPQL = " ORDER BY smearmetadata.title ASC";
    public static final String ORDER_BY_SQL = " ORDER BY Metadata.title ASC";
    public static final String DATA_SOURCE = "smear";
    public static final String SESSION_FACTORY = "smearSessionFactory";
    public static final String TX_MANAGER = "liferayTransactionManager";
    public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
                "value.object.entity.cache.enabled.fi.csc.smear.db.model.Smearmetadata"),
            true);
    public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
                "value.object.finder.cache.enabled.fi.csc.smear.db.model.Smearmetadata"),
            true);
    public static final boolean COLUMN_BITMASK_ENABLED = false;
    public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(com.liferay.util.service.ServiceProps.get(
                "lock.expiration.time.fi.csc.smear.db.model.Smearmetadata"));
    private static ClassLoader _classLoader = Smearmetadata.class.getClassLoader();
    private static Class<?>[] _escapedModelInterfaces = new Class[] {
            Smearmetadata.class
        };
    private String _title;
    private String _rightsCategory;
    private String _access_rights;
    private String _project;
    private String _maintaining_organisation;
    private String _contact;
    private String _ref;
    private String _creator;
    private String _discipline;
    private Date _timestamp;
    private Smearmetadata _escapedModel;

    public SmearmetadataModelImpl() {
    }

    /**
     * Converts the soap model instance into a normal model instance.
     *
     * @param soapModel the soap model instance to convert
     * @return the normal model instance
     */
    public static Smearmetadata toModel(SmearmetadataSoap soapModel) {
        if (soapModel == null) {
            return null;
        }

        Smearmetadata model = new SmearmetadataImpl();

        model.setTitle(soapModel.getTitle());
        model.setRightsCategory(soapModel.getRightsCategory());
        model.setAccess_rights(soapModel.getAccess_rights());
        model.setProject(soapModel.getProject());
        model.setMaintaining_organisation(soapModel.getMaintaining_organisation());
        model.setContact(soapModel.getContact());
        model.setRef(soapModel.getRef());
        model.setCreator(soapModel.getCreator());
        model.setDiscipline(soapModel.getDiscipline());
        model.setTimestamp(soapModel.getTimestamp());

        return model;
    }

    /**
     * Converts the soap model instances into normal model instances.
     *
     * @param soapModels the soap model instances to convert
     * @return the normal model instances
     */
    public static List<Smearmetadata> toModels(SmearmetadataSoap[] soapModels) {
        if (soapModels == null) {
            return null;
        }

        List<Smearmetadata> models = new ArrayList<Smearmetadata>(soapModels.length);

        for (SmearmetadataSoap soapModel : soapModels) {
            models.add(toModel(soapModel));
        }

        return models;
    }

    @Override
    public String getPrimaryKey() {
        return _title;
    }

    @Override
    public void setPrimaryKey(String primaryKey) {
        setTitle(primaryKey);
    }

    @Override
    public Serializable getPrimaryKeyObj() {
        return _title;
    }

    @Override
    public void setPrimaryKeyObj(Serializable primaryKeyObj) {
        setPrimaryKey((String) primaryKeyObj);
    }

    @Override
    public Class<?> getModelClass() {
        return Smearmetadata.class;
    }

    @Override
    public String getModelClassName() {
        return Smearmetadata.class.getName();
    }

    @Override
    public Map<String, Object> getModelAttributes() {
        Map<String, Object> attributes = new HashMap<String, Object>();

        attributes.put("title", getTitle());
        attributes.put("rightsCategory", getRightsCategory());
        attributes.put("access_rights", getAccess_rights());
        attributes.put("project", getProject());
        attributes.put("maintaining_organisation", getMaintaining_organisation());
        attributes.put("contact", getContact());
        attributes.put("ref", getRef());
        attributes.put("creator", getCreator());
        attributes.put("discipline", getDiscipline());
        attributes.put("timestamp", getTimestamp());

        return attributes;
    }

    @Override
    public void setModelAttributes(Map<String, Object> attributes) {
        String title = (String) attributes.get("title");

        if (title != null) {
            setTitle(title);
        }

        String rightsCategory = (String) attributes.get("rightsCategory");

        if (rightsCategory != null) {
            setRightsCategory(rightsCategory);
        }

        String access_rights = (String) attributes.get("access_rights");

        if (access_rights != null) {
            setAccess_rights(access_rights);
        }

        String project = (String) attributes.get("project");

        if (project != null) {
            setProject(project);
        }

        String maintaining_organisation = (String) attributes.get(
                "maintaining_organisation");

        if (maintaining_organisation != null) {
            setMaintaining_organisation(maintaining_organisation);
        }

        String contact = (String) attributes.get("contact");

        if (contact != null) {
            setContact(contact);
        }

        String ref = (String) attributes.get("ref");

        if (ref != null) {
            setRef(ref);
        }

        String creator = (String) attributes.get("creator");

        if (creator != null) {
            setCreator(creator);
        }

        String discipline = (String) attributes.get("discipline");

        if (discipline != null) {
            setDiscipline(discipline);
        }

        Date timestamp = (Date) attributes.get("timestamp");

        if (timestamp != null) {
            setTimestamp(timestamp);
        }
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
    public String getRightsCategory() {
        if (_rightsCategory == null) {
            return StringPool.BLANK;
        } else {
            return _rightsCategory;
        }
    }

    @Override
    public void setRightsCategory(String rightsCategory) {
        _rightsCategory = rightsCategory;
    }

    @JSON
    @Override
    public String getAccess_rights() {
        if (_access_rights == null) {
            return StringPool.BLANK;
        } else {
            return _access_rights;
        }
    }

    @Override
    public void setAccess_rights(String access_rights) {
        _access_rights = access_rights;
    }

    @JSON
    @Override
    public String getProject() {
        if (_project == null) {
            return StringPool.BLANK;
        } else {
            return _project;
        }
    }

    @Override
    public void setProject(String project) {
        _project = project;
    }

    @JSON
    @Override
    public String getMaintaining_organisation() {
        if (_maintaining_organisation == null) {
            return StringPool.BLANK;
        } else {
            return _maintaining_organisation;
        }
    }

    @Override
    public void setMaintaining_organisation(String maintaining_organisation) {
        _maintaining_organisation = maintaining_organisation;
    }

    @JSON
    @Override
    public String getContact() {
        if (_contact == null) {
            return StringPool.BLANK;
        } else {
            return _contact;
        }
    }

    @Override
    public void setContact(String contact) {
        _contact = contact;
    }

    @JSON
    @Override
    public String getRef() {
        if (_ref == null) {
            return StringPool.BLANK;
        } else {
            return _ref;
        }
    }

    @Override
    public void setRef(String ref) {
        _ref = ref;
    }

    @JSON
    @Override
    public String getCreator() {
        if (_creator == null) {
            return StringPool.BLANK;
        } else {
            return _creator;
        }
    }

    @Override
    public void setCreator(String creator) {
        _creator = creator;
    }

    @JSON
    @Override
    public String getDiscipline() {
        if (_discipline == null) {
            return StringPool.BLANK;
        } else {
            return _discipline;
        }
    }

    @Override
    public void setDiscipline(String discipline) {
        _discipline = discipline;
    }

    @JSON
    @Override
    public Date getTimestamp() {
        return _timestamp;
    }

    @Override
    public void setTimestamp(Date timestamp) {
        _timestamp = timestamp;
    }

    @Override
    public Smearmetadata toEscapedModel() {
        if (_escapedModel == null) {
            _escapedModel = (Smearmetadata) ProxyUtil.newProxyInstance(_classLoader,
                    _escapedModelInterfaces, new AutoEscapeBeanHandler(this));
        }

        return _escapedModel;
    }

    @Override
    public Object clone() {
        SmearmetadataImpl smearmetadataImpl = new SmearmetadataImpl();

        smearmetadataImpl.setTitle(getTitle());
        smearmetadataImpl.setRightsCategory(getRightsCategory());
        smearmetadataImpl.setAccess_rights(getAccess_rights());
        smearmetadataImpl.setProject(getProject());
        smearmetadataImpl.setMaintaining_organisation(getMaintaining_organisation());
        smearmetadataImpl.setContact(getContact());
        smearmetadataImpl.setRef(getRef());
        smearmetadataImpl.setCreator(getCreator());
        smearmetadataImpl.setDiscipline(getDiscipline());
        smearmetadataImpl.setTimestamp(getTimestamp());

        smearmetadataImpl.resetOriginalValues();

        return smearmetadataImpl;
    }

    @Override
    public int compareTo(Smearmetadata smearmetadata) {
        String primaryKey = smearmetadata.getPrimaryKey();

        return getPrimaryKey().compareTo(primaryKey);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (!(obj instanceof Smearmetadata)) {
            return false;
        }

        Smearmetadata smearmetadata = (Smearmetadata) obj;

        String primaryKey = smearmetadata.getPrimaryKey();

        if (getPrimaryKey().equals(primaryKey)) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public int hashCode() {
        return getPrimaryKey().hashCode();
    }

    @Override
    public void resetOriginalValues() {
    }

    @Override
    public CacheModel<Smearmetadata> toCacheModel() {
        SmearmetadataCacheModel smearmetadataCacheModel = new SmearmetadataCacheModel();

        smearmetadataCacheModel.title = getTitle();

        String title = smearmetadataCacheModel.title;

        if ((title != null) && (title.length() == 0)) {
            smearmetadataCacheModel.title = null;
        }

        smearmetadataCacheModel.rightsCategory = getRightsCategory();

        String rightsCategory = smearmetadataCacheModel.rightsCategory;

        if ((rightsCategory != null) && (rightsCategory.length() == 0)) {
            smearmetadataCacheModel.rightsCategory = null;
        }

        smearmetadataCacheModel.access_rights = getAccess_rights();

        String access_rights = smearmetadataCacheModel.access_rights;

        if ((access_rights != null) && (access_rights.length() == 0)) {
            smearmetadataCacheModel.access_rights = null;
        }

        smearmetadataCacheModel.project = getProject();

        String project = smearmetadataCacheModel.project;

        if ((project != null) && (project.length() == 0)) {
            smearmetadataCacheModel.project = null;
        }

        smearmetadataCacheModel.maintaining_organisation = getMaintaining_organisation();

        String maintaining_organisation = smearmetadataCacheModel.maintaining_organisation;

        if ((maintaining_organisation != null) &&
                (maintaining_organisation.length() == 0)) {
            smearmetadataCacheModel.maintaining_organisation = null;
        }

        smearmetadataCacheModel.contact = getContact();

        String contact = smearmetadataCacheModel.contact;

        if ((contact != null) && (contact.length() == 0)) {
            smearmetadataCacheModel.contact = null;
        }

        smearmetadataCacheModel.ref = getRef();

        String ref = smearmetadataCacheModel.ref;

        if ((ref != null) && (ref.length() == 0)) {
            smearmetadataCacheModel.ref = null;
        }

        smearmetadataCacheModel.creator = getCreator();

        String creator = smearmetadataCacheModel.creator;

        if ((creator != null) && (creator.length() == 0)) {
            smearmetadataCacheModel.creator = null;
        }

        smearmetadataCacheModel.discipline = getDiscipline();

        String discipline = smearmetadataCacheModel.discipline;

        if ((discipline != null) && (discipline.length() == 0)) {
            smearmetadataCacheModel.discipline = null;
        }

        Date timestamp = getTimestamp();

        if (timestamp != null) {
            smearmetadataCacheModel.timestamp = timestamp.getTime();
        } else {
            smearmetadataCacheModel.timestamp = Long.MIN_VALUE;
        }

        return smearmetadataCacheModel;
    }

    @Override
    public String toString() {
        StringBundler sb = new StringBundler(21);

        sb.append("{title=");
        sb.append(getTitle());
        sb.append(", rightsCategory=");
        sb.append(getRightsCategory());
        sb.append(", access_rights=");
        sb.append(getAccess_rights());
        sb.append(", project=");
        sb.append(getProject());
        sb.append(", maintaining_organisation=");
        sb.append(getMaintaining_organisation());
        sb.append(", contact=");
        sb.append(getContact());
        sb.append(", ref=");
        sb.append(getRef());
        sb.append(", creator=");
        sb.append(getCreator());
        sb.append(", discipline=");
        sb.append(getDiscipline());
        sb.append(", timestamp=");
        sb.append(getTimestamp());
        sb.append("}");

        return sb.toString();
    }

    @Override
    public String toXmlString() {
        StringBundler sb = new StringBundler(34);

        sb.append("<model><model-name>");
        sb.append("fi.csc.smear.db.model.Smearmetadata");
        sb.append("</model-name>");

        sb.append(
            "<column><column-name>title</column-name><column-value><![CDATA[");
        sb.append(getTitle());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>rightsCategory</column-name><column-value><![CDATA[");
        sb.append(getRightsCategory());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>access_rights</column-name><column-value><![CDATA[");
        sb.append(getAccess_rights());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>project</column-name><column-value><![CDATA[");
        sb.append(getProject());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>maintaining_organisation</column-name><column-value><![CDATA[");
        sb.append(getMaintaining_organisation());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>contact</column-name><column-value><![CDATA[");
        sb.append(getContact());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>ref</column-name><column-value><![CDATA[");
        sb.append(getRef());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>creator</column-name><column-value><![CDATA[");
        sb.append(getCreator());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>discipline</column-name><column-value><![CDATA[");
        sb.append(getDiscipline());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>timestamp</column-name><column-value><![CDATA[");
        sb.append(getTimestamp());
        sb.append("]]></column-value></column>");

        sb.append("</model>");

        return sb.toString();
    }
}
