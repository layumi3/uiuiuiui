package com.bdg.telkom.track1;

import android.app.IntentService;
import android.content.Intent;
import android.support.v4.content.LocalBroadcastManager;

/**
 * Created by lacorp on 5/24/2016.
 */
public class NewIntentService extends IntentService {

    public static final String TAG = "NowIntentService";

    public NewIntentService() {
        super(TAG);
    }

    @Override
    protected void onHandleIntent(Intent intent) {
        String taskId = intent.getStringExtra(TrackUtil.TASK_ID);
        boolean completed = TrackUtil.makeNetworkCall();
        Intent taskUpdateIntent = new Intent(TrackUtil.TASK_UPDATE_FILTER);
        taskUpdateIntent.putExtra(TrackUtil.TASK_ID, taskId);
        TaskItem taskItem = TrackUtil.getTaskItemFromFile(this, taskId);
        if (taskItem == null) {
            return;
        }
        if (completed) {
            taskItem.setmStatus(TaskItem.EXECUTED_STATUS);
        } else {
            taskItem.setmStatus(TaskItem.FAILED_STATUS);
        }
        taskUpdateIntent.putExtra(TrackUtil.TASK_STATUS, taskItem.getmStatus());
        TrackUtil.saveTaskItemToFile(this, taskItem);

        LocalBroadcastManager localBroadcastManager = LocalBroadcastManager.getInstance(this);
        localBroadcastManager.sendBroadcast(taskUpdateIntent);
    }
}
