package com.rancho.enhancedwiki.Fragment;

import android.app.Fragment;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import com.rancho.enhancedwiki.Adapters.CharacterListAdapter;
import com.rancho.enhancedwiki.Adapters.EventListAdapter;
import com.rancho.enhancedwiki.Entities.CharacterEntity;
import com.rancho.enhancedwiki.Entities.EventEntity;
import com.rancho.enhancedwiki.R;
import com.rancho.enhancedwiki.SQLHelper.DBHelper;

import java.util.ArrayList;

/**
 * Created by Rancho on 23-04-2016.
 */
public class CharacterFragment extends Fragment {
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        //return super.onCreateView(inflater, container, savedInstanceState);

        ((AppCompatActivity) getActivity()).getSupportActionBar().setTitle("Character List");

        View rootView = inflater.inflate(R.layout.fragment_character, container, false);
        ListView lvCharacterName = (ListView) rootView.findViewById(R.id.lvCharacterName);

        DBHelper db = new DBHelper(getActivity().getApplicationContext());
        ArrayList<CharacterEntity> characterList = db.GetAllCharacter();
        db.close();

        CharacterListAdapter adapter = new CharacterListAdapter(getActivity().getApplicationContext(),
                R.layout.character_list, characterList);
        lvCharacterName.setAdapter(adapter);


//        lvNGO.setOnItemClickListener(new AdapterView.OnItemClickListener() {
//            @Override
//            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
//                Intent intent = new Intent(getActivity().getApplicationContext(), NGODetailActivity.class);
//                intent.putExtra("selectedIndex", position);
//                startActivity(intent);
//
//            }
//        });

        return rootView;

    }
}
