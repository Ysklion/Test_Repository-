package com.xqoa.service.Impl;
import java.util.List;
import com.xqoa.dao.AddrInfoDao;
import com.xqoa.entity.AddrInfo;
import com.xqoa.common.Assist;
import com.xqoa.service.AddrInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class AddrInfoServiceImpl implements AddrInfoService{
    @Autowired
    private AddrInfoDao addrInfoDao;
    @Override
    public long getAddrInfoRowCount(Assist assist){
        return addrInfoDao.getAddrInfoRowCount(assist);
    }
    @Override
    public List<AddrInfo> selectAddrInfo(Assist assist){
        return addrInfoDao.selectAddrInfo(assist);
    }
    @Override
    public AddrInfo selectAddrInfoByObj(AddrInfo obj){
        return addrInfoDao.selectAddrInfoByObj(obj);
    }
    @Override
    public AddrInfo selectAddrInfoById(Integer id){
        return addrInfoDao.selectAddrInfoById(id);
    }
    @Override
    public int insertAddrInfo(AddrInfo value){
        return addrInfoDao.insertAddrInfo(value);
    }
    @Override
    public int insertNonEmptyAddrInfo(AddrInfo value){
        return addrInfoDao.insertNonEmptyAddrInfo(value);
    }
    @Override
    public int insertAddrInfoByBatch(List<AddrInfo> value){
        return addrInfoDao.insertAddrInfoByBatch(value);
    }
    @Override
    public int deleteAddrInfoById(Integer id){
        return addrInfoDao.deleteAddrInfoById(id);
    }
    @Override
    public int deleteAddrInfo(Assist assist){
        return addrInfoDao.deleteAddrInfo(assist);
    }
    @Override
    public int updateAddrInfoById(AddrInfo enti){
        return addrInfoDao.updateAddrInfoById(enti);
    }
    @Override
    public int updateAddrInfo(AddrInfo value, Assist assist){
        return addrInfoDao.updateAddrInfo(value,assist);
    }
    @Override
    public int updateNonEmptyAddrInfoById(AddrInfo enti){
        return addrInfoDao.updateNonEmptyAddrInfoById(enti);
    }
    @Override
    public int updateNonEmptyAddrInfo(AddrInfo value, Assist assist){
        return addrInfoDao.updateNonEmptyAddrInfo(value,assist);
    }

    public AddrInfoDao getAddrInfoDao() {
        return this.addrInfoDao;
    }

    public void setAddrInfoDao(AddrInfoDao addrInfoDao) {
        this.addrInfoDao = addrInfoDao;
    }

}