package my.assignment.customelistfragment;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by root on 8/31/16.
 */

public class CustomeListAdapter extends BaseAdapter {
    private ArrayList<Item> data;
    private Context context;
    private LayoutInflater inflater;

    public CustomeListAdapter(Context c,ArrayList<Item> list){
        context=c;
        data=list;
        inflater=(LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public int getCount() {
        return data.size();
    }

    @Override
    public Object getItem(int i) {
        return  data.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {

        ViewHolder holder=new ViewHolder();
        if (view == null) {
            view=(View)inflater.inflate(R.layout.list_item,null);
            holder.ImgView=(ImageView)view.findViewById(R.id.imageView);
            holder.nameView=(TextView)view.findViewById(R.id.name);
            holder.descView=(TextView)view.findViewById(R.id.description);
            holder.ImgView.setImageResource(data.get(i).getId());
            holder.nameView.setText(data.get(i).getName());
            holder.descView.setText(data.get(i).getDesc());
            view.setTag(holder);

        }else{
           holder=(ViewHolder) view.getTag();
        }

        return view;
    }

    public class ViewHolder{
        ImageView ImgView;
        TextView nameView;
        TextView descView;
    }
}
