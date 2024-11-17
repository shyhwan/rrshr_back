package com.example.hr.system.dao;

import org.apache.ibatis.session.SqlSession;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;

@Repository("commonDAO")
public class CommonDAO {

    @Autowired
    private SqlSession sqlSession;

    public int insert(String queryId, Map<String, Object> paramMap) {
        int retCnt = sqlSession.insert(queryId, paramMap);
        return retCnt;
    }
}
