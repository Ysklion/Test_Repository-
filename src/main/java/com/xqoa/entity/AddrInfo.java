package com.xqoa.entity;
public class AddrInfo {
    private Integer id;
    private Integer areaId;
    private Integer pid;
    private Integer cityId;
    private Integer provinceId;
    public AddrInfo() {
        super();
    }
    public AddrInfo(Integer id,Integer areaId,Integer pid,Integer cityId,Integer provinceId) {
        super();
        this.id = id;
        this.areaId = areaId;
        this.pid = pid;
        this.cityId = cityId;
        this.provinceId = provinceId;
    }
    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getAreaId() {
        return this.areaId;
    }

    public void setAreaId(Integer areaId) {
        this.areaId = areaId;
    }

    public Integer getPid() {
        return this.pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
    }

    public Integer getCityId() {
        return this.cityId;
    }

    public void setCityId(Integer cityId) {
        this.cityId = cityId;
    }

    public Integer getProvinceId() {
        return this.provinceId;
    }

    public void setProvinceId(Integer provinceId) {
        this.provinceId = provinceId;
    }

}
