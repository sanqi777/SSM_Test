package com.san.test;


import com.san.dao.ToolDao;


import com.san.domain.Tool;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;



import java.io.InputStream;

import java.util.List;

/**
 * Created by 三七 on 2020/3/21.
 */
public class MybatisTest {
    private InputStream in;
    private SqlSessionFactory factory;
    private SqlSession session;
    private ToolDao toolDao;



    @Test
    public void testFindAll() {
        List<Tool> accounts = toolDao.findAll();
        for(Tool tl : accounts) {
            System.out.println(tl);
            System.out.println(tl.getModel());

        }
    }



    @Before
    public void init() throws Exception {
        //1、读取配置文件
        in = Resources.getResourceAsStream("SqlMapConfig.xml");
        //2、创建sqlSessionFactory的构建对象
        SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
        //3、使用构建者创建工厂对象SqlSessionFactory
        factory = builder.build(in);
        //4、使用SqlSessionFactory生产SqlSession对象
        session = factory.openSession();
        //5、使用SqlSession创建dao接口对象
        toolDao = session.getMapper(ToolDao.class);

    }

    @After
    public void destroy() throws Exception{
        session.commit();
        //释放资源
        session.close();
        in.close();
    }

}
