package com.xqoa.service.Impl;
import java.util.ArrayList;
import java.util.List;

import com.xqoa.dao.AddrInfoDao;
import com.xqoa.dao.PersonnelDao;
import com.xqoa.dao.WorkDao;
import com.xqoa.dto.PersonInput;
import com.xqoa.dto.PersonOut;
import com.xqoa.entity.AddrInfo;
import com.xqoa.entity.Personnel;
import com.xqoa.common.Assist;
import com.xqoa.entity.Work;
import com.xqoa.service.PersonnelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class PersonnelServiceImpl implements PersonnelService{
    @Autowired
    private PersonnelDao personnelDao;
    @Autowired
    private WorkDao workDao;
    @Autowired
    private AddrInfoDao addrInfoDao;
    @Override
    public long getPersonnelRowCount(Assist assist){
        return personnelDao.getPersonnelRowCount(assist);
    }
    @Override
    public List<Personnel> selectPersonnel(Assist assist){
        return personnelDao.selectPersonnel(assist);
    }
    @Override
    public Personnel selectPersonnelByObj(Personnel obj){
        return personnelDao.selectPersonnelByObj(obj);
    }
    @Override
    public Personnel selectPersonnelById(Integer id){
        return personnelDao.selectPersonnelById(id);
    }
    @Override
    public int insertPersonnel(Personnel value){
        return personnelDao.insertPersonnel(value);
    }
    @Override
    public int insertNonEmptyPersonnel(Personnel value){
        return personnelDao.insertNonEmptyPersonnel(value);
    }
    @Override
    public int insertPersonnelByBatch(List<Personnel> value){
        return personnelDao.insertPersonnelByBatch(value);
    }
    @Override
    public int deletePersonnelById(Integer id){
        return personnelDao.deletePersonnelById(id);
    }
    @Override
    public int deletePersonnel(Assist assist){
        return personnelDao.deletePersonnel(assist);
    }
    @Override
    public int updatePersonnelById(Personnel enti){
        return personnelDao.updatePersonnelById(enti);
    }
    @Override
    public int updatePersonnel(Personnel value, Assist assist){
        return personnelDao.updatePersonnel(value,assist);
    }
    @Override
    public int updateNonEmptyPersonnelById(Personnel enti){
        return personnelDao.updateNonEmptyPersonnelById(enti);
    }
    @Override
    public int updateNonEmptyPersonnel(Personnel value, Assist assist){
        return personnelDao.updateNonEmptyPersonnel(value,assist);
    }

    public void setWorkDao(WorkDao workDao) {
        this.workDao = workDao;
    }

    public void setAddrInfoDao(AddrInfoDao addrInfoDao) {
        this.addrInfoDao = addrInfoDao;
    }

    public WorkDao getWorkDao() {

        return workDao;
    }

    public AddrInfoDao getAddrInfoDao() {
        return addrInfoDao;
    }

    @Override
    public void insertPersonnelInput(PersonInput personInput) {
        AddrInfo addrInfo = personInput.getAddrInfo();
        List<Work> workList = personInput.getWorkList();
        Personnel personnel = Personnel.transForm(personInput);
        personnelDao.insertPersonnel(personnel);
        for (int j = 0; j < workList.size(); j++) {
            workList.get(j).setPId(personnel.getId());
        }
        addrInfo.setPid(personnel.getId());
        workDao.insertWorkByBatch(workList);
        addrInfoDao.insertAddrInfo(addrInfo);

    }

    @Override
    public List<PersonOut> queryByAddr(String queryAddr, Integer queryAddrId) {
        Assist assist = new Assist();
        /*assist.setRequires(Assist.andEq("provinceId",queryAddrId));*/
        if(queryAddr.equals("provinceId")){
            assist.setRequires(Assist.andEq("provinceId",queryAddrId));
        }else if(queryAddr.equals("cityId")){
            assist.setRequires(Assist.andEq("cityId",queryAddrId));
        }else{
            assist.setRequires(Assist.andEq("areaId",queryAddrId));
        }
        List<AddrInfo> addrInfos = addrInfoDao.selectAddrInfo(assist);
        List<Integer> ids = new ArrayList<>();
        for (AddrInfo a : addrInfos) {
              ids.add(a.getPid());
        }
        List<Personnel> list= personnelDao.getByIds(ids);
        List<PersonOut> result = new ArrayList<>();
        for (Personnel p: list) {
            PersonOut personOut = PersonOut.transForm(p);
            result.add(PersonOut.transTypeName(personOut));
        }
        return result;
    }

    @Override
    public List<PersonOut> queryName(String queryName) {
        List<Personnel> list = personnelDao.selectLike(queryName);
        List<PersonOut> result = new ArrayList<>();
        for (Personnel p: list) {
            PersonOut personOut = PersonOut.transForm(p);
            result.add(PersonOut.transTypeName(personOut));
        }
        return result;
    }





    public PersonnelDao getPersonnelDao() {
        return this.personnelDao;
    }

    public void setPersonnelDao(PersonnelDao personnelDao) {
        this.personnelDao = personnelDao;
    }

}