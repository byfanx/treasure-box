package xyz.byfan.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.NoRepositoryBean;

import java.io.Serializable;

/**
 * @ClassName: BaseDao
 * @Description: 基础Dao类
 * @Author: byfan
 * @Date: 2022/8/25 14:59
 */
@NoRepositoryBean
public interface BaseDao<T, PK extends Serializable> extends JpaRepository<T, PK>, JpaSpecificationExecutor<T> {
}
