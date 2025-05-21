package com.tka.service;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Transaction;

import com.tka.Enity.Song;
import com.tka.dao.SongDao;

public class SongService {
	SongDao dao=new SongDao();
	public void SaveSong(Song song)
	{
		dao.SaveSong(song);
		
	}
	public void UpdateSong(Song song)
	{
	dao.UpdateSong(song);
		
	}
	public void delete(Song song)
	{
		dao.delete(song);
		
	}
	public void viewAllSongs()
	{
		List<Song> ll=dao.viewAllSongs();
		for (Song song : ll) {
			System.out.println(song);
		}
	}
	public Song getSongbyId(int  id)
	{
		Song songs=dao.getSongbyId(id);
		System.out.println(songs);
		return songs;
	}
}
