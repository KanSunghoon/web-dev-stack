package com.kh.practice3.controller;

import java.util.ArrayList;
import java.util.Collections;

import com.kh.practice3.compare.SongAscending;
import com.kh.practice3.model.Music;

public class MusicController {

	private ArrayList<Music> list = new ArrayList<>();
	// 메서드 리턴타입, 파라미터 받는 부분 자유!
	
	//1. 특정 곡 추가
	public boolean addList(String artist, String song) {
		for(Music music : list) {
			if(music.getSong().equals(song) && music.getArtist().equals(artist)) {
				return false;
			}
		}
		if(artist.trim().equals("") || song.trim().equals("")) {
			return false;
		}
		return list.add(new Music(artist, song));
	}		
	
	//2. 전체 곡 목록 출력
	public ArrayList<Music> printAll() {
		return list;
	}
	
	//3. 특정 곡 검색
	public ArrayList<Music> searchMusic(String keyword) {
		ArrayList<Music> result = new ArrayList<>();
		// contains
		for(Music music : list) {
			if(music.getSong().toLowerCase().contains(keyword.toLowerCase()) || music.getArtist().toLowerCase().contains(keyword.toLowerCase())) {
				result.add(music);
			}
		}
		return null;
	}
	
	// 곡 검색 시 중복된 경우
	public ArrayList<Music> checkMusic(String song) {
		ArrayList<Music> result = new ArrayList<>();
		for(Music music : list) {
			if(music.getSong().equals(song)) {
				result.add(music);
			}
		}
		return result;
	}
	
	//4. 특정 곡 수정 -> 1개인 경우, 여러개인 경우
	public Music updateMusic(String searchSong, String searchArtist, Music update) {
		// set
		for(Music music : list) {
			boolean chekSong = music.getSong().equals(searchSong);
			boolean chekArtist = music.getArtist().equals(searchArtist);
			
			if(searchArtist == null && music.getSong().equals(searchSong)) {
				return list.set(list.indexOf(music), update);
			} else if(music.getSong().equals(searchSong) && music.getArtist().equals(searchArtist)) {
				return list.set(list.indexOf(music), update);
			}
			
	    }
		return null;
	}
	
	//5. 특정 곡 삭제
	public Music removeMusic(String song, String artist) {
		// remove
		for(Music music : list) {
			if(artist == null && music.getSong().equals(song) || music.getSong().equals(song) && music.getArtist().equals(artist)) {
				return list.remove(list.indexOf(music));
			}
		}
		return null;
	}
	
	// 가수명 내림차순
	public ArrayList<Music> descArtist() {
		ArrayList<Music> clone = (ArrayList<Music>)list.clone();
		Collections.sort(clone);
		Collections.reverse(clone);
		return clone;
	}
	
	// 곡명 오름차순
	public ArrayList<Music> ascSong() {
		ArrayList<Music> clone = (ArrayList<Music>) list.clone();
		Collections.sort(clone, new SongAscending());
		return clone;
	}
	
	public Music removeMusic(String song) {
	    return removeMusic(song, null);
	}
	
}