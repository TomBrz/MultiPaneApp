package brzyk.tom.be.multipaneapp;


import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class fragment_detail extends Fragment {
    private TextView mTxtv_name;


    public fragment_detail() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_detail, container, false);
        return view;
    }
    public void setText(String person){
        mTxtv_name = (TextView) getView().findViewById(R.id.txtv_detail);
        mTxtv_name.setText(person);
    }


}
