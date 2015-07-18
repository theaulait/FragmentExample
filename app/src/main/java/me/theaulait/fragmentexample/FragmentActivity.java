package me.theaulait.fragmentexample;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

/**
 * Created by c4q-vanice on 7/18/15.
 */
public class FragmentActivity extends Fragment {

    public int count = 0;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment, container, false);

        Button button = (Button) view.findViewById(R.id.button);
        final TextView tv = (TextView) view.findViewById(R.id.display);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                count ++;
                tv.setText(String.valueOf(count));
            }
        });

      return view;
    }
}
