package brzyk.tom.be.multipaneapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.List;

/**
 * Created by TomB on 27/02/2015.
 */
public class PersonAdapter extends BaseAdapter {
    List<Person> list;
    Context context;
    public PersonAdapter(List<Person> list, Context context){
        this.list = list;
        this.context = context;
    }

    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public Person getItem(int position) {
        return list.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = LayoutInflater.from(context);
        if(convertView == null) {
            convertView = inflater.inflate(R.layout.list_item, null);
        }
        TextView mTxtvName = (TextView) convertView.findViewById(R.id.txtv_name);
        TextView mTxtvAge = (TextView) convertView.findViewById(R.id.txtv_age);

        mTxtvName.setText(list.get(position).getPerson());
        mTxtvAge.setText(list.get(position).getAge() + "");
        return convertView;
    }
}
