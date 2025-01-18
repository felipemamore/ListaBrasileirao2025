package com.example.listagemdetimes;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.view.LayoutInflater;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.List;

public class ClubAdapter extends ArrayAdapter<Club> {

    ImageView logo;
    TextView clubname;

    public ClubAdapter(Context context, List<Club> clubs) {
        super(context, 0, clubs);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        Club club = getItem(position);
        if (convertView == null){
            convertView = LayoutInflater.from(getContext())
                    .inflate(R.layout.item_club, parent, false);
        }

        logo = convertView.findViewById(R.id.clubLogo);
        clubname = convertView.findViewById(R.id.clubName);

        logo.setImageResource(club.getLogoResId());
        clubname.setText(club.getName());






        return convertView;
    }
}
