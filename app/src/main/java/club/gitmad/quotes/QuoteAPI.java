package club.gitmad.quotes;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface QuoteAPI {
    @GET("quotes.json")
    Call<List<Quote>> getQuotes();
}
