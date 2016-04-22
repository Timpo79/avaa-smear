package fi.csc.smear.db.model;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.impl.BaseModelImpl;

import fi.csc.smear.db.service.ClpSerializer;
import fi.csc.smear.db.service.Sii2eddyLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;


public class Sii2eddyClp extends BaseModelImpl<Sii2eddy> implements Sii2eddy {
    private Date _samptime;
    private float _U;
    private int _U_EMEP;
    private float _wind_dir;
    private int _wind_dir_EMEP;
    private float _eta;
    private int _eta_EMEP;
    private float _theta;
    private int _theta_EMEP;
    private float _beta;
    private int _beta_EMEP;
    private float _H;
    private int _H_EMEP;
    private float _tau;
    private int _tau_EMEP;
    private float _u_star;
    private int _u_star_EMEP;
    private float _MO_length;
    private int _MO_length_EMEP;
    private float _err_packet;
    private int _err_packet_EMEP;
    private float _F_c_LI72;
    private int _F_c_LI72_EMEP;
    private float _F_H2O_LI72;
    private int _F_H2O_LI72_EMEP;
    private float _F_CH4_LI77;
    private int _F_CH4_LI77_EMEP;
    private float _LE_LI72;
    private int _LE_LI72_EMEP;
    private float _av_u;
    private int _av_u_EMEP;
    private float _av_v;
    private int _av_v_EMEP;
    private float _av_w;
    private int _av_w_EMEP;
    private float _T_s;
    private int _T_s_EMEP;
    private float _av_c;
    private int _av_c_EMEP;
    private float _av_H2O_LI72;
    private int _av_H2O_LI72_EMEP;
    private float _av_CH4_LI77;
    private int _av_CH4_LI77_EMEP;
    private float _std_u;
    private int _std_u_EMEP;
    private float _std_v;
    private int _std_v_EMEP;
    private float _std_w;
    private int _std_w_EMEP;
    private float _std_T_s;
    private int _std_T_s_EMEP;
    private float _std_c_LI72;
    private int _std_c_LI72_EMEP;
    private float _std_H2O_LI72;
    private int _std_H2O_LI72_EMEP;
    private float _std_CH4_LI77;
    private int _std_CH4_LI77_EMEP;
    private float _c_lag_LI72;
    private int _c_lag_LI72_EMEP;
    private float _H2O_lag_LI72;
    private int _H2O_lag_LI72_EMEP;
    private float _CH4_lag_LI77;
    private int _CH4_lag_LI77_EMEP;
    private int _Qc_H;
    private int _Qc_H_EMEP;
    private int _Qc_CO2_LI70;
    private int _Qc_CO2_LI70_EMEP;
    private int _Qc_CH4_LI77;
    private int _Qc_CH4_LI77_EMEP;
    private int _Qc_LE_LI72;
    private int _Qc_LE_LI72_EMEP;
    private int _Qc_tau;
    private int _Qc_tau_EMEP;
    private BaseModel<?> _sii2eddyRemoteModel;
    private Class<?> _clpSerializerClass = fi.csc.smear.db.service.ClpSerializer.class;

    public Sii2eddyClp() {
    }

    @Override
    public Class<?> getModelClass() {
        return Sii2eddy.class;
    }

    @Override
    public String getModelClassName() {
        return Sii2eddy.class.getName();
    }

    @Override
    public java.util.Date getPrimaryKey() {
        return _samptime;
    }

    @Override
    public void setPrimaryKey(java.util.Date primaryKey) {
        setSamptime(primaryKey);
    }

    @Override
    public Serializable getPrimaryKeyObj() {
        return _samptime;
    }

    @Override
    public void setPrimaryKeyObj(Serializable primaryKeyObj) {
        setPrimaryKey((java.util.Date) primaryKeyObj);
    }

    @Override
    public Map<String, Object> getModelAttributes() {
        Map<String, Object> attributes = new HashMap<String, Object>();

        attributes.put("samptime", getSamptime());
        attributes.put("U", getU());
        attributes.put("U_EMEP", getU_EMEP());
        attributes.put("wind_dir", getWind_dir());
        attributes.put("wind_dir_EMEP", getWind_dir_EMEP());
        attributes.put("eta", getEta());
        attributes.put("eta_EMEP", getEta_EMEP());
        attributes.put("theta", getTheta());
        attributes.put("theta_EMEP", getTheta_EMEP());
        attributes.put("beta", getBeta());
        attributes.put("beta_EMEP", getBeta_EMEP());
        attributes.put("H", getH());
        attributes.put("H_EMEP", getH_EMEP());
        attributes.put("tau", getTau());
        attributes.put("tau_EMEP", getTau_EMEP());
        attributes.put("u_star", getU_star());
        attributes.put("u_star_EMEP", getU_star_EMEP());
        attributes.put("MO_length", getMO_length());
        attributes.put("MO_length_EMEP", getMO_length_EMEP());
        attributes.put("err_packet", getErr_packet());
        attributes.put("err_packet_EMEP", getErr_packet_EMEP());
        attributes.put("F_c_LI72", getF_c_LI72());
        attributes.put("F_c_LI72_EMEP", getF_c_LI72_EMEP());
        attributes.put("F_H2O_LI72", getF_H2O_LI72());
        attributes.put("F_H2O_LI72_EMEP", getF_H2O_LI72_EMEP());
        attributes.put("F_CH4_LI77", getF_CH4_LI77());
        attributes.put("F_CH4_LI77_EMEP", getF_CH4_LI77_EMEP());
        attributes.put("LE_LI72", getLE_LI72());
        attributes.put("LE_LI72_EMEP", getLE_LI72_EMEP());
        attributes.put("av_u", getAv_u());
        attributes.put("av_u_EMEP", getAv_u_EMEP());
        attributes.put("av_v", getAv_v());
        attributes.put("av_v_EMEP", getAv_v_EMEP());
        attributes.put("av_w", getAv_w());
        attributes.put("av_w_EMEP", getAv_w_EMEP());
        attributes.put("T_s", getT_s());
        attributes.put("T_s_EMEP", getT_s_EMEP());
        attributes.put("av_c", getAv_c());
        attributes.put("av_c_EMEP", getAv_c_EMEP());
        attributes.put("av_H2O_LI72", getAv_H2O_LI72());
        attributes.put("av_H2O_LI72_EMEP", getAv_H2O_LI72_EMEP());
        attributes.put("av_CH4_LI77", getAv_CH4_LI77());
        attributes.put("av_CH4_LI77_EMEP", getAv_CH4_LI77_EMEP());
        attributes.put("std_u", getStd_u());
        attributes.put("std_u_EMEP", getStd_u_EMEP());
        attributes.put("std_v", getStd_v());
        attributes.put("std_v_EMEP", getStd_v_EMEP());
        attributes.put("std_w", getStd_w());
        attributes.put("std_w_EMEP", getStd_w_EMEP());
        attributes.put("std_T_s", getStd_T_s());
        attributes.put("std_T_s_EMEP", getStd_T_s_EMEP());
        attributes.put("std_c_LI72", getStd_c_LI72());
        attributes.put("std_c_LI72_EMEP", getStd_c_LI72_EMEP());
        attributes.put("std_H2O_LI72", getStd_H2O_LI72());
        attributes.put("std_H2O_LI72_EMEP", getStd_H2O_LI72_EMEP());
        attributes.put("std_CH4_LI77", getStd_CH4_LI77());
        attributes.put("std_CH4_LI77_EMEP", getStd_CH4_LI77_EMEP());
        attributes.put("c_lag_LI72", getC_lag_LI72());
        attributes.put("c_lag_LI72_EMEP", getC_lag_LI72_EMEP());
        attributes.put("H2O_lag_LI72", getH2O_lag_LI72());
        attributes.put("H2O_lag_LI72_EMEP", getH2O_lag_LI72_EMEP());
        attributes.put("CH4_lag_LI77", getCH4_lag_LI77());
        attributes.put("CH4_lag_LI77_EMEP", getCH4_lag_LI77_EMEP());
        attributes.put("Qc_H", getQc_H());
        attributes.put("Qc_H_EMEP", getQc_H_EMEP());
        attributes.put("Qc_CO2_LI70", getQc_CO2_LI70());
        attributes.put("Qc_CO2_LI70_EMEP", getQc_CO2_LI70_EMEP());
        attributes.put("Qc_CH4_LI77", getQc_CH4_LI77());
        attributes.put("Qc_CH4_LI77_EMEP", getQc_CH4_LI77_EMEP());
        attributes.put("Qc_LE_LI72", getQc_LE_LI72());
        attributes.put("Qc_LE_LI72_EMEP", getQc_LE_LI72_EMEP());
        attributes.put("Qc_tau", getQc_tau());
        attributes.put("Qc_tau_EMEP", getQc_tau_EMEP());

        return attributes;
    }

