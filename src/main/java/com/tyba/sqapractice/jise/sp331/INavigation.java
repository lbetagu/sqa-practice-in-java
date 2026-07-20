package com.tyba.sqapractice.jise.sp331;

public interface INavigation {

    public void forwardFifteenSeconds();

    public void backFifteenSeconds();

    public void jumpToTrack(int chapterNumber);

    public void changeSpeed(double speed);
}
