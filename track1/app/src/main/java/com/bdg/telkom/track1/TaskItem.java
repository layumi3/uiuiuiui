package com.bdg.telkom.track1;

/**
 * Created by lacorp on 5/24/2016.
 */
/*This is task for position each position*/
public class TaskItem {
    public static final String ONEOFF_TASK = "Oneoff Task";
    public static final String NOW_TASK = "Now Task";
    public static final String PENDING_STATUS = "Pending";
    public static final String EXECUTED_STATUS = "Executed";
    public static final String FAILED_STATUS = "Failed";


    private String mId;
    private String mType;
    private String mStatus;

    public TaskItem(String id, String label, String status) {
        setmId(id);
        setmType(label);
        setmStatus(status);
    }

    public String getmId() {
        return mId;
    }

    public void setmId(String mId) {
        this.mId = mId;
    }

    public String getmType() {
        return mType;
    }

    public void setmType(String mType) {
        this.mType = mType;
    }

    public String getmStatus() {
        return mStatus;
    }

    public void setmStatus(String mStatus) {
        this.mStatus = mStatus;
    }
}



