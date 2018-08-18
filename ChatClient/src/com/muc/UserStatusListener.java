package com.muc;

/**
 * Created by jim on 4/21/17.
 */
public interface UserStatusListener {
    public void online(String login);
    public void offline(String login);
}
