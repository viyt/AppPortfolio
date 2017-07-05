package cf.javadev.appportfolio;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainFragment extends Fragment {

    public MainFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_main, container, false);
        Button buttonPopularMovies = (Button) view.findViewById(R.id.btnPopularMovies);
        buttonPopularMovies.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showShortToastMessage(R.string.msg_movies);
            }
        });

        Button buttonStockHawk = (Button) view.findViewById(R.id.btnStockHawk);
        buttonStockHawk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showShortToastMessage(R.string.msg_stock_hawk);
            }
        });

        Button buttonBuildBigger = (Button) view.findViewById(R.id.btnBuildBigger);
        buttonBuildBigger.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showShortToastMessage(R.string.msg_build_bigger);
            }
        });

        Button buttonMakeAppMaterial = (Button) view.findViewById(R.id.btnMakeAppMaterial);
        buttonMakeAppMaterial.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showShortToastMessage(R.string.msg_app_material);
            }
        });

        Button buttonUbiquitous = (Button) view.findViewById(R.id.btnUbiquitous);
        buttonUbiquitous.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showShortToastMessage(R.string.msg_ubiquitous);
            }
        });

        Button buttonCapstone = (Button) view.findViewById(R.id.btnCapstone);
        buttonCapstone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showShortToastMessage(R.string.msg_capstone);
            }
        });

        return view;
    }

    private void showShortToastMessage(int resourceId) {
        String message = getResources().getString(resourceId);
        Toast toast = Toast.makeText(this.getContext(), message, Toast.LENGTH_SHORT);
        TextView textView = (TextView) toast.getView().findViewById(android.R.id.message);
        if (textView != null) {
            textView.setGravity(Gravity.CENTER);
        }
        toast.show();
    }
}
