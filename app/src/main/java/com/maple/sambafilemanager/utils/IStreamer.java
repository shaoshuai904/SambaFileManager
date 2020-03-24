package com.maple.sambafilemanager.utils;

public interface IStreamer {

    public void start();

    public void stopStream();

    /**
     * get post
     *
     * @return
     */
    public int getPort();

    /**
     * For using in current device, you can just use "127.0.0.1"<p/>
     * For others, use your true ip in ipv4
     *
     * @return
     */
    public String getIp();
}
