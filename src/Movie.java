import java.util.Objects;

public class Movie {
    String title;
    int ReleaseDate;
    String genre;
    int ranking;

    public Movie(String title, int releaseDate, String genre, int ranking) {
        this.title = title;
        ReleaseDate = releaseDate;
        this.genre = genre;
        this.ranking = ranking;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getReleaseDate() {
        return ReleaseDate;
    }

    public void setReleaseDate(int releaseDate) {
        ReleaseDate = releaseDate;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public int getRanking() {
        return ranking;
    }

    public void setRanking(int ranking) {
        this.ranking = ranking;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Movie movie = (Movie) o;
        return Objects.equals(title, movie.title);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title);
    }

    @Override
    public String toString() {
        return "Movie{" +
                "title='" + title + '\'' +
                ", ReleaseDate=" + ReleaseDate +
                ", genre='" + genre + '\'' +
                ", ranking=" + ranking +
                '}';
    }
}
