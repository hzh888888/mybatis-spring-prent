package com.formatter;

import com.entity.UserInfo;
import org.springframework.format.Formatter;

import java.text.ParseException;
import java.util.Locale;

public class EmpFormatter implements Formatter<UserInfo> {
    @Override
    public UserInfo parse(String s, Locale locale) throws ParseException {
        String[] date=s.split(",");
        UserInfo userInfo=new UserInfo();
        userInfo.setFirstName(date[0]);
        userInfo.setLastName(date[1]);
        return userInfo;
    }

    @Override
    public String print(UserInfo userInfo, Locale locale) {
        return null;
    }
}
