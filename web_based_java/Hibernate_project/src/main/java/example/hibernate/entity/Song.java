package example.hibernate.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Song_Master")
public class Song {
	@Id
	@Column(name="song_id",length=4)
	private String SongId;
	@Column(name="song_title",length=50)
	private String title;
	
	
	
	public Song() {
		super();
	}



	public Song(String songId, String title) {
		super();
		SongId = songId;
		this.title = title;
	}
	
	
	
	public String getSongId() {
		return SongId;
	}
	public void setSongId(String songId) {
		SongId = songId;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}

	@Override
	public String toString() {
		return "Song [SongId=" + SongId + ", title=" + title + "]";
	}

}
