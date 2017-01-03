package com.dgse.androidviper.ui.presenter;

import com.dgse.androidviper.ui.presenter.base.MainPresenter;
import com.dgse.androidviper.ui.view.base.MainView;
import com.dgse.androidviper.ui.view.base.ViewBase;

/**
 * Created by BigDi on 02.01.2017.
 */

public class MainPresenterImpl implements MainPresenter {

    MainView mainView = null;

    @Override
    public void bind(ViewBase view) {
        mainView = (MainView) view;
    }

    @Override
    public void unbind() {
        mainView = null;
    }

    @Override
    public boolean isAdded() {
        return mainView != null;
    }
}
