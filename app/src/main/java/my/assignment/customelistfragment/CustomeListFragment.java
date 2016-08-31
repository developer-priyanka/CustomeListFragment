package my.assignment.customelistfragment;

import android.app.ListFragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

/**
 * Created by root on 8/31/16.
 */

public class CustomeListFragment extends ListFragment {
    private CustomeListAdapter adapter;
    private Item item;
    private ArrayList<Item> itemList=new ArrayList<Item>();



    public CustomeListFragment() {
        super();
    }
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setRetainInstance(true);
        item=new Item("You Tube","You Tube Description",R.drawable.youtube_logo_color);
        itemList.add(item);
        item=new Item("Blogger","Blogger Description",R.drawable.blogger_logo);
        itemList.add(item);
        adapter=new CustomeListAdapter(getActivity(),itemList);
        setListAdapter(adapter);

    }



    }
