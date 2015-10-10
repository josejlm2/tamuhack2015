package com.example.tamuhack2015;

/**

  Represents an event
 * Created by Nick on 10/10/2015.
 */
public class Event {
    /**
     * Event time decided
     */
    @com.google.gson.annotations.SerializedName("time")
    private String mTime;

    /**
     * Event  Id
     */
    @com.google.gson.annotations.SerializedName("id")
    private String mId;

    /**
     * Event activity decided
     */
    @com.google.gson.annotations.SerializedName("activity")
    private String mActivity;


    /**
     * Event date
     */
    @com.google.gson.annotations.SerializedName("date")
    private String mDate;

    /**
     * Event name
     */
    @com.google.gson.annotations.SerializedName("name")
    private String mName;

    /**
     * ToDoItem constructor
     */
    public Event() {

    }

    @Override
    public String toString() {
        return getName();
    }

    /**
     * Initializes a new Event
     * *
     * @param name
     *            The event name
     *
     * @param date
     *            The event date
     * @param id
     *            The event id
     */
    public Event(String name, String date, String id) {
        this.setDate(date);
        this.setName(name);
        this.setId(id);
    }

    /**
     * Returns the event Name
     */
    public String getName() {
        return mName;
    }

    /**
     * Sets the item name
     *
     * @param name
     *            name to set
     */
    public final void setName(String name) {
        mName = name;
    }

    /**
     * Returns the Event id
     */
    public String getId() {
        return mId;
    }

    /**
     * Sets the Event id
     *
     * @param id
     *            id to set
     */
    public final void setId(String id) {
        mId = id;
    }

    /**
     * Returns the Event id
     */
    public String getDate() {
        return mDate;
    }

    /**
     * Sets the Event date
     *
     * @param date
     *            date to set
     */
    public final void setDate(String date) {
        mDate = date;
    }

    //activity
    /**
     * Returns the Event time
     */
    public String getTime() {
        return mTime;
    }
    /**
    * Sets the Event time
    *
     * @param time
     *          time to set
    */
    public final void setmTime(String time){
        mTime = time;
    }

    /**
     * Returns the Event time
     */
    public String getActivity() {
        return mActivity;
    }
    /**
     * Sets the Event activity
     *
     * @param activity
     *          activity to set
     */
    public final void setmActivity(String activity){
        mActivity = activity;
    }

    @Override
    public boolean equals(Object o) {
        return o instanceof Event && ((Event) o).mId == mId;
    }
}
