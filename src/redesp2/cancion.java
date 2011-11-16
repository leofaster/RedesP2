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
public String extApp;
public String genre;

    public cancion(String location, String title, String creator, String album, String extApp, String genre) {
        this.location = location;
        this.title = title;
        this.creator = creator;
        this.album = album;
        this.extApp = extApp;
        this.genre = genre;
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

    public String getExtApp() {
        return extApp;
    }

    public void setExtApp(String extApp) {
        this.extApp = extApp;
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

    @Override
    public String toString() {
        return "cancion {" + "location=" + location + ", title=" + title +
                ", creator=" + creator + ", album=" + album + ", extApp=" + 
                extApp + ", genre=" + genre + "}" ;
    }


 
 

}
