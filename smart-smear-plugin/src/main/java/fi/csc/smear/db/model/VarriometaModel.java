package fi.csc.smear.db.model;

import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.service.ServiceContext;

import com.liferay.portlet.expando.model.ExpandoBridge;

import java.io.Serializable;

import java.util.Date;

/**
 * The base model interface for the Varriometa service. Represents a row in the &quot;VAR_META&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link fi.csc.smear.db.model.impl.VarriometaModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link fi.csc.smear.db.model.impl.VarriometaImpl}.
 * </p>
 *
 * @author pj
 * @see Varriometa
 * @see fi.csc.smear.db.model.impl.VarriometaImpl
 * @see fi.csc.smear.db.model.impl.VarriometaModelImpl
 * @generated
 */
public interface VarriometaModel extends BaseModel<Varriometa> {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this interface directly. All methods that expect a varriometa model instance should use the {@link Varriometa} interface instead.
     */

    /**
     * Returns the primary key of this varriometa.
     *
     * @return the primary key of this varriometa
     */
    public java.util.Date getPrimaryKey();

    /**
     * Sets the primary key of this varriometa.
     *
     * @param primaryKey the primary key of this varriometa
     */
    public void setPrimaryKey(java.util.Date primaryKey);

    /**
     * Returns the s a m p t i m e of this varriometa.
     *
     * @return the s a m p t i m e of this varriometa
     */
    public Date getSAMPTIME();

    /**
     * Sets the s a m p t i m e of this varriometa.
     *
     * @param SAMPTIME the s a m p t i m e of this varriometa
     */
    public void setSAMPTIME(Date SAMPTIME);

    /**
     * Returns the w s0 of this varriometa.
     *
     * @return the w s0 of this varriometa
     */
    public float getWS0();

    /**
     * Sets the w s0 of this varriometa.
     *
     * @param WS0 the w s0 of this varriometa
     */
    public void setWS0(float WS0);

    /**
     * Returns the w s1 of this varriometa.
     *
     * @return the w s1 of this varriometa
     */
    public float getWS1();

    /**
     * Sets the w s1 of this varriometa.
     *
     * @param WS1 the w s1 of this varriometa
     */
    public void setWS1(float WS1);

    /**
     * Returns the w s2 of this varriometa.
     *
     * @return the w s2 of this varriometa
     */
    public float getWS2();

    /**
     * Sets the w s2 of this varriometa.
     *
     * @param WS2 the w s2 of this varriometa
     */
    public void setWS2(float WS2);

    /**
     * Returns the w s3 of this varriometa.
     *
     * @return the w s3 of this varriometa
     */
    public float getWS3();

    /**
     * Sets the w s3 of this varriometa.
     *
     * @param WS3 the w s3 of this varriometa
     */
    public void setWS3(float WS3);

    /**
     * Returns the w s4 of this varriometa.
     *
     * @return the w s4 of this varriometa
     */
    public float getWS4();

    /**
     * Sets the w s4 of this varriometa.
     *
     * @param WS4 the w s4 of this varriometa
     */
    public void setWS4(float WS4);

    /**
     * Returns the r m m of this varriometa.
     *
     * @return the r m m of this varriometa
     */
    public float getRMM();

    /**
     * Sets the r m m of this varriometa.
     *
     * @param RMM the r m m of this varriometa
     */
    public void setRMM(float RMM);

    /**
     * Returns the t l o g of this varriometa.
     *
     * @return the t l o g of this varriometa
     */
    public float getTLOG();

    /**
     * Sets the t l o g of this varriometa.
     *
     * @param TLOG the t l o g of this varriometa
     */
    public void setTLOG(float TLOG);

    /**
     * Returns the p a r of this varriometa.
     *
     * @return the p a r of this varriometa
     */
    public float getPAR();

    /**
     * Sets the p a r of this varriometa.
     *
     * @param PAR the p a r of this varriometa
     */
    public void setPAR(float PAR);

