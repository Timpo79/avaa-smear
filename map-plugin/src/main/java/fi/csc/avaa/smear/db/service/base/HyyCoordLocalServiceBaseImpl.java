package fi.csc.avaa.smear.db.service.base;

import com.liferay.portal.kernel.bean.BeanReference;
import com.liferay.portal.kernel.bean.IdentifiableBean;
import com.liferay.portal.kernel.dao.jdbc.SqlUpdate;
import com.liferay.portal.kernel.dao.jdbc.SqlUpdateFactoryUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQueryFactoryUtil;
import com.liferay.portal.kernel.dao.orm.Projection;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.search.Indexable;
import com.liferay.portal.kernel.search.IndexableType;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.model.PersistedModel;
import com.liferay.portal.service.BaseLocalServiceImpl;
import com.liferay.portal.service.PersistedModelLocalServiceRegistryUtil;
import com.liferay.portal.service.persistence.UserPersistence;

import fi.csc.avaa.smear.db.model.HyyCoord;
import fi.csc.avaa.smear.db.service.HyyCoordLocalService;
import fi.csc.avaa.smear.db.service.persistence.HyyCoordPersistence;

import java.io.Serializable;

import java.util.List;

import javax.sql.DataSource;

/**
 * Provides the base implementation for the hyy coord local service.
 *
 * <p>
 * This implementation exists only as a container for the default service methods generated by ServiceBuilder. All custom service methods should be put in {@link fi.csc.avaa.smear.db.service.impl.HyyCoordLocalServiceImpl}.
 * </p>
 *
 * @author tkantola
 * @see fi.csc.avaa.smear.db.service.impl.HyyCoordLocalServiceImpl
 * @see fi.csc.avaa.smear.db.service.HyyCoordLocalServiceUtil
 * @generated
 */
