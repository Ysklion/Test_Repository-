package com.xqoa.service;
import java.util.List;
import com.xqoa.entity.Province;
import com.xqoa.common.Assist;
public interface ProvinceService{
	/**
	 * 获得Province数据的总行数,可以通过辅助工具Assist进行条件查询,如果没有条件则传入null
	 * @param assist
	 * @return
	 */
    long getProvinceRowCount(Assist assist);
	/**
	 * 获得Province数据集合,可以通过辅助工具Assist进行条件查询,如果没有条件则传入null
	 * @param assist
	 * @return
	 */
    List<Province> selectProvince(Assist assist);
	/**
	 * 获得一个Province对象,以参数Province对象中不为空的属性作为条件进行查询
	 * @param obj
	 * @return
	 */
    Province selectProvinceByObj(Province obj);
	/**
	 * 通过Province的id获得Province对象
	 * @param id
	 * @return
	 */
    Province selectProvinceById(Integer id);
	/**
	 * 插入Province到数据库,包括null值
	 * @param value
	 * @return
	 */
    int insertProvince(Province value);
	/**
	 * 插入Province中属性值不为null的数据到数据库
	 * @param value
	 * @return
	 */
    int insertNonEmptyProvince(Province value);
	/**
	 * 批量插入Province到数据库
	 * @param value
	 * @return
	 */
    int insertProvinceByBatch(List<Province> value);
	/**
	 * 通过Province的id删除Province
	 * @param id
	 * @return
	 */
    int deleteProvinceById(Integer id);
	/**
	 * 通过辅助工具Assist的条件删除Province
	 * @param assist
	 * @return
	 */
    int deleteProvince(Assist assist);
	/**
	 * 通过Province的id更新Province中的数据,包括null值
	 * @param enti
	 * @return
	 */
    int updateProvinceById(Province enti);
 	/**
	 * 通过辅助工具Assist的条件更新Province中的数据,包括null值
	 * @param value
	 * @param assist
	 * @return
	 */
    int updateProvince(Province value,  Assist assist);
	/**
	 * 通过Province的id更新Province中属性不为null的数据
	 * @param enti
	 * @return
	 */
    int updateNonEmptyProvinceById(Province enti);
 	/**
	 * 通过辅助工具Assist的条件更新Province中属性不为null的数据
	 * @param value
	 * @param assist
	 * @return
	 */
    int updateNonEmptyProvince(Province value, Assist assist);
}