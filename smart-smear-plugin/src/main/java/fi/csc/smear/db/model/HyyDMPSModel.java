package fi.csc.smear.db.model;

import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.service.ServiceContext;

import com.liferay.portlet.expando.model.ExpandoBridge;

import java.io.Serializable;

import java.util.Date;

/**
 * The base model interface for the HyyDMPS service. Represents a row in the &quot;HYY_DMPS&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link fi.csc.smear.db.model.impl.HyyDMPSModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link fi.csc.smear.db.model.impl.HyyDMPSImpl}.
 * </p>
 *
 * @author pj
 * @see HyyDMPS
 * @see fi.csc.smear.db.model.impl.HyyDMPSImpl
 * @see fi.csc.smear.db.model.impl.HyyDMPSModelImpl
 * @generated
 */
public interface HyyDMPSModel extends BaseModel<HyyDMPS> {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this interface directly. All methods that expect a hyy d m p s model instance should use the {@link HyyDMPS} interface instead.
     */

    /**
     * Returns the primary key of this hyy d m p s.
     *
     * @return the primary key of this hyy d m p s
     */
    public java.util.Date getPrimaryKey();

    /**
     * Sets the primary key of this hyy d m p s.
     *
     * @param primaryKey the primary key of this hyy d m p s
     */
    public void setPrimaryKey(java.util.Date primaryKey);

    /**
     * Returns the samptime of this hyy d m p s.
     *
     * @return the samptime of this hyy d m p s
     */
    public Date getSamptime();

    /**
     * Sets the samptime of this hyy d m p s.
     *
     * @param samptime the samptime of this hyy d m p s
     */
    public void setSamptime(Date samptime);

    /**
     * Returns the t1 of this hyy d m p s.
     *
     * @return the t1 of this hyy d m p s
     */
    public float getT1();

    /**
     * Sets the t1 of this hyy d m p s.
     *
     * @param t1 the t1 of this hyy d m p s
     */
    public void setT1(float t1);

    /**
     * Returns the t2 of this hyy d m p s.
     *
     * @return the t2 of this hyy d m p s
     */
    public float getT2();

    /**
     * Sets the t2 of this hyy d m p s.
     *
     * @param t2 the t2 of this hyy d m p s
     */
    public void setT2(float t2);

    /**
     * Returns the p1 of this hyy d m p s.
     *
     * @return the p1 of this hyy d m p s
     */
    public float getP1();

    /**
     * Sets the p1 of this hyy d m p s.
     *
     * @param p1 the p1 of this hyy d m p s
     */
    public void setP1(float p1);

    /**
     * Returns the p2 of this hyy d m p s.
     *
     * @return the p2 of this hyy d m p s
     */
    public float getP2();

    /**
     * Sets the p2 of this hyy d m p s.
     *
     * @param p2 the p2 of this hyy d m p s
     */
    public void setP2(float p2);

    /**
     * Returns the rh1 of this hyy d m p s.
     *
     * @return the rh1 of this hyy d m p s
     */
    public float getRh1();

    /**
     * Sets the rh1 of this hyy d m p s.
     *
     * @param rh1 the rh1 of this hyy d m p s
     */
    public void setRh1(float rh1);

    /**
     * Returns the rh2 of this hyy d m p s.
     *
     * @return the rh2 of this hyy d m p s
     */
    public float getRh2();

    /**
     * Sets the rh2 of this hyy d m p s.
     *
     * @param rh2 the rh2 of this hyy d m p s
     */
    public void setRh2(float rh2);

    /**
     * Returns the d100e1 of this hyy d m p s.
     *
     * @return the d100e1 of this hyy d m p s
     */
    public float getD100e1();

    /**
     * Sets the d100e1 of this hyy d m p s.
     *
     * @param d100e1 the d100e1 of this hyy d m p s
     */
    public void setD100e1(float d100e1);

    /**
     * Returns the d112e1 of this hyy d m p s.
     *
     * @return the d112e1 of this hyy d m p s
     */
    public float getD112e1();

    /**
     * Sets the d112e1 of this hyy d m p s.
     *
     * @param d112e1 the d112e1 of this hyy d m p s
     */
    public void setD112e1(float d112e1);

    /**
     * Returns the d126e1 of this hyy d m p s.
     *
     * @return the d126e1 of this hyy d m p s
     */
    public float getD126e1();

