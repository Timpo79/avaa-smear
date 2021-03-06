package fi.csc.smear.db.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link KumpulametaLocalService}.
 *
 * @author pj
 * @see KumpulametaLocalService
 * @generated
 */
public class KumpulametaLocalServiceWrapper implements KumpulametaLocalService,
    ServiceWrapper<KumpulametaLocalService> {
    private KumpulametaLocalService _kumpulametaLocalService;

    public KumpulametaLocalServiceWrapper(
        KumpulametaLocalService kumpulametaLocalService) {
        _kumpulametaLocalService = kumpulametaLocalService;
    }

    /**
    * Adds the kumpulameta to the database. Also notifies the appropriate model listeners.
    *
    * @param kumpulameta the kumpulameta
    * @return the kumpulameta that was added
    * @throws SystemException if a system exception occurred
    */
    @Override
    public fi.csc.smear.db.model.Kumpulameta addKumpulameta(
        fi.csc.smear.db.model.Kumpulameta kumpulameta)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _kumpulametaLocalService.addKumpulameta(kumpulameta);
    }

    /**
    * Creates a new kumpulameta with the primary key. Does not add the kumpulameta to the database.
    *
    * @param samptime the primary key for the new kumpulameta
    * @return the new kumpulameta
    */
    @Override
    public fi.csc.smear.db.model.Kumpulameta createKumpulameta(
        java.util.Date samptime) {
        return _kumpulametaLocalService.createKumpulameta(samptime);
    }

    /**
    * Deletes the kumpulameta with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param samptime the primary key of the kumpulameta
    * @return the kumpulameta that was removed
    * @throws PortalException if a kumpulameta with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    @Override
    public fi.csc.smear.db.model.Kumpulameta deleteKumpulameta(
        java.util.Date samptime)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _kumpulametaLocalService.deleteKumpulameta(samptime);
    }

    /**
    * Deletes the kumpulameta from the database. Also notifies the appropriate model listeners.
    *
    * @param kumpulameta the kumpulameta
    * @return the kumpulameta that was removed
    * @throws SystemException if a system exception occurred
    */
    @Override
    public fi.csc.smear.db.model.Kumpulameta deleteKumpulameta(
        fi.csc.smear.db.model.Kumpulameta kumpulameta)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _kumpulametaLocalService.deleteKumpulameta(kumpulameta);
    }

    @Override
    public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
        return _kumpulametaLocalService.dynamicQuery();
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
        return _kumpulametaLocalService.dynamicQuery(dynamicQuery);
    }

    /**
    * Performs a dynamic query on the database and returns a range of the matching rows.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link fi.csc.smear.db.model.impl.KumpulametaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
        return _kumpulametaLocalService.dynamicQuery(dynamicQuery, start, end);
    }

    /**
    * Performs a dynamic query on the database and returns an ordered range of the matching rows.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link fi.csc.smear.db.model.impl.KumpulametaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
        return _kumpulametaLocalService.dynamicQuery(dynamicQuery, start, end,
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
        return _kumpulametaLocalService.dynamicQueryCount(dynamicQuery);
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
        return _kumpulametaLocalService.dynamicQueryCount(dynamicQuery,
            projection);
    }

    @Override
    public fi.csc.smear.db.model.Kumpulameta fetchKumpulameta(
        java.util.Date samptime)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _kumpulametaLocalService.fetchKumpulameta(samptime);
    }

    /**
    * Returns the kumpulameta with the primary key.
    *
    * @param samptime the primary key of the kumpulameta
    * @return the kumpulameta
    * @throws PortalException if a kumpulameta with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    @Override
    public fi.csc.smear.db.model.Kumpulameta getKumpulameta(
        java.util.Date samptime)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _kumpulametaLocalService.getKumpulameta(samptime);
    }

    @Override
    public com.liferay.portal.model.PersistedModel getPersistedModel(
        java.io.Serializable primaryKeyObj)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _kumpulametaLocalService.getPersistedModel(primaryKeyObj);
    }

    /**
    * Returns a range of all the kumpulametas.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link fi.csc.smear.db.model.impl.KumpulametaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of kumpulametas
    * @param end the upper bound of the range of kumpulametas (not inclusive)
    * @return the range of kumpulametas
    * @throws SystemException if a system exception occurred
    */
    @Override
    public java.util.List<fi.csc.smear.db.model.Kumpulameta> getKumpulametas(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _kumpulametaLocalService.getKumpulametas(start, end);
    }

    /**
    * Returns the number of kumpulametas.
    *
    * @return the number of kumpulametas
    * @throws SystemException if a system exception occurred
    */
    @Override
    public int getKumpulametasCount()
        throws com.liferay.portal.kernel.exception.SystemException {
        return _kumpulametaLocalService.getKumpulametasCount();
    }

    /**
    * Updates the kumpulameta in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
    *
    * @param kumpulameta the kumpulameta
    * @return the kumpulameta that was updated
    * @throws SystemException if a system exception occurred
    */
    @Override
    public fi.csc.smear.db.model.Kumpulameta updateKumpulameta(
        fi.csc.smear.db.model.Kumpulameta kumpulameta)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _kumpulametaLocalService.updateKumpulameta(kumpulameta);
    }

    /**
    * Returns the Spring bean ID for this bean.
    *
    * @return the Spring bean ID for this bean
    */
    @Override
    public java.lang.String getBeanIdentifier() {
        return _kumpulametaLocalService.getBeanIdentifier();
    }

    /**
    * Sets the Spring bean ID for this bean.
    *
    * @param beanIdentifier the Spring bean ID for this bean
    */
    @Override
    public void setBeanIdentifier(java.lang.String beanIdentifier) {
        _kumpulametaLocalService.setBeanIdentifier(beanIdentifier);
    }

    @Override
    public java.lang.Object invokeMethod(java.lang.String name,
        java.lang.String[] parameterTypes, java.lang.Object[] arguments)
        throws java.lang.Throwable {
        return _kumpulametaLocalService.invokeMethod(name, parameterTypes,
            arguments);
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
     */
    public KumpulametaLocalService getWrappedKumpulametaLocalService() {
        return _kumpulametaLocalService;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
     */
    public void setWrappedKumpulametaLocalService(
        KumpulametaLocalService kumpulametaLocalService) {
        _kumpulametaLocalService = kumpulametaLocalService;
    }

    @Override
    public KumpulametaLocalService getWrappedService() {
        return _kumpulametaLocalService;
    }

    @Override
    public void setWrappedService(
        KumpulametaLocalService kumpulametaLocalService) {
        _kumpulametaLocalService = kumpulametaLocalService;
    }
}