    /**
     * Returns the g l o b of this varriometa.
     *
     * @return the g l o b of this varriometa
     */
    public float getGLOB();

    /**
     * Sets the g l o b of this varriometa.
     *
     * @param GLOB the g l o b of this varriometa
     */
    public void setGLOB(float GLOB);

    /**
     * Returns the r e f l of this varriometa.
     *
     * @return the r e f l of this varriometa
     */
    public float getREFL();

    /**
     * Sets the r e f l of this varriometa.
     *
     * @param REFL the r e f l of this varriometa
     */
    public void setREFL(float REFL);

    /**
     * Returns the n e t of this varriometa.
     *
     * @return the n e t of this varriometa
     */
    public float getNET();

    /**
     * Sets the n e t of this varriometa.
     *
     * @param NET the n e t of this varriometa
     */
    public void setNET(float NET);

    /**
     * Returns the u v a of this varriometa.
     *
     * @return the u v a of this varriometa
     */
    public float getUVA();

    /**
     * Sets the u v a of this varriometa.
     *
     * @param UVA the u v a of this varriometa
     */
    public void setUVA(float UVA);

    /**
     * Returns the u v b of this varriometa.
     *
     * @return the u v b of this varriometa
     */
    public float getUVB();

    /**
     * Sets the u v b of this varriometa.
     *
     * @param UVB the u v b of this varriometa
     */
    public void setUVB(float UVB);

    /**
     * Returns the u v a t of this varriometa.
     *
     * @return the u v a t of this varriometa
     */
    public float getUVAT();

    /**
     * Sets the u v a t of this varriometa.
     *
     * @param UVAT the u v a t of this varriometa
     */
    public void setUVAT(float UVAT);

    /**
     * Returns the u v b t of this varriometa.
     *
     * @return the u v b t of this varriometa
     */
    public float getUVBT();

    /**
     * Sets the u v b t of this varriometa.
     *
     * @param UVBT the u v b t of this varriometa
     */
    public void setUVBT(float UVBT);

    /**
     * Returns the r a i n of this varriometa.
     *
     * @return the r a i n of this varriometa
     */
    public float getRAIN();

    /**
     * Sets the r a i n of this varriometa.
     *
     * @param RAIN the r a i n of this varriometa
     */
    public void setRAIN(float RAIN);

    /**
     * Returns the t d r y0 of this varriometa.
     *
     * @return the t d r y0 of this varriometa
     */
    public float getTDRY0();

    /**
     * Sets the t d r y0 of this varriometa.
     *
     * @param TDRY0 the t d r y0 of this varriometa
     */
    public void setTDRY0(float TDRY0);

    /**
     * Returns the t w e t0 of this varriometa.
     *
     * @return the t w e t0 of this varriometa
     */
    public float getTWET0();

    /**
     * Sets the t w e t0 of this varriometa.
     *
     * @param TWET0 the t w e t0 of this varriometa
     */
    public void setTWET0(float TWET0);

    /**
     * Returns the t d r y1 of this varriometa.
     *
     * @return the t d r y1 of this varriometa
     */
    public float getTDRY1();

    /**
     * Sets the t d r y1 of this varriometa.
     *
     * @param TDRY1 the t d r y1 of this varriometa
     */
    public void setTDRY1(float TDRY1);

    /**
     * Returns the t w e t1 of this varriometa.
     *
     * @return the t w e t1 of this varriometa
     */
    public float getTWET1();

    /**
     * Sets the t w e t1 of this varriometa.
     *
     * @param TWET1 the t w e t1 of this varriometa
     */
    public void setTWET1(float TWET1);

    /**
     * Returns the t d r y2 of this varriometa.
     *
     * @return the t d r y2 of this varriometa
     */
    public float getTDRY2();

    /**
     * Sets the t d r y2 of this varriometa.
     *
     * @param TDRY2 the t d r y2 of this varriometa
     */
    public void setTDRY2(float TDRY2);

