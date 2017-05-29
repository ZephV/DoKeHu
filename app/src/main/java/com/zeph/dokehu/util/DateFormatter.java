package com.zeph.dokehu.util;


import java.text.SimpleDateFormat;
import java.util.Date;

public class DateFormatter {

  public String ZhihuDailyDateFormat(long date) {
    String sDate;
    Date d = new Date(date + 24 * 60 * 60 * 1000);
    SimpleDateFormat format = new SimpleDateFormat("yyyyMMdd");
    sDate = format.format(d);

    return sDate;
  }

}
