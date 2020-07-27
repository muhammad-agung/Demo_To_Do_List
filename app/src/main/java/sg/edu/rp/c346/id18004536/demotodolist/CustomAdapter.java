package sg.edu.rp.c346.id18004536.demotodolist;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Calendar;

public class CustomAdapter extends ArrayAdapter {

    Context parent_context;
    int layout_id;
    ArrayList<ToDo> todoList;


    public CustomAdapter(Context context, int resource, ArrayList<ToDo> objects){
        super(context, resource, objects);

        parent_context = context;
        layout_id = resource;
        todoList = objects;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Obtain the LayoutInflater object\\//layout inflater shows XML file
        LayoutInflater inflater = (LayoutInflater) parent_context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        // "Inflate" the View for each row
        View rowView = inflater.inflate(layout_id, parent, false);

        // Obtain the UI components and do the necessary binding
        TextView tvName = rowView.findViewById(R.id.TvName);
        TextView tvTime = rowView.findViewById(R.id.tvTime);

        // Obtain the Android Version information based on the position
        ToDo currentTodo = todoList.get(position);

        // Set values to the TextView to display the corresponding information
        tvName.setText(currentTodo.getName());
        tvTime.setText(currentTodo.toString() +" ("+ currentTodo.getDay(currentTodo.getTime().get(Calendar.DAY_OF_WEEK))+")");


        return rowView;
    }

}