    /**
     * Sets the d126e1 of this hyy d m p s.
     *
     * @param d126e1 the d126e1 of this hyy d m p s
     */
    public void setD126e1(float d126e1);

    /**
     * Returns the d141e1 of this hyy d m p s.
     *
     * @return the d141e1 of this hyy d m p s
     */
    public float getD141e1();

    /**
     * Sets the d141e1 of this hyy d m p s.
     *
     * @param d141e1 the d141e1 of this hyy d m p s
     */
    public void setD141e1(float d141e1);

    /**
     * Returns the d158e1 of this hyy d m p s.
     *
     * @return the d158e1 of this hyy d m p s
     */
    public float getD158e1();

    /**
     * Sets the d158e1 of this hyy d m p s.
     *
     * @param d158e1 the d158e1 of this hyy d m p s
     */
    public void setD158e1(float d158e1);

    /**
     * Returns the d178e1 of this hyy d m p s.
     *
     * @return the d178e1 of this hyy d m p s
     */
    public float getD178e1();

    /**
     * Sets the d178e1 of this hyy d m p s.
     *
     * @param d178e1 the d178e1 of this hyy d m p s
     */
    public void setD178e1(float d178e1);

    /**
     * Returns the d200e1 of this hyy d m p s.
     *
     * @return the d200e1 of this hyy d m p s
     */
    public float getD200e1();

    /**
     * Sets the d200e1 of this hyy d m p s.
     *
     * @param d200e1 the d200e1 of this hyy d m p s
     */
    public void setD200e1(float d200e1);

    /**
     * Returns the d224e1 of this hyy d m p s.
     *
     * @return the d224e1 of this hyy d m p s
     */
    public float getD224e1();

    /**
     * Sets the d224e1 of this hyy d m p s.
     *
     * @param d224e1 the d224e1 of this hyy d m p s
     */
    public void setD224e1(float d224e1);

    /**
     * Returns the d251e1 of this hyy d m p s.
     *
     * @return the d251e1 of this hyy d m p s
     */
    public float getD251e1();

    /**
     * Sets the d251e1 of this hyy d m p s.
     *
     * @param d251e1 the d251e1 of this hyy d m p s
     */
    public void setD251e1(float d251e1);

    /**
     * Returns the d282e1 of this hyy d m p s.
     *
     * @return the d282e1 of this hyy d m p s
     */
    public float getD282e1();

    /**
     * Sets the d282e1 of this hyy d m p s.
     *
     * @param d282e1 the d282e1 of this hyy d m p s
     */
    public void setD282e1(float d282e1);

    /**
     * Returns the d316e1 of this hyy d m p s.
     *
     * @return the d316e1 of this hyy d m p s
     */
    public float getD316e1();

    /**
     * Sets the d316e1 of this hyy d m p s.
     *
     * @param d316e1 the d316e1 of this hyy d m p s
     */
    public void setD316e1(float d316e1);

    /**
     * Returns the d355e1 of this hyy d m p s.
     *
     * @return the d355e1 of this hyy d m p s
     */
    public float getD355e1();

    /**
     * Sets the d355e1 of this hyy d m p s.
     *
     * @param d355e1 the d355e1 of this hyy d m p s
     */
    public void setD355e1(float d355e1);

    /**
     * Returns the d398e1 of this hyy d m p s.
     *
     * @return the d398e1 of this hyy d m p s
     */
    public float getD398e1();

    /**
     * Sets the d398e1 of this hyy d m p s.
     *
     * @param d398e1 the d398e1 of this hyy d m p s
     */
    public void setD398e1(float d398e1);

    /**
     * Returns the d447e1 of this hyy d m p s.
     *
     * @return the d447e1 of this hyy d m p s
     */
    public float getD447e1();

    /**
     * Sets the d447e1 of this hyy d m p s.
     *
     * @param d447e1 the d447e1 of this hyy d m p s
     */
    public void setD447e1(float d447e1);

    /**
     * Returns the d501e1 of this hyy d m p s.
     *
     * @return the d501e1 of this hyy d m p s
     */
    public float getD501e1();

    /**
     * Sets the d501e1 of this hyy d m p s.
     *
     * @param d501e1 the d501e1 of this hyy d m p s
     */
    public void setD501e1(float d501e1);

