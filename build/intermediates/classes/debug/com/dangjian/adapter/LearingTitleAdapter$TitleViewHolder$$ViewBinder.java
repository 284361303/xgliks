// Generated code from Butter Knife. Do not modify!
package com.dangjian.adapter;

import android.view.View;
import butterknife.ButterKnife.Finder;
import butterknife.ButterKnife.ViewBinder;

public class LearingTitleAdapter$TitleViewHolder$$ViewBinder<T extends com.dangjian.adapter.LearingTitleAdapter.TitleViewHolder> implements ViewBinder<T> {
  @Override public void bind(final Finder finder, final T target, Object source) {
    View view;
    view = finder.findRequiredView(source, 2131427800, "field 'itemLearingTitleTv'");
    target.itemLearingTitleTv = finder.castView(view, 2131427800, "field 'itemLearingTitleTv'");
    view = finder.findRequiredView(source, 2131427801, "field 'itemLearingTitleView'");
    target.itemLearingTitleView = view;
  }

  @Override public void unbind(T target) {
    target.itemLearingTitleTv = null;
    target.itemLearingTitleView = null;
  }
}
