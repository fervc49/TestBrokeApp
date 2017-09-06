package com.alexch49.weatherapp.models;

import com.google.gson.annotations.SerializedName;

public class HourlyForecast {


    @SerializedName("FCTTIME")
    private FCTTIME fCTTIME;
    private Metrics temp;
    private Metrics dewpoint;
    private String condition;
    private String icon;
    @SerializedName("icon_url")
    private String iconUrl;
    private String fctcode;
    private String sky;
    private Metrics wspd;
    private Wdir wdir;
    private String wx;
    private String uvi;
    private String humidity;
    private Metrics windchill;
    private Metrics heatindex;
    private Metrics feelslike;
    private Metrics qpf;
    private Metrics snow;
    private String pop;
    private Metrics mslp;

    public FCTTIME getFCTTIME() {
        return fCTTIME;
    }

    public void setFCTTIME(FCTTIME fCTTIME) {
        this.fCTTIME = fCTTIME;
    }

    public Metrics getTemp() {
        return temp;
    }

    public void setTemp(Metrics temp) {
        this.temp = temp;
    }

    public Metrics getDewpoint() {
        return dewpoint;
    }

    public void setDewpoint(Metrics dewpoint) {
        this.dewpoint = dewpoint;
    }

    public String getCondition() {
        return condition;
    }

    public void setCondition(String condition) {
        this.condition = condition;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public String getIconUrl() {
        return iconUrl;
    }

    public void setIconUrl(String iconUrl) {
        this.iconUrl = iconUrl;
    }

    public String getFctcode() {
        return fctcode;
    }

    public void setFctcode(String fctcode) {
        this.fctcode = fctcode;
    }

    public String getSky() {
        return sky;
    }

    public void setSky(String sky) {
        this.sky = sky;
    }

    public Metrics getWspd() {
        return wspd;
    }

    public void setWspd(Metrics wspd) {
        this.wspd = wspd;
    }

    public Wdir getWdir() {
        return wdir;
    }

    public void setWdir(Wdir wdir) {
        this.wdir = wdir;
    }

    public String getWx() {
        return wx;
    }

    public void setWx(String wx) {
        this.wx = wx;
    }

    public String getUvi() {
        return uvi;
    }

    public void setUvi(String uvi) {
        this.uvi = uvi;
    }

    public String getHumidity() {
        return humidity;
    }

    public void setHumidity(String humidity) {
        this.humidity = humidity;
    }

    public Metrics getWindchill() {
        return windchill;
    }

    public void setWindchill(Metrics windchill) {
        this.windchill = windchill;
    }

    public Metrics getHeatindex() {
        return heatindex;
    }

    public void setHeatindex(Metrics heatindex) {
        this.heatindex = heatindex;
    }

    public Metrics getFeelslike() {
        return feelslike;
    }

    public void setFeelslike(Metrics feelslike) {
        this.feelslike = feelslike;
    }

    public Metrics getQpf() {
        return qpf;
    }

    public void setQpf(Metrics qpf) {
        this.qpf = qpf;
    }

    public Metrics getSnow() {
        return snow;
    }

    public void setSnow(Metrics snow) {
        this.snow = snow;
    }

    public String getPop() {
        return pop;
    }

    public void setPop(String pop) {
        this.pop = pop;
    }

    public Metrics getMslp() {
        return mslp;
    }

    public void setMslp(Metrics mslp) {
        this.mslp = mslp;
    }

}
