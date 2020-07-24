package org.ndroi.easy163.utils;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by andro on 2020/5/5.
 */
public class Keyword
{
    public String songName;
    public List<String> singers = new ArrayList<>();

    @Override
    public String toString()
    {
        String str = songName + ": ";
        for (String singer : singers)
        {
            str += '/' + singer;
        }
        return str;
    }
}
