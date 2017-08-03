package com.joeweather.android.db;

/**
 * Created by hp on 2017/8/3.
 */

public class Province extends DataSupport{
    private int id;
    private String provinceName;
    private int privinceCode;
    private int getId() {
        return id;
    }
    public void setId() {
        this.id = id;
    }

    public String getProvinceName(String provinceName) {
        return provinceName;
    }

    public void setProvinceName() {
        this.provinceName = provinceName;
    }

    public int getPrivinceCode() {
        return privinceCode;
    }

    public void setPrivinceCode(int privinceCode) {
        this.privinceCode = privinceCode;
    }
}
