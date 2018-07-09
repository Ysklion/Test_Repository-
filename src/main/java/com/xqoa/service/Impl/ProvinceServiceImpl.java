package com.xqoa.service.Impl;
import java.util.List;
import com.xqoa.dao.ProvinceDao;
import com.xqoa.entity.Province;
import com.xqoa.common.Assist;
import com.xqoa.service.ProvinceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class ProvinceServiceImpl implements ProvinceService{
    @Autowired
    private ProvinceDao provinceDao;
    @Override
    public long getProvinceRowCount(Assist assist){
        return provinceDao.getProvinceRowCount(assist);
    }
    @Override
    public List<Province> selectProvince(Assist assist){
        return provinceDao.selectProvince(assist);
    }
    @Override
    public Province selectProvinceByObj(Province obj){
        return provinceDao.selectProvinceByObj(obj);
    }
    @Override
    public Province selectProvinceById(Integer id){
        return provinceDao.selectProvinceById(id);
    }
    @Override
    public int insertProvince(Province value){
        return provinceDao.insertProvince(value);
    }
    @Override
    public int insertNonEmptyProvince(Province value){
        return provinceDao.insertNonEmptyProvince(value);
    }
    @Override
    public int insertProvinceByBatch(List<Province> value){
        return provinceDao.insertProvinceByBatch(value);
    }
    @Override
    public int deleteProvinceById(Integer id){
        return provinceDao.deleteProvinceById(id);
    }
    @Override
    public int deleteProvince(Assist assist){
        return provinceDao.deleteProvince(assist);
    }
    @Override
    public int updateProvinceById(Province enti){
        return provinceDao.updateProvinceById(enti);
    }
    @Override
    public int updateProvince(Province value, Assist assist){
        return provinceDao.updateProvince(value,assist);
    }
    @Override
    public int updateNonEmptyProvinceById(Province enti){
        return provinceDao.updateNonEmptyProvinceById(enti);
    }
    @Override
    public int updateNonEmptyProvince(Province value, Assist assist){
        return provinceDao.updateNonEmptyProvince(value,assist);
    }

    public ProvinceDao getProvinceDao() {
        return this.provinceDao;
    }

    public void setProvinceDao(ProvinceDao provinceDao) {
        this.provinceDao = provinceDao;
    }

}