    /**
     * Returns the t w e t2 of this varriometa.
     *
     * @return the t w e t2 of this varriometa
     */
    public float getTWET2();

    /**
     * Sets the t w e t2 of this varriometa.
     *
     * @param TWET2 the t w e t2 of this varriometa
     */
    public void setTWET2(float TWET2);

    /**
     * Returns the t d r y3 of this varriometa.
     *
     * @return the t d r y3 of this varriometa
     */
    public float getTDRY3();

    /**
     * Sets the t d r y3 of this varriometa.
     *
     * @param TDRY3 the t d r y3 of this varriometa
     */
    public void setTDRY3(float TDRY3);

    /**
     * Returns the t w e t3 of this varriometa.
     *
     * @return the t w e t3 of this varriometa
     */
    public float getTWET3();

    /**
     * Sets the t w e t3 of this varriometa.
     *
     * @param TWET3 the t w e t3 of this varriometa
     */
    public void setTWET3(float TWET3);

    /**
     * Returns the t d r y4 of this varriometa.
     *
     * @return the t d r y4 of this varriometa
     */
    public float getTDRY4();

    /**
     * Sets the t d r y4 of this varriometa.
     *
     * @param TDRY4 the t d r y4 of this varriometa
     */
    public void setTDRY4(float TDRY4);

    /**
     * Returns the t w e t4 of this varriometa.
     *
     * @return the t w e t4 of this varriometa
     */
    public float getTWET4();

    /**
     * Sets the t w e t4 of this varriometa.
     *
     * @param TWET4 the t w e t4 of this varriometa
     */
    public void setTWET4(float TWET4);

    /**
     * Returns the s t of this varriometa.
     *
     * @return the s t of this varriometa
     */
    public float getST();

    /**
     * Sets the s t of this varriometa.
     *
     * @param ST the s t of this varriometa
     */
    public void setST(float ST);

    /**
     * Returns the w d i r of this varriometa.
     *
     * @return the w d i r of this varriometa
     */
    public float getWDIR();

    /**
     * Sets the w d i r of this varriometa.
     *
     * @param WDIR the w d i r of this varriometa
     */
    public void setWDIR(float WDIR);

    /**
     * Returns the c p c1 of this varriometa.
     *
     * @return the c p c1 of this varriometa
     */
    public float getCPC1();

    /**
     * Sets the c p c1 of this varriometa.
     *
     * @param CPC1 the c p c1 of this varriometa
     */
    public void setCPC1(float CPC1);

    /**
     * Returns the o3_0 of this varriometa.
     *
     * @return the o3_0 of this varriometa
     */
    public float getO3_0();

    /**
     * Sets the o3_0 of this varriometa.
     *
     * @param O3_0 the o3_0 of this varriometa
     */
    public void setO3_0(float O3_0);

    /**
     * Returns the o3_1 of this varriometa.
     *
     * @return the o3_1 of this varriometa
     */
    public float getO3_1();

    /**
     * Sets the o3_1 of this varriometa.
     *
     * @param O3_1 the o3_1 of this varriometa
     */
    public void setO3_1(float O3_1);

    /**
     * Returns the o3_2 of this varriometa.
     *
     * @return the o3_2 of this varriometa
     */
    public float getO3_2();

    /**
     * Sets the o3_2 of this varriometa.
     *
     * @param O3_2 the o3_2 of this varriometa
     */
    public void setO3_2(float O3_2);

    /**
     * Returns the o3_3 of this varriometa.
     *
     * @return the o3_3 of this varriometa
     */
    public float getO3_3();

    /**
     * Sets the o3_3 of this varriometa.
     *
     * @param O3_3 the o3_3 of this varriometa
     */
    public void setO3_3(float O3_3);

    /**
     * Returns the o3_4 of this varriometa.
     *
     * @return the o3_4 of this varriometa
     */
    public float getO3_4();

