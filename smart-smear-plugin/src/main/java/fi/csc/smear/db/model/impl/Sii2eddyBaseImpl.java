package fi.csc.smear.db.model.impl;

import com.liferay.portal.kernel.exception.SystemException;

import fi.csc.smear.db.model.Sii2eddy;
import fi.csc.smear.db.service.Sii2eddyLocalServiceUtil;

/**
 * The extended model base implementation for the Sii2eddy service. Represents a row in the &quot;SII2_EDDY&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This class exists only as a container for the default extended model level methods generated by ServiceBuilder. Helper methods and all application logic should be put in {@link Sii2eddyImpl}.
 * </p>
 *
 * @author pj
 * @see Sii2eddyImpl
 * @see fi.csc.smear.db.model.Sii2eddy
 * @generated
 */
public abstract class Sii2eddyBaseImpl extends Sii2eddyModelImpl
    implements Sii2eddy {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this class directly. All methods that expect a sii2eddy model instance should use the {@link Sii2eddy} interface instead.
     */
    @Override
    public void persist() throws SystemException {
        if (this.isNew()) {
            Sii2eddyLocalServiceUtil.addSii2eddy(this);
        } else {
            Sii2eddyLocalServiceUtil.updateSii2eddy(this);
        }
    }
}