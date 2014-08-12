package herbal.id;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;

public class AboutActivity extends Activity {

	private ListView listView1;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.about_layout);

        listabout weather_data[] = new listabout[]
        {
            new listabout(R.drawable.btg, "Mabrur Roh Bintang J (10650007)"),
            new listabout(R.drawable.fara, "Faradilah Umami (10650042)"),
            new listabout(R.drawable.ihsan, "Ihsan Sinatriya R (106500032)"),
            new listabout(R.drawable.arum, "Arum Mei (10650009)"),
            new listabout(R.drawable.panji, "Panji Patih (10650010)")
        };

        ListaboutAdapter adapter = new ListaboutAdapter(this,
                R.layout.listview_item_row, weather_data);

        listView1 = (ListView)findViewById(R.id.listView1);

        View header = (View)getLayoutInflater().inflate(R.layout.list_view_header_row, null);
        listView1.addHeaderView(header);

        listView1.setAdapter(adapter);
    }
}