package fi.csc.smear.db.model.impl;

import com.liferay.portal.kernel.exception.SystemException;

import fi.csc.smear.db.model.Vareddy;
import fi.csc.smear.db.service.VareddyLocalServiceUtil;

/**
 * The extended model base implementation for the Vareddy service. Represents a row in the &quot;VAR_EDDY&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This class exists only as a container for the default extended model level methods generated by ServiceBuilder. Helper methods and all application logic should be put in {@link VareddyImpl}.
 * </p>
 *
 * @author pj
 * @see VareddyImpl
 * @see fi.csc.smear.db.model.Vareddy
 * @generated
 */
public abstract class VareddyBaseImpl extends VareddyModelImpl
    implements Vareddy {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this class directly. All methods that expect a vareddy model instance should use the {@link Vareddy} interface instead.
     */
    @Override
    public void persist() throws SystemException {
        if (this.isNew()) {
            VareddyLocalServiceUtil.addVareddy(this);
        } else {
            VareddyLocalServiceUtil.updateVareddy(this);
        }
    }
}