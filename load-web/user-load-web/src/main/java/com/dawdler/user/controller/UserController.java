package com.dawdler.user.controller;

import com.anywide.dawdler.clientplug.annotation.Controller;
import com.anywide.dawdler.clientplug.annotation.JsonIgnoreNull;
import com.anywide.dawdler.clientplug.annotation.RequestMapping.RequestMethod;
import com.anywide.dawdler.clientplug.annotation.RequestMapping;
import com.anywide.dawdler.clientplug.annotation.ResponseBody;
import com.anywide.dawdler.clientplug.web.result.BaseResult;
import com.anywide.dawdler.clientplug.web.result.PageResult;
import com.anywide.dawdler.core.annotation.Service;
import com.anywide.dawdler.serverplug.load.bean.Page;
import com.dawdler.user.entity.User;
import com.dawdler.user.service.UserService;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/user")
public class UserController {
    @Service
    private UserService userService;

    /** 
     * 
     * @Title list
     * @Description 查询[用户表]列表
     * @Copyright	dawdler 	2023-1-28
     * <p> Company: dawdler  </p>
     * @author srchen
     * @date 2023年1月28日 上午11:15:42
     * @version 1.0
     * @param pageOn
     * @param row
     * @param user
     */
	@ResponseBody
    @RequestMapping(value="/list", method = RequestMethod.GET)
	@JsonIgnoreNull
    public PageResult<List<User>> list(Integer pageOn, Integer row, User user) {
        Map<String, Object> userMap = userService.selectPageList(user, pageOn, row);
        Page page = (Page)userMap.get("page");
        List<User> userList = (List<User>)userMap.get("userList");
        PageResult<List<User>> pageResult = new PageResult<>(userList, page);
        return pageResult;
    }

    /** 
     * 
     * @Title info
     * @Description 查询[用户表]
     * @Copyright	dawdler 	2023-1-28
     * <p> Company: dawdler  </p>
     * @author srchen
     * @date 2023年1月28日 上午11:15:42
     * @version 1.0
     * @param userid	userid
     */
    @ResponseBody
    @RequestMapping(value="/info", method = RequestMethod.GET)
    public BaseResult<User> info(Integer userid) {
        User user = userService.selectByPrimaryKey(userid);
        BaseResult<User> baseResult = new BaseResult<>(user);
        return baseResult;
    }

    /** 
     * 
     * @Title update
     * @Description 更新[用户表]
     * @Copyright	dawdler 	2023-1-28
     * <p> Company: dawdler  </p>
     * @author srchen
     * @date 2023年1月28日 上午11:15:42
     * @version 1.0
     * @param user
     */
    @ResponseBody
    @RequestMapping(value="/update", method = RequestMethod.POST)
    public BaseResult<String> update(User user) {
        int count = userService.updateByPrimaryKeySelective(user);
        BaseResult<String> baseResult;
        if(count > 0){
         baseResult = new BaseResult<>("更新成功!", true);
        }else{
         baseResult = new BaseResult<>("更新失败!", false);
        }
        return baseResult;
    }

    /** 
     * 
     * @Title insert
     * @Description 插入[用户表]
     * @Copyright	dawdler 	2023-1-28
     * <p> Company: dawdler  </p>
     * @author srchen
     * @date 2023年1月28日 上午11:15:42
     * @version 1.0
     * @param user
     */
    @ResponseBody
    @RequestMapping(value="/insert", method = RequestMethod.POST)
    public BaseResult<String> insert(User user) {
        int count = userService.insertSelective(user);
        BaseResult<String> baseResult;
        if(count > 0){
         baseResult = new BaseResult<>("插入成功!", true);
        }else{
         baseResult = new BaseResult<>("插入失败!", false);
        }
        return baseResult;
    }

    /** 
     * 
     * @Title delete
     * @Description 删除[用户表]
     * @Copyright	dawdler 	2023-1-28
     * <p> Company: dawdler  </p>
     * @author srchen
     * @date 2023年1月28日 上午11:15:42
     * @version 1.0
     * @param userid	userid
     */
    @ResponseBody
    @RequestMapping(value="/delete", method = RequestMethod.POST)
    public BaseResult<String> delete(Integer userid) {
        int count = userService.deleteByPrimaryKey(userid);
        BaseResult<String> baseResult;
        if(count > 0){
         baseResult = new BaseResult<>("删除成功!", true);
        }else{
         baseResult = new BaseResult<>("删除失败!", false);
        }
        return baseResult;
    }
}