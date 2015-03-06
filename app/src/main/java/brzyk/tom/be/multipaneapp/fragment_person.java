package brzyk.tom.be.multipaneapp;


import android.app.Activity;
import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;


/**
 * A simple {@link Fragment} subclass.
 */
public class fragment_person extends Fragment {
    private ListView lv;
    private PersonAdapter adapter;
    private List<Person> list;
    private OnPersonSelectedListener listener;
    private Person person;

    public interface OnPersonSelectedListener{
        public void showPerson(String person);


    }

    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        if(activity instanceof OnPersonSelectedListener){
            listener = (OnPersonSelectedListener) activity;

        }


        else {
            throw new ClassCastException(activity.toString() + "must implemnt the framentperson.onpersonSelectedlisteren");
        }
    }

    public fragment_person() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        list = new ArrayList<>();
        list.add(new Person(54, "Jos"));
        list.add(new Person(63, "Erik"));
        list.add(new Person(22, "Seppe"));
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_person, container, false);
        lv= (ListView) view.findViewById(R.id.listView);
        adapter = new PersonAdapter(list, getActivity());
        lv.setAdapter(adapter);
        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                person = (Person)parent.getItemAtPosition(position);
                listener.showPerson(person.toString());
            }
        });
        return view;
    }


}
