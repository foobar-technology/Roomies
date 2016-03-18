package org.losdeveloperos.roomies.model;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.losdeveloperos.roomies.db.AppUser;
import org.losdeveloperos.roomies.hibernate.HibernateSession;
import org.losdeveloperos.roomies.hibernate.SQL;

public class AppUserModel {
	
	public static List<AppUser> findByUserName(String userName){
		Session session = HibernateSession.getSession();
		session.beginTransaction();
		String sql = SQL.getQuery("AppUser", "findByUserName");
		System.out.println(sql);
		Query query = session.createQuery(sql);
		query.setParameter("user", userName);
		List<AppUser> list = query.list();
		session.close();
		return list;
	}
}
