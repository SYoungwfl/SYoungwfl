package com.cookandroid.healthapp.listener;

import com.cookandroid.healthapp.PostInfo;

public interface OnPostListener {
    void onDelete(PostInfo postInfo);
    void onModify();
}
