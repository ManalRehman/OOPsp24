import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Movie>movies=new ArrayList<>();
        System.out.println(movies.isEmpty());
        System.out.println(movies.size());
        movies.add(new Movie("Enola Holmes 2",2022,"Mystery",8));
        movies.add(new Movie("Bird Box",2021,"Drama",7));
        movies.add(new Movie("Knives Out",2020,"Thriller",9));

        for(Movie  temp: movies){
            System.out.println(temp);
        }
        movies.remove(new Movie("Bird Box",2021,"Drama",7));
        //movies.remove(1);

        System.out.println("remove");
        for(Movie  temp: movies){
            System.out.println(temp);
        }
        movies.set(0,new Movie("Harry Potter",2001,"Fiction",6));
        System.out.println("Updated");
        for(Movie  temp: movies){
            System.out.println(temp);
        }

        for(Movie  temp: movies){
            int i=temp.getRanking();
            i=i+1;
            temp.setRanking((i));
        }
        System.out.println("incrementing of ranking");
        for(Movie  temp: movies){
            System.out.println(temp);
        }

        System.out.println("index of this object : "+movies.indexOf(new Movie("Knives Out",2020,"Thriller",9)));
    }
}