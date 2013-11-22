package models;

import java.util.ArrayList;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;

import play.db.jpa.Model;

@Entity
public class Post extends Model{
	public String title;
	
	@Lob
	public String content;
	public Date postedAt;
	
	public Post(String title, String content){
		this.title = title;
		this.content = content;
		this.postedAt = new Date();
	}
}
