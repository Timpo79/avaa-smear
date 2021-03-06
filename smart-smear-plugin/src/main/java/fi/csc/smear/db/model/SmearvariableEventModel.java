package fi.csc.smear.db.model;

import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.service.ServiceContext;

import com.liferay.portlet.expando.model.ExpandoBridge;

import fi.csc.smear.db.service.persistence.SmearvariableEventPK;

import java.io.Serializable;

/**
 * The base model interface for the SmearvariableEvent service. Represents a row in the &quot;variableEvent&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link fi.csc.smear.db.model.impl.SmearvariableEventModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link fi.csc.smear.db.model.impl.SmearvariableEventImpl}.
 * </p>
 *
 * @author pj
 * @see SmearvariableEvent
 * @see fi.csc.smear.db.model.impl.SmearvariableEventImpl
 * @see fi.csc.smear.db.model.impl.SmearvariableEventModelImpl
 * @generated
 */
public interface SmearvariableEventModel extends BaseModel<SmearvariableEvent> {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this interface directly. All methods that expect a smearvariable event model instance should use the {@link SmearvariableEvent} interface instead.
     */

    /**
     * Returns the primary key of this smearvariable event.
     *
     * @return the primary key of this smearvariable event
     */
    public SmearvariableEventPK getPrimaryKey();

    /**
     * Sets the primary key of this smearvariable event.
     *
     * @param primaryKey the primary key of this smearvariable event
     */
    public void setPrimaryKey(SmearvariableEventPK primaryKey);

    /**
     * Returns the event i d of this smearvariable event.
     *
     * @return the event i d of this smearvariable event
     */
    public long getEventID();

    /**
     * Sets the event i d of this smearvariable event.
     *
     * @param eventID the event i d of this smearvariable event
     */
    public void setEventID(long eventID);

    /**
     * Returns the variable i d of this smearvariable event.
     *
     * @return the variable i d of this smearvariable event
     */
    public long getVariableID();

    /**
     * Sets the variable i d of this smearvariable event.
     *
     * @param variableID the variable i d of this smearvariable event
     */
    public void setVariableID(long variableID);

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
    public int compareTo(SmearvariableEvent smearvariableEvent);

    @Override
    public int hashCode();

    @Override
    public CacheModel<SmearvariableEvent> toCacheModel();

    @Override
    public SmearvariableEvent toEscapedModel();

    @Override
    public SmearvariableEvent toUnescapedModel();

    @Override
    public String toString();

    @Override
    public String toXmlString();
}
