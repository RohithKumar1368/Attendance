package rohith.attendance;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

public class AttendanceFragment extends Fragment {

    private TextView subjectName ;
    private TextView safeBunkIndicator ;
    private TextView numberBunk ;
    private TextView numberTotal ;

    private Button bunkMinus ;
    private Button bunkPlus ;
    private Button totalMinus ;
    private Button totalPlus ;

    public static final String EXTRA_CRIME = "rohith.attendance.AttendanceFragment" ;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.subject_detail,container,false) ;

        //Wiring up the widgets
        subjectName = (TextView) v.findViewById(R.id.subject_name) ;
        safeBunkIndicator = (TextView) v.findViewById(R.id.safe_bunk_indicator) ;
        numberBunk = (TextView) v.findViewById(R.id.no_of_bunk_textview) ;
        numberTotal = (TextView) v.findViewById(R.id.total_textview) ;

        bunkMinus = (Button) v.findViewById(R.id.bunk_minus_button) ;
        bunkPlus = (Button) v.findViewById(R.id.bunk_plus_button) ;
        totalMinus = (Button) v.findViewById(R.id.total_minus_button) ;
        totalPlus = (Button) v.findViewById(R.id.total_plus_button) ;

        //Setting up listeners for buttons
        bunkMinus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // TODO implement the click on negative button click
            }
        });

        bunkPlus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // TODO implement the click on positive button click
            }
        });

        totalMinus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // TODO implement the click on total minus button
            }
        });

        totalPlus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // TODO implement the click on total plus button
            }
        });

        return v ;
    }
}
