package com.bdg.telkom.track1;

import android.content.Intent;
import android.support.v4.content.LocalBroadcastManager;
import android.util.Log;

import com.google.android.gms.gcm.GcmNetworkManager;
import com.google.android.gms.gcm.GcmTaskService;
import com.google.android.gms.gcm.TaskParams;

/**
 * Created by lacorp on 5/24/2016.
 */
//public class BestTimeService {
public class BestTimeService extends GcmTaskService{

    private static final String TAG = "BestTimeService";

    @Override
    public int onRunTask(TaskParams taskParams) {
        String taskId = taskParams.getExtras().getString(TrackUtil.TASK_ID);
        boolean completed = TrackUtil.makeNetworkCall();

        Log.d(TAG, "Oneoff scheduled call executed. Task ID: " + taskId);

        // Prepare Intent to send with broadcast.
        Intent taskUpdateIntent = new Intent(TrackUtil.TASK_UPDATE_FILTER);
        taskUpdateIntent.putExtra(TrackUtil.TASK_ID, taskId);
        TaskItem taskItem = TrackUtil.getTaskItemFromFile(this, taskId);
        if (taskItem == null) {
            return GcmNetworkManager.RESULT_FAILURE;
        }
        if (completed) {
            taskItem.setmStatus(TaskItem.EXECUTED_STATUS);
        } else {
            taskItem.setmStatus(TaskItem.FAILED_STATUS);
        }
        taskUpdateIntent.putExtra(TrackUtil.TASK_STATUS, taskItem.getmStatus());
        TrackUtil.saveTaskItemToFile(this, taskItem);

        // Notify listeners (MainActivity) that task was completed successfully.
        LocalBroadcastManager localBroadcastManager = LocalBroadcastManager.getInstance(this);
        localBroadcastManager.sendBroadcast(taskUpdateIntent);
        return 0;
    }
}
