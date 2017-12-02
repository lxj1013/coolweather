package cn.com.hisistar.coolweather.db;

import org.litepal.crud.DataSupport;

/**
 * Created by lixinjian on 2017/12/1.
 */

public class County extends DataSupport {
    private int id;
    private String countyId;
    private String weatherId;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCountyId() {
        return countyId;
    }

    public void setCountyId(String countyId) {
        this.countyId = countyId;
    }

    public String getWeatherId() {
        return weatherId;
    }

    public void setWeatherId(String weatherId) {
        this.weatherId = weatherId;
    }
}
