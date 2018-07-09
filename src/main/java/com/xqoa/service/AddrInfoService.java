package com.xqoa.service;
import java.util.List;
import com.xqoa.entity.AddrInfo;
import com.xqoa.common.Assist;
public interface AddrInfoService{
	/**
	 * 获得AddrInfo数据的总行数,可以通过辅助工具Assist进行条件查询,如果没有条件则传入null
	 * @param assist
	 * @return
	 */
    long getAddrInfoRowCount(Assist assist);
	/**
	 * 获得AddrInfo数据集合,可以通过辅助工具Assist进行条件查询,如果没有条件则传入null
	 * @param assist
	 * @return
	 */
    List<AddrInfo> selectAddrInfo(Assist assist);
	/**
	 * 获得一个AddrInfo对象,以参数AddrInfo对象中不为空的属性作为条件进行查询
	 * @param obj
	 * @return
	 */
    AddrInfo selectAddrInfoByObj(AddrInfo obj);
	/**
	 * 通过AddrInfo的id获得AddrInfo对象
	 * @param id
	 * @return
	 */
    AddrInfo selectAddrInfoById(Integer id);
	/**
	 * 插入AddrInfo到数据库,包括null值
	 * @param value
	 * @return
	 */
    int insertAddrInfo(AddrInfo value);
	/**
	 * 插入AddrInfo中属性值不为null的数据到数据库
	 * @param value
	 * @return
	 */
    int insertNonEmptyAddrInfo(AddrInfo value);
	/**
	 * 批量插入AddrInfo到数据库
	 * @param value
	 * @return
	 */
    int insertAddrInfoByBatch(List<AddrInfo> value);
	/**
	 * 通过AddrInfo的id删除AddrInfo
	 * @param id
	 * @return
	 */
    int deleteAddrInfoById(Integer id);
	/**
	 * 通过辅助工具Assist的条件删除AddrInfo
	 * @param assist
	 * @return
	 */
    int deleteAddrInfo(Assist assist);
	/**
	 * 通过AddrInfo的id更新AddrInfo中的数据,包括null值
	 * @param enti
	 * @return
	 */
    int updateAddrInfoById(AddrInfo enti);
 	/**
	 * 通过辅助工具Assist的条件更新AddrInfo中的数据,包括null值
	 * @param value
	 * @param assist
	 * @return
	 */
    int updateAddrInfo(AddrInfo value,  Assist assist);
	/**
	 * 通过AddrInfo的id更新AddrInfo中属性不为null的数据
	 * @param enti
	 * @return
	 */
    int updateNonEmptyAddrInfoById(AddrInfo enti);
 	/**
	 * 通过辅助工具Assist的条件更新AddrInfo中属性不为null的数据
	 * @param value
	 * @param assist
	 * @return
	 */
    int updateNonEmptyAddrInfo(AddrInfo value, Assist assist);
}