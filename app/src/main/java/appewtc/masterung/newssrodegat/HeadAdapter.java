package appewtc.masterung.newssrodegat;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

/**
 * Created by masterUNG on 8/28/15 AD.
 */
public class HeadAdapter extends BaseAdapter{

    //Explicit
    private Context objContext;
    private String[] headStrings, dateStrings, ownerStrings, sourceImageStrings;

    public HeadAdapter(Context objContext, String[] headStrings, String[] dateStrings, String[] ownerStrings, String[] sourceImageStrings) {
        this.objContext = objContext;
        this.headStrings = headStrings;
        this.dateStrings = dateStrings;
        this.ownerStrings = ownerStrings;
        this.sourceImageStrings = sourceImageStrings;
    }

    @Override
    public int getCount() {
        return headStrings.length;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {

        LayoutInflater objLayoutInflater = (LayoutInflater) objContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View objView1 = objLayoutInflater.inflate(R.layout.head_listview, viewGroup, false);

        //Show Head
        TextView headTextView = (TextView) objView1.findViewById(R.id.txtShowHead);
        headTextView.setText(headStrings[i]);

        //Show Date
        TextView dateTextView = (TextView) objView1.findViewById(R.id.txtShowDate);
        dateTextView.setText(dateStrings[i]);

        //Show Owner
        TextView ownerTextView = (TextView) objView1.findViewById(R.id.txtShowOwner);
        ownerTextView.setText(ownerStrings[i]);

        //Show Icon
        ImageView iconImageView = (ImageView) objView1.findViewById(R.id.imvShowIcon);
        Picasso.with(objContext).load(sourceImageStrings[i]).into(iconImageView);

        return objView1;
    }   // getView

}   // Main Class
