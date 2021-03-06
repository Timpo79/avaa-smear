package fi.csc.smear.db.model.impl;

import com.liferay.portal.kernel.exception.SystemException;

import fi.csc.smear.db.model.KumpulaDMPS;
import fi.csc.smear.db.service.KumpulaDMPSLocalServiceUtil;

/**
 * The extended model base implementation for the KumpulaDMPS service. Represents a row in the &quot;KUM_DMPS&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This class exists only as a container for the default extended model level methods generated by ServiceBuilder. Helper methods and all application logic should be put in {@link KumpulaDMPSImpl}.
 * </p>
 *
 * @author pj
 * @see KumpulaDMPSImpl
 * @see fi.csc.smear.db.model.KumpulaDMPS
 * @generated
 */
public abstract class KumpulaDMPSBaseImpl extends KumpulaDMPSModelImpl
    implements KumpulaDMPS {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this class directly. All methods that expect a kumpula d m p s model instance should use the {@link KumpulaDMPS} interface instead.
     */
    @Override
    public void persist() throws SystemException {
        if (this.isNew()) {
            KumpulaDMPSLocalServiceUtil.addKumpulaDMPS(this);
        } else {
            KumpulaDMPSLocalServiceUtil.updateKumpulaDMPS(this);
        }
    }
}
