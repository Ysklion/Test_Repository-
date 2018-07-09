package com.xqoa.dto;

import com.xqoa.entity.AddrInfo;
import com.xqoa.entity.Personnel;
import com.xqoa.entity.Work;

import java.util.List;

public class PersonInput extends Personnel{
    private AddrInfo addrInfo ;
    private List<Work> workList;

    public AddrInfo getAddrInfo() {
        return addrInfo;
    }

    public List<Work> getWorkList() {
        return workList;
    }

    public void setAddrInfo(AddrInfo addrInfo) {
        this.addrInfo = addrInfo;
    }

    public void setWorkList(List<Work> workList) {
        this.workList = workList;
    }

    public PersonInput(AddrInfo addrInfo, List<Work> workList) {
        this.addrInfo = addrInfo;
        this.workList = workList;
    }

    public PersonInput() {
    }
}
