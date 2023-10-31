package ch6;

public class TimeTest {
  public static void main(String[] args) {
    Time t = new Time(12, 35, 30);
    System.out.println(t);
    //t.hour = 13; //에러
    t.setHour(t.getHour() + 1);
    System.out.println(t);
  }
}

class Time {
  private int hour, minute, second;

  Time(int hour, int minute, int second) {
    setHour(hour);
    setMinute(minute);
    setSecond(second);
  }

  public int getHour() {
    return hour;
  }

  public void setHour(int hour) {
    if (hour < 0 || hour > 23) return;
    this.hour = hour;
  }

  public int getMinute() {
    return minute;
  }

  public void setMinute(int minute) {

    if (isaBoolean(minute)) return;
    this.minute = minute;
  }


  // alt+shift+m -> 메서드 추출하기.
  private static boolean isaBoolean(int minute) {
    return minute < 0 || minute > 59;
  }

  public int getSecond() {
    return second;
  }

  public void setSecond(int second) {
    if (second < 0 || second > 59) return;
    this.second = second;
  }

  public String toString() {
    return hour + ":" + minute + ":" + second;
  }
}

