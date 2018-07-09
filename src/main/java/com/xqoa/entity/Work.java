package com.xqoa.entity;
public class Work {
    private Integer id;
    private Integer pId;
    private String workDetail;
    public Work() {
        super();
    }
    public Work(Integer id,Integer pId,String workDetail) {
        super();
        this.id = id;
        this.pId = pId;
        this.workDetail = workDetail;
    }
    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getPId() {
        return this.pId;
    }

    public void setPId(Integer pId) {
        this.pId = pId;
    }

    public String getWorkDetail() {
        return this.workDetail;
    }

    public void setWorkDetail(String workDetail) {
        this.workDetail = workDetail;
    }

}
