package herbal.id;





import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;




public class IndoherbalActivity extends Activity {
    /** Called when the activity is first created. */
	 @Override
	    public void onCreate(Bundle savedInstanceState) {
	        super.onCreate(savedInstanceState);
	        setContentView(R.layout.dashboard_layout);
	        
	        /**
	         * Creating all buttons instances
	         * */
	        // Dashboard News feed button
	        Button btn_newsfeed = (Button) findViewById(R.id.btn_news_feed);
	        
	        // Dashboard Friends button
	        Button btn_friends = (Button) findViewById(R.id.btn_friends);
	        
	        // Dashboard Messages button
	        Button btn_messages = (Button) findViewById(R.id.btn_messages);
	        
	        // Dashboard Places button
	        Button btn_places = (Button) findViewById(R.id.btn_places);
	        
	       	        /**
	         * Handling all button click events
	         * */
	        
	        // Listening to News Feed button click
	        btn_newsfeed.setOnClickListener(new View.OnClickListener() {
				
			
				public void onClick(View view) {
					// Launching News Feed Screen
					Intent i = new Intent(getApplicationContext(), HerbalActivity.class);
					startActivity(i);
				}
			});
	        
	       // Listening Friends button click
	        btn_friends.setOnClickListener(new View.OnClickListener() {
				
				
				public void onClick(View view) {
					// Launching News Feed Screen
					Intent i = new Intent(getApplicationContext(), HerbalEduActivity.class);
					startActivity(i);
				}
			});
	        
	        // Listening Messages button click
	        btn_messages.setOnClickListener(new View.OnClickListener() {
				
				
				public void onClick(View view) {
					// Launching News Feed Screen
					Intent i = new Intent(getApplicationContext(), bbactivity.class);
					startActivity(i);
				}
			});
	        
	        // Listening to Places button click
	        btn_places.setOnClickListener(new View.OnClickListener() {
				
				
				public void onClick(View view) {
					// Launching News Feed Screen
					Intent i = new Intent(getApplicationContext(), AboutActivity.class);
					startActivity(i);
				}
			});
	        
	       	    }
	}