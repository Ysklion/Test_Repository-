package com.xqoa.service.Impl;
import java.util.List;
import com.xqoa.dao.CityDao;
import com.xqoa.entity.City;
import com.xqoa.common.Assist;
import com.xqoa.service.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class CityServiceImpl implements CityService{
    @Autowired
    private CityDao cityDao;
    @Override
    public long getCityRowCount(Assist assist){
        return cityDao.getCityRowCount(assist);
    }
    @Override
    public List<City> selectCity(Assist assist){
        return cityDao.selectCity(assist);
    }
    @Override
    public City selectCityByObj(City obj){
        return cityDao.selectCityByObj(obj);
    }
    @Override
    public City selectCityById(Integer id){
        return cityDao.selectCityById(id);
    }
    @Override
    public int insertCity(City value){
        return cityDao.insertCity(value);
    }
    @Override
    public int insertNonEmptyCity(City value){
        return cityDao.insertNonEmptyCity(value);
    }
    @Override
    public int insertCityByBatch(List<City> value){
        return cityDao.insertCityByBatch(value);
    }
    @Override
    public int deleteCityById(Integer id){
        return cityDao.deleteCityById(id);
    }
    @Override
    public int deleteCity(Assist assist){
        return cityDao.deleteCity(assist);
    }
    @Override
    public int updateCityById(City enti){
        return cityDao.updateCityById(enti);
    }
    @Override
    public int updateCity(City value, Assist assist){
        return cityDao.updateCity(value,assist);
    }
    @Override
    public int updateNonEmptyCityById(City enti){
        return cityDao.updateNonEmptyCityById(enti);
    }
    @Override
    public int updateNonEmptyCity(City value, Assist assist){
        return cityDao.updateNonEmptyCity(value,assist);
    }

    public CityDao getCityDao() {
        return this.cityDao;
    }

    public void setCityDao(CityDao cityDao) {
        this.cityDao = cityDao;
    }

}