    /**
     * Sets the o3_4 of this varriometa.
     *
     * @param O3_4 the o3_4 of this varriometa
     */
    public void setO3_4(float O3_4);

    /**
     * Returns the s o2_0 of this varriometa.
     *
     * @return the s o2_0 of this varriometa
     */
    public float getSO2_0();

    /**
     * Sets the s o2_0 of this varriometa.
     *
     * @param SO2_0 the s o2_0 of this varriometa
     */
    public void setSO2_0(float SO2_0);

    /**
     * Returns the s o2_1 of this varriometa.
     *
     * @return the s o2_1 of this varriometa
     */
    public float getSO2_1();

    /**
     * Sets the s o2_1 of this varriometa.
     *
     * @param SO2_1 the s o2_1 of this varriometa
     */
    public void setSO2_1(float SO2_1);

    /**
     * Returns the s o2_2 of this varriometa.
     *
     * @return the s o2_2 of this varriometa
     */
    public float getSO2_2();

    /**
     * Sets the s o2_2 of this varriometa.
     *
     * @param SO2_2 the s o2_2 of this varriometa
     */
    public void setSO2_2(float SO2_2);

    /**
     * Returns the s o2_3 of this varriometa.
     *
     * @return the s o2_3 of this varriometa
     */
    public float getSO2_3();

    /**
     * Sets the s o2_3 of this varriometa.
     *
     * @param SO2_3 the s o2_3 of this varriometa
     */
    public void setSO2_3(float SO2_3);

    /**
     * Returns the s o2_4 of this varriometa.
     *
     * @return the s o2_4 of this varriometa
     */
    public float getSO2_4();

    /**
     * Sets the s o2_4 of this varriometa.
     *
     * @param SO2_4 the s o2_4 of this varriometa
     */
    public void setSO2_4(float SO2_4);

    /**
     * Returns the n o_0 of this varriometa.
     *
     * @return the n o_0 of this varriometa
     */
    public float getNO_0();

    /**
     * Sets the n o_0 of this varriometa.
     *
     * @param NO_0 the n o_0 of this varriometa
     */
    public void setNO_0(float NO_0);

    /**
     * Returns the n o_1 of this varriometa.
     *
     * @return the n o_1 of this varriometa
     */
    public float getNO_1();

    /**
     * Sets the n o_1 of this varriometa.
     *
     * @param NO_1 the n o_1 of this varriometa
     */
    public void setNO_1(float NO_1);

    /**
     * Returns the n o_2 of this varriometa.
     *
     * @return the n o_2 of this varriometa
     */
    public float getNO_2();

    /**
     * Sets the n o_2 of this varriometa.
     *
     * @param NO_2 the n o_2 of this varriometa
     */
    public void setNO_2(float NO_2);

    /**
     * Returns the n o_4 of this varriometa.
     *
     * @return the n o_4 of this varriometa
     */
    public float getNO_4();

    /**
     * Sets the n o_4 of this varriometa.
     *
     * @param NO_4 the n o_4 of this varriometa
     */
    public void setNO_4(float NO_4);

    /**
     * Returns the n o x_0 of this varriometa.
     *
     * @return the n o x_0 of this varriometa
     */
    public float getNOX_0();

    /**
     * Sets the n o x_0 of this varriometa.
     *
     * @param NOX_0 the n o x_0 of this varriometa
     */
    public void setNOX_0(float NOX_0);

    /**
     * Returns the n o x_1 of this varriometa.
     *
     * @return the n o x_1 of this varriometa
     */
    public float getNOX_1();

    /**
     * Sets the n o x_1 of this varriometa.
     *
     * @param NOX_1 the n o x_1 of this varriometa
     */
    public void setNOX_1(float NOX_1);

    /**
     * Returns the n o x_2 of this varriometa.
     *
     * @return the n o x_2 of this varriometa
     */
    public float getNOX_2();

