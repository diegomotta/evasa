package fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.evasa.evasa.R;

/**
 * Created by diego on 20/04/16.
 */
public class ControlOperativoTercero extends Fragment {

    public ControlOperativoTercero() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View evenfragment = inflater.inflate(R.layout.layout_control_operativo_3, container, false);
        return evenfragment;
    }
}
