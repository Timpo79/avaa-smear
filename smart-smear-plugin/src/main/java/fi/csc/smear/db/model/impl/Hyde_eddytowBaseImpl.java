package fi.csc.smear.db.model.impl;

import com.liferay.portal.kernel.exception.SystemException;

import fi.csc.smear.db.model.Hyde_eddytow;
import fi.csc.smear.db.service.Hyde_eddytowLocalServiceUtil;

/**
 * The extended model base implementation for the Hyde_eddytow service. Represents a row in the &quot;HYY_EDDYTOW&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This class exists only as a container for the default extended model level methods generated by ServiceBuilder. Helper methods and all application logic should be put in {@link Hyde_eddytowImpl}.
 * </p>
 *
 * @author pj
 * @see Hyde_eddytowImpl
 * @see fi.csc.smear.db.model.Hyde_eddytow
 * @generated
 */
public abstract class Hyde_eddytowBaseImpl extends Hyde_eddytowModelImpl
    implements Hyde_eddytow {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this class directly. All methods that expect a hyde_eddytow model instance should use the {@link Hyde_eddytow} interface instead.
     */
    @Override
    public void persist() throws SystemException {
        if (this.isNew()) {
            Hyde_eddytowLocalServiceUtil.addHyde_eddytow(this);
        } else {
            Hyde_eddytowLocalServiceUtil.updateHyde_eddytow(this);
        }
    }
}