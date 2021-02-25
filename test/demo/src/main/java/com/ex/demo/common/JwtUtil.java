package com.ex.demo.common;

import com.auth0.jwt.JWT;
import com.auth0.jwt.JWTVerifier;
import com.auth0.jwt.algorithms.Algorithm;
import com.auth0.jwt.interfaces.DecodedJWT;
import com.ex.demo.pojo.User;

import javax.servlet.http.HttpServletRequest;
import java.util.Date;

public class JwtUtil {

    // Token过期时间
    public static final long EXPIRE_TIME = 60 * 60 * 1000;

    /* *
     *校验token是否正确
     * @Return boolean
     */
    public static boolean verify(User user) {
        String token = user.getUToken();
        String username = user.getUserName();
        String secret = user.getUserPwd();
        try {
            // 设置加密算法
            Algorithm algorithm = Algorithm.HMAC256(secret);
            JWTVerifier verifier = JWT.require(algorithm)
                    .withClaim("username", username)
                    .build();
            // 效验TOKEN
            DecodedJWT jwt = verifier.verify(token);
            return true;
        } catch (Exception exception) {
            return false;
        }
    }


    /* *
     * 生成签名,60min后过期
     * @Return java.lang.String
     */
    public static User sign(User user) {
        String username = user.getUserName();
        String secret = user.getUserPwd();
        Integer userId = user.getUserId();
        Date createDate = new Date();
        Date date = new Date(System.currentTimeMillis() + EXPIRE_TIME);
        Algorithm algorithm = Algorithm.HMAC256(secret);
        // 附带username信息
        String uToken = JWT.create()
                .withAudience(userId.toString())
                .withClaim("userId", userId)
                .withClaim("username", username)
                .withIssuedAt(createDate)
                .withExpiresAt(date)
                .sign(algorithm);
        user.setUToken(uToken);
        user.setUTokenCreatetime(createDate);
        user.setUTokenOvertime(date);
        return user;
    }

    public static String getUserNameByToken(HttpServletRequest request) {
        String token = request.getHeader("token");
        DecodedJWT jwt = JWT.decode(token);
        return jwt.getClaim("username")
                .asString();
    }
}
