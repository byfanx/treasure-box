package xyz.byfan.service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

import java.util.List;

/**
 * @ClassName: IBaseService
 * @Description: 基础业务层
 * @Author: byfan
 * @Date: 2022/8/25 15:06
 */
public interface IBaseService<T,PK> {

    /**
     * @Description 保存/更新
     * @Author byfan
     * @Date 2022/8/25 15:08
     * @param entity
     * @return S
     * @throws
     */
    <S extends T> S save(S entity);

    /**
     * @Description 根据id删除
     * @Author byfan
     * @Date 2022/8/25 15:09
     * @param id
     * @return void
     * @throws
     */
    void deleteById(PK id);

    /**
     * @Description 根据id列表删除
     * @Author byfan
     * @Date 2022/8/25 15:09
     * @param ids
     * @return void
     * @throws
     */
    void deleteAllById(List<PK> ids);

    /**
     * @Description 根据id进行查询
     * @Author byfan
     * @Date 2022/8/25 15:15
     * @param id
     * @return T
     * @throws 
     */
    T getById(PK id);

    /**
     * @Description 查询全部
     * @Author byfan
     * @Date 2022/8/25 15:18
     * @param
     * @return java.util.List<T>
     * @throws
     */
    List<T> findAll();

    /**
     * @Description 查询全部并且排序
     * @Author byfan
     * @Date 2022/8/25 15:18
     * @param sort
     * @return java.util.List<T>
     * @throws
     */
    List<T> findAll(Sort sort);

    /**
     * @Description 根据id列表进行查询
     * @Author byfan
     * @Date 2022/8/25 15:18
     * @param ids
     * @return java.util.List<T>
     * @throws
     */
    List<T> findAllById(List<PK> ids);

    /**
     * @Description 分页查询全部
     * @Author byfan
     * @Date 2022/8/25 15:18
     * @param pageable
     * @return org.springframework.data.domain.Page<T>
     * @throws
     */
    Page<T> findAll(Pageable pageable);

}
