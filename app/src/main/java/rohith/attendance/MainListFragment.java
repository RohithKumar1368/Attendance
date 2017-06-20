package rohith.attendance;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.ListFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class MainListFragment extends ListFragment {

    private ArrayList<Subject> subjects ;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View v = super.onCreateView(inflater,container,savedInstanceState) ;

        getActivity().setTitle("Subjects");
        subjects = SubjectLab.get(getActivity()).getSubjects() ;

        SubjectAdapter adapter = new SubjectAdapter(subjects) ;
        setListAdapter(adapter);

        return v ;
    }

    @Override
    public void onListItemClick(ListView l, View v, int position, long id) {
        // Get the Subject from the adapter
        Subject subject = ((SubjectAdapter)getListAdapter()).getItem(position) ;

        //Start the Attendance Activity
        Intent i = new Intent(getActivity(),AttendanceActivity.class) ;
        i.putExtra(AttendanceFragment.EXTRA_CRIME,subject.getSubjectID()) ;
        startActivity(i);
    }

    private class SubjectAdapter extends ArrayAdapter<Subject> {
        public SubjectAdapter(ArrayList<Subject> subjects) {
            super(getActivity(),0,subjects) ;
        }

        public View getView(int position,@Nullable View convertView,@Nullable ViewGroup parent) {
            // If we weren't given a view then inflate this one.
            // Check to see if a recycled view is being passed in.
            if(convertView == null){
                convertView = getActivity().getLayoutInflater().inflate(R.layout.list_item_subject,null) ;
            }

            //Configuring the View for the given (or created) crime
            // Get the object that was clicked
            Subject subject = getItem(position) ;

            TextView subjectTitle = (TextView) convertView.findViewById(R.id.crime_list_title) ;
            subjectTitle.setText(subject.getName());

            TextView subjectPercentage = (TextView) convertView.findViewById(R.id.crime_list_percentage) ;
            subjectPercentage.setText(subject.getCurrentPercentage() + "");

            return convertView ;
        }
    }
}