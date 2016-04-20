package fragments;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import com.evasa.evasa.MainActivity;
import com.evasa.evasa.R;



/**
 * Created by diego on 13/04/16.
 */
public class ControlOperativo extends Fragment {
    private static final String TAG_FRAGMENT = "ControlOperativo" ;
    private ViewPager viewPager;

    public ControlOperativo(){
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View evenfragment = inflater.inflate(R.layout.layout_control_operativo, container, false);
        Spinner spinner_animales = (Spinner) evenfragment.findViewById(R.id.spinnerFecha);
        ArrayAdapter spinner_adapter = ArrayAdapter.createFromResource( evenfragment.getContext(), R.array.fecha , android.R.layout.simple_spinner_item);
        spinner_adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner_animales.setAdapter(spinner_adapter);


        Spinner spinnerEmsefor = (Spinner) evenfragment.findViewById(R.id.spinnerEmsefor);
        ArrayAdapter spinner_adapter1 = ArrayAdapter.createFromResource( evenfragment.getContext(), R.array.EMSEFOR , android.R.layout.simple_spinner_item);
        spinner_adapter1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnerEmsefor.setAdapter(spinner_adapter1);

        Spinner spinnerEncargado = (Spinner) evenfragment.findViewById(R.id.spinnerEncargado);
        ArrayAdapter spinner_adapter2 = ArrayAdapter.createFromResource( evenfragment.getContext(), R.array.Encargado , android.R.layout.simple_spinner_item);
        spinner_adapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnerEncargado.setAdapter(spinner_adapter2);

        Spinner spinnerPredio = (Spinner) evenfragment.findViewById(R.id.spinnerPredio);
        ArrayAdapter spinner_adapter3 = ArrayAdapter.createFromResource( evenfragment.getContext(), R.array.Predio , android.R.layout.simple_spinner_item);
        spinner_adapter3.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnerPredio.setAdapter(spinner_adapter3);

        Spinner spinnerArea = (Spinner) evenfragment.findViewById(R.id.spinnerArea);
        ArrayAdapter spinner_adapter4 = ArrayAdapter.createFromResource( evenfragment.getContext(), R.array.Area , android.R.layout.simple_spinner_item);
        spinner_adapter4.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnerArea.setAdapter(spinner_adapter4);

        Spinner spinnerActividad = (Spinner) evenfragment.findViewById(R.id.spinnerActividad);
        ArrayAdapter spinner_adapter5 = ArrayAdapter.createFromResource( evenfragment.getContext(), R.array.Actividad , android.R.layout.simple_spinner_item);
        spinner_adapter5.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnerActividad.setAdapter(spinner_adapter5);

        Spinner spinnerAsesor = (Spinner) evenfragment.findViewById(R.id.spinnerAsesorde);
        ArrayAdapter spinner_adapter6 = ArrayAdapter.createFromResource( evenfragment.getContext(), R.array.Asesorde , android.R.layout.simple_spinner_item);
        spinner_adapter6.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnerAsesor.setAdapter(spinner_adapter6);

        Spinner spinnerCantPersonal = (Spinner) evenfragment.findViewById(R.id.spinnerCantPersonal);
        ArrayAdapter spinner_adapter7 = ArrayAdapter.createFromResource( evenfragment.getContext(), R.array.CantidadPersonal , android.R.layout.simple_spinner_item);
        spinner_adapter7.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnerCantPersonal.setAdapter(spinner_adapter7);

        FloatingActionButton fab = (FloatingActionButton) evenfragment.findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ((MainActivity)getActivity()).setCurrentItem(1, true);
            }
        });

        return evenfragment;


    }


}
