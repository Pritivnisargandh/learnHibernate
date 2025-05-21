package com.tka.Enity;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.CriteriaQuery;
import org.hibernate.criterion.Restrictions;
//session=connection
public class HibernateConfiguration {
public static void main(String[] args) {

	Configuration cfg=new Configuration().configure();
	cfg.addAnnotatedClass(Song.class);
	SessionFactory factory=cfg.buildSessionFactory();//reading the hibernate.cfg.xml
	Session session=factory.openSession();
	Criteria criteria=session.createCriteria(Song.class);
	criteria.add(Restrictions.eq("songName", "abc")).add(Restrictions.gt("songid", 2));
	List<Song>  list =criteria.list();
	for (Song song : list) {
		System.out.println(song);
	}
}
}
