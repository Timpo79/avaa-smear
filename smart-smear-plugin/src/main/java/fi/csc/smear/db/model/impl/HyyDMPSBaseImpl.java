package fi.csc.smear.db.model.impl;

import com.liferay.portal.kernel.exception.SystemException;

import fi.csc.smear.db.model.HyyDMPS;
import fi.csc.smear.db.service.HyyDMPSLocalServiceUtil;

/**
 * The extended model base implementation for the HyyDMPS service. Represents a row in the &quot;HYY_DMPS&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This class exists only as a container for the default extended model level methods generated by ServiceBuilder. Helper methods and all application logic should be put in {@link HyyDMPSImpl}.
 * </p>
 *
 * @author pj
 * @see HyyDMPSImpl
 * @see fi.csc.smear.db.model.HyyDMPS
 * @generated
 */
public abstract class HyyDMPSBaseImpl extends HyyDMPSModelImpl
    implements HyyDMPS {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this class directly. All methods that expect a hyy d m p s model instance should use the {@link HyyDMPS} interface instead.
     */
    @Override
    public void persist() throws SystemException {
        if (this.isNew()) {
            HyyDMPSLocalServiceUtil.addHyyDMPS(this);
        } else {
            HyyDMPSLocalServiceUtil.updateHyyDMPS(this);
        }
    }
}