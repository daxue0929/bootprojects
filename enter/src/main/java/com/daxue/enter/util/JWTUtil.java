package com.daxue.enter.util;

import com.auth0.jwt.JWT;
import com.auth0.jwt.algorithms.Algorithm;
import com.daxue.enter.entity.User;

public class JWTUtil {

    public static String getToken(User user) {
        String token= JWT.create().withAudience(String.valueOf(user.getName()))
                .sign(Algorithm.HMAC256(user.getPassword()));
        return token;
    }

    /**
     * Algorithm.HMAC256():使用HS256生成token,密钥则是用户的密码，唯一密钥的话可以保存在服务端。
     * withAudience()存入需要保存在token的信息，这里我把用户ID存入token中
     */

}
