package com.xqoa.entity;

import com.xqoa.dto.PersonInput;
import org.springframework.beans.BeanUtils;

public class Personnel {
    private Integer id;//唯一标记字段
    private Integer education;//学历
    private String idCard;//身份证
    private Integer sex;//性别
    private String origin;//籍贯
    private Integer workRemake;//工作经历
    private String phone;//电话
    private java.util.Date createTime;
    private java.util.Date brith;//生日
    private String name;//员工姓名
    private String addr;//地址
    private Integer maritalStatus;//婚姻状况
    private Integer height;//身高
    public Personnel() {
        super();
    }

    public Personnel(String name) {
        super();
        this.name = name;
    }

    public Personnel(Integer id,Integer education,String idCard,Integer sex,String origin,Integer workRemake,String phone,java.util.Date createTime,java.util.Date brith,String name,String addr,Integer maritalStatus,Integer height) {
        super();
        this.id = id;
        this.education = education;
        this.idCard = idCard;
        this.sex = sex;
        this.origin = origin;
        this.workRemake = workRemake;
        this.phone = phone;
        this.createTime = createTime;
        this.brith = brith;
        this.name = name;
        this.addr = addr;
        this.maritalStatus = maritalStatus;
        this.height = height;
    }
    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getEducation() {
        return this.education;
    }

    public void setEducation(Integer education) {
        this.education = education;
    }

    public String getIdCard() {
        return this.idCard;
    }

    public void setIdCard(String idCard) {
        this.idCard = idCard;
    }

    public Integer getSex() {
        return this.sex;
    }

    public void setSex(Integer sex) {
        this.sex = sex;
    }

    public String getOrigin() {
        return this.origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public Integer getWorkRemake() {
        return this.workRemake;
    }

    public void setWorkRemake(Integer workRemake) {
        this.workRemake = workRemake;
    }

    public String getPhone() {
        return this.phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public java.util.Date getCreateTime() {
        return this.createTime;
    }

    public void setCreateTime(java.util.Date createTime) {
        this.createTime = createTime;
    }

    public java.util.Date getBrith() {
        return this.brith;
    }

    public void setBrith(java.util.Date brith) {
        this.brith = brith;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddr() {
        return this.addr;
    }

    public void setAddr(String addr) {
        this.addr = addr;
    }

    public Integer getMaritalStatus() {
        return this.maritalStatus;
    }

    public void setMaritalStatus(Integer maritalStatus) {
        this.maritalStatus = maritalStatus;
    }

    public Integer getHeight() {
        return this.height;
    }

    public void setHeight(Integer height) {
        this.height = height;
    }

    @Override
    public String toString() {
        return "Personnel{" +
                "id=" + id +
                ", education=" + education +
                ", idCard='" + idCard + '\'' +
                ", sex=" + sex +
                ", origin='" + origin + '\'' +
                ", workRemake=" + workRemake +
                ", phone='" + phone + '\'' +
                ", createTime=" + createTime +
                ", brith=" + brith +
                ", name='" + name + '\'' +
                ", addr=" + addr +
                ", maritalStatus=" + maritalStatus +
                ", height=" + height +
                '}';
    }

    public  static Personnel transForm(PersonInput personInput){
        Personnel personnel = new Personnel();
        BeanUtils.copyProperties(personInput,personnel);
        return personnel;
    }
}
