package com.xqoa.dao;
import com.xqoa.entity.Personnel;
import java.util.List;
import com.xqoa.common.Assist;
import org.apache.ibatis.annotations.Param;
public interface PersonnelDao{
	/**
	 * 获得Personnel数据的总行数,可以通过辅助工具Assist进行条件查询,如果没有条件则传入null
	 * @param assist
	 * @return
	 */
    long getPersonnelRowCount(Assist assist);
	/**
	 * 获得Personnel数据集合,可以通过辅助工具Assist进行条件查询,如果没有条件则传入null
	 * @param assist
	 * @return
	 */
    List<Personnel> selectPersonnel(Assist assist);
	/**
	 * 获得一个Personnel对象,以参数Personnel对象中不为空的属性作为条件进行查询
	 * @param obj
	 * @return
	 */
    Personnel selectPersonnelByObj(Personnel obj);
	/**
	 * 通过Personnel的id获得Personnel对象
	 * @param id
	 * @return
	 */
    Personnel selectPersonnelById(Integer id);
	/**
	 * 插入Personnel到数据库,包括null值
	 * @param value
	 * @return
	 */
    int insertPersonnel(Personnel value);
	/**
	 * 插入Personnel中属性值不为null的数据到数据库
	 * @param value
	 * @return
	 */
    int insertNonEmptyPersonnel(Personnel value);
	/**
	 * 批量插入Personnel到数据库,包括null值
	 * @param value
	 * @return
	 */
    int insertPersonnelByBatch(List<Personnel> value);
	/**
	 * 通过Personnel的id删除Personnel
	 * @param id
	 * @return
	 */
    int deletePersonnelById(Integer id);
	/**
	 * 通过辅助工具Assist的条件删除Personnel
	 * @param assist
	 * @return
	 */
    int deletePersonnel(Assist assist);
	/**
	 * 通过Personnel的id更新Personnel中的数据,包括null值
	 * @param enti
	 * @return
	 */
    int updatePersonnelById(Personnel enti);
 	/**
	 * 通过辅助工具Assist的条件更新Personnel中的数据,包括null值
	 * @param value
	 * @param assist
	 * @return
	 */
    int updatePersonnel(@Param("enti") Personnel value, @Param("assist") Assist assist);
	/**
	 * 通过Personnel的id更新Personnel中属性不为null的数据
	 * @param enti
	 * @return
	 */
    int updateNonEmptyPersonnelById(Personnel enti);
 	/**
	 * 通过辅助工具Assist的条件更新Personnel中属性不为null的数据
	 * @param value
	 * @param assist
	 * @return
	 */
    int updateNonEmptyPersonnel(@Param("enti") Personnel value, @Param("assist") Assist assist);

	List<Personnel> getByIds(List<Integer> ids);

    List<Personnel> selectLike(String queryName);
}