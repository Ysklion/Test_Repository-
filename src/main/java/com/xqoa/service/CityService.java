package com.xqoa.service;
import java.util.List;
import com.xqoa.entity.City;
import com.xqoa.common.Assist;
public interface CityService{
	/**
	 * 获得City数据的总行数,可以通过辅助工具Assist进行条件查询,如果没有条件则传入null
	 * @param assist
	 * @return
	 */
    long getCityRowCount(Assist assist);
	/**
	 * 获得City数据集合,可以通过辅助工具Assist进行条件查询,如果没有条件则传入null
	 * @param assist
	 * @return
	 */
    List<City> selectCity(Assist assist);
	/**
	 * 获得一个City对象,以参数City对象中不为空的属性作为条件进行查询
	 * @param obj
	 * @return
	 */
    City selectCityByObj(City obj);
	/**
	 * 通过City的id获得City对象
	 * @param id
	 * @return
	 */
    City selectCityById(Integer id);
	/**
	 * 插入City到数据库,包括null值
	 * @param value
	 * @return
	 */
    int insertCity(City value);
	/**
	 * 插入City中属性值不为null的数据到数据库
	 * @param value
	 * @return
	 */
    int insertNonEmptyCity(City value);
	/**
	 * 批量插入City到数据库
	 * @param value
	 * @return
	 */
    int insertCityByBatch(List<City> value);
	/**
	 * 通过City的id删除City
	 * @param id
	 * @return
	 */
    int deleteCityById(Integer id);
	/**
	 * 通过辅助工具Assist的条件删除City
	 * @param assist
	 * @return
	 */
    int deleteCity(Assist assist);
	/**
	 * 通过City的id更新City中的数据,包括null值
	 * @param enti
	 * @return
	 */
    int updateCityById(City enti);
 	/**
	 * 通过辅助工具Assist的条件更新City中的数据,包括null值
	 * @param value
	 * @param assist
	 * @return
	 */
    int updateCity(City value,  Assist assist);
	/**
	 * 通过City的id更新City中属性不为null的数据
	 * @param enti
	 * @return
	 */
    int updateNonEmptyCityById(City enti);
 	/**
	 * 通过辅助工具Assist的条件更新City中属性不为null的数据
	 * @param value
	 * @param assist
	 * @return
	 */
    int updateNonEmptyCity(City value, Assist assist);
}