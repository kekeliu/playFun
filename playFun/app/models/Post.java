package models;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.*;

import play.data.validation.MaxSize;
import play.db.jpa.Model;

@Entity
public class Post extends Model{

	public String title;
	
	@ManyToOne
	public User author;
	
	@Lob
	@MaxSize(200) 
	public String content;
	public Date postedAt;
	
	public Post(User author, String title, String content){
		this.author = author;
		this.title = title;
		this.content = content;
		this.postedAt = new Date();
	}
}
