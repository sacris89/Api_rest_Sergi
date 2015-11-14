package com.example.sacris.api_rest;

import android.app.Activity;
import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import org.w3c.dom.Text;

public class Adaptador extends ArrayAdapter {

    Activity context;
    github[] dades;

    public Adaptador(Activity context, github[] resource) {
        super(context, R.layout.activity_adaptador, resource);
        this.dades = resource;
        this.context = context;


    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = context.getLayoutInflater();
        View item = inflater.inflate(R.layout.activity_adaptador, null);
        TextView t = (TextView) item.findViewById(R.id.textView);
        t.setText(dades[position].getId());
        TextView t2 = (TextView) item.findViewById(R.id.textView2);
        t2.setText(dades[position].getNom());



        return item;
    }
}
