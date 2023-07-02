package Datos;
import com.fasterxml.jackson.annotation.JsonProperty;
public class Root{
    @JsonProperty("albums")
    public Albums albums;
    @JsonProperty("artists")
    public Artists Artists;
    @JsonProperty("episodes")
    public Episodes episodes;
    @JsonProperty("genres")
    public Genres genres;
    @JsonProperty("playlists")
    public Playlists playlists;
    @JsonProperty("podcasts")
    public Podcasts podcasts;
    @JsonProperty("topResults")
    public TopResults topResults;
    @JsonProperty("tracks")
    public Tracks tracks;
    @JsonProperty("users")
    public Users users;
    @JsonProperty("query")
    public String query;
    
}