    @Override
    public void setModelAttributes(Map<String, Object> attributes) {
        Date samptime = (Date) attributes.get("samptime");

        if (samptime != null) {
            setSamptime(samptime);
        }

        Float U = (Float) attributes.get("U");

        if (U != null) {
            setU(U);
        }

        Integer U_EMEP = (Integer) attributes.get("U_EMEP");

        if (U_EMEP != null) {
            setU_EMEP(U_EMEP);
        }

        Float wind_dir = (Float) attributes.get("wind_dir");

        if (wind_dir != null) {
            setWind_dir(wind_dir);
        }

        Integer wind_dir_EMEP = (Integer) attributes.get("wind_dir_EMEP");

        if (wind_dir_EMEP != null) {
            setWind_dir_EMEP(wind_dir_EMEP);
        }

        Float eta = (Float) attributes.get("eta");

        if (eta != null) {
            setEta(eta);
        }

        Integer eta_EMEP = (Integer) attributes.get("eta_EMEP");

        if (eta_EMEP != null) {
            setEta_EMEP(eta_EMEP);
        }

        Float theta = (Float) attributes.get("theta");

        if (theta != null) {
            setTheta(theta);
        }

        Integer theta_EMEP = (Integer) attributes.get("theta_EMEP");

        if (theta_EMEP != null) {
            setTheta_EMEP(theta_EMEP);
        }

        Float beta = (Float) attributes.get("beta");

        if (beta != null) {
            setBeta(beta);
        }

        Integer beta_EMEP = (Integer) attributes.get("beta_EMEP");

        if (beta_EMEP != null) {
            setBeta_EMEP(beta_EMEP);
        }

        Float H = (Float) attributes.get("H");

        if (H != null) {
            setH(H);
        }

        Integer H_EMEP = (Integer) attributes.get("H_EMEP");

        if (H_EMEP != null) {
            setH_EMEP(H_EMEP);
        }

        Float tau = (Float) attributes.get("tau");

        if (tau != null) {
            setTau(tau);
        }

        Integer tau_EMEP = (Integer) attributes.get("tau_EMEP");

        if (tau_EMEP != null) {
            setTau_EMEP(tau_EMEP);
        }

        Float u_star = (Float) attributes.get("u_star");

        if (u_star != null) {
            setU_star(u_star);
        }

        Integer u_star_EMEP = (Integer) attributes.get("u_star_EMEP");

        if (u_star_EMEP != null) {
            setU_star_EMEP(u_star_EMEP);
        }

        Float MO_length = (Float) attributes.get("MO_length");

        if (MO_length != null) {
            setMO_length(MO_length);
        }

        Integer MO_length_EMEP = (Integer) attributes.get("MO_length_EMEP");

        if (MO_length_EMEP != null) {
            setMO_length_EMEP(MO_length_EMEP);
        }

        Float err_packet = (Float) attributes.get("err_packet");

        if (err_packet != null) {
            setErr_packet(err_packet);
        }

        Integer err_packet_EMEP = (Integer) attributes.get("err_packet_EMEP");

        if (err_packet_EMEP != null) {
            setErr_packet_EMEP(err_packet_EMEP);
        }

        Float F_c_LI72 = (Float) attributes.get("F_c_LI72");

        if (F_c_LI72 != null) {
            setF_c_LI72(F_c_LI72);
        }

        Integer F_c_LI72_EMEP = (Integer) attributes.get("F_c_LI72_EMEP");

        if (F_c_LI72_EMEP != null) {
            setF_c_LI72_EMEP(F_c_LI72_EMEP);
        }

        Float F_H2O_LI72 = (Float) attributes.get("F_H2O_LI72");

        if (F_H2O_LI72 != null) {
            setF_H2O_LI72(F_H2O_LI72);
        }

        Integer F_H2O_LI72_EMEP = (Integer) attributes.get("F_H2O_LI72_EMEP");

        if (F_H2O_LI72_EMEP != null) {
            setF_H2O_LI72_EMEP(F_H2O_LI72_EMEP);
        }

        Float F_CH4_LI77 = (Float) attributes.get("F_CH4_LI77");

        if (F_CH4_LI77 != null) {
            setF_CH4_LI77(F_CH4_LI77);
        }

        Integer F_CH4_LI77_EMEP = (Integer) attributes.get("F_CH4_LI77_EMEP");

        if (F_CH4_LI77_EMEP != null) {
            setF_CH4_LI77_EMEP(F_CH4_LI77_EMEP);
        }

        Float LE_LI72 = (Float) attributes.get("LE_LI72");

        if (LE_LI72 != null) {
            setLE_LI72(LE_LI72);
        }

        Integer LE_LI72_EMEP = (Integer) attributes.get("LE_LI72_EMEP");

        if (LE_LI72_EMEP != null) {
            setLE_LI72_EMEP(LE_LI72_EMEP);
        }

        Float av_u = (Float) attributes.get("av_u");

        if (av_u != null) {
            setAv_u(av_u);
        }

        Integer av_u_EMEP = (Integer) attributes.get("av_u_EMEP");

        if (av_u_EMEP != null) {
            setAv_u_EMEP(av_u_EMEP);
        }

        Float av_v = (Float) attributes.get("av_v");

        if (av_v != null) {
            setAv_v(av_v);
        }

        Integer av_v_EMEP = (Integer) attributes.get("av_v_EMEP");

        if (av_v_EMEP != null) {
            setAv_v_EMEP(av_v_EMEP);
        }

        Float av_w = (Float) attributes.get("av_w");

        if (av_w != null) {
            setAv_w(av_w);
        }

        Integer av_w_EMEP = (Integer) attributes.get("av_w_EMEP");

        if (av_w_EMEP != null) {
            setAv_w_EMEP(av_w_EMEP);
        }

        Float T_s = (Float) attributes.get("T_s");

        if (T_s != null) {
            setT_s(T_s);
        }

        Integer T_s_EMEP = (Integer) attributes.get("T_s_EMEP");

        if (T_s_EMEP != null) {
            setT_s_EMEP(T_s_EMEP);
        }

        Float av_c = (Float) attributes.get("av_c");

        if (av_c != null) {
            setAv_c(av_c);
        }

        Integer av_c_EMEP = (Integer) attributes.get("av_c_EMEP");

        if (av_c_EMEP != null) {
            setAv_c_EMEP(av_c_EMEP);
        }

        Float av_H2O_LI72 = (Float) attributes.get("av_H2O_LI72");

        if (av_H2O_LI72 != null) {
            setAv_H2O_LI72(av_H2O_LI72);
        }

        Integer av_H2O_LI72_EMEP = (Integer) attributes.get("av_H2O_LI72_EMEP");

        if (av_H2O_LI72_EMEP != null) {
            setAv_H2O_LI72_EMEP(av_H2O_LI72_EMEP);
        }

        Float av_CH4_LI77 = (Float) attributes.get("av_CH4_LI77");

        if (av_CH4_LI77 != null) {
            setAv_CH4_LI77(av_CH4_LI77);
        }

        Integer av_CH4_LI77_EMEP = (Integer) attributes.get("av_CH4_LI77_EMEP");

        if (av_CH4_LI77_EMEP != null) {
            setAv_CH4_LI77_EMEP(av_CH4_LI77_EMEP);
        }

        Float std_u = (Float) attributes.get("std_u");

        if (std_u != null) {
            setStd_u(std_u);
        }

        Integer std_u_EMEP = (Integer) attributes.get("std_u_EMEP");

        if (std_u_EMEP != null) {
            setStd_u_EMEP(std_u_EMEP);
        }

        Float std_v = (Float) attributes.get("std_v");

        if (std_v != null) {
            setStd_v(std_v);
        }

        Integer std_v_EMEP = (Integer) attributes.get("std_v_EMEP");

        if (std_v_EMEP != null) {
            setStd_v_EMEP(std_v_EMEP);
        }

        Float std_w = (Float) attributes.get("std_w");

        if (std_w != null) {
            setStd_w(std_w);
        }

        Integer std_w_EMEP = (Integer) attributes.get("std_w_EMEP");

        if (std_w_EMEP != null) {
            setStd_w_EMEP(std_w_EMEP);
        }

        Float std_T_s = (Float) attributes.get("std_T_s");

        if (std_T_s != null) {
            setStd_T_s(std_T_s);
        }

        Integer std_T_s_EMEP = (Integer) attributes.get("std_T_s_EMEP");

        if (std_T_s_EMEP != null) {
            setStd_T_s_EMEP(std_T_s_EMEP);
        }

        Float std_c_LI72 = (Float) attributes.get("std_c_LI72");

        if (std_c_LI72 != null) {
            setStd_c_LI72(std_c_LI72);
        }

        Integer std_c_LI72_EMEP = (Integer) attributes.get("std_c_LI72_EMEP");

        if (std_c_LI72_EMEP != null) {
            setStd_c_LI72_EMEP(std_c_LI72_EMEP);
        }

        Float std_H2O_LI72 = (Float) attributes.get("std_H2O_LI72");

        if (std_H2O_LI72 != null) {
            setStd_H2O_LI72(std_H2O_LI72);
        }

        Integer std_H2O_LI72_EMEP = (Integer) attributes.get(
                "std_H2O_LI72_EMEP");

        if (std_H2O_LI72_EMEP != null) {
            setStd_H2O_LI72_EMEP(std_H2O_LI72_EMEP);
        }

        Float std_CH4_LI77 = (Float) attributes.get("std_CH4_LI77");

        if (std_CH4_LI77 != null) {
            setStd_CH4_LI77(std_CH4_LI77);
        }

        Integer std_CH4_LI77_EMEP = (Integer) attributes.get(
                "std_CH4_LI77_EMEP");

        if (std_CH4_LI77_EMEP != null) {
            setStd_CH4_LI77_EMEP(std_CH4_LI77_EMEP);
        }

        Float c_lag_LI72 = (Float) attributes.get("c_lag_LI72");

        if (c_lag_LI72 != null) {
            setC_lag_LI72(c_lag_LI72);
        }

        Integer c_lag_LI72_EMEP = (Integer) attributes.get("c_lag_LI72_EMEP");

        if (c_lag_LI72_EMEP != null) {
            setC_lag_LI72_EMEP(c_lag_LI72_EMEP);
        }

        Float H2O_lag_LI72 = (Float) attributes.get("H2O_lag_LI72");

        if (H2O_lag_LI72 != null) {
            setH2O_lag_LI72(H2O_lag_LI72);
        }

        Integer H2O_lag_LI72_EMEP = (Integer) attributes.get(
                "H2O_lag_LI72_EMEP");

        if (H2O_lag_LI72_EMEP != null) {
            setH2O_lag_LI72_EMEP(H2O_lag_LI72_EMEP);
        }

        Float CH4_lag_LI77 = (Float) attributes.get("CH4_lag_LI77");

        if (CH4_lag_LI77 != null) {
            setCH4_lag_LI77(CH4_lag_LI77);
        }

        Integer CH4_lag_LI77_EMEP = (Integer) attributes.get(
                "CH4_lag_LI77_EMEP");

        if (CH4_lag_LI77_EMEP != null) {
            setCH4_lag_LI77_EMEP(CH4_lag_LI77_EMEP);
        }

        Integer Qc_H = (Integer) attributes.get("Qc_H");

        if (Qc_H != null) {
            setQc_H(Qc_H);
        }

        Integer Qc_H_EMEP = (Integer) attributes.get("Qc_H_EMEP");

        if (Qc_H_EMEP != null) {
            setQc_H_EMEP(Qc_H_EMEP);
        }

        Integer Qc_CO2_LI70 = (Integer) attributes.get("Qc_CO2_LI70");

        if (Qc_CO2_LI70 != null) {
            setQc_CO2_LI70(Qc_CO2_LI70);
        }

        Integer Qc_CO2_LI70_EMEP = (Integer) attributes.get("Qc_CO2_LI70_EMEP");

        if (Qc_CO2_LI70_EMEP != null) {
            setQc_CO2_LI70_EMEP(Qc_CO2_LI70_EMEP);
        }

        Integer Qc_CH4_LI77 = (Integer) attributes.get("Qc_CH4_LI77");

        if (Qc_CH4_LI77 != null) {
            setQc_CH4_LI77(Qc_CH4_LI77);
        }

        Integer Qc_CH4_LI77_EMEP = (Integer) attributes.get("Qc_CH4_LI77_EMEP");

        if (Qc_CH4_LI77_EMEP != null) {
            setQc_CH4_LI77_EMEP(Qc_CH4_LI77_EMEP);
        }

        Integer Qc_LE_LI72 = (Integer) attributes.get("Qc_LE_LI72");

        if (Qc_LE_LI72 != null) {
            setQc_LE_LI72(Qc_LE_LI72);
        }

        Integer Qc_LE_LI72_EMEP = (Integer) attributes.get("Qc_LE_LI72_EMEP");

        if (Qc_LE_LI72_EMEP != null) {
            setQc_LE_LI72_EMEP(Qc_LE_LI72_EMEP);
        }

        Integer Qc_tau = (Integer) attributes.get("Qc_tau");

        if (Qc_tau != null) {
            setQc_tau(Qc_tau);
        }

        Integer Qc_tau_EMEP = (Integer) attributes.get("Qc_tau_EMEP");

        if (Qc_tau_EMEP != null) {
            setQc_tau_EMEP(Qc_tau_EMEP);
        }
    }

