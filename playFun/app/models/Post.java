package models;

import java.util.ArrayList;
import java.util.Date;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Lob;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.swing.text.html.HTML.Tag;

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