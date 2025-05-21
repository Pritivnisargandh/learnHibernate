package com.tka.controller;

import java.util.Scanner;
import com.tka.Enity.Song;
import com.tka.service.SongService;

public class SongController {
	public static void main(String[] args) {
		SongService service = new SongService();
		Scanner sc = new Scanner(System.in);
		System.out.println(
				"Enter a choice \n1.AddSong \n2.UpdateSong \n3.deleteSong \n4.viewAllsongs \n5.GetSongByid \n6.setSongByName");
		int choice = sc.nextInt();
		System.out.println("Hello");
		switch (choice) {
		case 1:
			System.out.println("Enter a SongId,name,Singer");
			Song song = new Song(sc.nextInt(), sc.next(), sc.next());
			service.SaveSong(song);
			break;
		case 2:
			System.out.println("Enter a Song details to update like  SongId,name,Singer");
			Song songu = new Song(sc.nextInt(), sc.next(), sc.next());
			service.UpdateSong(songu);
			break;
		case 3:
			System.out.println("Enter a SongId");
			Song songd = new Song(sc.nextInt());
			service.delete(songd);
			break;
		case 4:
			service.viewAllSongs();
			break;
		case 5:
			System.out.println("Enter a SongId");
			Song songv = new Song(sc.nextInt());
			service.getSongbyId(sc.nextInt());
			break;

		case 6:
			System.out.println("enter songName and SongId");
			Song songj = new Song(sc.nextInt());
			service.getSongbyId(sc.nextInt());
			break;

		case 7:
			SongService service1 = new SongService();

			System.out.println("Enter Id: ");
			int id = sc.nextInt();

			Song song1 = service1.getSongbyId(id); // fetch song by id

			if (id < 8) {
				service1.viewAllSongs(); // display all songs if id < 8
			} else {
				System.out.println("Song Details: " + song1);
			}

			sc.close();
		}

	}

}
