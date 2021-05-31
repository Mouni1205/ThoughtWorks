import java.util.*;
public class Movie {
    private String title;
    private String studio;
    private String rating;
    Movie(String title,String studio,String rating){
        this.title=title;
        this.studio=studio;
        this.rating=rating;
    }
    Movie(String title,String studio){
        this.title=title;
        this.studio=studio;
        rating="PG";
    }
    public static Movie[] getPG(Movie array[]){
      ArrayList<Movie> pgMovies=new ArrayList<>();
        for(int i=0;i<array.length;i++){
            if(array[i].rating.contains("PG"))
                pgMovies.add(array[i]);
        }
        Movie resultarray[]=new Movie[pgMovies.size()];
        resultarray=pgMovies.toArray(resultarray);
        return resultarray;
    }
    public static void main(String args[]){
        Movie m1=new Movie("Casino Royale","Eon Productions","PG-13");
        Movie m2=new Movie("Shutter Island","ABC productions","U");
        Movie m3=new Movie("Shawshank Redemption","XYZ productions","PG");
        Movie inputArray[]={m1,m2,m3};
        Movie resultArray[]=getPG(inputArray);
        for(int i=0;i<resultArray.length;i++){
            System.out.println(resultArray[i].title);
        }
    }
}
