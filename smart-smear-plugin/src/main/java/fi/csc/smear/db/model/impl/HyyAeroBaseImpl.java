package fi.csc.smear.db.model.impl;

import com.liferay.portal.kernel.exception.SystemException;

import fi.csc.smear.db.model.HyyAero;
import fi.csc.smear.db.service.HyyAeroLocalServiceUtil;

/**
 * The extended model base implementation for the HyyAero service. Represents a row in the &quot;HYY_AERO&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This class exists only as a container for the default extended model level methods generated by ServiceBuilder. Helper methods and all application logic should be put in {@link HyyAeroImpl}.
 * </p>
 *
 * @author pj
 * @see HyyAeroImpl
 * @see fi.csc.smear.db.model.HyyAero
 * @generated
 */
public abstract class HyyAeroBaseImpl extends HyyAeroModelImpl
    implements HyyAero {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this class directly. All methods that expect a hyy aero model instance should use the {@link HyyAero} interface instead.
     */
    @Override
    public void persist() throws SystemException {
        if (this.isNew()) {
            HyyAeroLocalServiceUtil.addHyyAero(this);
        } else {
            HyyAeroLocalServiceUtil.updateHyyAero(this);
        }
    }
}