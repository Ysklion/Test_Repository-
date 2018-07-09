package com.xqoa.dao;
import com.xqoa.entity.Work;
import java.util.List;
import com.xqoa.common.Assist;
import org.apache.ibatis.annotations.Param;
public interface WorkDao{
	/**
	 * 获得Work数据的总行数,可以通过辅助工具Assist进行条件查询,如果没有条件则传入null
	 * @param assist
	 * @return
	 */
    long getWorkRowCount(Assist assist);
	/**
	 * 获得Work数据集合,可以通过辅助工具Assist进行条件查询,如果没有条件则传入null
	 * @param assist
	 * @return
	 */
    List<Work> selectWork(Assist assist);
	/**
	 * 获得一个Work对象,以参数Work对象中不为空的属性作为条件进行查询
	 * @param obj
	 * @return
	 */
    Work selectWorkByObj(Work obj);
	/**
	 * 通过Work的id获得Work对象
	 * @param id
	 * @return
	 */
    Work selectWorkById(Integer id);
	/**
	 * 插入Work到数据库,包括null值
	 * @param value
	 * @return
	 */
    int insertWork(Work value);
	/**
	 * 插入Work中属性值不为null的数据到数据库
	 * @param value
	 * @return
	 */
    int insertNonEmptyWork(Work value);
	/**
	 * 批量插入Work到数据库,包括null值
	 * @param value
	 * @return
	 */
    int insertWorkByBatch(List<Work> value);
	/**
	 * 通过Work的id删除Work
	 * @param id
	 * @return
	 */
    int deleteWorkById(Integer id);
	/**
	 * 通过辅助工具Assist的条件删除Work
	 * @param assist
	 * @return
	 */
    int deleteWork(Assist assist);
	/**
	 * 通过Work的id更新Work中的数据,包括null值
	 * @param enti
	 * @return
	 */
    int updateWorkById(Work enti);
 	/**
	 * 通过辅助工具Assist的条件更新Work中的数据,包括null值
	 * @param value
	 * @param assist
	 * @return
	 */
    int updateWork(@Param("enti") Work value, @Param("assist") Assist assist);
	/**
	 * 通过Work的id更新Work中属性不为null的数据
	 * @param enti
	 * @return
	 */
    int updateNonEmptyWorkById(Work enti);
 	/**
	 * 通过辅助工具Assist的条件更新Work中属性不为null的数据
	 * @param value
	 * @param assist
	 * @return
	 */
    int updateNonEmptyWork(@Param("enti") Work value, @Param("assist") Assist assist);
}