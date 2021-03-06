package fi.csc.avaa.smear.db.service.base;

import com.liferay.portal.kernel.bean.BeanReference;
import com.liferay.portal.kernel.bean.IdentifiableBean;
import com.liferay.portal.kernel.dao.jdbc.SqlUpdate;
import com.liferay.portal.kernel.dao.jdbc.SqlUpdateFactoryUtil;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.service.BaseServiceImpl;
import com.liferay.portal.service.persistence.UserPersistence;

import fi.csc.avaa.smear.db.model.HyyCoord;
import fi.csc.avaa.smear.db.service.HyyCoordService;
import fi.csc.avaa.smear.db.service.persistence.HyyCoordPersistence;

import javax.sql.DataSource;

/**
 * Provides the base implementation for the hyy coord remote service.
 *
 * <p>
 * This implementation exists only as a container for the default service methods generated by ServiceBuilder. All custom service methods should be put in {@link fi.csc.avaa.smear.db.service.impl.HyyCoordServiceImpl}.
 * </p>
 *
 * @author tkantola
 * @see fi.csc.avaa.smear.db.service.impl.HyyCoordServiceImpl
 * @see fi.csc.avaa.smear.db.service.HyyCoordServiceUtil
 * @generated
 */
public abstract class HyyCoordServiceBaseImpl extends BaseServiceImpl
    implements HyyCoordService, IdentifiableBean {
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
    private HyyCoordServiceClpInvoker _clpInvoker = new HyyCoordServiceClpInvoker();

    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this class directly. Always use {@link fi.csc.avaa.smear.db.service.HyyCoordServiceUtil} to access the hyy coord remote service.
     */

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
    }

    public void destroy() {
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
