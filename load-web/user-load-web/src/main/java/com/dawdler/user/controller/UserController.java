package com.dawdler.user.controller;

import java.util.List;

import com.anywide.dawdler.clientplug.annotation.Controller;
import com.anywide.dawdler.clientplug.annotation.PathVariable;
import com.anywide.dawdler.clientplug.annotation.RequestMapping;
import com.anywide.dawdler.clientplug.annotation.RequestMapping.RequestMethod;
import com.anywide.dawdler.clientplug.annotation.ResponseBody;
import com.anywide.dawdler.clientplug.web.result.BaseResult;
import com.anywide.dawdler.clientplug.web.result.PageResult;
import com.anywide.dawdler.core.annotation.Service;
import com.anywide.dawdler.serverplug.load.bean.Page;
import com.dawdler.user.entity.User;
import com.dawdler.user.service.UserService;

@Controller
@RequestMapping("/user")
public class UserController {
    @Service
    private UserService userService;

    /** 
     * 
     * @Title list
     * @Description 查询[用户表]列表
     * @Copyright	dawdler 	2022-10-11
     * <p> Company: dawdler  </p>
     * @author srchen
     * @date 2022年10月11日 下午9:52:52
     * @version 1.0
     * @param pageOn
     * @param row
     * @param head 一个头
     * @param user
     */
    @ResponseBody
    @RequestMapping(value="/list", method = RequestMethod.GET)
    public PageResult<List<User>> list(int pageOn, int row, String head ,User user) {
        Page page = new Page(pageOn, row);
        List<User> userList = userService.selectPageList(user, page);
        PageResult<List<User>> pageResult = new PageResult<>(userList, page, true);
        return pageResult;
    }

    /** 
     * 
     * @Title info
     * @Description 查询[用户表]
     * @Copyright	dawdler 	2022-10-11
     * <p> Company: dawdler  </p>
     * @author srchen
     * @date 2022年10月11日 下午9:52:52
     * @version 1.0
     * @param userid	userid
     * @param id	  用户id
     */
    @ResponseBody
    @RequestMapping(value="/info/{id}", method = RequestMethod.GET)
    public BaseResult<User> info(Integer userid,@PathVariable("id") int id) {
        User user = userService.selectByPrimaryKey(userid);
        BaseResult<User> baseResult = new BaseResult<>(user);
//        test(baseResult.getData());
        return baseResult;
    }
    
    public void test(User user) {
    	user.setNickname("jackson.song123144321321");
    	
    }

    /** 
     * 
     * @Title update
     * @Description 更新[用户表]
     * @Copyright	dawdler 	2022-10-11
     * <p> Company: dawdler  </p>
     * @author srchen
     * @date 2022年10月11日 下午9:52:52
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
     * @Copyright	dawdler 	2022-10-11
     * <p> Company: dawdler  </p>
     * @author srchen
     * @date 2022年10月11日 下午9:52:52
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
     * @Copyright	dawdler 	2022-10-11
     * <p> Company: dawdler  </p>
     * @author srchen
     * @date 2022年10月11日 下午9:52:52
     * @version 1.0
     * @param userid	userid
     */
    @ResponseBody
    @RequestMapping(value="/delete", method = RequestMethod.POST)
    public BaseResult<String> delete(Integer userid) {
        int count = userService.deleteByPrimaryKey(userid);
        BaseResult<String> baseResult;
        if(count > 0){
         baseResult = new BaseResult<>("插入成功!", true);
        }else{
         baseResult = new BaseResult<>("插入失败!", false);
        }
        return baseResult;
    }
}