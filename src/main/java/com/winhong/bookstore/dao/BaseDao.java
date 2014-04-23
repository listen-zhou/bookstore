package com.winhong.bookstore.dao;

import org.apache.ibatis.session.RowBounds;

import java.io.Serializable;
import java.util.List;

/**
 * DAO基类，其它DAO可以直接继承这个DAO，不但可以复用共用的方法，还可以获得泛型的好处。
 */
public interface BaseDao<T> {

    /**
     * 根据ID获取PO实例
     *
     * @param id
     * @return 返回相应的持久化PO实例
     */
    public T searchById(Serializable id);

    /**
     * 获取PO的所有对象
     *
     * @return
     */
    public List<T> searchAll(RowBounds rowBounds);

    /**
     * 执行查询
     *
     * @param entity
     * @return 查询结果
     */
    public List<T> search(T entity, RowBounds rowBounds);

    /**
     * 插入PO
     *
     * @param entity
     */
    public void insert(T entity);

    /**
     * 更新PO
     *
     * @param entity
     */
    public void update(T entity);

    /**
     * 保存PO
     *
     * @param entity
     */
    public void save(T entity);

    /**
     * 删除PO
     *
     * @param id
     */
    public void delete(Serializable id);

}