package ch08.domain.userinfo.dao.oracle;

import ch08.domain.userinfo.UserInfo;
import ch08.domain.userinfo.dao.UserInfoDao;

public class UserInfoOracelDao implements UserInfoDao {

	@Override
	public void insertUserInfo(UserInfo userinfo) {

		System.out.println("inser into Oracle DB userID = " + userinfo.getUserID());
	}

	@Override
	public void updateUserInfo(UserInfo userinfo) {
		
		System.out.println("update into Oracle DB userID = " + userinfo.getUserID());		
	}

	@Override
	public void deleteUserInfo(UserInfo userinfo) {

		System.out.println("delete from Oracle DB userID = " + userinfo.getUserID());
	}

}
