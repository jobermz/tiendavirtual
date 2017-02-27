/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package upc.epe.business.core.tiendavirtual.util;

import java.io.InputStream;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

/**
 *
 * @author pcfx
 */
public class MapperUtil {
    private static SqlSessionFactory sqlSessionFactory;
    private static SqlSession sqlSession;
    
    public static SqlSession getSession() throws Exception {
        if(sqlSessionFactory == null) {
            String resource = "mybatis-config.xml";
            InputStream inputStream = Resources.getResourceAsStream(resource);
            sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        }
        if(sqlSession == null) {
            sqlSession = sqlSessionFactory.openSession();
        }
        return sqlSession;
    }
}
