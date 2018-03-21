package com.example.android.architecture.blueprints.todoapp.addedittask;

import com.example.android.architecture.blueprints.todoapp.di.FragmentScoped;
import dagger.Module;
import dagger.Provides;

/**
 * Created by cafer.kaya on 20.03.2018.
 */

@Module abstract public class FragmentTestModule {
  @Provides @FragmentScoped static Integer provideSomeInteger() {
    return 123;
  }
}
