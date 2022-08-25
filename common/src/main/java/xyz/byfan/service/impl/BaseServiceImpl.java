package xyz.byfan.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import xyz.byfan.dao.BaseDao;
import xyz.byfan.service.IBaseService;

import java.io.Serializable;
import java.util.List;

/**
 * @ClassName: BaseServiceImpl
 * @Description: 基础业务层实现类
 * @Author: byfan
 * @Date: 2022/8/25 15:13
 */
public class BaseServiceImpl<T, PK extends Serializable> implements IBaseService<T, PK> {

    @Autowired
    protected BaseDao<T,PK> baseDao;

    /**
     * @param entity
     * @return S
     * @throws
     * @Description 保存/更新
     * @Author byfan
     * @Date 2022/8/25 15:08
     */
    @Override
    public <S extends T> S save(S entity) {
        return baseDao.save(entity);
    }

    /**
     * @param id
     * @return void
     * @throws
     * @Description 根据id删除
     * @Author byfan
     * @Date 2022/8/25 15:09
     */
    @Override
    public void deleteById(PK id) {
        baseDao.deleteById(id);
    }

    /**
     * @param ids
     * @return void
     * @throws
     * @Description 根据id列表删除
     * @Author byfan
     * @Date 2022/8/25 15:09
     */
    @Override
    public void deleteAllById(List<PK> ids) {
        baseDao.deleteAllById(ids);
    }

    /**
     * @param id
     * @return T
     * @throws
     * @Description 根据id进行查询
     * @Author byfan
     * @Date 2022/8/25 15:15
     */
    @Override
    public T getById(PK id) {
        return baseDao.getReferenceById(id);
    }

    /**
     * @return java.util.List<T>
     * @throws
     * @Description 查询全部
     * @Author byfan
     * @Date 2022/8/25 15:18
     */
    @Override
    public List<T> findAll() {
        return baseDao.findAll();
    }

    /**
     * @param sort
     * @return java.util.List<T>
     * @throws
     * @Description 查询全部并且排序
     * @Author byfan
     * @Date 2022/8/25 15:18
     */
    @Override
    public List<T> findAll(Sort sort) {
        return baseDao.findAll(sort);
    }

    /**
     * @param ids
     * @return java.util.List<T>
     * @throws
     * @Description 根据id列表进行查询
     * @Author byfan
     * @Date 2022/8/25 15:18
     */
    @Override
    public List<T> findAllById(List<PK> ids) {
        return baseDao.findAllById(ids);
    }

    /**
     * @param pageable
     * @return org.springframework.data.domain.Page<T>
     * @throws
     * @Description 分页查询全部
     * @Author byfan
     * @Date 2022/8/25 15:18
     */
    @Override
    public Page<T> findAll(Pageable pageable) {
        return baseDao.findAll(pageable);
    }
}
