package fi.csc.smear.db.model;

import com.liferay.portal.kernel.bean.AutoEscape;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.service.ServiceContext;

import com.liferay.portlet.expando.model.ExpandoBridge;

import java.io.Serializable;

/**
 * The base model interface for the SmearTags service. Represents a row in the &quot;Tags&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link fi.csc.smear.db.model.impl.SmearTagsModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link fi.csc.smear.db.model.impl.SmearTagsImpl}.
 * </p>
 *
 * @author pj
 * @see SmearTags
 * @see fi.csc.smear.db.model.impl.SmearTagsImpl
 * @see fi.csc.smear.db.model.impl.SmearTagsModelImpl
 * @generated
 */
public interface SmearTagsModel extends BaseModel<SmearTags> {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this interface directly. All methods that expect a smear tags model instance should use the {@link SmearTags} interface instead.
     */

    /**
     * Returns the primary key of this smear tags.
     *
     * @return the primary key of this smear tags
     */
    public long getPrimaryKey();

    /**
     * Sets the primary key of this smear tags.
     *
     * @param primaryKey the primary key of this smear tags
     */
    public void setPrimaryKey(long primaryKey);

    /**
     * Returns the tag i d of this smear tags.
     *
     * @return the tag i d of this smear tags
     */
    public long getTagID();

    /**
     * Sets the tag i d of this smear tags.
     *
     * @param tagID the tag i d of this smear tags
     */
    public void setTagID(long tagID);

    /**
     * Returns the vocabulary of this smear tags.
     *
     * @return the vocabulary of this smear tags
     */
    @AutoEscape
    public String getVocabulary();

    /**
     * Sets the vocabulary of this smear tags.
     *
     * @param vocabulary the vocabulary of this smear tags
     */
    public void setVocabulary(String vocabulary);

    /**
     * Returns the tag of this smear tags.
     *
     * @return the tag of this smear tags
     */
    @AutoEscape
    public String getTag();

    /**
     * Sets the tag of this smear tags.
     *
     * @param tag the tag of this smear tags
     */
    public void setTag(String tag);

    /**
     * Returns the displaykeyword of this smear tags.
     *
     * @return the displaykeyword of this smear tags
     */
    @AutoEscape
    public String getDisplaykeyword();

    /**
     * Sets the displaykeyword of this smear tags.
     *
     * @param displaykeyword the displaykeyword of this smear tags
     */
    public void setDisplaykeyword(String displaykeyword);

    @Override
    public boolean isNew();

    @Override
    public void setNew(boolean n);

    @Override
    public boolean isCachedModel();

    @Override
    public void setCachedModel(boolean cachedModel);

    @Override
    public boolean isEscapedModel();

    @Override
    public Serializable getPrimaryKeyObj();

    @Override
    public void setPrimaryKeyObj(Serializable primaryKeyObj);

    @Override
    public ExpandoBridge getExpandoBridge();

    @Override
    public void setExpandoBridgeAttributes(BaseModel<?> baseModel);

    @Override
    public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge);

    @Override
    public void setExpandoBridgeAttributes(ServiceContext serviceContext);

    @Override
    public Object clone();

    @Override
    public int compareTo(SmearTags smearTags);

    @Override
    public int hashCode();

    @Override
    public CacheModel<SmearTags> toCacheModel();

    @Override
    public SmearTags toEscapedModel();

    @Override
    public SmearTags toUnescapedModel();

    @Override
    public String toString();

    @Override
    public String toXmlString();
}
