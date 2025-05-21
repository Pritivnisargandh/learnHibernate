package com.tka.dao;

import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Projections;

import com.tka.Enity.Song;

public class SongDao {
	public static SessionFactory factory = null;
	public static Session session = null;

	public Session getSession() {
		Configuration configuration = new Configuration().configure();
		configuration.addAnnotatedClass(Song.class);
		factory = configuration.buildSessionFactory();
		session = factory.openSession();
		return session;

	}

	public void SaveSong(Song song) {
		session = getSession();
		Transaction tx = session.getTransaction();
		session.save(song);
		tx.begin();
		tx.commit();

	}

	public void UpdateSong(Song song) {
		session = getSession();
		Transaction tx = session.getTransaction();
		session.update(song);
		tx.begin();
		tx.commit();

	}

	public void delete(Song song) {
		session = getSession();
		Transaction tx = session.getTransaction();
		session.delete(song);
		tx.begin();
		tx.commit();

	}

	public List<Song> viewAllSongs() {
		session = getSession();
		Criteria criteria = session.createCriteria(Song.class);
		List<Song> list = criteria.list();

		return list;
	}

	public Song getSongbyId(int id) {
		session = getSession();
		Song ss = session.load(Song.class, id);
		return ss;
	}

	public List<Object[]> getSongNameList() {
		session = getSession();
		Criteria criteria = session.createCriteria(Song.class)

				.setProjection(Projections.projectionList().add(Projections.property("songName")));
		List<Object[]> songnamelist = criteria.list();

		return songnamelist;
	}

	public void getListofSong() {
		Song songid = new Song();
		for (int i = 0; i < 6; i++) {
			if (i < 6) {
				System.out.println(songid);

			}

		}

	}

}
