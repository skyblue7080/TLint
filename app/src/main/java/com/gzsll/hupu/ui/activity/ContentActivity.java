package com.gzsll.hupu.ui.activity;

import com.gzsll.hupu.R;
import com.gzsll.hupu.ui.fragment.ContentFragment_;

import org.androidannotations.annotations.AfterViews;
import org.androidannotations.annotations.EActivity;
import org.androidannotations.annotations.Extra;
import org.apache.log4j.Logger;

/**
 * Created by sll on 2015/3/7.
 */
@EActivity(R.layout.base_content_empty)
public class ContentActivity extends BaseSwipeBackActivity {
    Logger logger = Logger.getLogger(ContentActivity.class.getSimpleName());

    @Extra
    long mThreadId;
    @Extra
    int mPage;

    @AfterViews
    void init() {
        getSupportFragmentManager().beginTransaction().replace(R.id.content, ContentFragment_.builder().mThreadId(mThreadId).mPage(mPage).build()).commit();
    }


    @Override
    protected boolean isApplyStatusBarTranslucency() {
        return false;
    }

    @Override
    protected boolean isApplyKitKatTranslucency() {
        return false;
    }


}