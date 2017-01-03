package com.dgse.androidviper.ui.presenter.base;

import com.dgse.androidviper.ui.view.base.ViewBase;

/**
 * Created by BigDi on 02.01.2017.
 */

public interface PresenterBase {
    void bind(ViewBase view);

    void unbind();

    boolean isAdded();
}
