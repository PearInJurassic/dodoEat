package com.zyf.factory.presenter.fans;

import com.zyf.common.factory.data.base.DataSource;
import com.zyf.common.factory.presenter.base.BasePresenter;
import com.zyf.factory.R;
import com.zyf.factory.data.helper.PersonHelper;
import com.zyf.factory.model.Person;
import com.zyf.factory.model.fans.RequestModel_getFansList;

import java.util.List;

public class Presenter_fans extends BasePresenter<Contract_fans.View> implements Contract_fans.Presenter, DataSource.Callback<List<Person>> {

    public Presenter_fans(Contract_fans.View mView) {
        super(mView);
    }


    //刷新粉丝列表
    @Override
    public void refreshList() {
        PersonHelper.getFansList(new RequestModel_getFansList(1),this);
    }

    //列表数据获取成功的回调
    @Override
    public void onDataLoaded(List<Person> fans) {
        mView.onRefreshDone(fans);
    }

    //列表数据获取失败的回调
    @Override
    public void onDataNotAvaliable(int strRes) {
        mView.showError(R.string.data_rsp_error_unknown);
    }
}
