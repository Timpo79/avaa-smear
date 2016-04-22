package fi.csc.avaa.smear.db.service.persistence;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.ServiceContext;

import fi.csc.avaa.smear.db.model.HyyCoord;

import java.util.List;

/**
 * The persistence utility for the hyy coord service. This utility wraps {@link HyyCoordPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author tkantola
 * @see HyyCoordPersistence
 * @see HyyCoordPersistenceImpl
 * @generated
 */
public class HyyCoordUtil {
    private static HyyCoordPersistence _persistence;

    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify this class directly. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
     */

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#clearCache()
     */
    public static void clearCache() {
        getPersistence().clearCache();
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#clearCache(com.liferay.portal.model.BaseModel)
     */
    public static void clearCache(HyyCoord hyyCoord) {
        getPersistence().clearCache(hyyCoord);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#countWithDynamicQuery(DynamicQuery)
     */
    public static long countWithDynamicQuery(DynamicQuery dynamicQuery)
        throws SystemException {
        return getPersistence().countWithDynamicQuery(dynamicQuery);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
     */
    public static List<HyyCoord> findWithDynamicQuery(DynamicQuery dynamicQuery)
        throws SystemException {
        return getPersistence().findWithDynamicQuery(dynamicQuery);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
     */
    public static List<HyyCoord> findWithDynamicQuery(
        DynamicQuery dynamicQuery, int start, int end)
        throws SystemException {
        return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
     */
    public static List<HyyCoord> findWithDynamicQuery(
        DynamicQuery dynamicQuery, int start, int end,
        OrderByComparator orderByComparator) throws SystemException {
        return getPersistence()
                   .findWithDynamicQuery(dynamicQuery, start, end,
            orderByComparator);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
     */
    public static HyyCoord update(HyyCoord hyyCoord) throws SystemException {
        return getPersistence().update(hyyCoord);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
     */
    public static HyyCoord update(HyyCoord hyyCoord,
        ServiceContext serviceContext) throws SystemException {
        return getPersistence().update(hyyCoord, serviceContext);
    }

    /**
    * Caches the hyy coord in the entity cache if it is enabled.
    *
    * @param hyyCoord the hyy coord
    */
    public static void cacheResult(fi.csc.avaa.smear.db.model.HyyCoord hyyCoord) {
        getPersistence().cacheResult(hyyCoord);
    }

    /**
    * Caches the hyy coords in the entity cache if it is enabled.
    *
    * @param hyyCoords the hyy coords
    */
    public static void cacheResult(
        java.util.List<fi.csc.avaa.smear.db.model.HyyCoord> hyyCoords) {
        getPersistence().cacheResult(hyyCoords);
    }

    /**
    * Creates a new hyy coord with the primary key. Does not add the hyy coord to the database.
    *
    * @param arrTimeID the primary key for the new hyy coord
    * @return the new hyy coord
    */
    public static fi.csc.avaa.smear.db.model.HyyCoord create(long arrTimeID) {
        return getPersistence().create(arrTimeID);
    }

    /**
    * Removes the hyy coord with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param arrTimeID the primary key of the hyy coord
    * @return the hyy coord that was removed
    * @throws fi.csc.avaa.smear.db.NoSuchHyyCoordException if a hyy coord with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static fi.csc.avaa.smear.db.model.HyyCoord remove(long arrTimeID)
        throws com.liferay.portal.kernel.exception.SystemException,
            fi.csc.avaa.smear.db.NoSuchHyyCoordException {
        return getPersistence().remove(arrTimeID);
    }

    public static fi.csc.avaa.smear.db.model.HyyCoord updateImpl(
        fi.csc.avaa.smear.db.model.HyyCoord hyyCoord)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().updateImpl(hyyCoord);
    }

    /**
    * Returns the hyy coord with the primary key or throws a {@link fi.csc.avaa.smear.db.NoSuchHyyCoordException} if it could not be found.
    *
    * @param arrTimeID the primary key of the hyy coord
    * @return the hyy coord
    * @throws fi.csc.avaa.smear.db.NoSuchHyyCoordException if a hyy coord with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static fi.csc.avaa.smear.db.model.HyyCoord findByPrimaryKey(
        long arrTimeID)
        throws com.liferay.portal.kernel.exception.SystemException,
            fi.csc.avaa.smear.db.NoSuchHyyCoordException {
        return getPersistence().findByPrimaryKey(arrTimeID);
    }

    /**
    * Returns the hyy coord with the primary key or returns <code>null</code> if it could not be found.
    *
    * @param arrTimeID the primary key of the hyy coord
    * @return the hyy coord, or <code>null</code> if a hyy coord with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static fi.csc.avaa.smear.db.model.HyyCoord fetchByPrimaryKey(
        long arrTimeID)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().fetchByPrimaryKey(arrTimeID);
    }

    /**
    * Returns all the hyy coords.
    *
    * @return the hyy coords
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<fi.csc.avaa.smear.db.model.HyyCoord> findAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll();
    }

    /**
    * Returns a range of all the hyy coords.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link fi.csc.avaa.smear.db.model.impl.HyyCoordModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of hyy coords
    * @param end the upper bound of the range of hyy coords (not inclusive)
    * @return the range of hyy coords
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<fi.csc.avaa.smear.db.model.HyyCoord> findAll(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll(start, end);
    }

    /**
    * Returns an ordered range of all the hyy coords.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link fi.csc.avaa.smear.db.model.impl.HyyCoordModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of hyy coords
    * @param end the upper bound of the range of hyy coords (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of hyy coords
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<fi.csc.avaa.smear.db.model.HyyCoord> findAll(
        int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll(start, end, orderByComparator);
    }

    /**
    * Removes all the hyy coords from the database.
    *
    * @throws SystemException if a system exception occurred
    */
    public static void removeAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        getPersistence().removeAll();
    }

    /**
    * Returns the number of hyy coords.
    *
    * @return the number of hyy coords
    * @throws SystemException if a system exception occurred
    */
    public static int countAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().countAll();
    }

    public static HyyCoordPersistence getPersistence() {
        if (_persistence == null) {
            _persistence = (HyyCoordPersistence) PortletBeanLocatorUtil.locate(fi.csc.avaa.smear.db.service.ClpSerializer.getServletContextName(),
                    HyyCoordPersistence.class.getName());

            ReferenceRegistry.registerReference(HyyCoordUtil.class,
                "_persistence");
        }

        return _persistence;
    }

    /**
     * @deprecated As of 6.2.0
     */
    public void setPersistence(HyyCoordPersistence persistence) {
    }
}
