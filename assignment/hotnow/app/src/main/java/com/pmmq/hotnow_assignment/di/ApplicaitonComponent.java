package com.pmmq.hotnow_assignment.di;

import javax.inject.Singleton;

import com.pmmq.hotnow_assignment.di.module.ApplicationModule;
import com.pmmq.hotnow_assignment.ui.main.DetailViewModel;
import com.pmmq.hotnow_assignment.ui.main.MainActivity;
import com.pmmq.hotnow_assignment.ui.main.MainViewModel;
import dagger.Component;

@Singleton
@Component(modules = {ApplicationModule.class})
public interface ApplicaitonComponent {
	void inject(MainActivity mainActivity);
	void inject(MainViewModel mainViewModel);
}