    /**
     * Returns the d562e1 of this hyy d m p s.
     *
     * @return the d562e1 of this hyy d m p s
     */
    public float getD562e1();

    /**
     * Sets the d562e1 of this hyy d m p s.
     *
     * @param d562e1 the d562e1 of this hyy d m p s
     */
    public void setD562e1(float d562e1);

    /**
     * Returns the d631e1 of this hyy d m p s.
     *
     * @return the d631e1 of this hyy d m p s
     */
    public float getD631e1();

    /**
     * Sets the d631e1 of this hyy d m p s.
     *
     * @param d631e1 the d631e1 of this hyy d m p s
     */
    public void setD631e1(float d631e1);

    /**
     * Returns the d708e1 of this hyy d m p s.
     *
     * @return the d708e1 of this hyy d m p s
     */
    public float getD708e1();

    /**
     * Sets the d708e1 of this hyy d m p s.
     *
     * @param d708e1 the d708e1 of this hyy d m p s
     */
    public void setD708e1(float d708e1);

    /**
     * Returns the d794e1 of this hyy d m p s.
     *
     * @return the d794e1 of this hyy d m p s
     */
    public float getD794e1();

    /**
     * Sets the d794e1 of this hyy d m p s.
     *
     * @param d794e1 the d794e1 of this hyy d m p s
     */
    public void setD794e1(float d794e1);

    /**
     * Returns the d891e1 of this hyy d m p s.
     *
     * @return the d891e1 of this hyy d m p s
     */
    public float getD891e1();

    /**
     * Sets the d891e1 of this hyy d m p s.
     *
     * @param d891e1 the d891e1 of this hyy d m p s
     */
    public void setD891e1(float d891e1);

    /**
     * Returns the d100e2 of this hyy d m p s.
     *
     * @return the d100e2 of this hyy d m p s
     */
    public float getD100e2();

    /**
     * Sets the d100e2 of this hyy d m p s.
     *
     * @param d100e2 the d100e2 of this hyy d m p s
     */
    public void setD100e2(float d100e2);

    /**
     * Returns the d112e2 of this hyy d m p s.
     *
     * @return the d112e2 of this hyy d m p s
     */
    public float getD112e2();

    /**
     * Sets the d112e2 of this hyy d m p s.
     *
     * @param d112e2 the d112e2 of this hyy d m p s
     */
    public void setD112e2(float d112e2);

    /**
     * Returns the d126e2 of this hyy d m p s.
     *
     * @return the d126e2 of this hyy d m p s
     */
    public float getD126e2();

    /**
     * Sets the d126e2 of this hyy d m p s.
     *
     * @param d126e2 the d126e2 of this hyy d m p s
     */
    public void setD126e2(float d126e2);

    /**
     * Returns the d141e2 of this hyy d m p s.
     *
     * @return the d141e2 of this hyy d m p s
     */
    public float getD141e2();

    /**
     * Sets the d141e2 of this hyy d m p s.
     *
     * @param d141e2 the d141e2 of this hyy d m p s
     */
    public void setD141e2(float d141e2);

    /**
     * Returns the d158e2 of this hyy d m p s.
     *
     * @return the d158e2 of this hyy d m p s
     */
    public float getD158e2();

    /**
     * Sets the d158e2 of this hyy d m p s.
     *
     * @param d158e2 the d158e2 of this hyy d m p s
     */
    public void setD158e2(float d158e2);

    /**
     * Returns the d178e2 of this hyy d m p s.
     *
     * @return the d178e2 of this hyy d m p s
     */
    public float getD178e2();

    /**
     * Sets the d178e2 of this hyy d m p s.
     *
     * @param d178e2 the d178e2 of this hyy d m p s
     */
    public void setD178e2(float d178e2);

    /**
     * Returns the d200e2 of this hyy d m p s.
     *
     * @return the d200e2 of this hyy d m p s
     */
    public float getD200e2();

    /**
     * Sets the d200e2 of this hyy d m p s.
     *
     * @param d200e2 the d200e2 of this hyy d m p s
     */
    public void setD200e2(float d200e2);

    /**
     * Returns the d224e2 of this hyy d m p s.
     *
     * @return the d224e2 of this hyy d m p s
     */
    public float getD224e2();

