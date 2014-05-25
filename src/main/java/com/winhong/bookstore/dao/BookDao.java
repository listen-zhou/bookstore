package com.winhong.bookstore.dao;

import com.winhong.bookstore.common.RankType;
import com.winhong.bookstore.entity.Book;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * User对象Dao
 */
@Repository
public interface BookDao extends BaseDao<Book> {
    /**
     * BUY：销售排行榜
     * NEW：新书排行榜
     * FOLLOW：关注排行榜
     * COMMENT：评论排行榜
     * FAVORITE：收藏排行榜
     * @param count
     * @return
     */
    public List<Book> rankBooks(@Param("count") int count, @Param("type") RankType type);

    /**
     * 通过书名模糊搜索
     * @param count
     * @return
     */
    public List<Book> getBooksByName(String name);
}
