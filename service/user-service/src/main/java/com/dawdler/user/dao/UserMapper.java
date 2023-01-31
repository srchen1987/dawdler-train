package com.dawdler.user.dao;

import com.anywide.dawdler.serverplug.load.bean.Page;
import com.dawdler.user.entity.User;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserMapper {
    /** 
     * 
     * @Title deleteByPrimaryKey
     * @Description 删除[用户表]
     * @Copyright	dawdler 	2023-1-28
     * <p> Company: dawdler  </p>
     * @author srchen
     * @date 2023年1月28日 上午11:15:42
     * @version 1.0
     * @param userid	userid
     */
    int deleteByPrimaryKey(Integer userid);

    /** 
     * 
     * @Title insert
     * @Description 插入[用户表]
     * @Copyright	dawdler 	2023-1-28
     * <p> Company: dawdler  </p>
     * @author srchen
     * @date 2023年1月28日 上午11:15:42
     * @version 1.0
     * @param row
     */
    int insert(User row);

    /** 
     * 
     * @Title insertSelective
     * @Description 插入[用户表]
     * @Copyright	dawdler 	2023-1-28
     * <p> Company: dawdler  </p>
     * @author srchen
     * @date 2023年1月28日 上午11:15:42
     * @version 1.0
     * @param row
     */
    int insertSelective(User row);

    /** 
     * 
     * @Title selectByPrimaryKey
     * @Description 查询[用户表]
     * @Copyright	dawdler 	2023-1-28
     * <p> Company: dawdler  </p>
     * @author srchen
     * @date 2023年1月28日 上午11:15:42
     * @version 1.0
     * @param userid	userid
     */
    User selectByPrimaryKey(Integer userid);

    /** 
     * 
     * @Title updateByPrimaryKeySelective
     * @Description 更新[用户表]
     * @Copyright	dawdler 	2023-1-28
     * <p> Company: dawdler  </p>
     * @author srchen
     * @date 2023年1月28日 上午11:15:42
     * @version 1.0
     * @param row
     */
    int updateByPrimaryKeySelective(User row);

    /** 
     * 
     * @Title updateByPrimaryKey
     * @Description 更新[用户表]
     * @Copyright	dawdler 	2023-1-28
     * <p> Company: dawdler  </p>
     * @author srchen
     * @date 2023年1月28日 上午11:15:42
     * @version 1.0
     * @param row
     */
    int updateByPrimaryKey(User row);

    /** 
     * 
     * @Title selectPageListCount
     * @Description 查询[用户表]
     * @Copyright	dawdler 	2023-1-28
     * <p> Company: dawdler  </p>
     * @author srchen
     * @date 2023年1月28日 上午11:15:42
     * @version 1.0
     * @param user
     */
    int selectPageListCount(User user);

    /** 
     * 
     * @Title selectPageList
     * @Description 查询[用户表]列表
     * @Copyright	dawdler 	2023-1-28
     * <p> Company: dawdler  </p>
     * @author srchen
     * @date 2023年1月28日 上午11:15:42
     * @version 1.0
     * @param user
     * @param page
     */
    List<User> selectPageList(@Param("user") User user, @Param("page") Page page);
}