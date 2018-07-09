package com.xqoa.entity;
public class Area {
    private Integer id;
    private String area;
    private String areaID;
    private String father;
    public Area() {
        super();
    }
    public Area(Integer id,String area,String areaID,String father) {
        super();
        this.id = id;
        this.area = area;
        this.areaID = areaID;
        this.father = father;
    }
    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getArea() {
        return this.area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getAreaID() {
        return this.areaID;
    }

    public void setAreaID(String areaID) {
        this.areaID = areaID;
    }

    public String getFather() {
        return this.father;
    }

    public void setFather(String father) {
        this.father = father;
    }

}
