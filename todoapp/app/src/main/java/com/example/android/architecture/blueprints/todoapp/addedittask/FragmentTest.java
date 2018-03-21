package com.example.android.architecture.blueprints.todoapp.addedittask;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.FloatingActionButton;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;
import com.example.android.architecture.blueprints.todoapp.R;
import dagger.android.support.DaggerFragment;
import javax.inject.Inject;

/**
 * Created by cafer.kaya on 20.03.2018.
 */

public class FragmentTest extends DaggerFragment {

  @Inject Integer someInteger;

  @Override public void onActivityCreated(Bundle savedInstanceState) {
    super.onActivityCreated(savedInstanceState);

    FloatingActionButton fab = getActivity().findViewById(R.id.fab_edit_task_done);
    fab.setImageResource(R.drawable.ic_done);
    fab.setOnClickListener(new View.OnClickListener() {
      @Override public void onClick(View v) {
        Toast.makeText(getContext(), Integer.toString(someInteger), Toast.LENGTH_SHORT).show();
      }
    });
  }

  @Nullable @Override public View onCreateView(LayoutInflater inflater, ViewGroup container,
      Bundle savedInstanceState) {
    return inflater.inflate(R.layout.test_frag, container, false);
  }
}
