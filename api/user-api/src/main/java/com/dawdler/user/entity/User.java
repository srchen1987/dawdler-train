package com.dawdler.user.entity;

import java.io.Serializable;

public class User implements Serializable {
    /** userid */
    private Integer userid;

    /** 昵称 */
    private String nickname;

    /** 手机号 */
    private String mobile;

    /** 密码 */
    private String password;

    /** 添加时间 */
    private Integer addtime;

    /** ip地址 */
    private String ipaddress;

    /** 金币 */
    private Double gold;

    /** 真实姓名 */
    private String realname;

    /** 身份证号 */
    private String idcard;

    /** 用户表 */
    private static final long serialVersionUID = 1L;

    /**
     * 获取[userid]
     * @return userid
     */
    public Integer getUserid() {
        return userid;
    }

    /**
     * 设置[userid]
     * @param userid
     */
    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    /**
     * 获取[昵称]
     * @return nickname
     */
    public String getNickname() {
        return nickname;
    }

    /**
     * 设置[昵称]
     * @param nickname
     */
    public void setNickname(String nickname) {
        this.nickname = nickname == null ? null : nickname.trim();
    }

    /**
     * 获取[手机号]
     * @return mobile
     */
    public String getMobile() {
        return mobile;
    }

    /**
     * 设置[手机号]
     * @param mobile
     */
    public void setMobile(String mobile) {
        this.mobile = mobile == null ? null : mobile.trim();
    }

    /**
     * 获取[密码]
     * @return password
     */
    public String getPassword() {
        return password;
    }

    /**
     * 设置[密码]
     * @param password
     */
    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    /**
     * 获取[添加时间]
     * @return addtime
     */
    public Integer getAddtime() {
        return addtime;
    }

    /**
     * 设置[添加时间]
     * @param addtime
     */
    public void setAddtime(Integer addtime) {
        this.addtime = addtime;
    }

    /**
     * 获取[ip地址]
     * @return ipaddress
     */
    public String getIpaddress() {
        return ipaddress;
    }

    /**
     * 设置[ip地址]
     * @param ipaddress
     */
    public void setIpaddress(String ipaddress) {
        this.ipaddress = ipaddress == null ? null : ipaddress.trim();
    }

    /**
     * 获取[金币]
     * @return gold
     */
    public Double getGold() {
        return gold;
    }

    /**
     * 设置[金币]
     * @param gold
     */
    public void setGold(Double gold) {
        this.gold = gold;
    }

    /**
     * 获取[真实姓名]
     * @return realname
     */
    public String getRealname() {
        return realname;
    }

    /**
     * 设置[真实姓名]
     * @param realname
     */
    public void setRealname(String realname) {
        this.realname = realname == null ? null : realname.trim();
    }

    /**
     * 获取[身份证号]
     * @return idcard
     */
    public String getIdcard() {
        return idcard;
    }

    /**
     * 设置[身份证号]
     * @param idcard
     */
    public void setIdcard(String idcard) {
        this.idcard = idcard == null ? null : idcard.trim();
    }
}