    /**
     * Sets the n o x_2 of this varriometa.
     *
     * @param NOX_2 the n o x_2 of this varriometa
     */
    public void setNOX_2(float NOX_2);

    /**
     * Returns the n o x_4 of this varriometa.
     *
     * @return the n o x_4 of this varriometa
     */
    public float getNOX_4();

    /**
     * Sets the n o x_4 of this varriometa.
     *
     * @param NOX_4 the n o x_4 of this varriometa
     */
    public void setNOX_4(float NOX_4);

    /**
     * Returns the p of this varriometa.
     *
     * @return the p of this varriometa
     */
    public float getP();

    /**
     * Sets the p of this varriometa.
     *
     * @param P the p of this varriometa
     */
    public void setP(float P);

    /**
     * Returns the h u m_ r h of this varriometa.
     *
     * @return the h u m_ r h of this varriometa
     */
    public float getHUM_RH();

    /**
     * Sets the h u m_ r h of this varriometa.
     *
     * @param HUM_RH the h u m_ r h of this varriometa
     */
    public void setHUM_RH(float HUM_RH);

    /**
     * Returns the h u m_ t of this varriometa.
     *
     * @return the h u m_ t of this varriometa
     */
    public float getHUM_T();

    /**
     * Sets the h u m_ t of this varriometa.
     *
     * @param HUM_T the h u m_ t of this varriometa
     */
    public void setHUM_T(float HUM_T);

    /**
     * Returns the temp of this varriometa.
     *
     * @return the temp of this varriometa
     */
    public float getTemp();

    /**
     * Sets the temp of this varriometa.
     *
     * @param temp the temp of this varriometa
     */
    public void setTemp(float temp);

    /**
     * Returns the w s00 of this varriometa.
     *
     * @return the w s00 of this varriometa
     */
    public float getWS00();

    /**
     * Sets the w s00 of this varriometa.
     *
     * @param WS00 the w s00 of this varriometa
     */
    public void setWS00(float WS00);

    /**
     * Returns the visibility of this varriometa.
     *
     * @return the visibility of this varriometa
     */
    public float getVisibility();

    /**
     * Sets the visibility of this varriometa.
     *
     * @param visibility the visibility of this varriometa
     */
    public void setVisibility(float visibility);

    /**
     * Returns the rainint of this varriometa.
     *
     * @return the rainint of this varriometa
     */
    public float getRainint();

    /**
     * Sets the rainint of this varriometa.
     *
     * @param rainint the rainint of this varriometa
     */
    public void setRainint(float rainint);

    /**
     * Returns the precipacc of this varriometa.
     *
     * @return the precipacc of this varriometa
     */
    public float getPrecipacc();

    /**
     * Sets the precipacc of this varriometa.
     *
     * @param Precipacc the precipacc of this varriometa
     */
    public void setPrecipacc(float Precipacc);

    /**
     * Returns the haildiammax of this varriometa.
     *
     * @return the haildiammax of this varriometa
     */
    public float getHaildiammax();

    /**
     * Sets the haildiammax of this varriometa.
     *
     * @param haildiammax the haildiammax of this varriometa
     */
    public void setHaildiammax(float haildiammax);

    /**
     * Returns the snowint of this varriometa.
     *
     * @return the snowint of this varriometa
     */
    public float getSnowint();

    /**
     * Sets the snowint of this varriometa.
     *
     * @param snowint the snowint of this varriometa
     */
    public void setSnowint(float snowint);

    /**
     * Returns the visibilitylpm of this varriometa.
     *
     * @return the visibilitylpm of this varriometa
     */
    public float getVisibilitylpm();

    /**
     * Sets the visibilitylpm of this varriometa.
     *
     * @param visibilitylpm the visibilitylpm of this varriometa
     */
    public void setVisibilitylpm(float visibilitylpm);

    /**
     * Returns the wthcode of this varriometa.
     *
     * @return the wthcode of this varriometa
     */
    public int getWthcode();

