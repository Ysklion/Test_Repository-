package com.xqoa.entity;
public class City {
    private Integer id;
    private String city;
    private String father;
    private String cityID;
    public City() {
        super();
    }
    public City(Integer id,String city,String father,String cityID) {
        super();
        this.id = id;
        this.city = city;
        this.father = father;
        this.cityID = cityID;
    }
    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCity() {
        return this.city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getFather() {
        return this.father;
    }

    public void setFather(String father) {
        this.father = father;
    }

    public String getCityID() {
        return this.cityID;
    }

    public void setCityID(String cityID) {
        this.cityID = cityID;
    }

}
