package com.xqoa.service;
import java.util.List;
import com.xqoa.entity.Area;
import com.xqoa.common.Assist;
public interface AreaService{
	/**
	 * 获得Area数据的总行数,可以通过辅助工具Assist进行条件查询,如果没有条件则传入null
	 * @param assist
	 * @return
	 */
    long getAreaRowCount(Assist assist);
	/**
	 * 获得Area数据集合,可以通过辅助工具Assist进行条件查询,如果没有条件则传入null
	 * @param assist
	 * @return
	 */
    List<Area> selectArea(Assist assist);
	/**
	 * 获得一个Area对象,以参数Area对象中不为空的属性作为条件进行查询
	 * @param obj
	 * @return
	 */
    Area selectAreaByObj(Area obj);
	/**
	 * 通过Area的id获得Area对象
	 * @param id
	 * @return
	 */
    Area selectAreaById(Integer id);
	/**
	 * 插入Area到数据库,包括null值
	 * @param value
	 * @return
	 */
    int insertArea(Area value);
	/**
	 * 插入Area中属性值不为null的数据到数据库
	 * @param value
	 * @return
	 */
    int insertNonEmptyArea(Area value);
	/**
	 * 批量插入Area到数据库
	 * @param value
	 * @return
	 */
    int insertAreaByBatch(List<Area> value);
	/**
	 * 通过Area的id删除Area
	 * @param id
	 * @return
	 */
    int deleteAreaById(Integer id);
	/**
	 * 通过辅助工具Assist的条件删除Area
	 * @param assist
	 * @return
	 */
    int deleteArea(Assist assist);
	/**
	 * 通过Area的id更新Area中的数据,包括null值
	 * @param enti
	 * @return
	 */
    int updateAreaById(Area enti);
 	/**
	 * 通过辅助工具Assist的条件更新Area中的数据,包括null值
	 * @param value
	 * @param assist
	 * @return
	 */
    int updateArea(Area value,  Assist assist);
	/**
	 * 通过Area的id更新Area中属性不为null的数据
	 * @param enti
	 * @return
	 */
    int updateNonEmptyAreaById(Area enti);
 	/**
	 * 通过辅助工具Assist的条件更新Area中属性不为null的数据
	 * @param value
	 * @param assist
	 * @return
	 */
    int updateNonEmptyArea(Area value, Assist assist);
}