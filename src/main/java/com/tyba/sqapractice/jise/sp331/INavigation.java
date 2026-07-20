package com.tyba.sqapractice.jise.sp331;

public interface INavigation {

    public void forwardFifteenSeconds();

    public void backFifteenSeconds();

    public void jumpToTrack(int trackNumber);

    public void changeSpeed(int speed);
}
