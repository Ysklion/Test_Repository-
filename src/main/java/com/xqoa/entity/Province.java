package com.xqoa.entity;
public class Province {
    private Integer id;
    private String province;
    private String provinceID;
    public Province() {
        super();
    }
    public Province(Integer id,String province,String provinceID) {
        super();
        this.id = id;
        this.province = province;
        this.provinceID = provinceID;
    }
    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getProvince() {
        return this.province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getProvinceID() {
        return this.provinceID;
    }

    public void setProvinceID(String provinceID) {
        this.provinceID = provinceID;
    }

}
