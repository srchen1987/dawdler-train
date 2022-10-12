package com.dawdler.user.service.impl;

import com.anywide.dawdler.serverplug.db.annotation.DBTransaction.MODE;
import com.anywide.dawdler.serverplug.db.annotation.DBTransaction;
import com.anywide.dawdler.serverplug.db.annotation.Repository;
import com.anywide.dawdler.serverplug.load.bean.Page;
import com.dawdler.user.dao.UserMapper;
import com.dawdler.user.entity.User;
import com.dawdler.user.service.UserService;
import java.util.List;

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
    public List<User> selectPageList(User user, Page page) {
        int rowCount = userMapper.selectPageListCount(user);
        page.setRowCountAndCompute(rowCount);
        List<User> userList = userMapper.selectPageList(user, page);
        return userList;
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