package com.tensqurare.test;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.JwtBuilder;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;

import java.util.Date;

public class ParseJwtTest {

        public static void main(String[] args) {
            String token="eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIxMzYxMjM0NTYiLCJpYXQiOjE1NzY3NTE1MTgsInJvbGVzIjoidXNlciIsImV4cCI6MTU3Njc1NTExOH0.mUb1uNBQ9lfYGq6Il6EkWESUraSPf4ETPoGWTAcD8eM";
            Claims claims =
                    Jwts.parser().setSigningKey("tensquare").parseClaimsJws(token).getBody();
            System.out.println("id:"+claims.getId());
            System.out.println("subject:"+claims.getSubject());
            System.out.println("IssuedAt:"+claims.getIssuedAt());
        }

}
