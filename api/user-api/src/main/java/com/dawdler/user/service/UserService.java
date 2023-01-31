package com.dawdler.user.service;

import com.anywide.dawdler.core.annotation.RemoteService;
import com.dawdler.user.entity.User;
import java.util.Map;

@RemoteService("user-service")
public interface UserService {
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
     * @Title selectPageList
     * @Description 查询[用户表]列表
     * @Copyright	dawdler 	2023-1-28
     * <p> Company: dawdler  </p>
     * @author srchen
     * @date 2023年1月28日 上午11:15:42
     * @version 1.0
     * @param user
     * @param pageOn
     * @param row
     */
    Map<String, Object> selectPageList(User user, Integer pageOn, Integer row);

    /** 
     * 
     * @Title updateByPrimaryKeySelective
     * @Description 更新[用户表]
     * @Copyright	dawdler 	2023-1-28
     * <p> Company: dawdler  </p>
     * @author srchen
     * @date 2023年1月28日 上午11:15:42
     * @version 1.0
     * @param user
     */
    int updateByPrimaryKeySelective(User user);

    /** 
     * 
     * @Title insertSelective
     * @Description 插入[用户表]
     * @Copyright	dawdler 	2023-1-28
     * <p> Company: dawdler  </p>
     * @author srchen
     * @date 2023年1月28日 上午11:15:42
     * @version 1.0
     * @param user
     */
    int insertSelective(User user);

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
}