    @Override
    public Date getSamptime() {
        return _samptime;
    }

    @Override
    public void setSamptime(Date samptime) {
        _samptime = samptime;

        if (_sii2eddyRemoteModel != null) {
            try {
                Class<?> clazz = _sii2eddyRemoteModel.getClass();

                Method method = clazz.getMethod("setSamptime", Date.class);

                method.invoke(_sii2eddyRemoteModel, samptime);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public float getU() {
        return _U;
    }

    @Override
    public void setU(float U) {
        _U = U;

        if (_sii2eddyRemoteModel != null) {
            try {
                Class<?> clazz = _sii2eddyRemoteModel.getClass();

                Method method = clazz.getMethod("setU", float.class);

                method.invoke(_sii2eddyRemoteModel, U);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public int getU_EMEP() {
        return _U_EMEP;
    }

    @Override
    public void setU_EMEP(int U_EMEP) {
        _U_EMEP = U_EMEP;

        if (_sii2eddyRemoteModel != null) {
            try {
                Class<?> clazz = _sii2eddyRemoteModel.getClass();

                Method method = clazz.getMethod("setU_EMEP", int.class);

                method.invoke(_sii2eddyRemoteModel, U_EMEP);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public float getWind_dir() {
        return _wind_dir;
    }

    @Override
    public void setWind_dir(float wind_dir) {
        _wind_dir = wind_dir;

        if (_sii2eddyRemoteModel != null) {
            try {
                Class<?> clazz = _sii2eddyRemoteModel.getClass();

                Method method = clazz.getMethod("setWind_dir", float.class);

                method.invoke(_sii2eddyRemoteModel, wind_dir);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public int getWind_dir_EMEP() {
        return _wind_dir_EMEP;
    }

    @Override
    public void setWind_dir_EMEP(int wind_dir_EMEP) {
        _wind_dir_EMEP = wind_dir_EMEP;

        if (_sii2eddyRemoteModel != null) {
            try {
                Class<?> clazz = _sii2eddyRemoteModel.getClass();

                Method method = clazz.getMethod("setWind_dir_EMEP", int.class);

                method.invoke(_sii2eddyRemoteModel, wind_dir_EMEP);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public float getEta() {
        return _eta;
    }

    @Override
    public void setEta(float eta) {
        _eta = eta;

        if (_sii2eddyRemoteModel != null) {
            try {
                Class<?> clazz = _sii2eddyRemoteModel.getClass();

                Method method = clazz.getMethod("setEta", float.class);

                method.invoke(_sii2eddyRemoteModel, eta);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public int getEta_EMEP() {
        return _eta_EMEP;
    }

    @Override
    public void setEta_EMEP(int eta_EMEP) {
        _eta_EMEP = eta_EMEP;

        if (_sii2eddyRemoteModel != null) {
            try {
                Class<?> clazz = _sii2eddyRemoteModel.getClass();

                Method method = clazz.getMethod("setEta_EMEP", int.class);

                method.invoke(_sii2eddyRemoteModel, eta_EMEP);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public float getTheta() {
        return _theta;
    }

    @Override
    public void setTheta(float theta) {
        _theta = theta;

        if (_sii2eddyRemoteModel != null) {
            try {
                Class<?> clazz = _sii2eddyRemoteModel.getClass();

                Method method = clazz.getMethod("setTheta", float.class);

                method.invoke(_sii2eddyRemoteModel, theta);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public int getTheta_EMEP() {
        return _theta_EMEP;
    }

    @Override
    public void setTheta_EMEP(int theta_EMEP) {
        _theta_EMEP = theta_EMEP;

        if (_sii2eddyRemoteModel != null) {
            try {
                Class<?> clazz = _sii2eddyRemoteModel.getClass();

                Method method = clazz.getMethod("setTheta_EMEP", int.class);

                method.invoke(_sii2eddyRemoteModel, theta_EMEP);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public float getBeta() {
        return _beta;
    }

    @Override
    public void setBeta(float beta) {
        _beta = beta;

        if (_sii2eddyRemoteModel != null) {
            try {
                Class<?> clazz = _sii2eddyRemoteModel.getClass();

                Method method = clazz.getMethod("setBeta", float.class);

                method.invoke(_sii2eddyRemoteModel, beta);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public int getBeta_EMEP() {
        return _beta_EMEP;
    }

    @Override
    public void setBeta_EMEP(int beta_EMEP) {
        _beta_EMEP = beta_EMEP;

        if (_sii2eddyRemoteModel != null) {
            try {
                Class<?> clazz = _sii2eddyRemoteModel.getClass();

                Method method = clazz.getMethod("setBeta_EMEP", int.class);

                method.invoke(_sii2eddyRemoteModel, beta_EMEP);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public float getH() {
        return _H;
    }

    @Override
    public void setH(float H) {
        _H = H;

        if (_sii2eddyRemoteModel != null) {
            try {
                Class<?> clazz = _sii2eddyRemoteModel.getClass();

                Method method = clazz.getMethod("setH", float.class);

                method.invoke(_sii2eddyRemoteModel, H);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public int getH_EMEP() {
        return _H_EMEP;
    }

    @Override
    public void setH_EMEP(int H_EMEP) {
        _H_EMEP = H_EMEP;

        if (_sii2eddyRemoteModel != null) {
            try {
                Class<?> clazz = _sii2eddyRemoteModel.getClass();

                Method method = clazz.getMethod("setH_EMEP", int.class);

                method.invoke(_sii2eddyRemoteModel, H_EMEP);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public float getTau() {
        return _tau;
    }

    @Override
    public void setTau(float tau) {
        _tau = tau;

        if (_sii2eddyRemoteModel != null) {
            try {
                Class<?> clazz = _sii2eddyRemoteModel.getClass();

                Method method = clazz.getMethod("setTau", float.class);

                method.invoke(_sii2eddyRemoteModel, tau);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public int getTau_EMEP() {
        return _tau_EMEP;
    }

    @Override
    public void setTau_EMEP(int tau_EMEP) {
        _tau_EMEP = tau_EMEP;

        if (_sii2eddyRemoteModel != null) {
            try {
                Class<?> clazz = _sii2eddyRemoteModel.getClass();

                Method method = clazz.getMethod("setTau_EMEP", int.class);

                method.invoke(_sii2eddyRemoteModel, tau_EMEP);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public float getU_star() {
        return _u_star;
    }

    @Override
    public void setU_star(float u_star) {
        _u_star = u_star;

        if (_sii2eddyRemoteModel != null) {
            try {
                Class<?> clazz = _sii2eddyRemoteModel.getClass();

                Method method = clazz.getMethod("setU_star", float.class);

                method.invoke(_sii2eddyRemoteModel, u_star);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public int getU_star_EMEP() {
        return _u_star_EMEP;
    }

    @Override
    public void setU_star_EMEP(int u_star_EMEP) {
        _u_star_EMEP = u_star_EMEP;

        if (_sii2eddyRemoteModel != null) {
            try {
                Class<?> clazz = _sii2eddyRemoteModel.getClass();

                Method method = clazz.getMethod("setU_star_EMEP", int.class);

                method.invoke(_sii2eddyRemoteModel, u_star_EMEP);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public float getMO_length() {
        return _MO_length;
    }

    @Override
    public void setMO_length(float MO_length) {
        _MO_length = MO_length;

        if (_sii2eddyRemoteModel != null) {
            try {
                Class<?> clazz = _sii2eddyRemoteModel.getClass();

                Method method = clazz.getMethod("setMO_length", float.class);

                method.invoke(_sii2eddyRemoteModel, MO_length);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public int getMO_length_EMEP() {
        return _MO_length_EMEP;
    }

    @Override
    public void setMO_length_EMEP(int MO_length_EMEP) {
        _MO_length_EMEP = MO_length_EMEP;

        if (_sii2eddyRemoteModel != null) {
            try {
                Class<?> clazz = _sii2eddyRemoteModel.getClass();

                Method method = clazz.getMethod("setMO_length_EMEP", int.class);

                method.invoke(_sii2eddyRemoteModel, MO_length_EMEP);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public float getErr_packet() {
        return _err_packet;
    }

    @Override
    public void setErr_packet(float err_packet) {
        _err_packet = err_packet;

        if (_sii2eddyRemoteModel != null) {
            try {
                Class<?> clazz = _sii2eddyRemoteModel.getClass();

                Method method = clazz.getMethod("setErr_packet", float.class);

                method.invoke(_sii2eddyRemoteModel, err_packet);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public int getErr_packet_EMEP() {
        return _err_packet_EMEP;
    }

    @Override
    public void setErr_packet_EMEP(int err_packet_EMEP) {
        _err_packet_EMEP = err_packet_EMEP;

        if (_sii2eddyRemoteModel != null) {
            try {
                Class<?> clazz = _sii2eddyRemoteModel.getClass();

                Method method = clazz.getMethod("setErr_packet_EMEP", int.class);

                method.invoke(_sii2eddyRemoteModel, err_packet_EMEP);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public float getF_c_LI72() {
        return _F_c_LI72;
    }

    @Override
    public void setF_c_LI72(float F_c_LI72) {
        _F_c_LI72 = F_c_LI72;

        if (_sii2eddyRemoteModel != null) {
            try {
                Class<?> clazz = _sii2eddyRemoteModel.getClass();

                Method method = clazz.getMethod("setF_c_LI72", float.class);

                method.invoke(_sii2eddyRemoteModel, F_c_LI72);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public int getF_c_LI72_EMEP() {
        return _F_c_LI72_EMEP;
    }

    @Override
    public void setF_c_LI72_EMEP(int F_c_LI72_EMEP) {
        _F_c_LI72_EMEP = F_c_LI72_EMEP;

        if (_sii2eddyRemoteModel != null) {
            try {
                Class<?> clazz = _sii2eddyRemoteModel.getClass();

                Method method = clazz.getMethod("setF_c_LI72_EMEP", int.class);

                method.invoke(_sii2eddyRemoteModel, F_c_LI72_EMEP);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public float getF_H2O_LI72() {
        return _F_H2O_LI72;
    }

    @Override
    public void setF_H2O_LI72(float F_H2O_LI72) {
        _F_H2O_LI72 = F_H2O_LI72;

        if (_sii2eddyRemoteModel != null) {
            try {
                Class<?> clazz = _sii2eddyRemoteModel.getClass();

                Method method = clazz.getMethod("setF_H2O_LI72", float.class);

                method.invoke(_sii2eddyRemoteModel, F_H2O_LI72);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public int getF_H2O_LI72_EMEP() {
        return _F_H2O_LI72_EMEP;
    }

    @Override
    public void setF_H2O_LI72_EMEP(int F_H2O_LI72_EMEP) {
        _F_H2O_LI72_EMEP = F_H2O_LI72_EMEP;

        if (_sii2eddyRemoteModel != null) {
            try {
                Class<?> clazz = _sii2eddyRemoteModel.getClass();

                Method method = clazz.getMethod("setF_H2O_LI72_EMEP", int.class);

                method.invoke(_sii2eddyRemoteModel, F_H2O_LI72_EMEP);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public float getF_CH4_LI77() {
        return _F_CH4_LI77;
    }

    @Override
    public void setF_CH4_LI77(float F_CH4_LI77) {
        _F_CH4_LI77 = F_CH4_LI77;

        if (_sii2eddyRemoteModel != null) {
            try {
                Class<?> clazz = _sii2eddyRemoteModel.getClass();

                Method method = clazz.getMethod("setF_CH4_LI77", float.class);

                method.invoke(_sii2eddyRemoteModel, F_CH4_LI77);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public int getF_CH4_LI77_EMEP() {
        return _F_CH4_LI77_EMEP;
    }

    @Override
    public void setF_CH4_LI77_EMEP(int F_CH4_LI77_EMEP) {
        _F_CH4_LI77_EMEP = F_CH4_LI77_EMEP;

        if (_sii2eddyRemoteModel != null) {
            try {
                Class<?> clazz = _sii2eddyRemoteModel.getClass();

                Method method = clazz.getMethod("setF_CH4_LI77_EMEP", int.class);

                method.invoke(_sii2eddyRemoteModel, F_CH4_LI77_EMEP);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public float getLE_LI72() {
        return _LE_LI72;
    }

    @Override
    public void setLE_LI72(float LE_LI72) {
        _LE_LI72 = LE_LI72;

        if (_sii2eddyRemoteModel != null) {
            try {
                Class<?> clazz = _sii2eddyRemoteModel.getClass();

                Method method = clazz.getMethod("setLE_LI72", float.class);

                method.invoke(_sii2eddyRemoteModel, LE_LI72);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public int getLE_LI72_EMEP() {
        return _LE_LI72_EMEP;
    }

    @Override
    public void setLE_LI72_EMEP(int LE_LI72_EMEP) {
        _LE_LI72_EMEP = LE_LI72_EMEP;

        if (_sii2eddyRemoteModel != null) {
            try {
                Class<?> clazz = _sii2eddyRemoteModel.getClass();

                Method method = clazz.getMethod("setLE_LI72_EMEP", int.class);

                method.invoke(_sii2eddyRemoteModel, LE_LI72_EMEP);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public float getAv_u() {
        return _av_u;
    }

    @Override
    public void setAv_u(float av_u) {
        _av_u = av_u;

        if (_sii2eddyRemoteModel != null) {
            try {
                Class<?> clazz = _sii2eddyRemoteModel.getClass();

                Method method = clazz.getMethod("setAv_u", float.class);

                method.invoke(_sii2eddyRemoteModel, av_u);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public int getAv_u_EMEP() {
        return _av_u_EMEP;
    }

    @Override
    public void setAv_u_EMEP(int av_u_EMEP) {
        _av_u_EMEP = av_u_EMEP;

        if (_sii2eddyRemoteModel != null) {
            try {
                Class<?> clazz = _sii2eddyRemoteModel.getClass();

                Method method = clazz.getMethod("setAv_u_EMEP", int.class);

                method.invoke(_sii2eddyRemoteModel, av_u_EMEP);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public float getAv_v() {
        return _av_v;
    }

    @Override
    public void setAv_v(float av_v) {
        _av_v = av_v;

        if (_sii2eddyRemoteModel != null) {
            try {
                Class<?> clazz = _sii2eddyRemoteModel.getClass();

                Method method = clazz.getMethod("setAv_v", float.class);

                method.invoke(_sii2eddyRemoteModel, av_v);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public int getAv_v_EMEP() {
        return _av_v_EMEP;
    }

    @Override
    public void setAv_v_EMEP(int av_v_EMEP) {
        _av_v_EMEP = av_v_EMEP;

        if (_sii2eddyRemoteModel != null) {
            try {
                Class<?> clazz = _sii2eddyRemoteModel.getClass();

                Method method = clazz.getMethod("setAv_v_EMEP", int.class);

                method.invoke(_sii2eddyRemoteModel, av_v_EMEP);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public float getAv_w() {
        return _av_w;
    }

    @Override
    public void setAv_w(float av_w) {
        _av_w = av_w;

        if (_sii2eddyRemoteModel != null) {
            try {
                Class<?> clazz = _sii2eddyRemoteModel.getClass();

                Method method = clazz.getMethod("setAv_w", float.class);

                method.invoke(_sii2eddyRemoteModel, av_w);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public int getAv_w_EMEP() {
        return _av_w_EMEP;
    }

    @Override
    public void setAv_w_EMEP(int av_w_EMEP) {
        _av_w_EMEP = av_w_EMEP;

        if (_sii2eddyRemoteModel != null) {
            try {
                Class<?> clazz = _sii2eddyRemoteModel.getClass();

                Method method = clazz.getMethod("setAv_w_EMEP", int.class);

                method.invoke(_sii2eddyRemoteModel, av_w_EMEP);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public float getT_s() {
        return _T_s;
    }

    @Override
    public void setT_s(float T_s) {
        _T_s = T_s;

        if (_sii2eddyRemoteModel != null) {
            try {
                Class<?> clazz = _sii2eddyRemoteModel.getClass();

                Method method = clazz.getMethod("setT_s", float.class);

                method.invoke(_sii2eddyRemoteModel, T_s);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public int getT_s_EMEP() {
        return _T_s_EMEP;
    }

    @Override
    public void setT_s_EMEP(int T_s_EMEP) {
        _T_s_EMEP = T_s_EMEP;

        if (_sii2eddyRemoteModel != null) {
            try {
                Class<?> clazz = _sii2eddyRemoteModel.getClass();

                Method method = clazz.getMethod("setT_s_EMEP", int.class);

                method.invoke(_sii2eddyRemoteModel, T_s_EMEP);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public float getAv_c() {
        return _av_c;
    }

    @Override
    public void setAv_c(float av_c) {
        _av_c = av_c;

        if (_sii2eddyRemoteModel != null) {
            try {
                Class<?> clazz = _sii2eddyRemoteModel.getClass();

                Method method = clazz.getMethod("setAv_c", float.class);

                method.invoke(_sii2eddyRemoteModel, av_c);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public int getAv_c_EMEP() {
        return _av_c_EMEP;
    }

    @Override
    public void setAv_c_EMEP(int av_c_EMEP) {
        _av_c_EMEP = av_c_EMEP;

        if (_sii2eddyRemoteModel != null) {
            try {
                Class<?> clazz = _sii2eddyRemoteModel.getClass();

                Method method = clazz.getMethod("setAv_c_EMEP", int.class);

                method.invoke(_sii2eddyRemoteModel, av_c_EMEP);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public float getAv_H2O_LI72() {
        return _av_H2O_LI72;
    }

    @Override
    public void setAv_H2O_LI72(float av_H2O_LI72) {
        _av_H2O_LI72 = av_H2O_LI72;

        if (_sii2eddyRemoteModel != null) {
            try {
                Class<?> clazz = _sii2eddyRemoteModel.getClass();

                Method method = clazz.getMethod("setAv_H2O_LI72", float.class);

                method.invoke(_sii2eddyRemoteModel, av_H2O_LI72);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public int getAv_H2O_LI72_EMEP() {
        return _av_H2O_LI72_EMEP;
    }

    @Override
    public void setAv_H2O_LI72_EMEP(int av_H2O_LI72_EMEP) {
        _av_H2O_LI72_EMEP = av_H2O_LI72_EMEP;

        if (_sii2eddyRemoteModel != null) {
            try {
                Class<?> clazz = _sii2eddyRemoteModel.getClass();

                Method method = clazz.getMethod("setAv_H2O_LI72_EMEP", int.class);

                method.invoke(_sii2eddyRemoteModel, av_H2O_LI72_EMEP);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public float getAv_CH4_LI77() {
        return _av_CH4_LI77;
    }

    @Override
    public void setAv_CH4_LI77(float av_CH4_LI77) {
        _av_CH4_LI77 = av_CH4_LI77;

        if (_sii2eddyRemoteModel != null) {
            try {
                Class<?> clazz = _sii2eddyRemoteModel.getClass();

                Method method = clazz.getMethod("setAv_CH4_LI77", float.class);

                method.invoke(_sii2eddyRemoteModel, av_CH4_LI77);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public int getAv_CH4_LI77_EMEP() {
        return _av_CH4_LI77_EMEP;
    }

    @Override
    public void setAv_CH4_LI77_EMEP(int av_CH4_LI77_EMEP) {
        _av_CH4_LI77_EMEP = av_CH4_LI77_EMEP;

        if (_sii2eddyRemoteModel != null) {
            try {
                Class<?> clazz = _sii2eddyRemoteModel.getClass();

                Method method = clazz.getMethod("setAv_CH4_LI77_EMEP", int.class);

                method.invoke(_sii2eddyRemoteModel, av_CH4_LI77_EMEP);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public float getStd_u() {
        return _std_u;
    }

    @Override
    public void setStd_u(float std_u) {
        _std_u = std_u;

        if (_sii2eddyRemoteModel != null) {
            try {
                Class<?> clazz = _sii2eddyRemoteModel.getClass();

                Method method = clazz.getMethod("setStd_u", float.class);

                method.invoke(_sii2eddyRemoteModel, std_u);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public int getStd_u_EMEP() {
        return _std_u_EMEP;
    }

    @Override
    public void setStd_u_EMEP(int std_u_EMEP) {
        _std_u_EMEP = std_u_EMEP;

        if (_sii2eddyRemoteModel != null) {
            try {
                Class<?> clazz = _sii2eddyRemoteModel.getClass();

                Method method = clazz.getMethod("setStd_u_EMEP", int.class);

                method.invoke(_sii2eddyRemoteModel, std_u_EMEP);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public float getStd_v() {
        return _std_v;
    }

    @Override
    public void setStd_v(float std_v) {
        _std_v = std_v;

        if (_sii2eddyRemoteModel != null) {
            try {
                Class<?> clazz = _sii2eddyRemoteModel.getClass();

                Method method = clazz.getMethod("setStd_v", float.class);

                method.invoke(_sii2eddyRemoteModel, std_v);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public int getStd_v_EMEP() {
        return _std_v_EMEP;
    }

    @Override
    public void setStd_v_EMEP(int std_v_EMEP) {
        _std_v_EMEP = std_v_EMEP;

        if (_sii2eddyRemoteModel != null) {
            try {
                Class<?> clazz = _sii2eddyRemoteModel.getClass();

                Method method = clazz.getMethod("setStd_v_EMEP", int.class);

                method.invoke(_sii2eddyRemoteModel, std_v_EMEP);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public float getStd_w() {
        return _std_w;
    }

    @Override
    public void setStd_w(float std_w) {
        _std_w = std_w;

        if (_sii2eddyRemoteModel != null) {
            try {
                Class<?> clazz = _sii2eddyRemoteModel.getClass();

                Method method = clazz.getMethod("setStd_w", float.class);

                method.invoke(_sii2eddyRemoteModel, std_w);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public int getStd_w_EMEP() {
        return _std_w_EMEP;
    }

    @Override
    public void setStd_w_EMEP(int std_w_EMEP) {
        _std_w_EMEP = std_w_EMEP;

        if (_sii2eddyRemoteModel != null) {
            try {
                Class<?> clazz = _sii2eddyRemoteModel.getClass();

                Method method = clazz.getMethod("setStd_w_EMEP", int.class);

                method.invoke(_sii2eddyRemoteModel, std_w_EMEP);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public float getStd_T_s() {
        return _std_T_s;
    }

    @Override
    public void setStd_T_s(float std_T_s) {
        _std_T_s = std_T_s;

        if (_sii2eddyRemoteModel != null) {
            try {
                Class<?> clazz = _sii2eddyRemoteModel.getClass();

                Method method = clazz.getMethod("setStd_T_s", float.class);

                method.invoke(_sii2eddyRemoteModel, std_T_s);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public int getStd_T_s_EMEP() {
        return _std_T_s_EMEP;
    }

    @Override
    public void setStd_T_s_EMEP(int std_T_s_EMEP) {
        _std_T_s_EMEP = std_T_s_EMEP;

        if (_sii2eddyRemoteModel != null) {
            try {
                Class<?> clazz = _sii2eddyRemoteModel.getClass();

                Method method = clazz.getMethod("setStd_T_s_EMEP", int.class);

                method.invoke(_sii2eddyRemoteModel, std_T_s_EMEP);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public float getStd_c_LI72() {
        return _std_c_LI72;
    }

    @Override
    public void setStd_c_LI72(float std_c_LI72) {
        _std_c_LI72 = std_c_LI72;

        if (_sii2eddyRemoteModel != null) {
            try {
                Class<?> clazz = _sii2eddyRemoteModel.getClass();

                Method method = clazz.getMethod("setStd_c_LI72", float.class);

                method.invoke(_sii2eddyRemoteModel, std_c_LI72);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public int getStd_c_LI72_EMEP() {
        return _std_c_LI72_EMEP;
    }

    @Override
    public void setStd_c_LI72_EMEP(int std_c_LI72_EMEP) {
        _std_c_LI72_EMEP = std_c_LI72_EMEP;

        if (_sii2eddyRemoteModel != null) {
            try {
                Class<?> clazz = _sii2eddyRemoteModel.getClass();

                Method method = clazz.getMethod("setStd_c_LI72_EMEP", int.class);

                method.invoke(_sii2eddyRemoteModel, std_c_LI72_EMEP);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public float getStd_H2O_LI72() {
        return _std_H2O_LI72;
    }

    @Override
    public void setStd_H2O_LI72(float std_H2O_LI72) {
        _std_H2O_LI72 = std_H2O_LI72;

        if (_sii2eddyRemoteModel != null) {
            try {
                Class<?> clazz = _sii2eddyRemoteModel.getClass();

                Method method = clazz.getMethod("setStd_H2O_LI72", float.class);

                method.invoke(_sii2eddyRemoteModel, std_H2O_LI72);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public int getStd_H2O_LI72_EMEP() {
        return _std_H2O_LI72_EMEP;
    }

    @Override
    public void setStd_H2O_LI72_EMEP(int std_H2O_LI72_EMEP) {
        _std_H2O_LI72_EMEP = std_H2O_LI72_EMEP;

        if (_sii2eddyRemoteModel != null) {
            try {
                Class<?> clazz = _sii2eddyRemoteModel.getClass();

                Method method = clazz.getMethod("setStd_H2O_LI72_EMEP",
                        int.class);

                method.invoke(_sii2eddyRemoteModel, std_H2O_LI72_EMEP);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public float getStd_CH4_LI77() {
        return _std_CH4_LI77;
    }

    @Override
    public void setStd_CH4_LI77(float std_CH4_LI77) {
        _std_CH4_LI77 = std_CH4_LI77;

        if (_sii2eddyRemoteModel != null) {
            try {
                Class<?> clazz = _sii2eddyRemoteModel.getClass();

                Method method = clazz.getMethod("setStd_CH4_LI77", float.class);

                method.invoke(_sii2eddyRemoteModel, std_CH4_LI77);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public int getStd_CH4_LI77_EMEP() {
        return _std_CH4_LI77_EMEP;
    }

    @Override
    public void setStd_CH4_LI77_EMEP(int std_CH4_LI77_EMEP) {
        _std_CH4_LI77_EMEP = std_CH4_LI77_EMEP;

        if (_sii2eddyRemoteModel != null) {
            try {
                Class<?> clazz = _sii2eddyRemoteModel.getClass();

                Method method = clazz.getMethod("setStd_CH4_LI77_EMEP",
                        int.class);

                method.invoke(_sii2eddyRemoteModel, std_CH4_LI77_EMEP);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public float getC_lag_LI72() {
        return _c_lag_LI72;
    }

    @Override
    public void setC_lag_LI72(float c_lag_LI72) {
        _c_lag_LI72 = c_lag_LI72;

        if (_sii2eddyRemoteModel != null) {
            try {
                Class<?> clazz = _sii2eddyRemoteModel.getClass();

                Method method = clazz.getMethod("setC_lag_LI72", float.class);

                method.invoke(_sii2eddyRemoteModel, c_lag_LI72);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public int getC_lag_LI72_EMEP() {
        return _c_lag_LI72_EMEP;
    }

    @Override
    public void setC_lag_LI72_EMEP(int c_lag_LI72_EMEP) {
        _c_lag_LI72_EMEP = c_lag_LI72_EMEP;

        if (_sii2eddyRemoteModel != null) {
            try {
                Class<?> clazz = _sii2eddyRemoteModel.getClass();

                Method method = clazz.getMethod("setC_lag_LI72_EMEP", int.class);

                method.invoke(_sii2eddyRemoteModel, c_lag_LI72_EMEP);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public float getH2O_lag_LI72() {
        return _H2O_lag_LI72;
    }

    @Override
    public void setH2O_lag_LI72(float H2O_lag_LI72) {
        _H2O_lag_LI72 = H2O_lag_LI72;

        if (_sii2eddyRemoteModel != null) {
            try {
                Class<?> clazz = _sii2eddyRemoteModel.getClass();

                Method method = clazz.getMethod("setH2O_lag_LI72", float.class);

                method.invoke(_sii2eddyRemoteModel, H2O_lag_LI72);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public int getH2O_lag_LI72_EMEP() {
        return _H2O_lag_LI72_EMEP;
    }

    @Override
    public void setH2O_lag_LI72_EMEP(int H2O_lag_LI72_EMEP) {
        _H2O_lag_LI72_EMEP = H2O_lag_LI72_EMEP;

        if (_sii2eddyRemoteModel != null) {
            try {
                Class<?> clazz = _sii2eddyRemoteModel.getClass();

                Method method = clazz.getMethod("setH2O_lag_LI72_EMEP",
                        int.class);

                method.invoke(_sii2eddyRemoteModel, H2O_lag_LI72_EMEP);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public float getCH4_lag_LI77() {
        return _CH4_lag_LI77;
    }

    @Override
    public void setCH4_lag_LI77(float CH4_lag_LI77) {
        _CH4_lag_LI77 = CH4_lag_LI77;

        if (_sii2eddyRemoteModel != null) {
            try {
                Class<?> clazz = _sii2eddyRemoteModel.getClass();

                Method method = clazz.getMethod("setCH4_lag_LI77", float.class);

                method.invoke(_sii2eddyRemoteModel, CH4_lag_LI77);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public int getCH4_lag_LI77_EMEP() {
        return _CH4_lag_LI77_EMEP;
    }

    @Override
    public void setCH4_lag_LI77_EMEP(int CH4_lag_LI77_EMEP) {
        _CH4_lag_LI77_EMEP = CH4_lag_LI77_EMEP;

        if (_sii2eddyRemoteModel != null) {
            try {
                Class<?> clazz = _sii2eddyRemoteModel.getClass();

                Method method = clazz.getMethod("setCH4_lag_LI77_EMEP",
                        int.class);

                method.invoke(_sii2eddyRemoteModel, CH4_lag_LI77_EMEP);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public int getQc_H() {
        return _Qc_H;
    }

    @Override
    public void setQc_H(int Qc_H) {
        _Qc_H = Qc_H;

        if (_sii2eddyRemoteModel != null) {
            try {
                Class<?> clazz = _sii2eddyRemoteModel.getClass();

                Method method = clazz.getMethod("setQc_H", int.class);

                method.invoke(_sii2eddyRemoteModel, Qc_H);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public int getQc_H_EMEP() {
        return _Qc_H_EMEP;
    }

    @Override
    public void setQc_H_EMEP(int Qc_H_EMEP) {
        _Qc_H_EMEP = Qc_H_EMEP;

        if (_sii2eddyRemoteModel != null) {
            try {
                Class<?> clazz = _sii2eddyRemoteModel.getClass();

                Method method = clazz.getMethod("setQc_H_EMEP", int.class);

                method.invoke(_sii2eddyRemoteModel, Qc_H_EMEP);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public int getQc_CO2_LI70() {
        return _Qc_CO2_LI70;
    }

    @Override
    public void setQc_CO2_LI70(int Qc_CO2_LI70) {
        _Qc_CO2_LI70 = Qc_CO2_LI70;

        if (_sii2eddyRemoteModel != null) {
            try {
                Class<?> clazz = _sii2eddyRemoteModel.getClass();

                Method method = clazz.getMethod("setQc_CO2_LI70", int.class);

                method.invoke(_sii2eddyRemoteModel, Qc_CO2_LI70);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public int getQc_CO2_LI70_EMEP() {
        return _Qc_CO2_LI70_EMEP;
    }

    @Override
    public void setQc_CO2_LI70_EMEP(int Qc_CO2_LI70_EMEP) {
        _Qc_CO2_LI70_EMEP = Qc_CO2_LI70_EMEP;

        if (_sii2eddyRemoteModel != null) {
            try {
                Class<?> clazz = _sii2eddyRemoteModel.getClass();

                Method method = clazz.getMethod("setQc_CO2_LI70_EMEP", int.class);

                method.invoke(_sii2eddyRemoteModel, Qc_CO2_LI70_EMEP);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public int getQc_CH4_LI77() {
        return _Qc_CH4_LI77;
    }

    @Override
    public void setQc_CH4_LI77(int Qc_CH4_LI77) {
        _Qc_CH4_LI77 = Qc_CH4_LI77;

        if (_sii2eddyRemoteModel != null) {
            try {
                Class<?> clazz = _sii2eddyRemoteModel.getClass();

                Method method = clazz.getMethod("setQc_CH4_LI77", int.class);

                method.invoke(_sii2eddyRemoteModel, Qc_CH4_LI77);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public int getQc_CH4_LI77_EMEP() {
        return _Qc_CH4_LI77_EMEP;
    }

    @Override
    public void setQc_CH4_LI77_EMEP(int Qc_CH4_LI77_EMEP) {
        _Qc_CH4_LI77_EMEP = Qc_CH4_LI77_EMEP;

        if (_sii2eddyRemoteModel != null) {
            try {
                Class<?> clazz = _sii2eddyRemoteModel.getClass();

                Method method = clazz.getMethod("setQc_CH4_LI77_EMEP", int.class);

                method.invoke(_sii2eddyRemoteModel, Qc_CH4_LI77_EMEP);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public int getQc_LE_LI72() {
        return _Qc_LE_LI72;
    }

    @Override
    public void setQc_LE_LI72(int Qc_LE_LI72) {
        _Qc_LE_LI72 = Qc_LE_LI72;

        if (_sii2eddyRemoteModel != null) {
            try {
                Class<?> clazz = _sii2eddyRemoteModel.getClass();

                Method method = clazz.getMethod("setQc_LE_LI72", int.class);

                method.invoke(_sii2eddyRemoteModel, Qc_LE_LI72);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public int getQc_LE_LI72_EMEP() {
        return _Qc_LE_LI72_EMEP;
    }

    @Override
    public void setQc_LE_LI72_EMEP(int Qc_LE_LI72_EMEP) {
        _Qc_LE_LI72_EMEP = Qc_LE_LI72_EMEP;

        if (_sii2eddyRemoteModel != null) {
            try {
                Class<?> clazz = _sii2eddyRemoteModel.getClass();

                Method method = clazz.getMethod("setQc_LE_LI72_EMEP", int.class);

                method.invoke(_sii2eddyRemoteModel, Qc_LE_LI72_EMEP);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public int getQc_tau() {
        return _Qc_tau;
    }

    @Override
    public void setQc_tau(int Qc_tau) {
        _Qc_tau = Qc_tau;

        if (_sii2eddyRemoteModel != null) {
            try {
                Class<?> clazz = _sii2eddyRemoteModel.getClass();

                Method method = clazz.getMethod("setQc_tau", int.class);

                method.invoke(_sii2eddyRemoteModel, Qc_tau);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public int getQc_tau_EMEP() {
        return _Qc_tau_EMEP;
    }

    @Override
    public void setQc_tau_EMEP(int Qc_tau_EMEP) {
        _Qc_tau_EMEP = Qc_tau_EMEP;

        if (_sii2eddyRemoteModel != null) {
            try {
                Class<?> clazz = _sii2eddyRemoteModel.getClass();

                Method method = clazz.getMethod("setQc_tau_EMEP", int.class);

                method.invoke(_sii2eddyRemoteModel, Qc_tau_EMEP);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    public BaseModel<?> getSii2eddyRemoteModel() {
        return _sii2eddyRemoteModel;
    }

    public void setSii2eddyRemoteModel(BaseModel<?> sii2eddyRemoteModel) {
        _sii2eddyRemoteModel = sii2eddyRemoteModel;
    }

    public Object invokeOnRemoteModel(String methodName,
        Class<?>[] parameterTypes, Object[] parameterValues)
        throws Exception {
        Object[] remoteParameterValues = new Object[parameterValues.length];

        for (int i = 0; i < parameterValues.length; i++) {
            if (parameterValues[i] != null) {
                remoteParameterValues[i] = ClpSerializer.translateInput(parameterValues[i]);
            }
        }

        Class<?> remoteModelClass = _sii2eddyRemoteModel.getClass();

        ClassLoader remoteModelClassLoader = remoteModelClass.getClassLoader();

        Class<?>[] remoteParameterTypes = new Class[parameterTypes.length];

        for (int i = 0; i < parameterTypes.length; i++) {
            if (parameterTypes[i].isPrimitive()) {
                remoteParameterTypes[i] = parameterTypes[i];
            } else {
                String parameterTypeName = parameterTypes[i].getName();

                remoteParameterTypes[i] = remoteModelClassLoader.loadClass(parameterTypeName);
            }
        }

        Method method = remoteModelClass.getMethod(methodName,
                remoteParameterTypes);

        Object returnValue = method.invoke(_sii2eddyRemoteModel,
                remoteParameterValues);

        if (returnValue != null) {
            returnValue = ClpSerializer.translateOutput(returnValue);
        }

        return returnValue;
    }

    @Override
    public void persist() throws SystemException {
        if (this.isNew()) {
            Sii2eddyLocalServiceUtil.addSii2eddy(this);
        } else {
            Sii2eddyLocalServiceUtil.updateSii2eddy(this);
        }
    }

    @Override
    public Sii2eddy toEscapedModel() {
        return (Sii2eddy) ProxyUtil.newProxyInstance(Sii2eddy.class.getClassLoader(),
            new Class[] { Sii2eddy.class }, new AutoEscapeBeanHandler(this));
    }

    @Override
    public Object clone() {
        Sii2eddyClp clone = new Sii2eddyClp();

        clone.setSamptime(getSamptime());
        clone.setU(getU());
        clone.setU_EMEP(getU_EMEP());
        clone.setWind_dir(getWind_dir());
        clone.setWind_dir_EMEP(getWind_dir_EMEP());
        clone.setEta(getEta());
        clone.setEta_EMEP(getEta_EMEP());
        clone.setTheta(getTheta());
        clone.setTheta_EMEP(getTheta_EMEP());
        clone.setBeta(getBeta());
        clone.setBeta_EMEP(getBeta_EMEP());
        clone.setH(getH());
        clone.setH_EMEP(getH_EMEP());
        clone.setTau(getTau());
        clone.setTau_EMEP(getTau_EMEP());
        clone.setU_star(getU_star());
        clone.setU_star_EMEP(getU_star_EMEP());
        clone.setMO_length(getMO_length());
        clone.setMO_length_EMEP(getMO_length_EMEP());
        clone.setErr_packet(getErr_packet());
        clone.setErr_packet_EMEP(getErr_packet_EMEP());
        clone.setF_c_LI72(getF_c_LI72());
        clone.setF_c_LI72_EMEP(getF_c_LI72_EMEP());
        clone.setF_H2O_LI72(getF_H2O_LI72());
        clone.setF_H2O_LI72_EMEP(getF_H2O_LI72_EMEP());
        clone.setF_CH4_LI77(getF_CH4_LI77());
        clone.setF_CH4_LI77_EMEP(getF_CH4_LI77_EMEP());
        clone.setLE_LI72(getLE_LI72());
        clone.setLE_LI72_EMEP(getLE_LI72_EMEP());
        clone.setAv_u(getAv_u());
        clone.setAv_u_EMEP(getAv_u_EMEP());
        clone.setAv_v(getAv_v());
        clone.setAv_v_EMEP(getAv_v_EMEP());
        clone.setAv_w(getAv_w());
        clone.setAv_w_EMEP(getAv_w_EMEP());
        clone.setT_s(getT_s());
        clone.setT_s_EMEP(getT_s_EMEP());
        clone.setAv_c(getAv_c());
        clone.setAv_c_EMEP(getAv_c_EMEP());
        clone.setAv_H2O_LI72(getAv_H2O_LI72());
        clone.setAv_H2O_LI72_EMEP(getAv_H2O_LI72_EMEP());
        clone.setAv_CH4_LI77(getAv_CH4_LI77());
        clone.setAv_CH4_LI77_EMEP(getAv_CH4_LI77_EMEP());
        clone.setStd_u(getStd_u());
        clone.setStd_u_EMEP(getStd_u_EMEP());
        clone.setStd_v(getStd_v());
        clone.setStd_v_EMEP(getStd_v_EMEP());
        clone.setStd_w(getStd_w());
        clone.setStd_w_EMEP(getStd_w_EMEP());
        clone.setStd_T_s(getStd_T_s());
        clone.setStd_T_s_EMEP(getStd_T_s_EMEP());
        clone.setStd_c_LI72(getStd_c_LI72());
        clone.setStd_c_LI72_EMEP(getStd_c_LI72_EMEP());
        clone.setStd_H2O_LI72(getStd_H2O_LI72());
        clone.setStd_H2O_LI72_EMEP(getStd_H2O_LI72_EMEP());
        clone.setStd_CH4_LI77(getStd_CH4_LI77());
        clone.setStd_CH4_LI77_EMEP(getStd_CH4_LI77_EMEP());
        clone.setC_lag_LI72(getC_lag_LI72());
        clone.setC_lag_LI72_EMEP(getC_lag_LI72_EMEP());
        clone.setH2O_lag_LI72(getH2O_lag_LI72());
        clone.setH2O_lag_LI72_EMEP(getH2O_lag_LI72_EMEP());
        clone.setCH4_lag_LI77(getCH4_lag_LI77());
        clone.setCH4_lag_LI77_EMEP(getCH4_lag_LI77_EMEP());
        clone.setQc_H(getQc_H());
        clone.setQc_H_EMEP(getQc_H_EMEP());
        clone.setQc_CO2_LI70(getQc_CO2_LI70());
        clone.setQc_CO2_LI70_EMEP(getQc_CO2_LI70_EMEP());
        clone.setQc_CH4_LI77(getQc_CH4_LI77());
        clone.setQc_CH4_LI77_EMEP(getQc_CH4_LI77_EMEP());
        clone.setQc_LE_LI72(getQc_LE_LI72());
        clone.setQc_LE_LI72_EMEP(getQc_LE_LI72_EMEP());
        clone.setQc_tau(getQc_tau());
        clone.setQc_tau_EMEP(getQc_tau_EMEP());

        return clone;
    }

    @Override
    public int compareTo(Sii2eddy sii2eddy) {
        java.util.Date primaryKey = sii2eddy.getPrimaryKey();

        return getPrimaryKey().compareTo(primaryKey);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (!(obj instanceof Sii2eddyClp)) {
            return false;
        }

        Sii2eddyClp sii2eddy = (Sii2eddyClp) obj;

        java.util.Date primaryKey = sii2eddy.getPrimaryKey();

        if (getPrimaryKey().equals(primaryKey)) {
            return true;
        } else {
            return false;
        }
    }

    public Class<?> getClpSerializerClass() {
        return _clpSerializerClass;
    }

    @Override
    public int hashCode() {
        return getPrimaryKey().hashCode();
    }

    @Override
    public String toString() {
        StringBundler sb = new StringBundler(147);

        sb.append("{samptime=");
        sb.append(getSamptime());
        sb.append(", U=");
        sb.append(getU());
        sb.append(", U_EMEP=");
        sb.append(getU_EMEP());
        sb.append(", wind_dir=");
        sb.append(getWind_dir());
        sb.append(", wind_dir_EMEP=");
        sb.append(getWind_dir_EMEP());
        sb.append(", eta=");
        sb.append(getEta());
        sb.append(", eta_EMEP=");
        sb.append(getEta_EMEP());
        sb.append(", theta=");
        sb.append(getTheta());
        sb.append(", theta_EMEP=");
        sb.append(getTheta_EMEP());
        sb.append(", beta=");
        sb.append(getBeta());
        sb.append(", beta_EMEP=");
        sb.append(getBeta_EMEP());
        sb.append(", H=");
        sb.append(getH());
        sb.append(", H_EMEP=");
        sb.append(getH_EMEP());
        sb.append(", tau=");
        sb.append(getTau());
        sb.append(", tau_EMEP=");
        sb.append(getTau_EMEP());
        sb.append(", u_star=");
        sb.append(getU_star());
        sb.append(", u_star_EMEP=");
        sb.append(getU_star_EMEP());
        sb.append(", MO_length=");
        sb.append(getMO_length());
        sb.append(", MO_length_EMEP=");
        sb.append(getMO_length_EMEP());
        sb.append(", err_packet=");
        sb.append(getErr_packet());
        sb.append(", err_packet_EMEP=");
        sb.append(getErr_packet_EMEP());
        sb.append(", F_c_LI72=");
        sb.append(getF_c_LI72());
        sb.append(", F_c_LI72_EMEP=");
        sb.append(getF_c_LI72_EMEP());
        sb.append(", F_H2O_LI72=");
        sb.append(getF_H2O_LI72());
        sb.append(", F_H2O_LI72_EMEP=");
        sb.append(getF_H2O_LI72_EMEP());
        sb.append(", F_CH4_LI77=");
        sb.append(getF_CH4_LI77());
        sb.append(", F_CH4_LI77_EMEP=");
        sb.append(getF_CH4_LI77_EMEP());
        sb.append(", LE_LI72=");
        sb.append(getLE_LI72());
        sb.append(", LE_LI72_EMEP=");
        sb.append(getLE_LI72_EMEP());
        sb.append(", av_u=");
        sb.append(getAv_u());
        sb.append(", av_u_EMEP=");
        sb.append(getAv_u_EMEP());
        sb.append(", av_v=");
        sb.append(getAv_v());
        sb.append(", av_v_EMEP=");
        sb.append(getAv_v_EMEP());
        sb.append(", av_w=");
        sb.append(getAv_w());
        sb.append(", av_w_EMEP=");
        sb.append(getAv_w_EMEP());
        sb.append(", T_s=");
        sb.append(getT_s());
        sb.append(", T_s_EMEP=");
        sb.append(getT_s_EMEP());
        sb.append(", av_c=");
        sb.append(getAv_c());
        sb.append(", av_c_EMEP=");
        sb.append(getAv_c_EMEP());
        sb.append(", av_H2O_LI72=");
        sb.append(getAv_H2O_LI72());
        sb.append(", av_H2O_LI72_EMEP=");
        sb.append(getAv_H2O_LI72_EMEP());
        sb.append(", av_CH4_LI77=");
        sb.append(getAv_CH4_LI77());
        sb.append(", av_CH4_LI77_EMEP=");
        sb.append(getAv_CH4_LI77_EMEP());
        sb.append(", std_u=");
        sb.append(getStd_u());
        sb.append(", std_u_EMEP=");
        sb.append(getStd_u_EMEP());
        sb.append(", std_v=");
        sb.append(getStd_v());
        sb.append(", std_v_EMEP=");
        sb.append(getStd_v_EMEP());
        sb.append(", std_w=");
        sb.append(getStd_w());
        sb.append(", std_w_EMEP=");
        sb.append(getStd_w_EMEP());
        sb.append(", std_T_s=");
        sb.append(getStd_T_s());
        sb.append(", std_T_s_EMEP=");
        sb.append(getStd_T_s_EMEP());
        sb.append(", std_c_LI72=");
        sb.append(getStd_c_LI72());
        sb.append(", std_c_LI72_EMEP=");
        sb.append(getStd_c_LI72_EMEP());
        sb.append(", std_H2O_LI72=");
        sb.append(getStd_H2O_LI72());
        sb.append(", std_H2O_LI72_EMEP=");
        sb.append(getStd_H2O_LI72_EMEP());
        sb.append(", std_CH4_LI77=");
        sb.append(getStd_CH4_LI77());
        sb.append(", std_CH4_LI77_EMEP=");
        sb.append(getStd_CH4_LI77_EMEP());
        sb.append(", c_lag_LI72=");
        sb.append(getC_lag_LI72());
        sb.append(", c_lag_LI72_EMEP=");
        sb.append(getC_lag_LI72_EMEP());
        sb.append(", H2O_lag_LI72=");
        sb.append(getH2O_lag_LI72());
        sb.append(", H2O_lag_LI72_EMEP=");
        sb.append(getH2O_lag_LI72_EMEP());
        sb.append(", CH4_lag_LI77=");
        sb.append(getCH4_lag_LI77());
        sb.append(", CH4_lag_LI77_EMEP=");
        sb.append(getCH4_lag_LI77_EMEP());
        sb.append(", Qc_H=");
        sb.append(getQc_H());
        sb.append(", Qc_H_EMEP=");
        sb.append(getQc_H_EMEP());
        sb.append(", Qc_CO2_LI70=");
        sb.append(getQc_CO2_LI70());
        sb.append(", Qc_CO2_LI70_EMEP=");
        sb.append(getQc_CO2_LI70_EMEP());
        sb.append(", Qc_CH4_LI77=");
        sb.append(getQc_CH4_LI77());
        sb.append(", Qc_CH4_LI77_EMEP=");
        sb.append(getQc_CH4_LI77_EMEP());
        sb.append(", Qc_LE_LI72=");
        sb.append(getQc_LE_LI72());
        sb.append(", Qc_LE_LI72_EMEP=");
        sb.append(getQc_LE_LI72_EMEP());
        sb.append(", Qc_tau=");
        sb.append(getQc_tau());
        sb.append(", Qc_tau_EMEP=");
        sb.append(getQc_tau_EMEP());
        sb.append("}");

        return sb.toString();
    }

    @Override
    public String toXmlString() {
        StringBundler sb = new StringBundler(223);

        sb.append("<model><model-name>");
        sb.append("fi.csc.smear.db.model.Sii2eddy");
        sb.append("</model-name>");

        sb.append(
            "<column><column-name>samptime</column-name><column-value><![CDATA[");
        sb.append(getSamptime());
        sb.append("]]></column-value></column>");
        sb.append("<column><column-name>U</column-name><column-value><![CDATA[");
        sb.append(getU());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>U_EMEP</column-name><column-value><![CDATA[");
        sb.append(getU_EMEP());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>wind_dir</column-name><column-value><![CDATA[");
        sb.append(getWind_dir());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>wind_dir_EMEP</column-name><column-value><![CDATA[");
        sb.append(getWind_dir_EMEP());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>eta</column-name><column-value><![CDATA[");
        sb.append(getEta());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>eta_EMEP</column-name><column-value><![CDATA[");
        sb.append(getEta_EMEP());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>theta</column-name><column-value><![CDATA[");
        sb.append(getTheta());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>theta_EMEP</column-name><column-value><![CDATA[");
        sb.append(getTheta_EMEP());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>beta</column-name><column-value><![CDATA[");
        sb.append(getBeta());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>beta_EMEP</column-name><column-value><![CDATA[");
        sb.append(getBeta_EMEP());
        sb.append("]]></column-value></column>");
        sb.append("<column><column-name>H</column-name><column-value><![CDATA[");
        sb.append(getH());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>H_EMEP</column-name><column-value><![CDATA[");
        sb.append(getH_EMEP());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>tau</column-name><column-value><![CDATA[");
        sb.append(getTau());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>tau_EMEP</column-name><column-value><![CDATA[");
        sb.append(getTau_EMEP());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>u_star</column-name><column-value><![CDATA[");
        sb.append(getU_star());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>u_star_EMEP</column-name><column-value><![CDATA[");
        sb.append(getU_star_EMEP());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>MO_length</column-name><column-value><![CDATA[");
        sb.append(getMO_length());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>MO_length_EMEP</column-name><column-value><![CDATA[");
        sb.append(getMO_length_EMEP());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>err_packet</column-name><column-value><![CDATA[");
        sb.append(getErr_packet());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>err_packet_EMEP</column-name><column-value><![CDATA[");
        sb.append(getErr_packet_EMEP());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>F_c_LI72</column-name><column-value><![CDATA[");
        sb.append(getF_c_LI72());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>F_c_LI72_EMEP</column-name><column-value><![CDATA[");
        sb.append(getF_c_LI72_EMEP());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>F_H2O_LI72</column-name><column-value><![CDATA[");
        sb.append(getF_H2O_LI72());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>F_H2O_LI72_EMEP</column-name><column-value><![CDATA[");
        sb.append(getF_H2O_LI72_EMEP());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>F_CH4_LI77</column-name><column-value><![CDATA[");
        sb.append(getF_CH4_LI77());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>F_CH4_LI77_EMEP</column-name><column-value><![CDATA[");
        sb.append(getF_CH4_LI77_EMEP());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>LE_LI72</column-name><column-value><![CDATA[");
        sb.append(getLE_LI72());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>LE_LI72_EMEP</column-name><column-value><![CDATA[");
        sb.append(getLE_LI72_EMEP());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>av_u</column-name><column-value><![CDATA[");
        sb.append(getAv_u());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>av_u_EMEP</column-name><column-value><![CDATA[");
        sb.append(getAv_u_EMEP());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>av_v</column-name><column-value><![CDATA[");
        sb.append(getAv_v());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>av_v_EMEP</column-name><column-value><![CDATA[");
        sb.append(getAv_v_EMEP());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>av_w</column-name><column-value><![CDATA[");
        sb.append(getAv_w());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>av_w_EMEP</column-name><column-value><![CDATA[");
        sb.append(getAv_w_EMEP());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>T_s</column-name><column-value><![CDATA[");
        sb.append(getT_s());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>T_s_EMEP</column-name><column-value><![CDATA[");
        sb.append(getT_s_EMEP());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>av_c</column-name><column-value><![CDATA[");
        sb.append(getAv_c());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>av_c_EMEP</column-name><column-value><![CDATA[");
        sb.append(getAv_c_EMEP());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>av_H2O_LI72</column-name><column-value><![CDATA[");
        sb.append(getAv_H2O_LI72());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>av_H2O_LI72_EMEP</column-name><column-value><![CDATA[");
        sb.append(getAv_H2O_LI72_EMEP());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>av_CH4_LI77</column-name><column-value><![CDATA[");
        sb.append(getAv_CH4_LI77());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>av_CH4_LI77_EMEP</column-name><column-value><![CDATA[");
        sb.append(getAv_CH4_LI77_EMEP());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>std_u</column-name><column-value><![CDATA[");
        sb.append(getStd_u());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>std_u_EMEP</column-name><column-value><![CDATA[");
        sb.append(getStd_u_EMEP());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>std_v</column-name><column-value><![CDATA[");
        sb.append(getStd_v());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>std_v_EMEP</column-name><column-value><![CDATA[");
        sb.append(getStd_v_EMEP());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>std_w</column-name><column-value><![CDATA[");
        sb.append(getStd_w());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>std_w_EMEP</column-name><column-value><![CDATA[");
        sb.append(getStd_w_EMEP());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>std_T_s</column-name><column-value><![CDATA[");
        sb.append(getStd_T_s());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>std_T_s_EMEP</column-name><column-value><![CDATA[");
        sb.append(getStd_T_s_EMEP());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>std_c_LI72</column-name><column-value><![CDATA[");
        sb.append(getStd_c_LI72());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>std_c_LI72_EMEP</column-name><column-value><![CDATA[");
        sb.append(getStd_c_LI72_EMEP());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>std_H2O_LI72</column-name><column-value><![CDATA[");
        sb.append(getStd_H2O_LI72());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>std_H2O_LI72_EMEP</column-name><column-value><![CDATA[");
        sb.append(getStd_H2O_LI72_EMEP());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>std_CH4_LI77</column-name><column-value><![CDATA[");
        sb.append(getStd_CH4_LI77());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>std_CH4_LI77_EMEP</column-name><column-value><![CDATA[");
        sb.append(getStd_CH4_LI77_EMEP());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>c_lag_LI72</column-name><column-value><![CDATA[");
        sb.append(getC_lag_LI72());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>c_lag_LI72_EMEP</column-name><column-value><![CDATA[");
        sb.append(getC_lag_LI72_EMEP());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>H2O_lag_LI72</column-name><column-value><![CDATA[");
        sb.append(getH2O_lag_LI72());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>H2O_lag_LI72_EMEP</column-name><column-value><![CDATA[");
        sb.append(getH2O_lag_LI72_EMEP());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>CH4_lag_LI77</column-name><column-value><![CDATA[");
        sb.append(getCH4_lag_LI77());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>CH4_lag_LI77_EMEP</column-name><column-value><![CDATA[");
        sb.append(getCH4_lag_LI77_EMEP());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>Qc_H</column-name><column-value><![CDATA[");
        sb.append(getQc_H());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>Qc_H_EMEP</column-name><column-value><![CDATA[");
        sb.append(getQc_H_EMEP());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>Qc_CO2_LI70</column-name><column-value><![CDATA[");
        sb.append(getQc_CO2_LI70());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>Qc_CO2_LI70_EMEP</column-name><column-value><![CDATA[");
        sb.append(getQc_CO2_LI70_EMEP());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>Qc_CH4_LI77</column-name><column-value><![CDATA[");
        sb.append(getQc_CH4_LI77());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>Qc_CH4_LI77_EMEP</column-name><column-value><![CDATA[");
        sb.append(getQc_CH4_LI77_EMEP());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>Qc_LE_LI72</column-name><column-value><![CDATA[");
        sb.append(getQc_LE_LI72());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>Qc_LE_LI72_EMEP</column-name><column-value><![CDATA[");
        sb.append(getQc_LE_LI72_EMEP());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>Qc_tau</column-name><column-value><![CDATA[");
        sb.append(getQc_tau());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>Qc_tau_EMEP</column-name><column-value><![CDATA[");
        sb.append(getQc_tau_EMEP());
        sb.append("]]></column-value></column>");

        sb.append("</model>");

        return sb.toString();
    }
}
