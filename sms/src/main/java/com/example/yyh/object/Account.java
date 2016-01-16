package com.example.yyh.object;

/**
 * Created by Administrator on 2016/1/11.
 * 通道抽象类
 */
public class Account {
    private String channel;
    private String ip;
    private int port;
    private String username;
    private String password;
    private String desc;

    public Account(String channel,String ip,int port,String username,String password,String desc){
        this.channel = channel;
        this.ip = ip;
        this.port = port;
        this.username = username;
        this.password = password;
        this.desc = desc;
    }

    public void setPort(int port) {
        this.port = port;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public void setChannel(String channel) {
        this.channel = channel;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getChannel() {

        return channel;
    }

    public String getIp() {
        return ip;
    }

    public int getPort() {
        return port;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String getDesc() {
        return desc;
    }
}
