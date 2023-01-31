package com.dawdler.user.service.impl;

import com.anywide.dawdler.serverplug.db.annotation.DBTransaction.MODE;
import com.anywide.dawdler.serverplug.db.annotation.DBTransaction;
import com.anywide.dawdler.serverplug.db.annotation.Repository;
import com.anywide.dawdler.serverplug.load.bean.Page;
import com.dawdler.user.dao.UserMapper;
import com.dawdler.user.entity.User;
import com.dawdler.user.service.UserService;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UserServiceImpl implements UserService {
    @Repository
    private UserMapper userMapper;

    @Override
    @DBTransaction(mode=MODE.readOnly)
    public User selectByPrimaryKey(Integer userid) {
        return userMapper.selectByPrimaryKey(userid);
    }

    @Override
    @DBTransaction(mode=MODE.readOnly)
    public Map<String, Object> selectPageList(User user, Integer pageOn, Integer row) {
        int rowCount = userMapper.selectPageListCount(user);
        Page page = new Page(pageOn, row);
        page.setRowCountAndCompute(rowCount);
        List<User> userList = userMapper.selectPageList(user, page);
        Map<String, Object> result = new HashMap<>();
        result.put("page", page);
        result.put("userList", userList);
        return result;
    }

    @Override
    @DBTransaction(mode=MODE.forceReadOnWrite)
    public int updateByPrimaryKeySelective(User user) {
        return userMapper.updateByPrimaryKeySelective(user);
    }

    @Override
    @DBTransaction(mode=MODE.forceReadOnWrite)
    public int insertSelective(User user) {
        return userMapper.insertSelective(user);
    }

    @Override
    @DBTransaction(mode=MODE.forceReadOnWrite)
    public int deleteByPrimaryKey(Integer userid) {
        return userMapper.deleteByPrimaryKey(userid);
    }
}