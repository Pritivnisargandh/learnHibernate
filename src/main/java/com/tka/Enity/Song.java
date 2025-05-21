package com.tka.Enity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Song {
	@Id
private int songid;
private String songName;
private String singer;


public Song() {
	super();
}


public Song(int songid) {
	super();
	this.songid = songid;
}


public Song(String songName) {
	super();
	this.songName = songName;
}




public Song(String songName, String singer) {
	super();
	this.songName = songName;
	this.singer = singer;
}


public Song(int songid, String songName, String singer) {
	super();
	this.songid = songid;
	this.songName = songName;
	this.singer = singer;
}
public int getSongid() {
	return songid;
}
public void setSongid(int songid) {
	this.songid = songid;
}
public String getSongName() {
	return songName;
}
public void setSongName(String songName) {
	this.songName = songName;
}
public String getSinger() {
	return singer;
}
public void setSinger(String singer) {
	this.singer = singer;
}
@Override
public String toString() {
	return "Song [songid=" + songid + ", songName=" + songName + ", singer=" + singer + "]";
}
}
