package com.dawdler.user.service;

import com.anywide.dawdler.core.annotation.RemoteService;
import com.anywide.dawdler.serverplug.load.bean.Page;
import com.dawdler.user.entity.User;
import java.util.List;

@RemoteService("user-service")
public interface UserService {
    /** 
     * 
     * @Title selectByPrimaryKey
     * @Description 查询[用户表]
     * @Copyright	dawdler 	2022-10-11
     * <p> Company: dawdler  </p>
     * @author srchen
     * @date 2022年10月11日 下午9:52:52
     * @version 1.0
     * @param userid	userid
     */
    User selectByPrimaryKey(Integer userid);

    /** 
     * 
     * @Title selectPageList
     * @Description 查询[用户表]列表
     * @Copyright	dawdler 	2022-10-11
     * <p> Company: dawdler  </p>
     * @author srchen
     * @date 2022年10月11日 下午9:52:52
     * @version 1.0
     * @param user
     * @param page
     */
    List<User> selectPageList(User user, Page page);

    /** 
     * 
     * @Title updateByPrimaryKeySelective
     * @Description 更新[用户表]
     * @Copyright	dawdler 	2022-10-11
     * <p> Company: dawdler  </p>
     * @author srchen
     * @date 2022年10月11日 下午9:52:52
     * @version 1.0
     * @param user
     */
    int updateByPrimaryKeySelective(User user);

    /** 
     * 
     * @Title insertSelective
     * @Description 插入[用户表]
     * @Copyright	dawdler 	2022-10-11
     * <p> Company: dawdler  </p>
     * @author srchen
     * @date 2022年10月11日 下午9:52:52
     * @version 1.0
     * @param user
     */
    int insertSelective(User user);

    /** 
     * 
     * @Title deleteByPrimaryKey
     * @Description 删除[用户表]
     * @Copyright	dawdler 	2022-10-11
     * <p> Company: dawdler  </p>
     * @author srchen
     * @date 2022年10月11日 下午9:52:52
     * @version 1.0
     * @param userid	userid
     */
    int deleteByPrimaryKey(Integer userid);
}