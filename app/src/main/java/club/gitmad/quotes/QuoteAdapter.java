package club.gitmad.quotes;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class QuoteAdapter extends RecyclerView.Adapter<QuoteAdapter.QuoteViewHolder> {
    // This is the dataset to build the recycler view on.
    private List<Quote> quotes;

    public QuoteAdapter(List<Quote> dataset) {
        quotes = dataset;
    }

    public static class QuoteViewHolder extends RecyclerView.ViewHolder {
        public TextView quote;
        public TextView author;
        public QuoteViewHolder(View v) {
            super(v);
            quote = v.findViewById(R.id.quote);
            author = v.findViewById(R.id.author);
        }
    }

    // Create new views (invoked by the layout manager)
    @Override
    public QuoteAdapter.QuoteViewHolder onCreateViewHolder(ViewGroup parent,
                                                         int viewType) {
        // create a new view
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.quote_item, parent, false);

        QuoteViewHolder vh = new QuoteViewHolder(view);
        return vh;
    }

    @Override
    public void onBindViewHolder(QuoteViewHolder holder, int position) {
        // - get quote from the quotes dataset at this position
        // - replace the contents of the view with that element
        holder.quote.setText(quotes.get(position).getQuote());
        holder.author.setText(quotes.get(position).getAuthor());
    }

    // Return the size of the dataset (invoked by the layout manager)
    @Override
    public int getItemCount() {
        return quotes.size();
    }
}
