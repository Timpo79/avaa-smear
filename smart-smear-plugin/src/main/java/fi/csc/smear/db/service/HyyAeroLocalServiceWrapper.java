package fi.csc.smear.db.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link HyyAeroLocalService}.
 *
 * @author pj
 * @see HyyAeroLocalService
 * @generated
 */
public class HyyAeroLocalServiceWrapper implements HyyAeroLocalService,
    ServiceWrapper<HyyAeroLocalService> {
    private HyyAeroLocalService _hyyAeroLocalService;

    public HyyAeroLocalServiceWrapper(HyyAeroLocalService hyyAeroLocalService) {
        _hyyAeroLocalService = hyyAeroLocalService;
    }

    /**
    * Adds the hyy aero to the database. Also notifies the appropriate model listeners.
    *
    * @param hyyAero the hyy aero
    * @return the hyy aero that was added
    * @throws SystemException if a system exception occurred
    */
    @Override
    public fi.csc.smear.db.model.HyyAero addHyyAero(
        fi.csc.smear.db.model.HyyAero hyyAero)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _hyyAeroLocalService.addHyyAero(hyyAero);
    }

    /**
    * Creates a new hyy aero with the primary key. Does not add the hyy aero to the database.
    *
    * @param samptime the primary key for the new hyy aero
    * @return the new hyy aero
    */
    @Override
    public fi.csc.smear.db.model.HyyAero createHyyAero(java.util.Date samptime) {
        return _hyyAeroLocalService.createHyyAero(samptime);
    }

    /**
    * Deletes the hyy aero with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param samptime the primary key of the hyy aero
    * @return the hyy aero that was removed
    * @throws PortalException if a hyy aero with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    @Override
    public fi.csc.smear.db.model.HyyAero deleteHyyAero(java.util.Date samptime)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _hyyAeroLocalService.deleteHyyAero(samptime);
    }

    /**
    * Deletes the hyy aero from the database. Also notifies the appropriate model listeners.
    *
    * @param hyyAero the hyy aero
    * @return the hyy aero that was removed
    * @throws SystemException if a system exception occurred
    */
    @Override
    public fi.csc.smear.db.model.HyyAero deleteHyyAero(
        fi.csc.smear.db.model.HyyAero hyyAero)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _hyyAeroLocalService.deleteHyyAero(hyyAero);
    }

    @Override
    public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
        return _hyyAeroLocalService.dynamicQuery();
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
    public java.util.List dynamicQuery(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _hyyAeroLocalService.dynamicQuery(dynamicQuery);
    }

    /**
    * Performs a dynamic query on the database and returns a range of the matching rows.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link fi.csc.smear.db.model.impl.HyyAeroModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
    public java.util.List dynamicQuery(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
        int end) throws com.liferay.portal.kernel.exception.SystemException {
        return _hyyAeroLocalService.dynamicQuery(dynamicQuery, start, end);
    }

    /**
    * Performs a dynamic query on the database and returns an ordered range of the matching rows.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link fi.csc.smear.db.model.impl.HyyAeroModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
    public java.util.List dynamicQuery(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
        int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _hyyAeroLocalService.dynamicQuery(dynamicQuery, start, end,
            orderByComparator);
    }

    /**
    * Returns the number of rows that match the dynamic query.
    *
    * @param dynamicQuery the dynamic query
    * @return the number of rows that match the dynamic query
    * @throws SystemException if a system exception occurred
    */
    @Override
    public long dynamicQueryCount(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _hyyAeroLocalService.dynamicQueryCount(dynamicQuery);
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
    public long dynamicQueryCount(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
        com.liferay.portal.kernel.dao.orm.Projection projection)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _hyyAeroLocalService.dynamicQueryCount(dynamicQuery, projection);
    }

    @Override
    public fi.csc.smear.db.model.HyyAero fetchHyyAero(java.util.Date samptime)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _hyyAeroLocalService.fetchHyyAero(samptime);
    }

    /**
    * Returns the hyy aero with the primary key.
    *
    * @param samptime the primary key of the hyy aero
    * @return the hyy aero
    * @throws PortalException if a hyy aero with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    @Override
    public fi.csc.smear.db.model.HyyAero getHyyAero(java.util.Date samptime)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _hyyAeroLocalService.getHyyAero(samptime);
    }

    @Override
    public com.liferay.portal.model.PersistedModel getPersistedModel(
        java.io.Serializable primaryKeyObj)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _hyyAeroLocalService.getPersistedModel(primaryKeyObj);
    }

    /**
    * Returns a range of all the hyy aeros.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link fi.csc.smear.db.model.impl.HyyAeroModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of hyy aeros
    * @param end the upper bound of the range of hyy aeros (not inclusive)
    * @return the range of hyy aeros
    * @throws SystemException if a system exception occurred
    */
    @Override
    public java.util.List<fi.csc.smear.db.model.HyyAero> getHyyAeros(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _hyyAeroLocalService.getHyyAeros(start, end);
    }

    /**
    * Returns the number of hyy aeros.
    *
    * @return the number of hyy aeros
    * @throws SystemException if a system exception occurred
    */
    @Override
    public int getHyyAerosCount()
        throws com.liferay.portal.kernel.exception.SystemException {
        return _hyyAeroLocalService.getHyyAerosCount();
    }

    /**
    * Updates the hyy aero in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
    *
    * @param hyyAero the hyy aero
    * @return the hyy aero that was updated
    * @throws SystemException if a system exception occurred
    */
    @Override
    public fi.csc.smear.db.model.HyyAero updateHyyAero(
        fi.csc.smear.db.model.HyyAero hyyAero)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _hyyAeroLocalService.updateHyyAero(hyyAero);
    }

    /**
    * Returns the Spring bean ID for this bean.
    *
    * @return the Spring bean ID for this bean
    */
    @Override
    public java.lang.String getBeanIdentifier() {
        return _hyyAeroLocalService.getBeanIdentifier();
    }

    /**
    * Sets the Spring bean ID for this bean.
    *
    * @param beanIdentifier the Spring bean ID for this bean
    */
    @Override
    public void setBeanIdentifier(java.lang.String beanIdentifier) {
        _hyyAeroLocalService.setBeanIdentifier(beanIdentifier);
    }

    @Override
    public java.lang.Object invokeMethod(java.lang.String name,
        java.lang.String[] parameterTypes, java.lang.Object[] arguments)
        throws java.lang.Throwable {
        return _hyyAeroLocalService.invokeMethod(name, parameterTypes, arguments);
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
     */
    public HyyAeroLocalService getWrappedHyyAeroLocalService() {
        return _hyyAeroLocalService;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
     */
    public void setWrappedHyyAeroLocalService(
        HyyAeroLocalService hyyAeroLocalService) {
        _hyyAeroLocalService = hyyAeroLocalService;
    }

    @Override
    public HyyAeroLocalService getWrappedService() {
        return _hyyAeroLocalService;
    }

    @Override
    public void setWrappedService(HyyAeroLocalService hyyAeroLocalService) {
        _hyyAeroLocalService = hyyAeroLocalService;
    }
}
