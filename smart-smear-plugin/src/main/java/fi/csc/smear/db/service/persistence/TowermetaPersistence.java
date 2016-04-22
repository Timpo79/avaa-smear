package fi.csc.smear.db.service.persistence;

import com.liferay.portal.service.persistence.BasePersistence;

import fi.csc.smear.db.model.Towermeta;

/**
 * The persistence interface for the towermeta service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author pj
 * @see TowermetaPersistenceImpl
 * @see TowermetaUtil
 * @generated
 */
public interface TowermetaPersistence extends BasePersistence<Towermeta> {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this interface directly. Always use {@link TowermetaUtil} to access the towermeta persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
     */

    /**
    * Caches the towermeta in the entity cache if it is enabled.
    *
    * @param towermeta the towermeta
    */
    public void cacheResult(fi.csc.smear.db.model.Towermeta towermeta);

    /**
    * Caches the towermetas in the entity cache if it is enabled.
    *
    * @param towermetas the towermetas
    */
    public void cacheResult(
        java.util.List<fi.csc.smear.db.model.Towermeta> towermetas);

    /**
    * Creates a new towermeta with the primary key. Does not add the towermeta to the database.
    *
    * @param samptime the primary key for the new towermeta
    * @return the new towermeta
    */
    public fi.csc.smear.db.model.Towermeta create(java.util.Date samptime);

    /**
    * Removes the towermeta with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param samptime the primary key of the towermeta
    * @return the towermeta that was removed
    * @throws fi.csc.smear.db.NoSuchTowermetaException if a towermeta with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public fi.csc.smear.db.model.Towermeta remove(java.util.Date samptime)
        throws com.liferay.portal.kernel.exception.SystemException,
            fi.csc.smear.db.NoSuchTowermetaException;

    public fi.csc.smear.db.model.Towermeta updateImpl(
        fi.csc.smear.db.model.Towermeta towermeta)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the towermeta with the primary key or throws a {@link fi.csc.smear.db.NoSuchTowermetaException} if it could not be found.
    *
    * @param samptime the primary key of the towermeta
    * @return the towermeta
    * @throws fi.csc.smear.db.NoSuchTowermetaException if a towermeta with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public fi.csc.smear.db.model.Towermeta findByPrimaryKey(
        java.util.Date samptime)
        throws com.liferay.portal.kernel.exception.SystemException,
            fi.csc.smear.db.NoSuchTowermetaException;

    /**
    * Returns the towermeta with the primary key or returns <code>null</code> if it could not be found.
    *
    * @param samptime the primary key of the towermeta
    * @return the towermeta, or <code>null</code> if a towermeta with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public fi.csc.smear.db.model.Towermeta fetchByPrimaryKey(
        java.util.Date samptime)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns all the towermetas.
    *
    * @return the towermetas
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<fi.csc.smear.db.model.Towermeta> findAll()
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns a range of all the towermetas.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link fi.csc.smear.db.model.impl.TowermetaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of towermetas
    * @param end the upper bound of the range of towermetas (not inclusive)
    * @return the range of towermetas
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<fi.csc.smear.db.model.Towermeta> findAll(int start,
        int end) throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns an ordered range of all the towermetas.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link fi.csc.smear.db.model.impl.TowermetaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of towermetas
    * @param end the upper bound of the range of towermetas (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of towermetas
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<fi.csc.smear.db.model.Towermeta> findAll(int start,
        int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Removes all the towermetas from the database.
    *
    * @throws SystemException if a system exception occurred
    */
    public void removeAll()
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the number of towermetas.
    *
    * @return the number of towermetas
    * @throws SystemException if a system exception occurred
    */
    public int countAll()
        throws com.liferay.portal.kernel.exception.SystemException;
}
