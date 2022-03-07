package ch08.domain.userinfo.dao.mysql;

import ch08.domain.userinfo.UserInfo;
import ch08.domain.userinfo.dao.UserInfoDao;

public class UserInfoMysqlDao implements UserInfoDao {

	@Override
	public void insertUserInfo(UserInfo userinfo) {

		System.out.println("inser into Mysql DB userID = " + userinfo.getUserID());
	}

	@Override
	public void updateUserInfo(UserInfo userinfo) {

		System.out.println("update into Mysql DB userID = " + userinfo.getUserID());
	}

	@Override
	public void deleteUserInfo(UserInfo userinfo) {

		System.out.println("delete from Mysql DB userID = " + userinfo.getUserID());
	}

}
