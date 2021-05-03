package com.fridge.model;

import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import io.swagger.v3.oas.annotations.media.Schema;

@Table(name = "post")
@Entity
public class Post {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Schema(title = "게시글 번호 (PK)")
	int id;
	@Schema(title = "게시글 제목")
	String title;
	@Schema(title = "게시글 내용")
	String contents;
	@Schema(title = "게시글 작성일")
	LocalDateTime date;
	@Schema(title = "게시글 이미지 개수")
	int imagecnt;
	@Schema(title = "게시글 조회수")
	int visit;
	@Schema(title = "게시글 좋아요 수")
	int good;
	@Schema(title = "개시글 싫어요 수")
	int hate;
	@Schema(title = "게시글 작성자(nickname)")
	String user_name;
	@ManyToOne
	@Schema(title = "user table과의 FK")
	private User user;

	protected Post() {
		super();
	}
	
	public Post(String title, int imageCnt, String user_name, User user) {
		this.title = title;
		this.contents = "";
		this.date = LocalDateTime.now();
		this.imagecnt = imageCnt;
		this.user_name = user_name;
		this.user = user;
	}

	public int getId() {
		return id;
	}

	public String getTitle() {
		return title;
	}

	public String getContents() {
		return contents;
	}

	public LocalDateTime getDate() {
		return date;
	}

	public int getImagecnt() {
		return imagecnt;
	}

	public int getVisit() {
		return visit;
	}

	public int getGood() {
		return good;
	}

	public int getHate() {
		return hate;
	}

	public String getUser_name() {
		return user_name;
	}

	public User getUser() {
		return user;
	}

	@Override
	public String toString() {
		return "Post [id=" + id + ", title=" + title + ", contents=" + contents + ", date=" + date + ", imagecnt="
				+ imagecnt + ", visit=" + visit + ", good=" + good + ", hate=" + hate + ", user_name=" + user_name
				+ ", user=" + user + "]";
	}

}
