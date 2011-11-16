/*
 * To change this template, choose Tools | Templates and open the template in
 * the editor.
 */
package redesp2;

/**
 *
 * @author leofaster
 */
public class cancion {
public String location;
public String title;
public String creator;
public String album;
public String genre;
public String ip;
public String id;

    public cancion() {
    }

    public cancion(String location, String title, String creator, String album, String genre, String ip, String id) {
        this.location = location;
        this.title = title;
        this.creator = creator;
        this.album = album;
        this.genre = genre;
        this.ip = ip;
        this.id = id;
    }


  

    public String getAlbum() {
        return album;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator;
    }


    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }
    
    

    @Override
    public String toString() {
        return "cancion {" + "location=" + location + ", title=" + title +
                ", creator=" + creator + ", album=" + album + ", genre=" + genre + "}" ;
    }


 
 

}
