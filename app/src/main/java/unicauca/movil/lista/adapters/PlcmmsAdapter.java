package unicauca.movil.lista.adapters;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.ArrayList;
import java.util.List;

import unicauca.movil.lista.R;
import unicauca.movil.lista.models.PLCmms;

/**
 * Created by Dario Chamorro on 22/12/2016.
 */

public class PlcmmsAdapter extends RecyclerView.Adapter<PlcmmsAdapter.PlcmmsViewHolder>  {

    private LayoutInflater inflater;
    private List<PLCmms> data;

    public PlcmmsAdapter(LayoutInflater inflater) {
        this.inflater = inflater;
        data = new ArrayList<>();
    }

    @Override
    public PlcmmsViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = inflater.inflate(R.layout.activity_main, parent, false);
        PlcmmsViewHolder viewHolder = new PlcmmsViewHolder(v);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(PlcmmsViewHolder holder, int position) {
        PLCmms plCmms = data.get(position);
        holder.name.setText(plCmms.getNombre());
        holder.description.setText(plCmms.getDescripcion());
    }

    @Override
    public int getItemCount() {
        return data.size();
    }

    public void setData(List<PLCmms> data) {
        this.data = data;
        notifyDataSetChanged();
    }

    static class PlcmmsViewHolder extends RecyclerView.ViewHolder{

        TextView name, description;

        public PlcmmsViewHolder(View itemView) {
            super(itemView);

            name = (TextView) itemView.findViewById(R.id.name);
            description = (TextView) itemView.findViewById(R.id.description);
        }
    }

}
