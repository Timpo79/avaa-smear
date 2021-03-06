package fi.csc.smear.db.model.impl;

import com.liferay.portal.kernel.exception.SystemException;

import fi.csc.smear.db.model.Varrio_tree;
import fi.csc.smear.db.service.Varrio_treeLocalServiceUtil;

/**
 * The extended model base implementation for the Varrio_tree service. Represents a row in the &quot;VAR_TREE&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This class exists only as a container for the default extended model level methods generated by ServiceBuilder. Helper methods and all application logic should be put in {@link Varrio_treeImpl}.
 * </p>
 *
 * @author pj
 * @see Varrio_treeImpl
 * @see fi.csc.smear.db.model.Varrio_tree
 * @generated
 */
public abstract class Varrio_treeBaseImpl extends Varrio_treeModelImpl
    implements Varrio_tree {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this class directly. All methods that expect a varrio_tree model instance should use the {@link Varrio_tree} interface instead.
     */
    @Override
    public void persist() throws SystemException {
        if (this.isNew()) {
            Varrio_treeLocalServiceUtil.addVarrio_tree(this);
        } else {
            Varrio_treeLocalServiceUtil.updateVarrio_tree(this);
        }
    }
}