    /**
     * Sets the d224e2 of this hyy d m p s.
     *
     * @param d224e2 the d224e2 of this hyy d m p s
     */
    public void setD224e2(float d224e2);

    /**
     * Returns the d251e2 of this hyy d m p s.
     *
     * @return the d251e2 of this hyy d m p s
     */
    public float getD251e2();

    /**
     * Sets the d251e2 of this hyy d m p s.
     *
     * @param d251e2 the d251e2 of this hyy d m p s
     */
    public void setD251e2(float d251e2);

    /**
     * Returns the d282e2 of this hyy d m p s.
     *
     * @return the d282e2 of this hyy d m p s
     */
    public float getD282e2();

    /**
     * Sets the d282e2 of this hyy d m p s.
     *
     * @param d282e2 the d282e2 of this hyy d m p s
     */
    public void setD282e2(float d282e2);

    /**
     * Returns the d316e2 of this hyy d m p s.
     *
     * @return the d316e2 of this hyy d m p s
     */
    public float getD316e2();

    /**
     * Sets the d316e2 of this hyy d m p s.
     *
     * @param d316e2 the d316e2 of this hyy d m p s
     */
    public void setD316e2(float d316e2);

    /**
     * Returns the d355e2 of this hyy d m p s.
     *
     * @return the d355e2 of this hyy d m p s
     */
    public float getD355e2();

    /**
     * Sets the d355e2 of this hyy d m p s.
     *
     * @param d355e2 the d355e2 of this hyy d m p s
     */
    public void setD355e2(float d355e2);

    /**
     * Returns the d398e2 of this hyy d m p s.
     *
     * @return the d398e2 of this hyy d m p s
     */
    public float getD398e2();

    /**
     * Sets the d398e2 of this hyy d m p s.
     *
     * @param d398e2 the d398e2 of this hyy d m p s
     */
    public void setD398e2(float d398e2);

    /**
     * Returns the d447e2 of this hyy d m p s.
     *
     * @return the d447e2 of this hyy d m p s
     */
    public float getD447e2();

    /**
     * Sets the d447e2 of this hyy d m p s.
     *
     * @param d447e2 the d447e2 of this hyy d m p s
     */
    public void setD447e2(float d447e2);

    /**
     * Returns the d501e2 of this hyy d m p s.
     *
     * @return the d501e2 of this hyy d m p s
     */
    public float getD501e2();

    /**
     * Sets the d501e2 of this hyy d m p s.
     *
     * @param d501e2 the d501e2 of this hyy d m p s
     */
    public void setD501e2(float d501e2);

    /**
     * Returns the d562e2 of this hyy d m p s.
     *
     * @return the d562e2 of this hyy d m p s
     */
    public float getD562e2();

    /**
     * Sets the d562e2 of this hyy d m p s.
     *
     * @param d562e2 the d562e2 of this hyy d m p s
     */
    public void setD562e2(float d562e2);

    /**
     * Returns the d631e2 of this hyy d m p s.
     *
     * @return the d631e2 of this hyy d m p s
     */
    public float getD631e2();

    /**
     * Sets the d631e2 of this hyy d m p s.
     *
     * @param d631e2 the d631e2 of this hyy d m p s
     */
    public void setD631e2(float d631e2);

    /**
     * Returns the d708e2 of this hyy d m p s.
     *
     * @return the d708e2 of this hyy d m p s
     */
    public float getD708e2();

    /**
     * Sets the d708e2 of this hyy d m p s.
     *
     * @param d708e2 the d708e2 of this hyy d m p s
     */
    public void setD708e2(float d708e2);

    /**
     * Returns the d794e2 of this hyy d m p s.
     *
     * @return the d794e2 of this hyy d m p s
     */
    public float getD794e2();

    /**
     * Sets the d794e2 of this hyy d m p s.
     *
     * @param d794e2 the d794e2 of this hyy d m p s
     */
    public void setD794e2(float d794e2);

    /**
     * Returns the d891e2 of this hyy d m p s.
     *
     * @return the d891e2 of this hyy d m p s
     */
    public float getD891e2();

    /**
     * Sets the d891e2 of this hyy d m p s.
     *
     * @param d891e2 the d891e2 of this hyy d m p s
     */
    public void setD891e2(float d891e2);

