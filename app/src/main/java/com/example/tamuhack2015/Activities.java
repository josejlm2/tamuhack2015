package com.example.tamuhack2015;

/**
 * Created by Nick on 10/10/2015.
 * id (int)
 - event_id (int)
 - name (varchar 50)
 - description (varchar max)
 */
public class Activities {
    /**
     * Event Id
     */
    @com.google.gson.annotations.SerializedName("event_id")
    private Integer mEventId;
    /**
     * Activities  Id
     */
    @com.google.gson.annotations.SerializedName("id")
    private Integer mId;

    /**
     * Activities  name
     */
    @com.google.gson.annotations.SerializedName("name")
    private String mName;

    /**
     * Activities  name
     */
    @com.google.gson.annotations.SerializedName("description")
    private String mDescription;
    /**
     * Activities constructor
     */
    public Activities() {

    }


    /**
     * Initializes a new Activitie
     * *
     * @param name
     *            The activities name
     *
     * @param description
     *            The activities descripton
     * @param id
     *            The activities id
     *
     * @param event_id
     *          The key related to events table
     *

     *
     */
    public Activities(String name, Integer event_id, Integer id, String description) {
        this.setEventId(event_id);
        this.setName(name);
        this.setId(id);
    }

    public String getName() { return mName; }
    public final void setName(String name) {
        mName =name;
    }

    public Integer getEventId(){ return mEventId;}
    public final void setEventId(Integer id){
        mEventId = id;
    }

    public Integer getId() { return mId;}

    public final void setId(Integer id) {
        mId = id;
    }

    public String getDescription() { return mDescription; }
    public final void setDescription(String description){
        mDescription = description;

    }
}
