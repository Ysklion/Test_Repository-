package com.xqoa.service.Impl;
import java.util.List;
import com.xqoa.dao.WorkDao;
import com.xqoa.entity.Work;
import com.xqoa.common.Assist;
import com.xqoa.service.WorkService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class WorkServiceImpl implements WorkService{
    @Autowired
    private WorkDao workDao;
    @Override
    public long getWorkRowCount(Assist assist){
        return workDao.getWorkRowCount(assist);
    }
    @Override
    public List<Work> selectWork(Assist assist){
        return workDao.selectWork(assist);
    }
    @Override
    public Work selectWorkByObj(Work obj){
        return workDao.selectWorkByObj(obj);
    }
    @Override
    public Work selectWorkById(Integer id){
        return workDao.selectWorkById(id);
    }
    @Override
    public int insertWork(Work value){
        return workDao.insertWork(value);
    }
    @Override
    public int insertNonEmptyWork(Work value){
        return workDao.insertNonEmptyWork(value);
    }
    @Override
    public int insertWorkByBatch(List<Work> value){
        return workDao.insertWorkByBatch(value);
    }
    @Override
    public int deleteWorkById(Integer id){
        return workDao.deleteWorkById(id);
    }
    @Override
    public int deleteWork(Assist assist){
        return workDao.deleteWork(assist);
    }
    @Override
    public int updateWorkById(Work enti){
        return workDao.updateWorkById(enti);
    }
    @Override
    public int updateWork(Work value, Assist assist){
        return workDao.updateWork(value,assist);
    }
    @Override
    public int updateNonEmptyWorkById(Work enti){
        return workDao.updateNonEmptyWorkById(enti);
    }
    @Override
    public int updateNonEmptyWork(Work value, Assist assist){
        return workDao.updateNonEmptyWork(value,assist);
    }

    public WorkDao getWorkDao() {
        return this.workDao;
    }

    public void setWorkDao(WorkDao workDao) {
        this.workDao = workDao;
    }

}