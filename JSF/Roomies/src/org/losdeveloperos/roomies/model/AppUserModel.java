package org.losdeveloperos.roomies.model;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.losdeveloperos.roomies.db.AppUser;
import org.losdeveloperos.roomies.hibernate.HibernateSession;
import org.losdeveloperos.roomies.hibernate.SQL;

public class AppUserModel {
	
	public static AppUser findByUserName(String userName){
		AppUser user = null;
		Session session = HibernateSession.getSession();
		session.beginTransaction();
		String sql = SQL.getQuery("AppUser", "findByUserName");
		Query query = session.createQuery(sql);
		query.setParameter("user", userName);
		List<AppUser> list = query.list();
		try{
			user = (AppUser)list.get(0);
		}catch(IndexOutOfBoundsException e){
			user = null;
		}
		session.close();
		return user;
	}
}
