package appewtc.masterung.newssrodegat;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

public class DetailActivity extends AppCompatActivity {

    private TextView headTextView, detailTextView, dateTextView, ownerTextView;
    private ImageView myImageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        //Bind Widget
        bindWidget();

        //Show View
        showView();

    }   // onCreate

    private void showView() {

        //Show Head
        String strHead = getIntent().getStringExtra("Head");
        headTextView.setText(strHead);

        //Show Image
        String strImage = getIntent().getStringExtra("Image");
        Picasso.with(DetailActivity.this)
                .load(strImage).resize(500, 600)
                .into(myImageView);

        //Show Detail
        String strDetail = getIntent().getStringExtra("Detail");
        detailTextView.setText(strDetail);

        //Show Date
        String strDate = getIntent().getStringExtra("Date");
        dateTextView.setText(strDate);

        //Show Owner
        String strOwner = getIntent().getStringExtra("Owner");
        ownerTextView.setText(strOwner);

    }   // showView

    private void bindWidget() {
        headTextView = (TextView) findViewById(R.id.txtDetailHead);
        myImageView = (ImageView) findViewById(R.id.imvDeailShow);
        detailTextView = (TextView) findViewById(R.id.txtDetailShow);
        dateTextView = (TextView) findViewById(R.id.txtDataDetail);
        ownerTextView = (TextView) findViewById(R.id.txtOwnerDetail);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_detail, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