public abstract class HyyCoordLocalServiceBaseImpl extends BaseLocalServiceImpl
    implements HyyCoordLocalService, IdentifiableBean {
    @BeanReference(type = fi.csc.avaa.smear.db.service.HyyCoordLocalService.class)
    protected fi.csc.avaa.smear.db.service.HyyCoordLocalService hyyCoordLocalService;
    @BeanReference(type = fi.csc.avaa.smear.db.service.HyyCoordService.class)
    protected fi.csc.avaa.smear.db.service.HyyCoordService hyyCoordService;
    @BeanReference(type = HyyCoordPersistence.class)
    protected HyyCoordPersistence hyyCoordPersistence;
    @BeanReference(type = com.liferay.counter.service.CounterLocalService.class)
    protected com.liferay.counter.service.CounterLocalService counterLocalService;
    @BeanReference(type = com.liferay.portal.service.ResourceLocalService.class)
    protected com.liferay.portal.service.ResourceLocalService resourceLocalService;
    @BeanReference(type = com.liferay.portal.service.UserLocalService.class)
    protected com.liferay.portal.service.UserLocalService userLocalService;
    @BeanReference(type = com.liferay.portal.service.UserService.class)
    protected com.liferay.portal.service.UserService userService;
    @BeanReference(type = UserPersistence.class)
    protected UserPersistence userPersistence;
    private String _beanIdentifier;
    private ClassLoader _classLoader;
    private HyyCoordLocalServiceClpInvoker _clpInvoker = new HyyCoordLocalServiceClpInvoker();

    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this class directly. Always use {@link fi.csc.avaa.smear.db.service.HyyCoordLocalServiceUtil} to access the hyy coord local service.
     */

    /**
     * Adds the hyy coord to the database. Also notifies the appropriate model listeners.
     *
     * @param hyyCoord the hyy coord
     * @return the hyy coord that was added
     * @throws SystemException if a system exception occurred
     */
    @Indexable(type = IndexableType.REINDEX)
    @Override
    public HyyCoord addHyyCoord(HyyCoord hyyCoord) throws SystemException {
        hyyCoord.setNew(true);

        return hyyCoordPersistence.update(hyyCoord);
    }

    /**
     * Creates a new hyy coord with the primary key. Does not add the hyy coord to the database.
     *
     * @param arrTimeID the primary key for the new hyy coord
     * @return the new hyy coord
     */
    @Override
    public HyyCoord createHyyCoord(long arrTimeID) {
        return hyyCoordPersistence.create(arrTimeID);
    }

    /**
     * Deletes the hyy coord with the primary key from the database. Also notifies the appropriate model listeners.
     *
     * @param arrTimeID the primary key of the hyy coord
     * @return the hyy coord that was removed
     * @throws PortalException if a hyy coord with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Indexable(type = IndexableType.DELETE)
    @Override
    public HyyCoord deleteHyyCoord(long arrTimeID)
        throws PortalException, SystemException {
        return hyyCoordPersistence.remove(arrTimeID);
    }

    /**
     * Deletes the hyy coord from the database. Also notifies the appropriate model listeners.
     *
     * @param hyyCoord the hyy coord
     * @return the hyy coord that was removed
     * @throws SystemException if a system exception occurred
     */
    @Indexable(type = IndexableType.DELETE)
    @Override
    public HyyCoord deleteHyyCoord(HyyCoord hyyCoord) throws SystemException {
        return hyyCoordPersistence.remove(hyyCoord);
    }

    @Override
    public DynamicQuery dynamicQuery() {
        Class<?> clazz = getClass();

        return DynamicQueryFactoryUtil.forClass(HyyCoord.class,
            clazz.getClassLoader());
    }

    /**
     * Performs a dynamic query on the database and returns the matching rows.
     *
     * @param dynamicQuery the dynamic query
     * @return the matching rows
     * @throws SystemException if a system exception occurred
     */
    @Override
    @SuppressWarnings("rawtypes")
    public List dynamicQuery(DynamicQuery dynamicQuery)
        throws SystemException {
        return hyyCoordPersistence.findWithDynamicQuery(dynamicQuery);
    }

    /**
     * Performs a dynamic query on the database and returns a range of the matching rows.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link fi.csc.avaa.smear.db.model.impl.HyyCoordModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param dynamicQuery the dynamic query
     * @param start the lower bound of the range of model instances
     * @param end the upper bound of the range of model instances (not inclusive)
     * @return the range of matching rows
     * @throws SystemException if a system exception occurred
     */
    @Override
    @SuppressWarnings("rawtypes")
    public List dynamicQuery(DynamicQuery dynamicQuery, int start, int end)
        throws SystemException {
        return hyyCoordPersistence.findWithDynamicQuery(dynamicQuery, start, end);
    }

    /**
     * Performs a dynamic query on the database and returns an ordered range of the matching rows.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link fi.csc.avaa.smear.db.model.impl.HyyCoordModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param dynamicQuery the dynamic query
     * @param start the lower bound of the range of model instances
     * @param end the upper bound of the range of model instances (not inclusive)
     * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
     * @return the ordered range of matching rows
     * @throws SystemException if a system exception occurred
     */
    @Override
    @SuppressWarnings("rawtypes")
    public List dynamicQuery(DynamicQuery dynamicQuery, int start, int end,
        OrderByComparator orderByComparator) throws SystemException {
        return hyyCoordPersistence.findWithDynamicQuery(dynamicQuery, start,
            end, orderByComparator);
    }

    /**
     * Returns the number of rows that match the dynamic query.
     *
     * @param dynamicQuery the dynamic query
     * @return the number of rows that match the dynamic query
     * @throws SystemException if a system exception occurred
     */
    @Override
    public long dynamicQueryCount(DynamicQuery dynamicQuery)
        throws SystemException {
        return hyyCoordPersistence.countWithDynamicQuery(dynamicQuery);
    }

    /**
     * Returns the number of rows that match the dynamic query.
     *
     * @param dynamicQuery the dynamic query
     * @param projection the projection to apply to the query
     * @return the number of rows that match the dynamic query
     * @throws SystemException if a system exception occurred
     */
    @Override
    public long dynamicQueryCount(DynamicQuery dynamicQuery,
        Projection projection) throws SystemException {
        return hyyCoordPersistence.countWithDynamicQuery(dynamicQuery,
            projection);
    }

    @Override
    public HyyCoord fetchHyyCoord(long arrTimeID) throws SystemException {
        return hyyCoordPersistence.fetchByPrimaryKey(arrTimeID);
    }

    /**
     * Returns the hyy coord with the primary key.
     *
     * @param arrTimeID the primary key of the hyy coord
     * @return the hyy coord
     * @throws PortalException if a hyy coord with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public HyyCoord getHyyCoord(long arrTimeID)
        throws PortalException, SystemException {
        return hyyCoordPersistence.findByPrimaryKey(arrTimeID);
    }

    @Override
    public PersistedModel getPersistedModel(Serializable primaryKeyObj)
        throws PortalException, SystemException {
        return hyyCoordPersistence.findByPrimaryKey(primaryKeyObj);
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
    @Override
    public List<HyyCoord> getHyyCoords(int start, int end)
        throws SystemException {
        return hyyCoordPersistence.findAll(start, end);
    }

    /**
     * Returns the number of hyy coords.
     *
     * @return the number of hyy coords
     * @throws SystemException if a system exception occurred
     */
    @Override
    public int getHyyCoordsCount() throws SystemException {
        return hyyCoordPersistence.countAll();
    }

    /**
     * Updates the hyy coord in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
     *
     * @param hyyCoord the hyy coord
     * @return the hyy coord that was updated
     * @throws SystemException if a system exception occurred
     */
    @Indexable(type = IndexableType.REINDEX)
    @Override
    public HyyCoord updateHyyCoord(HyyCoord hyyCoord) throws SystemException {
        return hyyCoordPersistence.update(hyyCoord);
    }

    /**
     * Returns the hyy coord local service.
     *
     * @return the hyy coord local service
     */
    public fi.csc.avaa.smear.db.service.HyyCoordLocalService getHyyCoordLocalService() {
        return hyyCoordLocalService;
    }

    /**
     * Sets the hyy coord local service.
     *
     * @param hyyCoordLocalService the hyy coord local service
     */
    public void setHyyCoordLocalService(
        fi.csc.avaa.smear.db.service.HyyCoordLocalService hyyCoordLocalService) {
        this.hyyCoordLocalService = hyyCoordLocalService;
    }

    /**
     * Returns the hyy coord remote service.
     *
     * @return the hyy coord remote service
     */
    public fi.csc.avaa.smear.db.service.HyyCoordService getHyyCoordService() {
        return hyyCoordService;
    }

    /**
     * Sets the hyy coord remote service.
     *
     * @param hyyCoordService the hyy coord remote service
     */
    public void setHyyCoordService(
        fi.csc.avaa.smear.db.service.HyyCoordService hyyCoordService) {
        this.hyyCoordService = hyyCoordService;
    }

    /**
     * Returns the hyy coord persistence.
     *
     * @return the hyy coord persistence
     */
    public HyyCoordPersistence getHyyCoordPersistence() {
        return hyyCoordPersistence;
    }

    /**
     * Sets the hyy coord persistence.
     *
     * @param hyyCoordPersistence the hyy coord persistence
     */
    public void setHyyCoordPersistence(HyyCoordPersistence hyyCoordPersistence) {
        this.hyyCoordPersistence = hyyCoordPersistence;
    }

    /**
     * Returns the counter local service.
     *
     * @return the counter local service
     */
    public com.liferay.counter.service.CounterLocalService getCounterLocalService() {
        return counterLocalService;
    }

    /**
     * Sets the counter local service.
     *
     * @param counterLocalService the counter local service
     */
    public void setCounterLocalService(
        com.liferay.counter.service.CounterLocalService counterLocalService) {
        this.counterLocalService = counterLocalService;
    }

    /**
     * Returns the resource local service.
     *
     * @return the resource local service
     */
    public com.liferay.portal.service.ResourceLocalService getResourceLocalService() {
        return resourceLocalService;
    }

    /**
     * Sets the resource local service.
     *
     * @param resourceLocalService the resource local service
     */
    public void setResourceLocalService(
        com.liferay.portal.service.ResourceLocalService resourceLocalService) {
        this.resourceLocalService = resourceLocalService;
    }

    /**
     * Returns the user local service.
     *
     * @return the user local service
     */
    public com.liferay.portal.service.UserLocalService getUserLocalService() {
        return userLocalService;
    }

    /**
     * Sets the user local service.
     *
     * @param userLocalService the user local service
     */
    public void setUserLocalService(
        com.liferay.portal.service.UserLocalService userLocalService) {
        this.userLocalService = userLocalService;
    }

    /**
     * Returns the user remote service.
     *
     * @return the user remote service
     */
    public com.liferay.portal.service.UserService getUserService() {
        return userService;
    }

    /**
     * Sets the user remote service.
     *
     * @param userService the user remote service
     */
    public void setUserService(
        com.liferay.portal.service.UserService userService) {
        this.userService = userService;
    }

    /**
     * Returns the user persistence.
     *
     * @return the user persistence
     */
    public UserPersistence getUserPersistence() {
        return userPersistence;
    }

    /**
     * Sets the user persistence.
     *
     * @param userPersistence the user persistence
     */
    public void setUserPersistence(UserPersistence userPersistence) {
        this.userPersistence = userPersistence;
    }

    public void afterPropertiesSet() {
        Class<?> clazz = getClass();

        _classLoader = clazz.getClassLoader();

        PersistedModelLocalServiceRegistryUtil.register("fi.csc.avaa.smear.db.model.HyyCoord",
            hyyCoordLocalService);
    }

    public void destroy() {
        PersistedModelLocalServiceRegistryUtil.unregister(
            "fi.csc.avaa.smear.db.model.HyyCoord");
    }

    /**
     * Returns the Spring bean ID for this bean.
     *
     * @return the Spring bean ID for this bean
     */
    @Override
    public String getBeanIdentifier() {
        return _beanIdentifier;
    }

    /**
     * Sets the Spring bean ID for this bean.
     *
     * @param beanIdentifier the Spring bean ID for this bean
     */
    @Override
    public void setBeanIdentifier(String beanIdentifier) {
        _beanIdentifier = beanIdentifier;
    }

    @Override
    public Object invokeMethod(String name, String[] parameterTypes,
        Object[] arguments) throws Throwable {
        Thread currentThread = Thread.currentThread();

        ClassLoader contextClassLoader = currentThread.getContextClassLoader();

        if (contextClassLoader != _classLoader) {
            currentThread.setContextClassLoader(_classLoader);
        }

        try {
            return _clpInvoker.invokeMethod(name, parameterTypes, arguments);
        } finally {
            if (contextClassLoader != _classLoader) {
                currentThread.setContextClassLoader(contextClassLoader);
            }
        }
    }

    protected Class<?> getModelClass() {
        return HyyCoord.class;
    }

    protected String getModelClassName() {
        return HyyCoord.class.getName();
    }

    /**
     * Performs an SQL query.
     *
     * @param sql the sql query
     */
    protected void runSQL(String sql) throws SystemException {
        try {
            DataSource dataSource = hyyCoordPersistence.getDataSource();

            SqlUpdate sqlUpdate = SqlUpdateFactoryUtil.getSqlUpdate(dataSource,
                    sql, new int[0]);

            sqlUpdate.update();
        } catch (Exception e) {
            throw new SystemException(e);
        }
    }
}