    /**
     * Sets the wthcode of this varriometa.
     *
     * @param wthcode the wthcode of this varriometa
     */
    public void setWthcode(int wthcode);

    /**
     * Returns the c o_1 of this varriometa.
     *
     * @return the c o_1 of this varriometa
     */
    public float getCO_1();

    /**
     * Sets the c o_1 of this varriometa.
     *
     * @param CO_1 the c o_1 of this varriometa
     */
    public void setCO_1(float CO_1);

    /**
     * Returns the quality of this varriometa.
     *
     * @return the quality of this varriometa
     */
    public int getQuality();

    /**
     * Sets the quality of this varriometa.
     *
     * @param quality the quality of this varriometa
     */
    public void setQuality(int quality);

    /**
     * Returns the tsoil of this varriometa.
     *
     * @return the tsoil of this varriometa
     */
    public float getTsoil();

    /**
     * Sets the tsoil of this varriometa.
     *
     * @param Tsoil the tsoil of this varriometa
     */
    public void setTsoil(float Tsoil);

    /**
     * Returns the wsoil of this varriometa.
     *
     * @return the wsoil of this varriometa
     */
    public float getWsoil();

    /**
     * Sets the wsoil of this varriometa.
     *
     * @param wsoil the wsoil of this varriometa
     */
    public void setWsoil(float wsoil);

    /**
     * Returns the c o206 of this varriometa.
     *
     * @return the c o206 of this varriometa
     */
    public float getCO206();

    /**
     * Sets the c o206 of this varriometa.
     *
     * @param CO206 the c o206 of this varriometa
     */
    public void setCO206(float CO206);

    /**
     * Returns the c o2soil of this varriometa.
     *
     * @return the c o2soil of this varriometa
     */
    public float getCO2soil();

    /**
     * Sets the c o2soil of this varriometa.
     *
     * @param CO2soil the c o2soil of this varriometa
     */
    public void setCO2soil(float CO2soil);

    /**
     * Returns the tsoil_ e m e p of this varriometa.
     *
     * @return the tsoil_ e m e p of this varriometa
     */
    public int getTsoil_EMEP();

    /**
     * Sets the tsoil_ e m e p of this varriometa.
     *
     * @param Tsoil_EMEP the tsoil_ e m e p of this varriometa
     */
    public void setTsoil_EMEP(int Tsoil_EMEP);

    /**
     * Returns the wsoil_ e m e p of this varriometa.
     *
     * @return the wsoil_ e m e p of this varriometa
     */
    public int getWsoil_EMEP();

    /**
     * Sets the wsoil_ e m e p of this varriometa.
     *
     * @param wsoil_EMEP the wsoil_ e m e p of this varriometa
     */
    public void setWsoil_EMEP(int wsoil_EMEP);

    /**
     * Returns the c o206_ e m e p of this varriometa.
     *
     * @return the c o206_ e m e p of this varriometa
     */
    public int getCO206_EMEP();

    /**
     * Sets the c o206_ e m e p of this varriometa.
     *
     * @param CO206_EMEP the c o206_ e m e p of this varriometa
     */
    public void setCO206_EMEP(int CO206_EMEP);

    /**
     * Returns the c o2soil_ e m e p of this varriometa.
     *
     * @return the c o2soil_ e m e p of this varriometa
     */
    public int getCO2soil_EMEP();

    /**
     * Sets the c o2soil_ e m e p of this varriometa.
     *
     * @param CO2soil_EMEP the c o2soil_ e m e p of this varriometa
     */
    public void setCO2soil_EMEP(int CO2soil_EMEP);

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
    public int compareTo(Varriometa varriometa);

    @Override
    public int hashCode();

    @Override
    public CacheModel<Varriometa> toCacheModel();

    @Override
    public Varriometa toEscapedModel();

    @Override
    public Varriometa toUnescapedModel();

    @Override
    public String toString();

    @Override
    public String toXmlString();
}