    /**
     * Returns the d100e3 of this hyy d m p s.
     *
     * @return the d100e3 of this hyy d m p s
     */
    public float getD100e3();

    /**
     * Sets the d100e3 of this hyy d m p s.
     *
     * @param d100e3 the d100e3 of this hyy d m p s
     */
    public void setD100e3(float d100e3);

    /**
     * Returns the d112e3 of this hyy d m p s.
     *
     * @return the d112e3 of this hyy d m p s
     */
    public float getD112e3();

    /**
     * Sets the d112e3 of this hyy d m p s.
     *
     * @param d112e3 the d112e3 of this hyy d m p s
     */
    public void setD112e3(float d112e3);

    /**
     * Returns the d126e3 of this hyy d m p s.
     *
     * @return the d126e3 of this hyy d m p s
     */
    public float getD126e3();

    /**
     * Sets the d126e3 of this hyy d m p s.
     *
     * @param d126e3 the d126e3 of this hyy d m p s
     */
    public void setD126e3(float d126e3);

    /**
     * Returns the d141e3 of this hyy d m p s.
     *
     * @return the d141e3 of this hyy d m p s
     */
    public float getD141e3();

    /**
     * Sets the d141e3 of this hyy d m p s.
     *
     * @param d141e3 the d141e3 of this hyy d m p s
     */
    public void setD141e3(float d141e3);

    /**
     * Returns the d158e3 of this hyy d m p s.
     *
     * @return the d158e3 of this hyy d m p s
     */
    public float getD158e3();

    /**
     * Sets the d158e3 of this hyy d m p s.
     *
     * @param d158e3 the d158e3 of this hyy d m p s
     */
    public void setD158e3(float d158e3);

    /**
     * Returns the d178e3 of this hyy d m p s.
     *
     * @return the d178e3 of this hyy d m p s
     */
    public float getD178e3();

    /**
     * Sets the d178e3 of this hyy d m p s.
     *
     * @param d178e3 the d178e3 of this hyy d m p s
     */
    public void setD178e3(float d178e3);

    /**
     * Returns the d200e3 of this hyy d m p s.
     *
     * @return the d200e3 of this hyy d m p s
     */
    public float getD200e3();

    /**
     * Sets the d200e3 of this hyy d m p s.
     *
     * @param d200e3 the d200e3 of this hyy d m p s
     */
    public void setD200e3(float d200e3);

    /**
     * Returns the d224e3 of this hyy d m p s.
     *
     * @return the d224e3 of this hyy d m p s
     */
    public float getD224e3();

    /**
     * Sets the d224e3 of this hyy d m p s.
     *
     * @param d224e3 the d224e3 of this hyy d m p s
     */
    public void setD224e3(float d224e3);

    /**
     * Returns the d251e3 of this hyy d m p s.
     *
     * @return the d251e3 of this hyy d m p s
     */
    public float getD251e3();

    /**
     * Sets the d251e3 of this hyy d m p s.
     *
     * @param d251e3 the d251e3 of this hyy d m p s
     */
    public void setD251e3(float d251e3);

    /**
     * Returns the d282e3 of this hyy d m p s.
     *
     * @return the d282e3 of this hyy d m p s
     */
    public float getD282e3();

    /**
     * Sets the d282e3 of this hyy d m p s.
     *
     * @param d282e3 the d282e3 of this hyy d m p s
     */
    public void setD282e3(float d282e3);

    /**
     * Returns the d316e3 of this hyy d m p s.
     *
     * @return the d316e3 of this hyy d m p s
     */
    public float getD316e3();

    /**
     * Sets the d316e3 of this hyy d m p s.
     *
     * @param d316e3 the d316e3 of this hyy d m p s
     */
    public void setD316e3(float d316e3);

    /**
     * Returns the d355e3 of this hyy d m p s.
     *
     * @return the d355e3 of this hyy d m p s
     */
    public float getD355e3();

    /**
     * Sets the d355e3 of this hyy d m p s.
     *
     * @param d355e3 the d355e3 of this hyy d m p s
     */
    public void setD355e3(float d355e3);

    /**
     * Returns the d398e3 of this hyy d m p s.
     *
     * @return the d398e3 of this hyy d m p s
     */
    public float getD398e3();

