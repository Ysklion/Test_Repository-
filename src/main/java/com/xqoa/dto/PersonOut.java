package com.xqoa.dto;

import com.xqoa.entity.Personnel;
import com.xqoa.entity.Work;
import org.springframework.beans.BeanUtils;

import java.util.Date;

public class PersonOut extends Personnel {

    private String educationName;
    private String sexType;
    private String marStatus;
    private Work work;

    public Work getWork() {
        return work;
    }

    public void setWork(Work work) {
        this.work = work;
    }

    public  static PersonOut transForm(Personnel personnel){
        PersonOut personOut =  new PersonOut();
        BeanUtils.copyProperties(personnel,personOut);
        return personOut;
    }

    public static PersonOut transTypeName(PersonOut personOut){
        switch (personOut.getEducation()){
            case 1 : personOut.setEducationName("小学");break;
            case 2 : personOut.setEducationName("初中");break;
            case 3 : personOut.setEducationName("高中");break;
            case 4 : personOut.setEducationName("中专");break;
            case 5 : personOut.setEducationName("大专");break;
            case 6 : personOut.setEducationName("本科");break;
            default: personOut.setEducationName("无");
        }
        return personOut;
    }

    public void setEducationName(String educationName) {
        this.educationName = educationName;
    }

    public void setSexType(String sexType) {
        this.sexType = sexType;
    }

    public void setMarStatus(String marStatus) {
        this.marStatus = marStatus;
    }

    public String getEducationName() {
        return educationName;
    }

    public String getSexType() {
        return sexType;
    }

    public String getMarStatus() {
        return marStatus;
    }

    public PersonOut() {
    }

    public PersonOut(String educationName, String sexType, String marStatus) {
        this.educationName = educationName;
        this.sexType = sexType;
        this.marStatus = marStatus;
    }

    public PersonOut(Integer id, Integer education, String idCard, Integer sex, String origin, Integer workRemake, String phone, Date createTime, Date brith, String name, String addr, Integer maritalStatus, Integer height, String educationName, String sexType, String marStatus) {
        super(id, education, idCard, sex, origin, workRemake, phone, createTime, brith, name, addr, maritalStatus, height);
        this.educationName = educationName;
        this.sexType = sexType;
        this.marStatus = marStatus;
    }
}
