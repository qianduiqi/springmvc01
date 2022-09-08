package test;

import com.itheima.dao.DeptDao;
import com.itheima.dao.EmplDao;
import com.itheima.dao.TagDao;
import com.itheima.dao.UserDao;
import com.itheima.domain.Dept;
import com.itheima.domain.Empl;
import com.itheima.domain.Tag;
import com.itheima.domain.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;


import java.io.IOException;
import java.io.InputStream;
import java.util.List;


public class UserTest {
    @Test
    public void test01() throws IOException {
        InputStream sqlMapConfig = Resources.getResourceAsStream("sqlMapConfig.xml");
        SqlSessionFactory sqlSessionFactory=new SqlSessionFactoryBuilder().build(sqlMapConfig);
        SqlSession sqlSession = sqlSessionFactory.openSession();
        EmplDao mapper = sqlSession.getMapper(EmplDao.class);
        Empl empl=new Empl();
        empl.setName("xxxxxx");
        mapper.addTest(empl,2);
        sqlSession.close();


    }
}
