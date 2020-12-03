package com.example.aplicacion.ui.home;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import com.example.aplicacion.Presenter.Servicios.MiServicioGPS;
import com.example.aplicacion.R;

public class HomeFragment extends Fragment {
    MiServicioGPS miServicio;
    private HomeViewModel homeViewModel;
    TextView prueba;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        homeViewModel =
                new ViewModelProvider(this).get(HomeViewModel.class);
        View root = inflater.inflate(R.layout.fragment_home, container, false);

        //miServicio = new MiServicioGPS(getActivity().getApplicationContext());
        prueba = (TextView)root.findViewById(R.id.text_home);
        //miServicio.setView(prueba);
        return root;
    }
}