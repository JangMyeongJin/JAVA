package ch08.web.userinfo;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import ch08.domain.userinfo.UserInfo;
import ch08.domain.userinfo.dao.UserInfoDao;
import ch08.domain.userinfo.dao.mysql.UserInfoMysqlDao;
import ch08.domain.userinfo.dao.oracle.UserInfoOracelDao;

public class UserInfoClient {
	public static void main(String[] args) throws IOException {
		
		FileInputStream fis = new FileInputStream("db.properties");
		
		Properties prop = new Properties();
		prop.load(fis);
		
		String dbType = prop.getProperty("DBTYPE");
		
		UserInfo userInfo = new UserInfo();
		userInfo.setUserID("user");
		userInfo.setPassword("qwert");
		userInfo.setUserName("Kim");
		
		UserInfoDao userInfoDao = null; 
		
		if(dbType.equals("ORACLE")) {
			userInfoDao = new UserInfoOracelDao();
			
		}else if(dbType.equals("MYSQL")) {
			userInfoDao = new UserInfoMysqlDao();
			
		}else {
			System.out.println("db error");
			return;
		}
		
		userInfoDao.insertUserInfo(userInfo);
		userInfoDao.updateUserInfo(userInfo);
		userInfoDao.deleteUserInfo(userInfo);
	}

}
