import java.util.*;

public class book {
    private helper help=new helper();
    String title;
    String author;
    String year_of_publication;

    public void settitle(String name){
        this.title=name;
    }
    public void setauthor(String name){
        this.author=name;
    }
    public void setyear(String year){
        this.year_of_publication=year;
    }


    public String gettitle(){
        return this.title;
    }
    public String getauthor(){
        return this.author;
    }
    public String getyear(){
        return this.year_of_publication;
    }

}
