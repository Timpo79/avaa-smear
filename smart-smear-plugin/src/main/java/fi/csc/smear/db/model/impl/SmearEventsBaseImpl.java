package fi.csc.smear.db.model.impl;

import com.liferay.portal.kernel.exception.SystemException;

import fi.csc.smear.db.model.SmearEvents;
import fi.csc.smear.db.service.SmearEventsLocalServiceUtil;

/**
 * The extended model base implementation for the SmearEvents service. Represents a row in the &quot;Events&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This class exists only as a container for the default extended model level methods generated by ServiceBuilder. Helper methods and all application logic should be put in {@link SmearEventsImpl}.
 * </p>
 *
 * @author pj
 * @see SmearEventsImpl
 * @see fi.csc.smear.db.model.SmearEvents
 * @generated
 */
public abstract class SmearEventsBaseImpl extends SmearEventsModelImpl
    implements SmearEvents {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this class directly. All methods that expect a smear events model instance should use the {@link SmearEvents} interface instead.
     */
    @Override
    public void persist() throws SystemException {
        if (this.isNew()) {
            SmearEventsLocalServiceUtil.addSmearEvents(this);
        } else {
            SmearEventsLocalServiceUtil.updateSmearEvents(this);
        }
    }
}
