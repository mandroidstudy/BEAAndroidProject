package com.epiboly.bea.http.model;

import com.epiboly.bea.util.Cons;

/**
 * @author vemao
 * @time 2023/1/24
 * @describe 节点服务器
 */
public class IntegralServer extends RequestServer{
    @Override
    public String getHost() {
        if (Cons.isDEBUG){
            return "http://117.50.192.232:8080/";
        }
        return "http://117.50.163.220/";
    }
}