    /**
     * Sets the d398e3 of this hyy d m p s.
     *
     * @param d398e3 the d398e3 of this hyy d m p s
     */
    public void setD398e3(float d398e3);

    /**
     * Returns the d447e3 of this hyy d m p s.
     *
     * @return the d447e3 of this hyy d m p s
     */
    public float getD447e3();

    /**
     * Sets the d447e3 of this hyy d m p s.
     *
     * @param d447e3 the d447e3 of this hyy d m p s
     */
    public void setD447e3(float d447e3);

    /**
     * Returns the d501e3 of this hyy d m p s.
     *
     * @return the d501e3 of this hyy d m p s
     */
    public float getD501e3();

    /**
     * Sets the d501e3 of this hyy d m p s.
     *
     * @param d501e3 the d501e3 of this hyy d m p s
     */
    public void setD501e3(float d501e3);

    /**
     * Returns the d562e3 of this hyy d m p s.
     *
     * @return the d562e3 of this hyy d m p s
     */
    public float getD562e3();

    /**
     * Sets the d562e3 of this hyy d m p s.
     *
     * @param d562e3 the d562e3 of this hyy d m p s
     */
    public void setD562e3(float d562e3);

    /**
     * Returns the d631e3 of this hyy d m p s.
     *
     * @return the d631e3 of this hyy d m p s
     */
    public float getD631e3();

    /**
     * Sets the d631e3 of this hyy d m p s.
     *
     * @param d631e3 the d631e3 of this hyy d m p s
     */
    public void setD631e3(float d631e3);

    /**
     * Returns the d708e3 of this hyy d m p s.
     *
     * @return the d708e3 of this hyy d m p s
     */
    public float getD708e3();

    /**
     * Sets the d708e3 of this hyy d m p s.
     *
     * @param d708e3 the d708e3 of this hyy d m p s
     */
    public void setD708e3(float d708e3);

    /**
     * Returns the d794e3 of this hyy d m p s.
     *
     * @return the d794e3 of this hyy d m p s
     */
    public float getD794e3();

    /**
     * Sets the d794e3 of this hyy d m p s.
     *
     * @param d794e3 the d794e3 of this hyy d m p s
     */
    public void setD794e3(float d794e3);

    /**
     * Returns the d891e3 of this hyy d m p s.
     *
     * @return the d891e3 of this hyy d m p s
     */
    public float getD891e3();

    /**
     * Sets the d891e3 of this hyy d m p s.
     *
     * @param d891e3 the d891e3 of this hyy d m p s
     */
    public void setD891e3(float d891e3);

    /**
     * Returns the d100e4 of this hyy d m p s.
     *
     * @return the d100e4 of this hyy d m p s
     */
    public float getD100e4();

    /**
     * Sets the d100e4 of this hyy d m p s.
     *
     * @param d100e4 the d100e4 of this hyy d m p s
     */
    public void setD100e4(float d100e4);

    /**
     * Returns the tconc of this hyy d m p s.
     *
     * @return the tconc of this hyy d m p s
     */
    public float getTconc();

    /**
     * Sets the tconc of this hyy d m p s.
     *
     * @param tconc the tconc of this hyy d m p s
     */
    public void setTconc(float tconc);

    @Override
    public boolean isNew();

    @Override
    public void setNew(boolean n);

    @Override
    public boolean isCachedModel();

    @Override
    public void setCachedModel(boolean cachedModel);

    @Override
    public boolean isEscapedModel();

    @Override
    public Serializable getPrimaryKeyObj();

    @Override
    public void setPrimaryKeyObj(Serializable primaryKeyObj);

    @Override
    public ExpandoBridge getExpandoBridge();

    @Override
    public void setExpandoBridgeAttributes(BaseModel<?> baseModel);

    @Override
    public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge);

    @Override
    public void setExpandoBridgeAttributes(ServiceContext serviceContext);

    @Override
    public Object clone();

    @Override
    public int compareTo(HyyDMPS hyyDMPS);

    @Override
    public int hashCode();

    @Override
    public CacheModel<HyyDMPS> toCacheModel();

    @Override
    public HyyDMPS toEscapedModel();

    @Override
    public HyyDMPS toUnescapedModel();

    @Override
    public String toString();

    @Override
    public String toXmlString();
}
