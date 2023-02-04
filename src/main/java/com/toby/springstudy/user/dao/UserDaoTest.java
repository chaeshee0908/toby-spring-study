package com.toby.springstudy.user.dao;

import java.sql.SQLException;

public class UserDaoTest {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        ConnectionMaker connectionMaker = new DConnectionMaker();   // 구현 클래스 결정

        UserDao dao = new UserDao(connectionMaker); // 두 오브젝트 사이의 의존관계 설정 효과
    }
}
